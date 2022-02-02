// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribePlacementGroupsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * group-name - The name of the placement group.
     * group-arn - The Amazon Resource Name (ARN) of the placement group.
     * state - The state of the placement group (pending |
     * available | deleting |
     * deleted).
     * strategy - The strategy of the placement group
     * (cluster | spread |
     * partition).
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the placement groups.
     */
    val groupIds: List<String>? = builder.groupIds
    /**
     * The names of the placement groups.
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     */
    val groupNames: List<String>? = builder.groupNames

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribePlacementGroupsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribePlacementGroupsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("groupIds=$groupIds,")
        append("groupNames=$groupNames)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (groupIds?.hashCode() ?: 0)
        result = 31 * result + (groupNames?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribePlacementGroupsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (groupIds != other.groupIds) return false
        if (groupNames != other.groupNames) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribePlacementGroupsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * group-name - The name of the placement group.
         * group-arn - The Amazon Resource Name (ARN) of the placement group.
         * state - The state of the placement group (pending |
         * available | deleting |
         * deleted).
         * strategy - The strategy of the placement group
         * (cluster | spread |
         * partition).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.
         */
        var filters: List<Filter>? = null
        /**
         * The IDs of the placement groups.
         */
        var groupIds: List<String>? = null
        /**
         * The names of the placement groups.
         * Default: Describes all your placement groups, or only those otherwise
         * specified.
         */
        var groupNames: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribePlacementGroupsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.groupIds = x.groupIds
            this.groupNames = x.groupNames
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribePlacementGroupsRequest = DescribePlacementGroupsRequest(this)
    }
}
