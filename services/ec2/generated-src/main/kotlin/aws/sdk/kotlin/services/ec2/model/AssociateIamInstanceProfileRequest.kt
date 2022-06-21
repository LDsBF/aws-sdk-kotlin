// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateIamInstanceProfileRequest private constructor(builder: Builder) {
    /**
     * The IAM instance profile.
     */
    val iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = builder.iamInstanceProfile
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateIamInstanceProfileRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateIamInstanceProfileRequest(")
        append("iamInstanceProfile=$iamInstanceProfile,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = iamInstanceProfile?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateIamInstanceProfileRequest

        if (iamInstanceProfile != other.iamInstanceProfile) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateIamInstanceProfileRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IAM instance profile.
         */
        var iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateIamInstanceProfileRequest) : this() {
            this.iamInstanceProfile = x.iamInstanceProfile
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateIamInstanceProfileRequest = AssociateIamInstanceProfileRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification] inside the given [block]
         */
        fun iamInstanceProfile(block: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.Builder.() -> kotlin.Unit) {
            this.iamInstanceProfile = aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.invoke(block)
        }
    }
}
