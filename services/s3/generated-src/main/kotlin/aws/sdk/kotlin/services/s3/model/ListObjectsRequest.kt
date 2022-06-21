// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListObjectsRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket containing the objects.
     *
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
     *
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * A delimiter is a character you use to group keys.
     */
    val delimiter: kotlin.String? = builder.delimiter
    /**
     * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
     */
    val encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = builder.encodingType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Marker is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. Marker can be any key in the bucket.
     */
    val marker: kotlin.String? = builder.marker
    /**
     * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
     */
    val maxKeys: kotlin.Int = builder.maxKeys
    /**
     * Limits the response to keys that begin with the specified prefix.
     */
    val prefix: kotlin.String? = builder.prefix
    /**
     * Confirms that the requester knows that she or he will be charged for the list objects request. Bucket owners need not specify this parameter in their requests.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListObjectsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListObjectsRequest(")
        append("bucket=$bucket,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("marker=$marker,")
        append("maxKeys=$maxKeys,")
        append("prefix=$prefix,")
        append("requestPayer=$requestPayer)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (marker?.hashCode() ?: 0)
        result = 31 * result + (maxKeys)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListObjectsRequest

        if (bucket != other.bucket) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (marker != other.marker) return false
        if (maxKeys != other.maxKeys) return false
        if (prefix != other.prefix) return false
        if (requestPayer != other.requestPayer) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListObjectsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket containing the objects.
         *
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
         *
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
         */
        var bucket: kotlin.String? = null
        /**
         * A delimiter is a character you use to group keys.
         */
        var delimiter: kotlin.String? = null
        /**
         * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
         */
        var encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Marker is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. Marker can be any key in the bucket.
         */
        var marker: kotlin.String? = null
        /**
         * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
         */
        var maxKeys: kotlin.Int = 0
        /**
         * Limits the response to keys that begin with the specified prefix.
         */
        var prefix: kotlin.String? = null
        /**
         * Confirms that the requester knows that she or he will be charged for the list objects request. Bucket owners need not specify this parameter in their requests.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListObjectsRequest) : this() {
            this.bucket = x.bucket
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.marker = x.marker
            this.maxKeys = x.maxKeys
            this.prefix = x.prefix
            this.requestPayer = x.requestPayer
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListObjectsRequest = ListObjectsRequest(this)
    }
}
