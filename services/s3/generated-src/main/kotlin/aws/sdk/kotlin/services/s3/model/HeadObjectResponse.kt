// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

class HeadObjectResponse private constructor(builder: Builder) {
    /**
     * Indicates that a range of bytes was specified.
     */
    val acceptRanges: kotlin.String? = builder.acceptRanges
    /**
     * The archive state of the head object.
     */
    val archiveStatus: aws.sdk.kotlin.services.s3.model.ArchiveStatus? = builder.archiveStatus
    /**
     * Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
     */
    val bucketKeyEnabled: kotlin.Boolean = builder.bucketKeyEnabled
    /**
     * Specifies caching behavior along the request/reply chain.
     */
    val cacheControl: kotlin.String? = builder.cacheControl
    /**
     * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    val checksumCrc32: kotlin.String? = builder.checksumCrc32
    /**
     * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    val checksumCrc32C: kotlin.String? = builder.checksumCrc32C
    /**
     * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    val checksumSha1: kotlin.String? = builder.checksumSha1
    /**
     * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    val checksumSha256: kotlin.String? = builder.checksumSha256
    /**
     * Specifies presentational information for the object.
     */
    val contentDisposition: kotlin.String? = builder.contentDisposition
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
     */
    val contentEncoding: kotlin.String? = builder.contentEncoding
    /**
     * The language the content is in.
     */
    val contentLanguage: kotlin.String? = builder.contentLanguage
    /**
     * Size of the body in bytes.
     */
    val contentLength: kotlin.Long = builder.contentLength
    /**
     * A standard MIME type describing the format of the object data.
     */
    val contentType: kotlin.String? = builder.contentType
    /**
     * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
     */
    val deleteMarker: kotlin.Boolean = builder.deleteMarker
    /**
     * An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */
    val eTag: kotlin.String? = builder.eTag
    /**
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the `expiry-date` and `rule-id` key-value pairs providing object expiration information. The value of the `rule-id` is URL-encoded.
     */
    val expiration: kotlin.String? = builder.expiration
    /**
     * The date and time at which the object is no longer cacheable.
     */
    val expires: aws.smithy.kotlin.runtime.time.Instant? = builder.expires
    /**
     * Creation date of the object.
     */
    val lastModified: aws.smithy.kotlin.runtime.time.Instant? = builder.lastModified
    /**
     * A map of metadata to store with the object in S3.
     */
    val metadata: Map<String, String>? = builder.metadata
    /**
     * This is set to the number of metadata entries not returned in `x-amz-meta` headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
     */
    val missingMeta: kotlin.Int = builder.missingMeta
    /**
     * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has the `s3:GetObjectLegalHold` permission. This header is not returned if the specified version of this object has never had a legal hold applied. For more information about S3 Object Lock, see [Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html).
     */
    val objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = builder.objectLockLegalHoldStatus
    /**
     * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has the `s3:GetObjectRetention` permission. For more information about S3 Object Lock, see [Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html).
     */
    val objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = builder.objectLockMode
    /**
     * The date and time when the Object Lock retention period expires. This header is only returned if the requester has the `s3:GetObjectRetention` permission.
     */
    val objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = builder.objectLockRetainUntilDate
    /**
     * The count of parts this object has. This value is only returned if you specify `partNumber` in your request and the object was uploaded as a multipart upload.
     */
    val partsCount: kotlin.Int = builder.partsCount
    /**
     * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a replication rule.
     *
     * In replication, you have a source bucket on which you configure replication and destination bucket or buckets where Amazon S3 stores object replicas. When you request an object (`GetObject`) or object metadata (`HeadObject`) from these buckets, Amazon S3 will return the `x-amz-replication-status` header in the response as follows:
     * + **If requesting an object from the source bucket**, Amazon S3 will return the `x-amz-replication-status` header if the object in your request is eligible for replication. For example, suppose that in your replication configuration, you specify object prefix `TaxDocs` requesting Amazon S3 to replicate objects with key prefix `TaxDocs`. Any objects you upload with this key name prefix, for example `TaxDocs/document1.pdf`, are eligible for replication. For any object request with this key name prefix, Amazon S3 will return the `x-amz-replication-status` header with value PENDING, COMPLETED or FAILED indicating object replication status.
     * + **If requesting an object from a destination bucket**, Amazon S3 will return the `x-amz-replication-status` header with value REPLICA if the object in your request is a replica that Amazon S3 created and there is no replica modification replication in progress.
     * + **When replicating objects to multiple destination buckets**, the `x-amz-replication-status` header acts differently. The header of the source object will only return a value of COMPLETED when replication is successful to all destinations. The header will remain at value PENDING until replication has completed for all destinations. If one or more destinations fails replication the header will return FAILED.
     *
     * For more information, see [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
     */
    val replicationStatus: aws.sdk.kotlin.services.s3.model.ReplicationStatus? = builder.replicationStatus
    /**
     * If present, indicates that the requester was successfully charged for the request.
     */
    val requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = builder.requestCharged
    /**
     * If the object is an archived object (an object whose storage class is GLACIER), the response includes this header if either the archive restoration is in progress (see [RestoreObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html) or an archive copy is already restored.
     *
     *  If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the object copy. For example:
     *
     * `x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"`
     *
     * If the object restoration is in progress, the header returns the value `ongoing-request="true"`.
     *
     * For more information about archiving objects, see [Transitioning Objects: General Considerations](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations).
     */
    val restore: kotlin.String? = builder.restore
    /**
     * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon S3-managed encryption key, the response includes this header with the value of the server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     */
    val serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = builder.serverSideEncryption
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for the object.
     */
    val ssekmsKeyId: kotlin.String? = builder.ssekmsKeyId
    /**
     * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects.
     *
     * For more information, see [Storage Classes](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html).
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = builder.storageClass
    /**
     * Version of the object.
     */
    val versionId: kotlin.String? = builder.versionId
    /**
     * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     */
    val websiteRedirectLocation: kotlin.String? = builder.websiteRedirectLocation

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.HeadObjectResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("HeadObjectResponse(")
        append("acceptRanges=$acceptRanges,")
        append("archiveStatus=$archiveStatus,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("cacheControl=$cacheControl,")
        append("checksumCrc32=$checksumCrc32,")
        append("checksumCrc32C=$checksumCrc32C,")
        append("checksumSha1=$checksumSha1,")
        append("checksumSha256=$checksumSha256,")
        append("contentDisposition=$contentDisposition,")
        append("contentEncoding=$contentEncoding,")
        append("contentLanguage=$contentLanguage,")
        append("contentLength=$contentLength,")
        append("contentType=$contentType,")
        append("deleteMarker=$deleteMarker,")
        append("eTag=$eTag,")
        append("expiration=$expiration,")
        append("expires=$expires,")
        append("lastModified=$lastModified,")
        append("metadata=$metadata,")
        append("missingMeta=$missingMeta,")
        append("objectLockLegalHoldStatus=$objectLockLegalHoldStatus,")
        append("objectLockMode=$objectLockMode,")
        append("objectLockRetainUntilDate=$objectLockRetainUntilDate,")
        append("partsCount=$partsCount,")
        append("replicationStatus=$replicationStatus,")
        append("requestCharged=$requestCharged,")
        append("restore=$restore,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("storageClass=$storageClass,")
        append("versionId=$versionId,")
        append("websiteRedirectLocation=$websiteRedirectLocation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceptRanges?.hashCode() ?: 0
        result = 31 * result + (archiveStatus?.hashCode() ?: 0)
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (cacheControl?.hashCode() ?: 0)
        result = 31 * result + (checksumCrc32?.hashCode() ?: 0)
        result = 31 * result + (checksumCrc32C?.hashCode() ?: 0)
        result = 31 * result + (checksumSha1?.hashCode() ?: 0)
        result = 31 * result + (checksumSha256?.hashCode() ?: 0)
        result = 31 * result + (contentDisposition?.hashCode() ?: 0)
        result = 31 * result + (contentEncoding?.hashCode() ?: 0)
        result = 31 * result + (contentLanguage?.hashCode() ?: 0)
        result = 31 * result + (contentLength.hashCode())
        result = 31 * result + (contentType?.hashCode() ?: 0)
        result = 31 * result + (deleteMarker.hashCode())
        result = 31 * result + (eTag?.hashCode() ?: 0)
        result = 31 * result + (expiration?.hashCode() ?: 0)
        result = 31 * result + (expires?.hashCode() ?: 0)
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        result = 31 * result + (metadata?.hashCode() ?: 0)
        result = 31 * result + (missingMeta)
        result = 31 * result + (objectLockLegalHoldStatus?.hashCode() ?: 0)
        result = 31 * result + (objectLockMode?.hashCode() ?: 0)
        result = 31 * result + (objectLockRetainUntilDate?.hashCode() ?: 0)
        result = 31 * result + (partsCount)
        result = 31 * result + (replicationStatus?.hashCode() ?: 0)
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (restore?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        result = 31 * result + (websiteRedirectLocation?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HeadObjectResponse

        if (acceptRanges != other.acceptRanges) return false
        if (archiveStatus != other.archiveStatus) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (cacheControl != other.cacheControl) return false
        if (checksumCrc32 != other.checksumCrc32) return false
        if (checksumCrc32C != other.checksumCrc32C) return false
        if (checksumSha1 != other.checksumSha1) return false
        if (checksumSha256 != other.checksumSha256) return false
        if (contentDisposition != other.contentDisposition) return false
        if (contentEncoding != other.contentEncoding) return false
        if (contentLanguage != other.contentLanguage) return false
        if (contentLength != other.contentLength) return false
        if (contentType != other.contentType) return false
        if (deleteMarker != other.deleteMarker) return false
        if (eTag != other.eTag) return false
        if (expiration != other.expiration) return false
        if (expires != other.expires) return false
        if (lastModified != other.lastModified) return false
        if (metadata != other.metadata) return false
        if (missingMeta != other.missingMeta) return false
        if (objectLockLegalHoldStatus != other.objectLockLegalHoldStatus) return false
        if (objectLockMode != other.objectLockMode) return false
        if (objectLockRetainUntilDate != other.objectLockRetainUntilDate) return false
        if (partsCount != other.partsCount) return false
        if (replicationStatus != other.replicationStatus) return false
        if (requestCharged != other.requestCharged) return false
        if (restore != other.restore) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (storageClass != other.storageClass) return false
        if (versionId != other.versionId) return false
        if (websiteRedirectLocation != other.websiteRedirectLocation) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.HeadObjectResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates that a range of bytes was specified.
         */
        var acceptRanges: kotlin.String? = null
        /**
         * The archive state of the head object.
         */
        var archiveStatus: aws.sdk.kotlin.services.s3.model.ArchiveStatus? = null
        /**
         * Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        var bucketKeyEnabled: kotlin.Boolean = false
        /**
         * Specifies caching behavior along the request/reply chain.
         */
        var cacheControl: kotlin.String? = null
        /**
         * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        var checksumCrc32: kotlin.String? = null
        /**
         * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        var checksumCrc32C: kotlin.String? = null
        /**
         * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        var checksumSha1: kotlin.String? = null
        /**
         * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        var checksumSha256: kotlin.String? = null
        /**
         * Specifies presentational information for the object.
         */
        var contentDisposition: kotlin.String? = null
        /**
         * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
         */
        var contentEncoding: kotlin.String? = null
        /**
         * The language the content is in.
         */
        var contentLanguage: kotlin.String? = null
        /**
         * Size of the body in bytes.
         */
        var contentLength: kotlin.Long = 0L
        /**
         * A standard MIME type describing the format of the object data.
         */
        var contentType: kotlin.String? = null
        /**
         * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
         */
        var deleteMarker: kotlin.Boolean = false
        /**
         * An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
         */
        var eTag: kotlin.String? = null
        /**
         * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the `expiry-date` and `rule-id` key-value pairs providing object expiration information. The value of the `rule-id` is URL-encoded.
         */
        var expiration: kotlin.String? = null
        /**
         * The date and time at which the object is no longer cacheable.
         */
        var expires: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Creation date of the object.
         */
        var lastModified: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * A map of metadata to store with the object in S3.
         */
        var metadata: Map<String, String>? = null
        /**
         * This is set to the number of metadata entries not returned in `x-amz-meta` headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
         */
        var missingMeta: kotlin.Int = 0
        /**
         * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has the `s3:GetObjectLegalHold` permission. This header is not returned if the specified version of this object has never had a legal hold applied. For more information about S3 Object Lock, see [Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html).
         */
        var objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = null
        /**
         * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has the `s3:GetObjectRetention` permission. For more information about S3 Object Lock, see [Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html).
         */
        var objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = null
        /**
         * The date and time when the Object Lock retention period expires. This header is only returned if the requester has the `s3:GetObjectRetention` permission.
         */
        var objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The count of parts this object has. This value is only returned if you specify `partNumber` in your request and the object was uploaded as a multipart upload.
         */
        var partsCount: kotlin.Int = 0
        /**
         * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a replication rule.
         *
         * In replication, you have a source bucket on which you configure replication and destination bucket or buckets where Amazon S3 stores object replicas. When you request an object (`GetObject`) or object metadata (`HeadObject`) from these buckets, Amazon S3 will return the `x-amz-replication-status` header in the response as follows:
         * + **If requesting an object from the source bucket**, Amazon S3 will return the `x-amz-replication-status` header if the object in your request is eligible for replication. For example, suppose that in your replication configuration, you specify object prefix `TaxDocs` requesting Amazon S3 to replicate objects with key prefix `TaxDocs`. Any objects you upload with this key name prefix, for example `TaxDocs/document1.pdf`, are eligible for replication. For any object request with this key name prefix, Amazon S3 will return the `x-amz-replication-status` header with value PENDING, COMPLETED or FAILED indicating object replication status.
         * + **If requesting an object from a destination bucket**, Amazon S3 will return the `x-amz-replication-status` header with value REPLICA if the object in your request is a replica that Amazon S3 created and there is no replica modification replication in progress.
         * + **When replicating objects to multiple destination buckets**, the `x-amz-replication-status` header acts differently. The header of the source object will only return a value of COMPLETED when replication is successful to all destinations. The header will remain at value PENDING until replication has completed for all destinations. If one or more destinations fails replication the header will return FAILED.
         *
         * For more information, see [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
         */
        var replicationStatus: aws.sdk.kotlin.services.s3.model.ReplicationStatus? = null
        /**
         * If present, indicates that the requester was successfully charged for the request.
         */
        var requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = null
        /**
         * If the object is an archived object (an object whose storage class is GLACIER), the response includes this header if either the archive restoration is in progress (see [RestoreObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html) or an archive copy is already restored.
         *
         *  If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the object copy. For example:
         *
         * `x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"`
         *
         * If the object restoration is in progress, the header returns the value `ongoing-request="true"`.
         *
         * For more information about archiving objects, see [Transitioning Objects: General Considerations](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations).
         */
        var restore: kotlin.String? = null
        /**
         * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon S3-managed encryption key, the response includes this header with the value of the server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
         */
        var serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = null
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for the object.
         */
        var ssekmsKeyId: kotlin.String? = null
        /**
         * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects.
         *
         * For more information, see [Storage Classes](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html).
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = null
        /**
         * Version of the object.
         */
        var versionId: kotlin.String? = null
        /**
         * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
         */
        var websiteRedirectLocation: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.HeadObjectResponse) : this() {
            this.acceptRanges = x.acceptRanges
            this.archiveStatus = x.archiveStatus
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.cacheControl = x.cacheControl
            this.checksumCrc32 = x.checksumCrc32
            this.checksumCrc32C = x.checksumCrc32C
            this.checksumSha1 = x.checksumSha1
            this.checksumSha256 = x.checksumSha256
            this.contentDisposition = x.contentDisposition
            this.contentEncoding = x.contentEncoding
            this.contentLanguage = x.contentLanguage
            this.contentLength = x.contentLength
            this.contentType = x.contentType
            this.deleteMarker = x.deleteMarker
            this.eTag = x.eTag
            this.expiration = x.expiration
            this.expires = x.expires
            this.lastModified = x.lastModified
            this.metadata = x.metadata
            this.missingMeta = x.missingMeta
            this.objectLockLegalHoldStatus = x.objectLockLegalHoldStatus
            this.objectLockMode = x.objectLockMode
            this.objectLockRetainUntilDate = x.objectLockRetainUntilDate
            this.partsCount = x.partsCount
            this.replicationStatus = x.replicationStatus
            this.requestCharged = x.requestCharged
            this.restore = x.restore
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsKeyId = x.ssekmsKeyId
            this.storageClass = x.storageClass
            this.versionId = x.versionId
            this.websiteRedirectLocation = x.websiteRedirectLocation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.HeadObjectResponse = HeadObjectResponse(this)
    }
}
