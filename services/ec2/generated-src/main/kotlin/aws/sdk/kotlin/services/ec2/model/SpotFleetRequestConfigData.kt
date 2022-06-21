// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the configuration of a Spot Fleet request.
 */
class SpotFleetRequestConfigData private constructor(builder: Builder) {
    /**
     * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet request.
     *
     * If the allocation strategy is `lowestPrice`, Spot Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy.
     *
     * If the allocation strategy is `diversified`, Spot Fleet launches instances from all the Spot Instance pools that you specify.
     *
     * If the allocation strategy is `capacityOptimized` (recommended), Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To give certain instance types a higher chance of launching first, use `capacityOptimizedPrioritized`. Set a priority for each instance type by using the `Priority` parameter for `LaunchTemplateOverrides`. You can assign the same priority to different `LaunchTemplateOverrides`. EC2 implements the priorities on a best-effort basis, but optimizes for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot Fleet uses a launch template. Note that if the `OnDemandAllocationStrategy` is set to `prioritized`, the same priority is applied when fulfilling On-Demand capacity.
     */
    val allocationStrategy: aws.sdk.kotlin.services.ec2.model.AllocationStrategy? = builder.allocationStrategy
    /**
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Reserved.
     */
    val context: kotlin.String? = builder.context
    /**
     * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
     */
    val excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.ExcessCapacityTerminationPolicy? = builder.excessCapacityTerminationPolicy
    /**
     * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
     */
    val fulfilledCapacity: kotlin.Double? = builder.fulfilledCapacity
    /**
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see [Spot Fleet prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites) in the *Amazon EC2 User Guide for Linux Instances*. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using [CancelSpotFleetRequests](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests) or when the Spot Fleet request expires, if you set `TerminateInstancesWithExpiration`.
     */
    val iamFleetRole: kotlin.String? = builder.iamFleetRole
    /**
     * The behavior when a Spot Instance is interrupted. The default is `terminate`.
     */
    val instanceInterruptionBehavior: aws.sdk.kotlin.services.ec2.model.InstanceInterruptionBehavior? = builder.instanceInterruptionBehavior
    /**
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot **AllocationStrategy** is set to `lowest-price`. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     *
     * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target capacity, Spot Fleet will continue to fulfill your request by drawing from the next cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances from more than the number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you might receive your full target capacity from fewer than the number of pools that you specified.
     */
    val instancePoolsToUseCount: kotlin.Int? = builder.instancePoolsToUseCount
    /**
     * The launch specifications for the Spot Fleet request. If you specify `LaunchSpecifications`, you can't specify `LaunchTemplateConfigs`. If you include On-Demand capacity in your request, you must use `LaunchTemplateConfigs`.
     */
    val launchSpecifications: List<SpotFleetLaunchSpecification>? = builder.launchSpecifications
    /**
     * The launch template and overrides. If you specify `LaunchTemplateConfigs`, you can't specify `LaunchSpecifications`. If you include On-Demand capacity in your request, you must use `LaunchTemplateConfigs`.
     */
    val launchTemplateConfigs: List<LaunchTemplateConfig>? = builder.launchTemplateConfigs
    /**
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups.
     *
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     */
    val loadBalancersConfig: aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig? = builder.loadBalancersConfig
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify `lowestPrice`, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify `prioritized`, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to `lowestPrice`.
     */
    val onDemandAllocationStrategy: aws.sdk.kotlin.services.ec2.model.OnDemandAllocationStrategy? = builder.onDemandAllocationStrategy
    /**
     * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     */
    val onDemandFulfilledCapacity: kotlin.Double? = builder.onDemandFulfilledCapacity
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     */
    val onDemandMaxTotalPrice: kotlin.String? = builder.onDemandMaxTotalPrice
    /**
     * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     */
    val onDemandTargetCapacity: kotlin.Int? = builder.onDemandTargetCapacity
    /**
     * Indicates whether Spot Fleet should replace unhealthy instances.
     */
    val replaceUnhealthyInstances: kotlin.Boolean? = builder.replaceUnhealthyInstances
    /**
     * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
     */
    val spotMaintenanceStrategies: aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies? = builder.spotMaintenanceStrategies
    /**
     * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the `spotdMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     */
    val spotMaxTotalPrice: kotlin.String? = builder.spotMaxTotalPrice
    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
     */
    val spotPrice: kotlin.String? = builder.spotPrice
    /**
     * The key-value pair for tagging the Spot Fleet request on creation. The value for `ResourceType` must be `spot-fleet-request`, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template) (valid only if you use `LaunchTemplateConfigs`) or in the `SpotFleetTagSpecification`[](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html) (valid only if you use `LaunchSpecifications`). For information about tagging after launch, see [Tagging Your Resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources).
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     */
    val targetCapacity: kotlin.Int? = builder.targetCapacity
    /**
     * The unit for the target capacity.
     *
     * Default: `units` (translates to number of instances)
     */
    val targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = builder.targetCapacityUnitType
    /**
     * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
     */
    val terminateInstancesWithExpiration: kotlin.Boolean? = builder.terminateInstancesWithExpiration
    /**
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is `request`, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is `maintain`, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: `maintain`. `instant` is listed but is not used by Spot Fleet.
     */
    val type: aws.sdk.kotlin.services.ec2.model.FleetType? = builder.type
    /**
     * The start date and time of the request, in UTC format (*YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). By default, Amazon EC2 starts fulfilling the request immediately.
     */
    val validFrom: aws.smithy.kotlin.runtime.time.Instant? = builder.validFrom
    /**
     * The end date and time of the request, in UTC format (*YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
     */
    val validUntil: aws.smithy.kotlin.runtime.time.Instant? = builder.validUntil

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotFleetRequestConfigData(")
        append("allocationStrategy=$allocationStrategy,")
        append("clientToken=$clientToken,")
        append("context=$context,")
        append("excessCapacityTerminationPolicy=$excessCapacityTerminationPolicy,")
        append("fulfilledCapacity=$fulfilledCapacity,")
        append("iamFleetRole=$iamFleetRole,")
        append("instanceInterruptionBehavior=$instanceInterruptionBehavior,")
        append("instancePoolsToUseCount=$instancePoolsToUseCount,")
        append("launchSpecifications=$launchSpecifications,")
        append("launchTemplateConfigs=$launchTemplateConfigs,")
        append("loadBalancersConfig=$loadBalancersConfig,")
        append("onDemandAllocationStrategy=$onDemandAllocationStrategy,")
        append("onDemandFulfilledCapacity=$onDemandFulfilledCapacity,")
        append("onDemandMaxTotalPrice=$onDemandMaxTotalPrice,")
        append("onDemandTargetCapacity=$onDemandTargetCapacity,")
        append("replaceUnhealthyInstances=$replaceUnhealthyInstances,")
        append("spotMaintenanceStrategies=$spotMaintenanceStrategies,")
        append("spotMaxTotalPrice=$spotMaxTotalPrice,")
        append("spotPrice=$spotPrice,")
        append("tagSpecifications=$tagSpecifications,")
        append("targetCapacity=$targetCapacity,")
        append("targetCapacityUnitType=$targetCapacityUnitType,")
        append("terminateInstancesWithExpiration=$terminateInstancesWithExpiration,")
        append("type=$type,")
        append("validFrom=$validFrom,")
        append("validUntil=$validUntil)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationStrategy?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (context?.hashCode() ?: 0)
        result = 31 * result + (excessCapacityTerminationPolicy?.hashCode() ?: 0)
        result = 31 * result + (fulfilledCapacity?.hashCode() ?: 0)
        result = 31 * result + (iamFleetRole?.hashCode() ?: 0)
        result = 31 * result + (instanceInterruptionBehavior?.hashCode() ?: 0)
        result = 31 * result + (instancePoolsToUseCount ?: 0)
        result = 31 * result + (launchSpecifications?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateConfigs?.hashCode() ?: 0)
        result = 31 * result + (loadBalancersConfig?.hashCode() ?: 0)
        result = 31 * result + (onDemandAllocationStrategy?.hashCode() ?: 0)
        result = 31 * result + (onDemandFulfilledCapacity?.hashCode() ?: 0)
        result = 31 * result + (onDemandMaxTotalPrice?.hashCode() ?: 0)
        result = 31 * result + (onDemandTargetCapacity ?: 0)
        result = 31 * result + (replaceUnhealthyInstances?.hashCode() ?: 0)
        result = 31 * result + (spotMaintenanceStrategies?.hashCode() ?: 0)
        result = 31 * result + (spotMaxTotalPrice?.hashCode() ?: 0)
        result = 31 * result + (spotPrice?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (targetCapacity ?: 0)
        result = 31 * result + (targetCapacityUnitType?.hashCode() ?: 0)
        result = 31 * result + (terminateInstancesWithExpiration?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (validFrom?.hashCode() ?: 0)
        result = 31 * result + (validUntil?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotFleetRequestConfigData

        if (allocationStrategy != other.allocationStrategy) return false
        if (clientToken != other.clientToken) return false
        if (context != other.context) return false
        if (excessCapacityTerminationPolicy != other.excessCapacityTerminationPolicy) return false
        if (fulfilledCapacity != other.fulfilledCapacity) return false
        if (iamFleetRole != other.iamFleetRole) return false
        if (instanceInterruptionBehavior != other.instanceInterruptionBehavior) return false
        if (instancePoolsToUseCount != other.instancePoolsToUseCount) return false
        if (launchSpecifications != other.launchSpecifications) return false
        if (launchTemplateConfigs != other.launchTemplateConfigs) return false
        if (loadBalancersConfig != other.loadBalancersConfig) return false
        if (onDemandAllocationStrategy != other.onDemandAllocationStrategy) return false
        if (onDemandFulfilledCapacity != other.onDemandFulfilledCapacity) return false
        if (onDemandMaxTotalPrice != other.onDemandMaxTotalPrice) return false
        if (onDemandTargetCapacity != other.onDemandTargetCapacity) return false
        if (replaceUnhealthyInstances != other.replaceUnhealthyInstances) return false
        if (spotMaintenanceStrategies != other.spotMaintenanceStrategies) return false
        if (spotMaxTotalPrice != other.spotMaxTotalPrice) return false
        if (spotPrice != other.spotPrice) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (targetCapacity != other.targetCapacity) return false
        if (targetCapacityUnitType != other.targetCapacityUnitType) return false
        if (terminateInstancesWithExpiration != other.terminateInstancesWithExpiration) return false
        if (type != other.type) return false
        if (validFrom != other.validFrom) return false
        if (validUntil != other.validUntil) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet request.
         *
         * If the allocation strategy is `lowestPrice`, Spot Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy.
         *
         * If the allocation strategy is `diversified`, Spot Fleet launches instances from all the Spot Instance pools that you specify.
         *
         * If the allocation strategy is `capacityOptimized` (recommended), Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To give certain instance types a higher chance of launching first, use `capacityOptimizedPrioritized`. Set a priority for each instance type by using the `Priority` parameter for `LaunchTemplateOverrides`. You can assign the same priority to different `LaunchTemplateOverrides`. EC2 implements the priorities on a best-effort basis, but optimizes for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot Fleet uses a launch template. Note that if the `OnDemandAllocationStrategy` is set to `prioritized`, the same priority is applied when fulfilling On-Demand capacity.
         */
        var allocationStrategy: aws.sdk.kotlin.services.ec2.model.AllocationStrategy? = null
        /**
         * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Reserved.
         */
        var context: kotlin.String? = null
        /**
         * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
         */
        var excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.ExcessCapacityTerminationPolicy? = null
        /**
         * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
         */
        var fulfilledCapacity: kotlin.Double? = null
        /**
         * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see [Spot Fleet prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites) in the *Amazon EC2 User Guide for Linux Instances*. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using [CancelSpotFleetRequests](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests) or when the Spot Fleet request expires, if you set `TerminateInstancesWithExpiration`.
         */
        var iamFleetRole: kotlin.String? = null
        /**
         * The behavior when a Spot Instance is interrupted. The default is `terminate`.
         */
        var instanceInterruptionBehavior: aws.sdk.kotlin.services.ec2.model.InstanceInterruptionBehavior? = null
        /**
         * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot **AllocationStrategy** is set to `lowest-price`. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
         *
         * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target capacity, Spot Fleet will continue to fulfill your request by drawing from the next cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances from more than the number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you might receive your full target capacity from fewer than the number of pools that you specified.
         */
        var instancePoolsToUseCount: kotlin.Int? = null
        /**
         * The launch specifications for the Spot Fleet request. If you specify `LaunchSpecifications`, you can't specify `LaunchTemplateConfigs`. If you include On-Demand capacity in your request, you must use `LaunchTemplateConfigs`.
         */
        var launchSpecifications: List<SpotFleetLaunchSpecification>? = null
        /**
         * The launch template and overrides. If you specify `LaunchTemplateConfigs`, you can't specify `LaunchSpecifications`. If you include On-Demand capacity in your request, you must use `LaunchTemplateConfigs`.
         */
        var launchTemplateConfigs: List<LaunchTemplateConfig>? = null
        /**
         * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups.
         *
         * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
         */
        var loadBalancersConfig: aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig? = null
        /**
         * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify `lowestPrice`, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify `prioritized`, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to `lowestPrice`.
         */
        var onDemandAllocationStrategy: aws.sdk.kotlin.services.ec2.model.OnDemandAllocationStrategy? = null
        /**
         * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
         */
        var onDemandFulfilledCapacity: kotlin.Double? = null
        /**
         * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
         */
        var onDemandMaxTotalPrice: kotlin.String? = null
        /**
         * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
         */
        var onDemandTargetCapacity: kotlin.Int? = null
        /**
         * Indicates whether Spot Fleet should replace unhealthy instances.
         */
        var replaceUnhealthyInstances: kotlin.Boolean? = null
        /**
         * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
         */
        var spotMaintenanceStrategies: aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies? = null
        /**
         * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the `spotdMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
         */
        var spotMaxTotalPrice: kotlin.String? = null
        /**
         * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
         */
        var spotPrice: kotlin.String? = null
        /**
         * The key-value pair for tagging the Spot Fleet request on creation. The value for `ResourceType` must be `spot-fleet-request`, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template) (valid only if you use `LaunchTemplateConfigs`) or in the `SpotFleetTagSpecification`[](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html) (valid only if you use `LaunchSpecifications`). For information about tagging after launch, see [Tagging Your Resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources).
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
         */
        var targetCapacity: kotlin.Int? = null
        /**
         * The unit for the target capacity.
         *
         * Default: `units` (translates to number of instances)
         */
        var targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = null
        /**
         * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
         */
        var terminateInstancesWithExpiration: kotlin.Boolean? = null
        /**
         * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is `request`, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is `maintain`, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: `maintain`. `instant` is listed but is not used by Spot Fleet.
         */
        var type: aws.sdk.kotlin.services.ec2.model.FleetType? = null
        /**
         * The start date and time of the request, in UTC format (*YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). By default, Amazon EC2 starts fulfilling the request immediately.
         */
        var validFrom: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The end date and time of the request, in UTC format (*YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
         */
        var validUntil: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData) : this() {
            this.allocationStrategy = x.allocationStrategy
            this.clientToken = x.clientToken
            this.context = x.context
            this.excessCapacityTerminationPolicy = x.excessCapacityTerminationPolicy
            this.fulfilledCapacity = x.fulfilledCapacity
            this.iamFleetRole = x.iamFleetRole
            this.instanceInterruptionBehavior = x.instanceInterruptionBehavior
            this.instancePoolsToUseCount = x.instancePoolsToUseCount
            this.launchSpecifications = x.launchSpecifications
            this.launchTemplateConfigs = x.launchTemplateConfigs
            this.loadBalancersConfig = x.loadBalancersConfig
            this.onDemandAllocationStrategy = x.onDemandAllocationStrategy
            this.onDemandFulfilledCapacity = x.onDemandFulfilledCapacity
            this.onDemandMaxTotalPrice = x.onDemandMaxTotalPrice
            this.onDemandTargetCapacity = x.onDemandTargetCapacity
            this.replaceUnhealthyInstances = x.replaceUnhealthyInstances
            this.spotMaintenanceStrategies = x.spotMaintenanceStrategies
            this.spotMaxTotalPrice = x.spotMaxTotalPrice
            this.spotPrice = x.spotPrice
            this.tagSpecifications = x.tagSpecifications
            this.targetCapacity = x.targetCapacity
            this.targetCapacityUnitType = x.targetCapacityUnitType
            this.terminateInstancesWithExpiration = x.terminateInstancesWithExpiration
            this.type = x.type
            this.validFrom = x.validFrom
            this.validUntil = x.validUntil
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData = SpotFleetRequestConfigData(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig] inside the given [block]
         */
        fun loadBalancersConfig(block: aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig.Builder.() -> kotlin.Unit) {
            this.loadBalancersConfig = aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies] inside the given [block]
         */
        fun spotMaintenanceStrategies(block: aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies.Builder.() -> kotlin.Unit) {
            this.spotMaintenanceStrategies = aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies.invoke(block)
        }
    }
}
