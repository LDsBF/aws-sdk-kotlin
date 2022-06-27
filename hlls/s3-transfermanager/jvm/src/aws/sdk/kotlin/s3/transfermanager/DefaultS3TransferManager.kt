package aws.sdk.kotlin.s3.transfermanager

import S3TransferManager
import aws.sdk.kotlin.s3.transfermanager.data.S3Uri
import aws.sdk.kotlin.s3.transfermanager.handler.DefaultOperation
import aws.sdk.kotlin.s3.transfermanager.handler.Operation
import aws.sdk.kotlin.s3.transfermanager.listener.ProgressListener
import aws.sdk.kotlin.services.s3.S3Client
import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.content.fromFile
import java.io.File


public class DefaultS3TransferManager(): S3TransferManager {
    // here's a problem, if I want to return Operation, I have t op
//    context(CoroutineScope)
    override suspend fun upload(from: String, to: S3Uri, progressListener: ProgressListener?): Operation {

        // judge whether fileName is a single file or directory with some Java method
        // like Path.toFile().isDirectory() or File.isDirectory(path)

        // before actual upload, first traverse the directory to calculate total files/chunks/Bytes to be uploaded
        // and pass them to  Operation's Progress class
        // an upload() is listened by single Operation

//        val job = async {
//
//        }

        // This detects your local profile file, reads your credentials, and
        // creates a new client ready to call S3 for your account.
        val s3 = S3Client.fromEnvironment {
            region = "us-west-2"
        }

        val localFile = File(from) // replace this with a real path
        if (localFile.isFile()) {
            // for single file upload, generate multiple parallel PUT requests according to s3Path and send to S3 Client object
            // wait the S3 client to reply upload response, then use operator to listen to progress and control pausing and resuming
            s3.putObject { // this is the actual call to S3 with arguments set below...
                bucket = to.bucket // replace this with your actual bucket name
                key = to.key // this can be whatever object name you want
                body= ByteStream.fromFile(localFile)
                // specify the file from earlier
                // ...there are lots more parameters to S3 uploads, but they're optional
            } // method returns when the upload is complete!
        } else if (localFile.isDirectory()) {
            // for directory, just use double pointer to start from fileDirectory/s3Path and recursively traverse directory/path
            // and call upload() to recursively finish the directory upload level by level like this
//            direc1     from: Users/direc1 		to:key
//               |_ a.txt    from: Users/direc1/a.txt	 to:key/a.txt
//               |_direc2    from: Users/direc1/direc2	to: key/direc2
//                   |_b.jpg	from: Users/direc1/direc2/b.jpg	to: key/direc2/b.jpg
//               |_direc3	from: Users/direc1/direc3	to: key/direc3


            val subFiles = localFile.listFiles()
            if (subFiles.size != 0) {
                for (i in 0..subFiles.size - 1) {
                    val subFile = subFiles[i]

                    var subFrom = "" + from // next level recursion's from
                    if (subFrom.get(subFrom.length - 1) == '/') {   // if directory ends with '/', just add subFile name to subFrom
                        subFrom += subFile.name
                    } else {    // if directory not end with '/', add "/" + subFile name to subFrom
                        subFrom += '/' + subFile.name
                    }

                    var subKey = to.key + '/' + subFile.name
                    val subTo = S3Uri(to.bucket, subKey) // next level recursion's to

                    // need to consider listener and receiver suboperation in the future!!!
                    val subOperation = upload(subFrom, subTo, progressListener)
                }
            }
        }

        val operation = DefaultOperation()
        return operation
    }
}

