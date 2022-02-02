// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeAddressesRequest private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; Information about the allocation IDs.
     */
    val allocationIds: List<String>? = builder.allocationIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters. Filter names and values are case-sensitive.
     * allocation-id - &#91;EC2-VPC&#93; The allocation ID for the address.
     * association-id - &#91;EC2-VPC&#93; The association ID for the address.
     * domain - Indicates whether the address is for use in EC2-Classic (standard)
     * or in a VPC (vpc).
     * instance-id - The ID of the instance the address is associated with, if any.
     * network-border-group -  A unique set of Availability Zones, Local Zones,
     * or Wavelength Zones from where Amazon Web Services advertises IP addresses.
     * network-interface-id - &#91;EC2-VPC&#93; The ID of the network interface that the address is associated with, if any.
     * network-interface-owner-id - The Amazon Web Services account ID of the owner.
     * private-ip-address - &#91;EC2-VPC&#93; The private IP address associated with the Elastic IP address.
     * public-ip - The Elastic IP address, or the carrier IP address.
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * One or more Elastic IP addresses.
     * Default: Describes all your Elastic IP addresses.
     */
    val publicIps: List<String>? = builder.publicIps

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeAddressesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAddressesRequest(")
        append("allocationIds=$allocationIds,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("publicIps=$publicIps)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (publicIps?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeAddressesRequest

        if (allocationIds != other.allocationIds) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (publicIps != other.publicIps) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeAddressesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * &#91;EC2-VPC&#93; Information about the allocation IDs.
         */
        var allocationIds: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters. Filter names and values are case-sensitive.
         * allocation-id - &#91;EC2-VPC&#93; The allocation ID for the address.
         * association-id - &#91;EC2-VPC&#93; The association ID for the address.
         * domain - Indicates whether the address is for use in EC2-Classic (standard)
         * or in a VPC (vpc).
         * instance-id - The ID of the instance the address is associated with, if any.
         * network-border-group -  A unique set of Availability Zones, Local Zones,
         * or Wavelength Zones from where Amazon Web Services advertises IP addresses.
         * network-interface-id - &#91;EC2-VPC&#93; The ID of the network interface that the address is associated with, if any.
         * network-interface-owner-id - The Amazon Web Services account ID of the owner.
         * private-ip-address - &#91;EC2-VPC&#93; The private IP address associated with the Elastic IP address.
         * public-ip - The Elastic IP address, or the carrier IP address.
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         */
        var filters: List<Filter>? = null
        /**
         * One or more Elastic IP addresses.
         * Default: Describes all your Elastic IP addresses.
         */
        var publicIps: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeAddressesRequest) : this() {
            this.allocationIds = x.allocationIds
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.publicIps = x.publicIps
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeAddressesRequest = DescribeAddressesRequest(this)
    }
}
