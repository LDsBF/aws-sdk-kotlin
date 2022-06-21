// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class CreateFleetRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Reserved.
     */
    val context: kotlin.String? = builder.context
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
     */
    val excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.FleetExcessCapacityTerminationPolicy? = builder.excessCapacityTerminationPolicy
    /**
     * The configuration for the EC2 Fleet.
     */
    val launchTemplateConfigs: List<FleetLaunchTemplateConfigRequest>? = builder.launchTemplateConfigs
    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    val onDemandOptions: aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest? = builder.onDemandOptions
    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances. Supported only for fleets of type `maintain`. For more information, see [EC2 Fleet health checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks) in the *Amazon EC2 User Guide*.
     */
    val replaceUnhealthyInstances: kotlin.Boolean? = builder.replaceUnhealthyInstances
    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    val spotOptions: aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest? = builder.spotOptions
    /**
     * The key-value pair for tagging the EC2 Fleet request on creation. For more information, see [Tagging your resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources).
     *
     * If the fleet type is `instant`, specify a resource type of `fleet` to tag the fleet or `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request`, specify a resource type of `fleet` to tag the fleet. You cannot specify a resource type of `instance`. To tag instances at launch, specify the tags in a [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template).
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The number of units to request.
     */
    val targetCapacitySpecification: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest? = builder.targetCapacitySpecification
    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */
    val terminateInstancesWithExpiration: kotlin.Boolean? = builder.terminateInstancesWithExpiration
    /**
     * The fleet type. The default value is `maintain`.
     * + `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
     * + `request` - The EC2 Fleet places an asynchronous one-time request for your desired capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.
     * + `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity, and returns errors for any instances that could not be launched.
     *
     * For more information, see [EC2 Fleet request types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the *Amazon EC2 User Guide*.
     */
    val type: aws.sdk.kotlin.services.ec2.model.FleetType? = builder.type
    /**
     * The start date and time of the request, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). The default is to start fulfilling the request immediately.
     */
    val validFrom: aws.smithy.kotlin.runtime.time.Instant? = builder.validFrom
    /**
     * The end date and time of the request, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     */
    val validUntil: aws.smithy.kotlin.runtime.time.Instant? = builder.validUntil

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateFleetRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateFleetRequest(")
        append("clientToken=$clientToken,")
        append("context=$context,")
        append("dryRun=$dryRun,")
        append("excessCapacityTerminationPolicy=$excessCapacityTerminationPolicy,")
        append("launchTemplateConfigs=$launchTemplateConfigs,")
        append("onDemandOptions=$onDemandOptions,")
        append("replaceUnhealthyInstances=$replaceUnhealthyInstances,")
        append("spotOptions=$spotOptions,")
        append("tagSpecifications=$tagSpecifications,")
        append("targetCapacitySpecification=$targetCapacitySpecification,")
        append("terminateInstancesWithExpiration=$terminateInstancesWithExpiration,")
        append("type=$type,")
        append("validFrom=$validFrom,")
        append("validUntil=$validUntil)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (context?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (excessCapacityTerminationPolicy?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateConfigs?.hashCode() ?: 0)
        result = 31 * result + (onDemandOptions?.hashCode() ?: 0)
        result = 31 * result + (replaceUnhealthyInstances?.hashCode() ?: 0)
        result = 31 * result + (spotOptions?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (targetCapacitySpecification?.hashCode() ?: 0)
        result = 31 * result + (terminateInstancesWithExpiration?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (validFrom?.hashCode() ?: 0)
        result = 31 * result + (validUntil?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateFleetRequest

        if (clientToken != other.clientToken) return false
        if (context != other.context) return false
        if (dryRun != other.dryRun) return false
        if (excessCapacityTerminationPolicy != other.excessCapacityTerminationPolicy) return false
        if (launchTemplateConfigs != other.launchTemplateConfigs) return false
        if (onDemandOptions != other.onDemandOptions) return false
        if (replaceUnhealthyInstances != other.replaceUnhealthyInstances) return false
        if (spotOptions != other.spotOptions) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (targetCapacitySpecification != other.targetCapacitySpecification) return false
        if (terminateInstancesWithExpiration != other.terminateInstancesWithExpiration) return false
        if (type != other.type) return false
        if (validFrom != other.validFrom) return false
        if (validUntil != other.validUntil) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateFleetRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Reserved.
         */
        var context: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
         */
        var excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.FleetExcessCapacityTerminationPolicy? = null
        /**
         * The configuration for the EC2 Fleet.
         */
        var launchTemplateConfigs: List<FleetLaunchTemplateConfigRequest>? = null
        /**
         * Describes the configuration of On-Demand Instances in an EC2 Fleet.
         */
        var onDemandOptions: aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest? = null
        /**
         * Indicates whether EC2 Fleet should replace unhealthy Spot Instances. Supported only for fleets of type `maintain`. For more information, see [EC2 Fleet health checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks) in the *Amazon EC2 User Guide*.
         */
        var replaceUnhealthyInstances: kotlin.Boolean? = null
        /**
         * Describes the configuration of Spot Instances in an EC2 Fleet.
         */
        var spotOptions: aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest? = null
        /**
         * The key-value pair for tagging the EC2 Fleet request on creation. For more information, see [Tagging your resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources).
         *
         * If the fleet type is `instant`, specify a resource type of `fleet` to tag the fleet or `instance` to tag the instances at launch.
         *
         * If the fleet type is `maintain` or `request`, specify a resource type of `fleet` to tag the fleet. You cannot specify a resource type of `instance`. To tag instances at launch, specify the tags in a [launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template).
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The number of units to request.
         */
        var targetCapacitySpecification: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest? = null
        /**
         * Indicates whether running instances should be terminated when the EC2 Fleet expires.
         */
        var terminateInstancesWithExpiration: kotlin.Boolean? = null
        /**
         * The fleet type. The default value is `maintain`.
         * + `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
         * + `request` - The EC2 Fleet places an asynchronous one-time request for your desired capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.
         * + `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity, and returns errors for any instances that could not be launched.
         *
         * For more information, see [EC2 Fleet request types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the *Amazon EC2 User Guide*.
         */
        var type: aws.sdk.kotlin.services.ec2.model.FleetType? = null
        /**
         * The start date and time of the request, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). The default is to start fulfilling the request immediately.
         */
        var validFrom: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The end date and time of the request, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
         */
        var validUntil: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateFleetRequest) : this() {
            this.clientToken = x.clientToken
            this.context = x.context
            this.dryRun = x.dryRun
            this.excessCapacityTerminationPolicy = x.excessCapacityTerminationPolicy
            this.launchTemplateConfigs = x.launchTemplateConfigs
            this.onDemandOptions = x.onDemandOptions
            this.replaceUnhealthyInstances = x.replaceUnhealthyInstances
            this.spotOptions = x.spotOptions
            this.tagSpecifications = x.tagSpecifications
            this.targetCapacitySpecification = x.targetCapacitySpecification
            this.terminateInstancesWithExpiration = x.terminateInstancesWithExpiration
            this.type = x.type
            this.validFrom = x.validFrom
            this.validUntil = x.validUntil
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateFleetRequest = CreateFleetRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest] inside the given [block]
         */
        fun onDemandOptions(block: aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest.Builder.() -> kotlin.Unit) {
            this.onDemandOptions = aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest] inside the given [block]
         */
        fun spotOptions(block: aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest.Builder.() -> kotlin.Unit) {
            this.spotOptions = aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest] inside the given [block]
         */
        fun targetCapacitySpecification(block: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest.Builder.() -> kotlin.Unit) {
            this.targetCapacitySpecification = aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest.invoke(block)
        }
    }
}
