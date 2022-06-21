// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class UnassignIpv6AddressesResponse private constructor(builder: Builder) {
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The IPv6 addresses that have been unassigned from the network interface.
     */
    val unassignedIpv6Addresses: List<String>? = builder.unassignedIpv6Addresses
    /**
     * The IPv4 prefixes that have been unassigned from the network interface.
     */
    val unassignedIpv6Prefixes: List<String>? = builder.unassignedIpv6Prefixes

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.UnassignIpv6AddressesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UnassignIpv6AddressesResponse(")
        append("networkInterfaceId=$networkInterfaceId,")
        append("unassignedIpv6Addresses=$unassignedIpv6Addresses,")
        append("unassignedIpv6Prefixes=$unassignedIpv6Prefixes)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInterfaceId?.hashCode() ?: 0
        result = 31 * result + (unassignedIpv6Addresses?.hashCode() ?: 0)
        result = 31 * result + (unassignedIpv6Prefixes?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UnassignIpv6AddressesResponse

        if (networkInterfaceId != other.networkInterfaceId) return false
        if (unassignedIpv6Addresses != other.unassignedIpv6Addresses) return false
        if (unassignedIpv6Prefixes != other.unassignedIpv6Prefixes) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.UnassignIpv6AddressesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The IPv6 addresses that have been unassigned from the network interface.
         */
        var unassignedIpv6Addresses: List<String>? = null
        /**
         * The IPv4 prefixes that have been unassigned from the network interface.
         */
        var unassignedIpv6Prefixes: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.UnassignIpv6AddressesResponse) : this() {
            this.networkInterfaceId = x.networkInterfaceId
            this.unassignedIpv6Addresses = x.unassignedIpv6Addresses
            this.unassignedIpv6Prefixes = x.unassignedIpv6Prefixes
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.UnassignIpv6AddressesResponse = UnassignIpv6AddressesResponse(this)
    }
}
