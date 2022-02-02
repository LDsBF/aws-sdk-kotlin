// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for information about access control for replicas.
 */
class AccessControlTranslation private constructor(builder: Builder) {
    /**
     * Specifies the replica ownership. For default and valid values, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
     * replication in the Amazon S3 API Reference.
     */
    val owner: aws.sdk.kotlin.services.s3.model.OwnerOverride? = builder.owner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.AccessControlTranslation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AccessControlTranslation(")
        append("owner=$owner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = owner?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AccessControlTranslation

        if (owner != other.owner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.AccessControlTranslation = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the replica ownership. For default and valid values, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
         * replication in the Amazon S3 API Reference.
         */
        var owner: aws.sdk.kotlin.services.s3.model.OwnerOverride? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.AccessControlTranslation) : this() {
            this.owner = x.owner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.AccessControlTranslation = AccessControlTranslation(this)
    }
}
