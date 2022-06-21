// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketPolicyStatusResponse private constructor(builder: Builder) {
    /**
     * The policy status for the specified bucket.
     */
    val policyStatus: aws.sdk.kotlin.services.s3.model.PolicyStatus? = builder.policyStatus

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketPolicyStatusResponse(")
        append("policyStatus=$policyStatus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = policyStatus?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketPolicyStatusResponse

        if (policyStatus != other.policyStatus) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The policy status for the specified bucket.
         */
        var policyStatus: aws.sdk.kotlin.services.s3.model.PolicyStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusResponse) : this() {
            this.policyStatus = x.policyStatus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusResponse = GetBucketPolicyStatusResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.PolicyStatus] inside the given [block]
         */
        fun policyStatus(block: aws.sdk.kotlin.services.s3.model.PolicyStatus.Builder.() -> kotlin.Unit) {
            this.policyStatus = aws.sdk.kotlin.services.s3.model.PolicyStatus.invoke(block)
        }
    }
}
