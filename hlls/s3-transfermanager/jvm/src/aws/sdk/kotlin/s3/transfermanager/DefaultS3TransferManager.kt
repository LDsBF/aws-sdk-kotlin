package aws.sdk.kotlin.s3.transfermanager

import aws.sdk.kotlin.s3.transfermanager.data.S3Uri
import aws.sdk.kotlin.s3.transfermanager.handler.DefaultOperation
import aws.sdk.kotlin.s3.transfermanager.handler.Operation
import aws.sdk.kotlin.s3.transfermanager.listener.ProgressListener
import aws.sdk.kotlin.services.s3.S3Client
import aws.sdk.kotlin.services.s3.completeMultipartUpload
import aws.sdk.kotlin.services.s3.createMultipartUpload
import aws.sdk.kotlin.services.s3.headBucket
import aws.sdk.kotlin.services.s3.headObject
import aws.sdk.kotlin.services.s3.model.CompletedPart
import aws.sdk.kotlin.services.s3.model.GetObjectRequest
import aws.sdk.kotlin.services.s3.model.ListObjectsV2Response
import aws.sdk.kotlin.services.s3.model.NotFound
import aws.sdk.kotlin.services.s3.paginators.listObjectsV2Paginated
import aws.sdk.kotlin.services.s3.putObject
import aws.sdk.kotlin.services.s3.uploadPart
import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.content.asByteStream
import aws.smithy.kotlin.runtime.content.fromFile
import aws.smithy.kotlin.runtime.content.writeToFile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.firstOrNull
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

internal class DefaultS3TransferManager(override val config: S3TransferManager.Config) : S3TransferManager {

    private val s3: S3Client = config.s3

    /**
     * upload a single file or directory locally to S3 bucket
     * starting from a main scope, generate children coroutine scope in such logic:
     *                        main coroutine
                                    | input file
                            parent coroutine
                    if file /	      		 \ if directory
            child coroutine		          give each subFile a separate coroutine
            uploadFIle/uploadFileParts    as their parent coroutine
                                                | recursively judging…
     */
    context(CoroutineScope)
    override fun upload(from: String, to: S3Uri, progressListener: ProgressListener?): Operation {
        val deferred = async<Unit> {
            val localFile = File(from)
            // throw IllegalArgumentException if from path is invalid
            require(localFile.exists()) { "From path is invalid" }

            when {
                localFile.isFile() -> uploadFile(localFile, to)
                localFile.isDirectory() -> uploadDirectory(localFile, to, progressListener)
                else -> throw IllegalArgumentException("From path is invalid")
            }
        }

        return DefaultOperation(deferred)
    }

    context(CoroutineScope)
    private fun uploadFile(localFile: File, to: S3Uri) {
        // for single file upload, generate multiple parallel PUT requests according to s3Path and send to S3 Client object
        // wait the S3 client to reply upload response, then use operator to listen to progress and control pausing and resuming

        // determine upload with single request or split parts request according to file size
        val fileSize = localFile.length()
        if (fileSize <= config.chunkSize) { // for file smaller than config chunk size
            uploadWholeFile(localFile, to)
        } else { // for large file over config chunk size
            uploadFileParts(localFile, to)
        }
    }

    context(CoroutineScope)
    private fun uploadWholeFile(localFile: File, to: S3Uri) {
        async<Unit> {
            s3.putObject {
                bucket = to.bucket
                key = to.key
                body = ByteStream.fromFile(localFile)
            }
        }
    }

    context(CoroutineScope)
    private fun uploadFileParts(localFile: File, to: S3Uri) {
        async<Unit> {
            val fileSize = localFile.length()

            val chunkRanges = (0 until fileSize step config.chunkSize).map {
                it until minOf(it + config.chunkSize, fileSize)
            }

            // initialize multipart upload
            val createMultipartUploadResponse = s3.createMultipartUpload {
                bucket = to.bucket
                key = to.key
            }
            val completedParts = mutableListOf<CompletedPart>()

            // call uploadPart() iteratively to continue uploading
            chunkRanges.forEachIndexed { index, chunkRange ->
                val uploadPartResponse = s3.uploadPart {
                    body = localFile.asByteStream(chunkRange)
                    bucket = to.bucket
                    key = to.key
                    uploadId = createMultipartUploadResponse.uploadId
                    partNumber = (index + 1)
                }
                completedParts.add(
                    CompletedPart {
                        eTag = uploadPartResponse.eTag
                        partNumber = (index + 1)
                    }
                )
            }

            // complete multipart upload
            s3.completeMultipartUpload {
                bucket = to.bucket
                key = to.key
                uploadId = createMultipartUploadResponse.uploadId
                multipartUpload { parts = completedParts }
            }
        }
    }

    context(CoroutineScope)
    private fun uploadDirectory(localFile: File, to: S3Uri, progressListener: ProgressListener?) {
        // for directory, just use double pointer to start from fileDirectory/s3Path and recursively traverse directory/path
        // and call upload() to recursively finish the directory upload level by level like this
//            direc1     from: Users/direc1 		to:key
//               |_ a.txt    from: Users/direc1/a.txt	 to:key/a.txt
//               |_direc2    from: Users/direc1/direc2	to: key/direc2
//                   |_b.jpg	from: Users/direc1/direc2/b.jpg	to: key/direc2/b.jpg
//               |_direc3	from: Users/direc1/direc3	to: key/direc3

        val subFiles = localFile.listFiles()
        subFiles.forEach {
            val subFrom = localFile.toPath().resolve(it.name).toString()

            val subKey = Paths.get(to.key, it.name).toString()

            val subTo = S3Uri(to.bucket, subKey) // next level recursion's to

            // need to consider listener and receiver suboperation in the future!!!
            upload(subFrom, subTo, progressListener)
        }
    }

    /**
     * download a S3 bucket key object or key-prefix directory to local file system
     * for directory download, ideal result is like this
        S3:
        keyPrefix: bucket/path/to/a/key/
        valid objects:
        bucket/path/to/a/key/file1
        bucket/path/to/a/key/dir1/file2
        bucket/path/to/a/key/dir1/file3
        bucket/path/to/a/key/bar/file4
        bucket/path/to/a/key/bar/dir1/file5

        Files system:
        /foo/bar/key/
        downloaded files:
        /foo/bar/key/file1
        /foo/bar/key/dir1/file2
        /foo/bar/key/dir1/file3
        /foo/bar/key/bar/file4
        /foo/bar/key/bar/dir1/file5
     */
    context(CoroutineScope)
    override fun download(from: S3Uri, to: String, progressListener: ProgressListener?): Operation {
        val deferred = async {
            var validFrom = false

            try { // first check if bucket exists
                s3.headBucket {
                    bucket = from.bucket
                }
            } catch (e: Exception) {
                throw IllegalArgumentException("The bucket does not exist or has no access to it")
            }

            if (!from.key.endsWith('/')) {
                try {
                    // throw a not found exception if there's no such key object
                    s3.headObject {
                        bucket = from.bucket
                        key = from.key
                    }

                    // if object exist, download that object
                    validFrom = true
                    val subTo = Paths.get(to).resolve(from.key.substringAfterLast('/')).toString()
                    downloadFile(from, subTo)
                } catch (_: NotFound) {
                }
            }

            if (validFrom) { // if from refers to specific object, just download it and return
                return@async
            }

            // check if the current key is a keyPrefix
            val keyPrefix = if (from.key.endsWith('/')) from.key else from.key.plus('/')

            val response = s3.listObjectsV2Paginated {
                bucket = from.bucket
                prefix = keyPrefix
            }

            if (response.firstOrNull()?.contents?.isNotEmpty() == true) {
                validFrom = true
            }

            response.collect {
                downloadDirectory(it, File(to), progressListener)
            }

            if (!validFrom) {
                throw IllegalArgumentException("From S3 uri contains invalid key/keyPrefix")
            }
        }

        return DefaultOperation(deferred)
    }

    /**
     * download a single object to local path
     * from is object's bucket-key
     * to refers to specific path ending with the file name
     */
    context(CoroutineScope)
    private fun downloadFile(from: S3Uri, to: String) {
        async {
            val request = GetObjectRequest {
                bucket = from.bucket
                key = from.key
            }
            s3.getObject(request) { resp ->
                val toPath = Paths.get(to)
                // create the target directory if to path doesn't exist
                Files.createDirectories(toPath.parent)
                resp.body?.writeToFile(toPath)
            }
        }
    }

    /**
     * within a single response containing max of 1000 objects, iterate through common keyPrefix's all valid objects,
     * extract and concatenate their local file path and call downloadFile() to download them separately
     */
    context(CoroutineScope)
    private fun downloadDirectory(response: ListObjectsV2Response, localFile: File, progressListener: ProgressListener?) {
//     to recursively execute single object download or sub-directory download at local next level

        response.contents?.forEach response@{
            val subFrom = response.prefix?.let { it1 -> it.key?.substringAfter(it1) }
            // continue to next object if current object refers to nothing
            if (subFrom == null) {
                return@response
            }
            val subTo = localFile.toPath().resolve(subFrom).toString()
            if (response.name != null) {
                val s3Uri = S3Uri(response.name!!, it.key!!)
                downloadFile(s3Uri, subTo)
            }
        }
    }

    override suspend fun copy(from: List<S3Uri>, to: S3Uri, progressListener: ProgressListener?): Operation {
        TODO("Not yet implemented")
    }
}
