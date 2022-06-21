// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyFpgaImageAttributeResponse private constructor(builder: Builder) {
    /**
     * Information about the attribute.
     */
    val fpgaImageAttribute: aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute? = builder.fpgaImageAttribute

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyFpgaImageAttributeResponse(")
        append("fpgaImageAttribute=$fpgaImageAttribute)")
    }

    override fun hashCode(): kotlin.Int {
        var result = fpgaImageAttribute?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyFpgaImageAttributeResponse

        if (fpgaImageAttribute != other.fpgaImageAttribute) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the attribute.
         */
        var fpgaImageAttribute: aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeResponse) : this() {
            this.fpgaImageAttribute = x.fpgaImageAttribute
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeResponse = ModifyFpgaImageAttributeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute] inside the given [block]
         */
        fun fpgaImageAttribute(block: aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute.Builder.() -> kotlin.Unit) {
            this.fpgaImageAttribute = aws.sdk.kotlin.services.ec2.model.FpgaImageAttribute.invoke(block)
        }
    }
}
