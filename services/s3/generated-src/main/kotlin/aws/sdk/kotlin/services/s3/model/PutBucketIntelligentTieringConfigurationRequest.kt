// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketIntelligentTieringConfigurationRequest private constructor(builder: Builder) {
    /**
     * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
     */
    val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     */
    val id: kotlin.String? = builder.id
    /**
     * Container for S3 Intelligent-Tiering configuration.
     */
    val intelligentTieringConfiguration: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration? = builder.intelligentTieringConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketIntelligentTieringConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketIntelligentTieringConfigurationRequest(")
        append("bucket=$bucket,")
        append("id=$id,")
        append("intelligentTieringConfiguration=$intelligentTieringConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (intelligentTieringConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketIntelligentTieringConfigurationRequest

        if (bucket != other.bucket) return false
        if (id != other.id) return false
        if (intelligentTieringConfiguration != other.intelligentTieringConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketIntelligentTieringConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
         */
        var bucket: kotlin.String? = null
        /**
         * The ID used to identify the S3 Intelligent-Tiering configuration.
         */
        var id: kotlin.String? = null
        /**
         * Container for S3 Intelligent-Tiering configuration.
         */
        var intelligentTieringConfiguration: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketIntelligentTieringConfigurationRequest) : this() {
            this.bucket = x.bucket
            this.id = x.id
            this.intelligentTieringConfiguration = x.intelligentTieringConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketIntelligentTieringConfigurationRequest = PutBucketIntelligentTieringConfigurationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration] inside the given [block]
         */
        fun intelligentTieringConfiguration(block: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration.Builder.() -> kotlin.Unit) {
            this.intelligentTieringConfiguration = aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration.invoke(block)
        }
    }
}
