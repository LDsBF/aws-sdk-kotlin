// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateAddressResponse private constructor(builder: Builder) {

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateAddressResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateAddressResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        return this::class.hashCode()
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateAddressResponse

        return true
    }

    class Builder {

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateAddressResponse) : this() {
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateAddressResponse = DisassociateAddressResponse(this)
    }
}
