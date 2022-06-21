// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the destination for an export image task.
 */
class ExportTaskS3LocationRequest private constructor(builder: Builder) {
    /**
     * The destination Amazon S3 bucket.
     */
    val s3Bucket: kotlin.String? = builder.s3Bucket
    /**
     * The prefix (logical hierarchy) in the bucket.
     */
    val s3Prefix: kotlin.String? = builder.s3Prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportTaskS3LocationRequest(")
        append("s3Bucket=$s3Bucket,")
        append("s3Prefix=$s3Prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = s3Bucket?.hashCode() ?: 0
        result = 31 * result + (s3Prefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportTaskS3LocationRequest

        if (s3Bucket != other.s3Bucket) return false
        if (s3Prefix != other.s3Prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The destination Amazon S3 bucket.
         */
        var s3Bucket: kotlin.String? = null
        /**
         * The prefix (logical hierarchy) in the bucket.
         */
        var s3Prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest) : this() {
            this.s3Bucket = x.s3Bucket
            this.s3Prefix = x.s3Prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest = ExportTaskS3LocationRequest(this)
    }
}
