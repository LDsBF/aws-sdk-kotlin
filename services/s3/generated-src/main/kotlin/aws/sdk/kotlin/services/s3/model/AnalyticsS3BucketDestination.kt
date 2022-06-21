// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains information about where to publish the analytics results.
 */
class AnalyticsS3BucketDestination private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.
     *
     *  Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.
     */
    val bucketAccountId: kotlin.String? = builder.bucketAccountId
    /**
     * Specifies the file format used when exporting data to Amazon S3.
     */
    val format: aws.sdk.kotlin.services.s3.model.AnalyticsS3ExportFileFormat? = builder.format
    /**
     * The prefix to use when exporting data. The prefix is prepended to all results.
     */
    val prefix: kotlin.String? = builder.prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.AnalyticsS3BucketDestination = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AnalyticsS3BucketDestination(")
        append("bucket=$bucket,")
        append("bucketAccountId=$bucketAccountId,")
        append("format=$format,")
        append("prefix=$prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (bucketAccountId?.hashCode() ?: 0)
        result = 31 * result + (format?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AnalyticsS3BucketDestination

        if (bucket != other.bucket) return false
        if (bucketAccountId != other.bucketAccountId) return false
        if (format != other.format) return false
        if (prefix != other.prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.AnalyticsS3BucketDestination = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) of the bucket to which data is exported.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.
         *
         *  Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.
         */
        var bucketAccountId: kotlin.String? = null
        /**
         * Specifies the file format used when exporting data to Amazon S3.
         */
        var format: aws.sdk.kotlin.services.s3.model.AnalyticsS3ExportFileFormat? = null
        /**
         * The prefix to use when exporting data. The prefix is prepended to all results.
         */
        var prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.AnalyticsS3BucketDestination) : this() {
            this.bucket = x.bucket
            this.bucketAccountId = x.bucketAccountId
            this.format = x.format
            this.prefix = x.prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.AnalyticsS3BucketDestination = AnalyticsS3BucketDestination(this)
    }
}
