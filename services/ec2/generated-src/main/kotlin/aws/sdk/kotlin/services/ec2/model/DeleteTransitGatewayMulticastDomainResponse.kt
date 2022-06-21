// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteTransitGatewayMulticastDomainResponse private constructor(builder: Builder) {
    /**
     * Information about the deleted transit gateway multicast domain.
     */
    val transitGatewayMulticastDomain: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomain? = builder.transitGatewayMulticastDomain

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayMulticastDomainResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayMulticastDomainResponse(")
        append("transitGatewayMulticastDomain=$transitGatewayMulticastDomain)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayMulticastDomain?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTransitGatewayMulticastDomainResponse

        if (transitGatewayMulticastDomain != other.transitGatewayMulticastDomain) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayMulticastDomainResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the deleted transit gateway multicast domain.
         */
        var transitGatewayMulticastDomain: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomain? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayMulticastDomainResponse) : this() {
            this.transitGatewayMulticastDomain = x.transitGatewayMulticastDomain
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayMulticastDomainResponse = DeleteTransitGatewayMulticastDomainResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomain] inside the given [block]
         */
        fun transitGatewayMulticastDomain(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomain.Builder.() -> kotlin.Unit) {
            this.transitGatewayMulticastDomain = aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomain.invoke(block)
        }
    }
}
