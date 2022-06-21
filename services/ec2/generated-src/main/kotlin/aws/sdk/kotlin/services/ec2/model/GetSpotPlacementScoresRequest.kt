// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetSpotPlacementScoresRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
     *
     * If you specify `InstanceRequirementsWithMetadata`, you can't specify `InstanceTypes`.
     */
    val instanceRequirementsWithMetadata: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest? = builder.instanceRequirementsWithMetadata
    /**
     * The instance types. We recommend that you specify at least three instance types. If you specify one or two instance types, or specify variations of a single instance type (for example, an `m3.xlarge` with and without instance storage), the returned placement score will always be low.
     *
     * If you specify `InstanceTypes`, you can't specify `InstanceRequirementsWithMetadata`.
     */
    val instanceTypes: List<String>? = builder.instanceTypes
    /**
     * The maximum number of results to return in a single call. Specify a value between 1 and  1000. The default value is 1000. To retrieve the remaining results, make another call with  the returned `NextToken` value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example, `us-east-1`.
     */
    val regionNames: List<String>? = builder.regionNames
    /**
     * Specify `true` so that the response returns a list of scored Availability Zones. Otherwise, the response returns a list of scored Regions.
     *
     * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single Availability Zone.
     */
    val singleAvailabilityZone: kotlin.Boolean? = builder.singleAvailabilityZone
    /**
     * The target capacity.
     */
    val targetCapacity: kotlin.Int? = builder.targetCapacity
    /**
     * The unit for the target capacity.
     *
     * Default: `units` (translates to number of instances)
     */
    val targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = builder.targetCapacityUnitType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetSpotPlacementScoresRequest(")
        append("dryRun=$dryRun,")
        append("instanceRequirementsWithMetadata=$instanceRequirementsWithMetadata,")
        append("instanceTypes=$instanceTypes,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("regionNames=$regionNames,")
        append("singleAvailabilityZone=$singleAvailabilityZone,")
        append("targetCapacity=$targetCapacity,")
        append("targetCapacityUnitType=$targetCapacityUnitType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceRequirementsWithMetadata?.hashCode() ?: 0)
        result = 31 * result + (instanceTypes?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (regionNames?.hashCode() ?: 0)
        result = 31 * result + (singleAvailabilityZone?.hashCode() ?: 0)
        result = 31 * result + (targetCapacity ?: 0)
        result = 31 * result + (targetCapacityUnitType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetSpotPlacementScoresRequest

        if (dryRun != other.dryRun) return false
        if (instanceRequirementsWithMetadata != other.instanceRequirementsWithMetadata) return false
        if (instanceTypes != other.instanceTypes) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (regionNames != other.regionNames) return false
        if (singleAvailabilityZone != other.singleAvailabilityZone) return false
        if (targetCapacity != other.targetCapacity) return false
        if (targetCapacityUnitType != other.targetCapacityUnitType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
         *
         * If you specify `InstanceRequirementsWithMetadata`, you can't specify `InstanceTypes`.
         */
        var instanceRequirementsWithMetadata: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest? = null
        /**
         * The instance types. We recommend that you specify at least three instance types. If you specify one or two instance types, or specify variations of a single instance type (for example, an `m3.xlarge` with and without instance storage), the returned placement score will always be low.
         *
         * If you specify `InstanceTypes`, you can't specify `InstanceRequirementsWithMetadata`.
         */
        var instanceTypes: List<String>? = null
        /**
         * The maximum number of results to return in a single call. Specify a value between 1 and  1000. The default value is 1000. To retrieve the remaining results, make another call with  the returned `NextToken` value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * The Regions used to narrow down the list of Regions to be scored. Enter the Region code, for example, `us-east-1`.
         */
        var regionNames: List<String>? = null
        /**
         * Specify `true` so that the response returns a list of scored Availability Zones. Otherwise, the response returns a list of scored Regions.
         *
         * A list of scored Availability Zones is useful if you want to launch all of your Spot capacity into a single Availability Zone.
         */
        var singleAvailabilityZone: kotlin.Boolean? = null
        /**
         * The target capacity.
         */
        var targetCapacity: kotlin.Int? = null
        /**
         * The unit for the target capacity.
         *
         * Default: `units` (translates to number of instances)
         */
        var targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceRequirementsWithMetadata = x.instanceRequirementsWithMetadata
            this.instanceTypes = x.instanceTypes
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.regionNames = x.regionNames
            this.singleAvailabilityZone = x.singleAvailabilityZone
            this.targetCapacity = x.targetCapacity
            this.targetCapacityUnitType = x.targetCapacityUnitType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresRequest = GetSpotPlacementScoresRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest] inside the given [block]
         */
        fun instanceRequirementsWithMetadata(block: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest.Builder.() -> kotlin.Unit) {
            this.instanceRequirementsWithMetadata = aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest.invoke(block)
        }
    }
}
