// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeNetworkAclsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * association.association-id - The ID of an association ID for the ACL.
     * association.network-acl-id - The ID of the network ACL involved in the association.
     * association.subnet-id - The ID of the subnet involved in the association.
     * default - Indicates whether the ACL is the default network ACL for the VPC.
     * entry.cidr - The IPv4 CIDR range specified in the entry.
     * entry.icmp.code - The ICMP code specified in the entry, if any.
     * entry.icmp.type - The ICMP type specified in the entry, if any.
     * entry.ipv6-cidr - The IPv6 CIDR range specified in the entry.
     * entry.port-range.from - The start of the port range specified in the entry.
     * entry.port-range.to - The end of the port range specified in the entry.
     * entry.protocol - The protocol specified in the entry (tcp | udp | icmp or a protocol number).
     * entry.rule-action - Allows or denies the matching traffic (allow | deny).
     * entry.rule-number - The number of an entry (in other words, rule) in
     * the set of ACL entries.
     * network-acl-id - The ID of the network ACL.
     * owner-id - The ID of the Amazon Web Services account that owns the network ACL.
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * vpc-id - The ID of the VPC for the network ACL.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * One or more network ACL IDs.
     * Default: Describes all your network ACLs.
     */
    val networkAclIds: List<String>? = builder.networkAclIds
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkAclsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("networkAclIds=$networkAclIds,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (networkAclIds?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkAclsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (networkAclIds != other.networkAclIds) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * association.association-id - The ID of an association ID for the ACL.
         * association.network-acl-id - The ID of the network ACL involved in the association.
         * association.subnet-id - The ID of the subnet involved in the association.
         * default - Indicates whether the ACL is the default network ACL for the VPC.
         * entry.cidr - The IPv4 CIDR range specified in the entry.
         * entry.icmp.code - The ICMP code specified in the entry, if any.
         * entry.icmp.type - The ICMP type specified in the entry, if any.
         * entry.ipv6-cidr - The IPv6 CIDR range specified in the entry.
         * entry.port-range.from - The start of the port range specified in the entry.
         * entry.port-range.to - The end of the port range specified in the entry.
         * entry.protocol - The protocol specified in the entry (tcp | udp | icmp or a protocol number).
         * entry.rule-action - Allows or denies the matching traffic (allow | deny).
         * entry.rule-number - The number of an entry (in other words, rule) in
         * the set of ACL entries.
         * network-acl-id - The ID of the network ACL.
         * owner-id - The ID of the Amazon Web Services account that owns the network ACL.
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * vpc-id - The ID of the VPC for the network ACL.
         */
        var filters: List<Filter>? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * One or more network ACL IDs.
         * Default: Describes all your network ACLs.
         */
        var networkAclIds: List<String>? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.networkAclIds = x.networkAclIds
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsRequest = DescribeNetworkAclsRequest(this)
    }
}
