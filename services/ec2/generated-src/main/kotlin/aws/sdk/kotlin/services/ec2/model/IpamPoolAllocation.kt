// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * In IPAM, an allocation is a CIDR assignment from an IPAM pool to another resource or IPAM pool.
 */
class IpamPoolAllocation private constructor(builder: Builder) {
    /**
     * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is 10.24.34.0/23. An IPv6 CIDR example is 2001:DB8::/32.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * A description of the pool allocation.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ID of an allocation.
     */
    val ipamPoolAllocationId: kotlin.String? = builder.ipamPoolAllocationId
    /**
     * The ID of the resource.
     */
    val resourceId: kotlin.String? = builder.resourceId
    /**
     * The owner of the resource.
     */
    val resourceOwner: kotlin.String? = builder.resourceOwner
    /**
     * The Amazon Web Services Region of the resource.
     */
    val resourceRegion: kotlin.String? = builder.resourceRegion
    /**
     * The type of the resource.
     */
    val resourceType: aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType? = builder.resourceType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.IpamPoolAllocation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IpamPoolAllocation(")
        append("cidr=$cidr,")
        append("description=$description,")
        append("ipamPoolAllocationId=$ipamPoolAllocationId,")
        append("resourceId=$resourceId,")
        append("resourceOwner=$resourceOwner,")
        append("resourceRegion=$resourceRegion,")
        append("resourceType=$resourceType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (ipamPoolAllocationId?.hashCode() ?: 0)
        result = 31 * result + (resourceId?.hashCode() ?: 0)
        result = 31 * result + (resourceOwner?.hashCode() ?: 0)
        result = 31 * result + (resourceRegion?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IpamPoolAllocation

        if (cidr != other.cidr) return false
        if (description != other.description) return false
        if (ipamPoolAllocationId != other.ipamPoolAllocationId) return false
        if (resourceId != other.resourceId) return false
        if (resourceOwner != other.resourceOwner) return false
        if (resourceRegion != other.resourceRegion) return false
        if (resourceType != other.resourceType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.IpamPoolAllocation = Builder(this).apply(block).build()

    class Builder {
        /**
         * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or netmask) and
         * refers to a range of IP addresses. An IPv4 CIDR example is 10.24.34.0/23. An IPv6 CIDR example is 2001:DB8::/32.
         */
        var cidr: kotlin.String? = null
        /**
         * A description of the pool allocation.
         */
        var description: kotlin.String? = null
        /**
         * The ID of an allocation.
         */
        var ipamPoolAllocationId: kotlin.String? = null
        /**
         * The ID of the resource.
         */
        var resourceId: kotlin.String? = null
        /**
         * The owner of the resource.
         */
        var resourceOwner: kotlin.String? = null
        /**
         * The Amazon Web Services Region of the resource.
         */
        var resourceRegion: kotlin.String? = null
        /**
         * The type of the resource.
         */
        var resourceType: aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.IpamPoolAllocation) : this() {
            this.cidr = x.cidr
            this.description = x.description
            this.ipamPoolAllocationId = x.ipamPoolAllocationId
            this.resourceId = x.resourceId
            this.resourceOwner = x.resourceOwner
            this.resourceRegion = x.resourceRegion
            this.resourceType = x.resourceType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.IpamPoolAllocation = IpamPoolAllocation(this)
    }
}
