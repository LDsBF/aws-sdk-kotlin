// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketAnalyticsConfigurationRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket from which an analytics configuration is deleted.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The ID that identifies the analytics configuration.
     */
    val id: kotlin.String? = builder.id

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.DeleteBucketAnalyticsConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketAnalyticsConfigurationRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("id=$id)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteBucketAnalyticsConfigurationRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (id != other.id) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.DeleteBucketAnalyticsConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket from which an analytics configuration is deleted.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The ID that identifies the analytics configuration.
         */
        var id: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.DeleteBucketAnalyticsConfigurationRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
            this.id = x.id
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.DeleteBucketAnalyticsConfigurationRequest = DeleteBucketAnalyticsConfigurationRequest(this)
    }
}
