// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreatePlacementGroupRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * A name for the placement group. Must be unique within the scope of your account for the Region.
     *
     * Constraints: Up to 255 ASCII characters
     */
    val groupName: kotlin.String? = builder.groupName
    /**
     * The number of partitions. Valid only when **Strategy** is set to `partition`.
     */
    val partitionCount: kotlin.Int? = builder.partitionCount
    /**
     * The placement strategy.
     */
    val strategy: aws.sdk.kotlin.services.ec2.model.PlacementStrategy? = builder.strategy
    /**
     * The tags to apply to the new placement group.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreatePlacementGroupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreatePlacementGroupRequest(")
        append("dryRun=$dryRun,")
        append("groupName=$groupName,")
        append("partitionCount=$partitionCount,")
        append("strategy=$strategy,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groupName?.hashCode() ?: 0)
        result = 31 * result + (partitionCount ?: 0)
        result = 31 * result + (strategy?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreatePlacementGroupRequest

        if (dryRun != other.dryRun) return false
        if (groupName != other.groupName) return false
        if (partitionCount != other.partitionCount) return false
        if (strategy != other.strategy) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreatePlacementGroupRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * A name for the placement group. Must be unique within the scope of your account for the Region.
         *
         * Constraints: Up to 255 ASCII characters
         */
        var groupName: kotlin.String? = null
        /**
         * The number of partitions. Valid only when **Strategy** is set to `partition`.
         */
        var partitionCount: kotlin.Int? = null
        /**
         * The placement strategy.
         */
        var strategy: aws.sdk.kotlin.services.ec2.model.PlacementStrategy? = null
        /**
         * The tags to apply to the new placement group.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreatePlacementGroupRequest) : this() {
            this.dryRun = x.dryRun
            this.groupName = x.groupName
            this.partitionCount = x.partitionCount
            this.strategy = x.strategy
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreatePlacementGroupRequest = CreatePlacementGroupRequest(this)
    }
}
