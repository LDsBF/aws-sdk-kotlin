// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for ModifySpotFleetRequest.
 */
class ModifySpotFleetRequestRequest private constructor(builder: Builder) {
    /**
     * Reserved.
     */
    val context: kotlin.String? = builder.context
    /**
     * Indicates whether running Spot Instances should be terminated if the target capacity
     * of the Spot Fleet request is decreased below the current size of the Spot Fleet.
     */
    val excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.ExcessCapacityTerminationPolicy? = builder.excessCapacityTerminationPolicy
    /**
     * The launch template and overrides. You can only use this parameter if you specified a
     * launch template (LaunchTemplateConfigs) in your Spot Fleet request. If you
     * specified LaunchSpecifications in your Spot Fleet request, then omit this
     * parameter.
     */
    val launchTemplateConfigs: List<LaunchTemplateConfig>? = builder.launchTemplateConfigs
    /**
     * The number of On-Demand Instances in the fleet.
     */
    val onDemandTargetCapacity: kotlin.Int? = builder.onDemandTargetCapacity
    /**
     * The ID of the Spot Fleet request.
     */
    val spotFleetRequestId: kotlin.String? = builder.spotFleetRequestId
    /**
     * The size of the fleet.
     */
    val targetCapacity: kotlin.Int? = builder.targetCapacity

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifySpotFleetRequestRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifySpotFleetRequestRequest(")
        append("context=$context,")
        append("excessCapacityTerminationPolicy=$excessCapacityTerminationPolicy,")
        append("launchTemplateConfigs=$launchTemplateConfigs,")
        append("onDemandTargetCapacity=$onDemandTargetCapacity,")
        append("spotFleetRequestId=$spotFleetRequestId,")
        append("targetCapacity=$targetCapacity)")
    }

    override fun hashCode(): kotlin.Int {
        var result = context?.hashCode() ?: 0
        result = 31 * result + (excessCapacityTerminationPolicy?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateConfigs?.hashCode() ?: 0)
        result = 31 * result + (onDemandTargetCapacity ?: 0)
        result = 31 * result + (spotFleetRequestId?.hashCode() ?: 0)
        result = 31 * result + (targetCapacity ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifySpotFleetRequestRequest

        if (context != other.context) return false
        if (excessCapacityTerminationPolicy != other.excessCapacityTerminationPolicy) return false
        if (launchTemplateConfigs != other.launchTemplateConfigs) return false
        if (onDemandTargetCapacity != other.onDemandTargetCapacity) return false
        if (spotFleetRequestId != other.spotFleetRequestId) return false
        if (targetCapacity != other.targetCapacity) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifySpotFleetRequestRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Reserved.
         */
        var context: kotlin.String? = null
        /**
         * Indicates whether running Spot Instances should be terminated if the target capacity
         * of the Spot Fleet request is decreased below the current size of the Spot Fleet.
         */
        var excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.ExcessCapacityTerminationPolicy? = null
        /**
         * The launch template and overrides. You can only use this parameter if you specified a
         * launch template (LaunchTemplateConfigs) in your Spot Fleet request. If you
         * specified LaunchSpecifications in your Spot Fleet request, then omit this
         * parameter.
         */
        var launchTemplateConfigs: List<LaunchTemplateConfig>? = null
        /**
         * The number of On-Demand Instances in the fleet.
         */
        var onDemandTargetCapacity: kotlin.Int? = null
        /**
         * The ID of the Spot Fleet request.
         */
        var spotFleetRequestId: kotlin.String? = null
        /**
         * The size of the fleet.
         */
        var targetCapacity: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifySpotFleetRequestRequest) : this() {
            this.context = x.context
            this.excessCapacityTerminationPolicy = x.excessCapacityTerminationPolicy
            this.launchTemplateConfigs = x.launchTemplateConfigs
            this.onDemandTargetCapacity = x.onDemandTargetCapacity
            this.spotFleetRequestId = x.spotFleetRequestId
            this.targetCapacity = x.targetCapacity
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifySpotFleetRequestRequest = ModifySpotFleetRequestRequest(this)
    }
}
