// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains all the possible checksum or digest values for an object.
 */
class Checksum private constructor(builder: Builder) {
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

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Checksum = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Checksum(")
        append("checksumCrc32=$checksumCrc32,")
        append("checksumCrc32C=$checksumCrc32C,")
        append("checksumSha1=$checksumSha1,")
        append("checksumSha256=$checksumSha256)")
    }

    override fun hashCode(): kotlin.Int {
        var result = checksumCrc32?.hashCode() ?: 0
        result = 31 * result + (checksumCrc32C?.hashCode() ?: 0)
        result = 31 * result + (checksumSha1?.hashCode() ?: 0)
        result = 31 * result + (checksumSha256?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Checksum

        if (checksumCrc32 != other.checksumCrc32) return false
        if (checksumCrc32C != other.checksumCrc32C) return false
        if (checksumSha1 != other.checksumSha1) return false
        if (checksumSha256 != other.checksumSha256) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Checksum = Builder(this).apply(block).build()

    class Builder {
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

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Checksum) : this() {
            this.checksumCrc32 = x.checksumCrc32
            this.checksumCrc32C = x.checksumCrc32C
            this.checksumSha1 = x.checksumSha1
            this.checksumSha256 = x.checksumSha256
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Checksum = Checksum(this)
    }
}
