// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class EnableFastLaunchResponse private constructor(builder: Builder) {
    /**
     * The image ID that identifies the Windows AMI for which faster launching was enabled.
     */
    val imageId: kotlin.String? = builder.imageId
    /**
     * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
     */
    val launchTemplate: aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse? = builder.launchTemplate
    /**
     * The maximum number of parallel instances to launch for creating resources.
     */
    val maxParallelLaunches: kotlin.Int? = builder.maxParallelLaunches
    /**
     * The owner ID for the Windows AMI for which faster launching was enabled.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
     */
    val resourceType: aws.sdk.kotlin.services.ec2.model.FastLaunchResourceType? = builder.resourceType
    /**
     * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster launching of the Windows AMI. This property is returned when the associated `resourceType` is `snapshot`.
     */
    val snapshotConfiguration: aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse? = builder.snapshotConfiguration
    /**
     * The current state of faster launching for the specified Windows AMI.
     */
    val state: aws.sdk.kotlin.services.ec2.model.FastLaunchStateCode? = builder.state
    /**
     * The reason that the state changed for faster launching for the Windows AMI.
     */
    val stateTransitionReason: kotlin.String? = builder.stateTransitionReason
    /**
     * The time that the state changed for faster launching for the Windows AMI.
     */
    val stateTransitionTime: aws.smithy.kotlin.runtime.time.Instant? = builder.stateTransitionTime

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableFastLaunchResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableFastLaunchResponse(")
        append("imageId=$imageId,")
        append("launchTemplate=$launchTemplate,")
        append("maxParallelLaunches=$maxParallelLaunches,")
        append("ownerId=$ownerId,")
        append("resourceType=$resourceType,")
        append("snapshotConfiguration=$snapshotConfiguration,")
        append("state=$state,")
        append("stateTransitionReason=$stateTransitionReason,")
        append("stateTransitionTime=$stateTransitionTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = imageId?.hashCode() ?: 0
        result = 31 * result + (launchTemplate?.hashCode() ?: 0)
        result = 31 * result + (maxParallelLaunches ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (snapshotConfiguration?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (stateTransitionReason?.hashCode() ?: 0)
        result = 31 * result + (stateTransitionTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableFastLaunchResponse

        if (imageId != other.imageId) return false
        if (launchTemplate != other.launchTemplate) return false
        if (maxParallelLaunches != other.maxParallelLaunches) return false
        if (ownerId != other.ownerId) return false
        if (resourceType != other.resourceType) return false
        if (snapshotConfiguration != other.snapshotConfiguration) return false
        if (state != other.state) return false
        if (stateTransitionReason != other.stateTransitionReason) return false
        if (stateTransitionTime != other.stateTransitionTime) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableFastLaunchResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The image ID that identifies the Windows AMI for which faster launching was enabled.
         */
        var imageId: kotlin.String? = null
        /**
         * The launch template that is used when launching Windows instances from pre-provisioned snapshots.
         */
        var launchTemplate: aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse? = null
        /**
         * The maximum number of parallel instances to launch for creating resources.
         */
        var maxParallelLaunches: kotlin.Int? = null
        /**
         * The owner ID for the Windows AMI for which faster launching was enabled.
         */
        var ownerId: kotlin.String? = null
        /**
         * The type of resource that was defined for pre-provisioning the Windows AMI for faster launching.
         */
        var resourceType: aws.sdk.kotlin.services.ec2.model.FastLaunchResourceType? = null
        /**
         * The configuration settings that were defined for creating and managing the pre-provisioned snapshots for faster launching of the Windows AMI. This property is returned when the associated `resourceType` is `snapshot`.
         */
        var snapshotConfiguration: aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse? = null
        /**
         * The current state of faster launching for the specified Windows AMI.
         */
        var state: aws.sdk.kotlin.services.ec2.model.FastLaunchStateCode? = null
        /**
         * The reason that the state changed for faster launching for the Windows AMI.
         */
        var stateTransitionReason: kotlin.String? = null
        /**
         * The time that the state changed for faster launching for the Windows AMI.
         */
        var stateTransitionTime: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableFastLaunchResponse) : this() {
            this.imageId = x.imageId
            this.launchTemplate = x.launchTemplate
            this.maxParallelLaunches = x.maxParallelLaunches
            this.ownerId = x.ownerId
            this.resourceType = x.resourceType
            this.snapshotConfiguration = x.snapshotConfiguration
            this.state = x.state
            this.stateTransitionReason = x.stateTransitionReason
            this.stateTransitionTime = x.stateTransitionTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableFastLaunchResponse = EnableFastLaunchResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse] inside the given [block]
         */
        fun launchTemplate(block: aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse.Builder.() -> kotlin.Unit) {
            this.launchTemplate = aws.sdk.kotlin.services.ec2.model.FastLaunchLaunchTemplateSpecificationResponse.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse] inside the given [block]
         */
        fun snapshotConfiguration(block: aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse.Builder.() -> kotlin.Unit) {
            this.snapshotConfiguration = aws.sdk.kotlin.services.ec2.model.FastLaunchSnapshotConfigurationResponse.invoke(block)
        }
    }
}
