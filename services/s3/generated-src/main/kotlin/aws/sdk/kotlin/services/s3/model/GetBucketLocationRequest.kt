// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketLocationRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket for which to get the location.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketLocationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketLocationRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketLocationRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketLocationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket for which to get the location.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        var expectedBucketOwner: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketLocationRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketLocationRequest = GetBucketLocationRequest(this)
    }
}
