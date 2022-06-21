// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketMetricsConfigurationsRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket containing the metrics configurations to retrieve.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The marker that is used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
     */
    val continuationToken: kotlin.String? = builder.continuationToken
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketMetricsConfigurationsRequest(")
        append("bucket=$bucket,")
        append("continuationToken=$continuationToken,")
        append("expectedBucketOwner=$expectedBucketOwner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (continuationToken?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListBucketMetricsConfigurationsRequest

        if (bucket != other.bucket) return false
        if (continuationToken != other.continuationToken) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket containing the metrics configurations to retrieve.
         */
        var bucket: kotlin.String? = null
        /**
         * The marker that is used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
         */
        var continuationToken: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        var expectedBucketOwner: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsRequest) : this() {
            this.bucket = x.bucket
            this.continuationToken = x.continuationToken
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsRequest = ListBucketMetricsConfigurationsRequest(this)
    }
}
