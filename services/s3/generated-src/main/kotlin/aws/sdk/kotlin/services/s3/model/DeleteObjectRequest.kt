// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteObjectRequest private constructor(builder: Builder) {
    /**
     * The bucket name of the bucket containing the object.
     *
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
     *
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * Indicates whether S3 Object Lock should bypass Governance-mode restrictions to process this operation. To use this header, you must have the `s3:BypassGovernanceRetention` permission.
     */
    val bypassGovernanceRetention: kotlin.Boolean = builder.bypassGovernanceRetention
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Key name of the object to delete.
     */
    val key: kotlin.String? = requireNotNull(builder.key) { "A non-null value must be provided for key" }
    /**
     * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device. Required to permanently delete a versioned object if versioning is configured with MFA delete enabled.
     */
    val mfa: kotlin.String? = builder.mfa
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from Requester Pays buckets, see [Downloading Objects in Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html) in the *Amazon S3 User Guide*.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * VersionId used to reference a specific version of the object.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.DeleteObjectRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteObjectRequest(")
        append("bucket=$bucket,")
        append("bypassGovernanceRetention=$bypassGovernanceRetention,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("key=$key,")
        append("mfa=$mfa,")
        append("requestPayer=$requestPayer,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (bypassGovernanceRetention.hashCode())
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (mfa?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteObjectRequest

        if (bucket != other.bucket) return false
        if (bypassGovernanceRetention != other.bypassGovernanceRetention) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (key != other.key) return false
        if (mfa != other.mfa) return false
        if (requestPayer != other.requestPayer) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.DeleteObjectRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket name of the bucket containing the object.
         *
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
         *
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
         */
        var bucket: kotlin.String? = null
        /**
         * Indicates whether S3 Object Lock should bypass Governance-mode restrictions to process this operation. To use this header, you must have the `s3:BypassGovernanceRetention` permission.
         */
        var bypassGovernanceRetention: kotlin.Boolean = false
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Key name of the object to delete.
         */
        var key: kotlin.String? = null
        /**
         * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device. Required to permanently delete a versioned object if versioning is configured with MFA delete enabled.
         */
        var mfa: kotlin.String? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from Requester Pays buckets, see [Downloading Objects in Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html) in the *Amazon S3 User Guide*.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * VersionId used to reference a specific version of the object.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.DeleteObjectRequest) : this() {
            this.bucket = x.bucket
            this.bypassGovernanceRetention = x.bypassGovernanceRetention
            this.expectedBucketOwner = x.expectedBucketOwner
            this.key = x.key
            this.mfa = x.mfa
            this.requestPayer = x.requestPayer
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.DeleteObjectRequest = DeleteObjectRequest(this)
    }
}
