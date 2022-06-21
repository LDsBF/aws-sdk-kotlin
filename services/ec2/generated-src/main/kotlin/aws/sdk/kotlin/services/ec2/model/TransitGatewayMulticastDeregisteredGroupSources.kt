// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the deregistered transit gateway multicast group sources.
 */
class TransitGatewayMulticastDeregisteredGroupSources private constructor(builder: Builder) {
    /**
     * The network interface IDs of the non-registered members.
     */
    val deregisteredNetworkInterfaceIds: List<String>? = builder.deregisteredNetworkInterfaceIds
    /**
     * The IP address assigned to the transit gateway multicast group.
     */
    val groupIpAddress: kotlin.String? = builder.groupIpAddress
    /**
     * The ID of the transit gateway multicast domain.
     */
    val transitGatewayMulticastDomainId: kotlin.String? = builder.transitGatewayMulticastDomainId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDeregisteredGroupSources = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayMulticastDeregisteredGroupSources(")
        append("deregisteredNetworkInterfaceIds=$deregisteredNetworkInterfaceIds,")
        append("groupIpAddress=$groupIpAddress,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deregisteredNetworkInterfaceIds?.hashCode() ?: 0
        result = 31 * result + (groupIpAddress?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayMulticastDeregisteredGroupSources

        if (deregisteredNetworkInterfaceIds != other.deregisteredNetworkInterfaceIds) return false
        if (groupIpAddress != other.groupIpAddress) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDeregisteredGroupSources = Builder(this).apply(block).build()

    class Builder {
        /**
         * The network interface IDs of the non-registered members.
         */
        var deregisteredNetworkInterfaceIds: List<String>? = null
        /**
         * The IP address assigned to the transit gateway multicast group.
         */
        var groupIpAddress: kotlin.String? = null
        /**
         * The ID of the transit gateway multicast domain.
         */
        var transitGatewayMulticastDomainId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDeregisteredGroupSources) : this() {
            this.deregisteredNetworkInterfaceIds = x.deregisteredNetworkInterfaceIds
            this.groupIpAddress = x.groupIpAddress
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDeregisteredGroupSources = TransitGatewayMulticastDeregisteredGroupSources(this)
    }
}
