// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyDefaultCreditSpecificationResponse private constructor(builder: Builder) {
    /**
     * The default credit option for CPU usage of the instance family.
     */
    val instanceFamilyCreditSpecification: aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification? = builder.instanceFamilyCreditSpecification

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyDefaultCreditSpecificationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyDefaultCreditSpecificationResponse(")
        append("instanceFamilyCreditSpecification=$instanceFamilyCreditSpecification)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceFamilyCreditSpecification?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyDefaultCreditSpecificationResponse

        if (instanceFamilyCreditSpecification != other.instanceFamilyCreditSpecification) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyDefaultCreditSpecificationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The default credit option for CPU usage of the instance family.
         */
        var instanceFamilyCreditSpecification: aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyDefaultCreditSpecificationResponse) : this() {
            this.instanceFamilyCreditSpecification = x.instanceFamilyCreditSpecification
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyDefaultCreditSpecificationResponse = ModifyDefaultCreditSpecificationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification] inside the given [block]
         */
        fun instanceFamilyCreditSpecification(block: aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification.Builder.() -> kotlin.Unit) {
            this.instanceFamilyCreditSpecification = aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification.invoke(block)
        }
    }
}
