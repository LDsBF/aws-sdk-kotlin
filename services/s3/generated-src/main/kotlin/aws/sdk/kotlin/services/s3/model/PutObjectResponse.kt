// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutObjectResponse private constructor(builder: Builder) {
    /**
     * Indicates whether the uploaded object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
     */
    val bucketKeyEnabled: kotlin.Boolean = builder.bucketKeyEnabled
    /**
     * Entity tag for the uploaded object.
     */
    val eTag: kotlin.String? = builder.eTag
    /**
     * If the expiration is configured for the object (see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">PutBucketLifecycleConfiguration), the response includes this header. It
     * includes the expiry-date and rule-id key-value pairs that provide information about object
     * expiration. The value of the rule-id is URL encoded.
     */
    val expiration: kotlin.String? = builder.expiration
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = builder.requestCharged
    /**
     * If you specified server-side encryption either with an Amazon Web Services KMS key
     * or Amazon S3-managed encryption key in your PUT request, the response includes this header. It
     * confirms the encryption algorithm that Amazon S3 used to encrypt the object.
     */
    val serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = builder.serverSideEncryption
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the
     * response will include this header confirming the encryption algorithm used.
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the
     * response will include this header to provide round-trip message integrity verification of
     * the customer-provided encryption key.
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
     * value of this header is a base64-encoded UTF-8 string holding JSON with the encryption
     * context key-value pairs.
     */
    val ssekmsEncryptionContext: kotlin.String? = builder.ssekmsEncryptionContext
    /**
     * If x-amz-server-side-encryption is present and has the value of
     * aws:kms, this header specifies the ID of the Amazon Web Services Key Management Service
     * (Amazon Web Services KMS) symmetric customer managed key that was used for the
     * object.
     */
    val ssekmsKeyId: kotlin.String? = builder.ssekmsKeyId
    /**
     * Version of the object.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutObjectResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutObjectResponse(")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("eTag=$eTag,")
        append("expiration=$expiration,")
        append("requestCharged=$requestCharged,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucketKeyEnabled.hashCode()
        result = 31 * result + (eTag?.hashCode() ?: 0)
        result = 31 * result + (expiration?.hashCode() ?: 0)
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsEncryptionContext?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutObjectResponse

        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (eTag != other.eTag) return false
        if (expiration != other.expiration) return false
        if (requestCharged != other.requestCharged) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsEncryptionContext != other.ssekmsEncryptionContext) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutObjectResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the uploaded object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        var bucketKeyEnabled: kotlin.Boolean = false
        /**
         * Entity tag for the uploaded object.
         */
        var eTag: kotlin.String? = null
        /**
         * If the expiration is configured for the object (see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">PutBucketLifecycleConfiguration), the response includes this header. It
         * includes the expiry-date and rule-id key-value pairs that provide information about object
         * expiration. The value of the rule-id is URL encoded.
         */
        var expiration: kotlin.String? = null
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = null
        /**
         * If you specified server-side encryption either with an Amazon Web Services KMS key
         * or Amazon S3-managed encryption key in your PUT request, the response includes this header. It
         * confirms the encryption algorithm that Amazon S3 used to encrypt the object.
         */
        var serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = null
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header confirming the encryption algorithm used.
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header to provide round-trip message integrity verification of
         * the customer-provided encryption key.
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
         * value of this header is a base64-encoded UTF-8 string holding JSON with the encryption
         * context key-value pairs.
         */
        var ssekmsEncryptionContext: kotlin.String? = null
        /**
         * If x-amz-server-side-encryption is present and has the value of
         * aws:kms, this header specifies the ID of the Amazon Web Services Key Management Service
         * (Amazon Web Services KMS) symmetric customer managed key that was used for the
         * object.
         */
        var ssekmsKeyId: kotlin.String? = null
        /**
         * Version of the object.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutObjectResponse) : this() {
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.eTag = x.eTag
            this.expiration = x.expiration
            this.requestCharged = x.requestCharged
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsEncryptionContext = x.ssekmsEncryptionContext
            this.ssekmsKeyId = x.ssekmsKeyId
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutObjectResponse = PutObjectResponse(this)
    }
}
