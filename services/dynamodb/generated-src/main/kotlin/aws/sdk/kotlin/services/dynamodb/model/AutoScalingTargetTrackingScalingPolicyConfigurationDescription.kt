// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a target tracking scaling policy.
 */
class AutoScalingTargetTrackingScalingPolicyConfigurationDescription private constructor(builder: Builder) {
    /**
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     */
    val disableScaleIn: kotlin.Boolean? = builder.disableScaleIn
    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately.
     */
    val scaleInCooldown: kotlin.Int? = builder.scaleInCooldown
    /**
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
     */
    val scaleOutCooldown: kotlin.Int? = builder.scaleOutCooldown
    /**
     * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     */
    val targetValue: kotlin.Double? = builder.targetValue

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AutoScalingTargetTrackingScalingPolicyConfigurationDescription(")
        append("disableScaleIn=$disableScaleIn,")
        append("scaleInCooldown=$scaleInCooldown,")
        append("scaleOutCooldown=$scaleOutCooldown,")
        append("targetValue=$targetValue)")
    }

    override fun hashCode(): kotlin.Int {
        var result = disableScaleIn?.hashCode() ?: 0
        result = 31 * result + (scaleInCooldown ?: 0)
        result = 31 * result + (scaleOutCooldown ?: 0)
        result = 31 * result + (targetValue?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AutoScalingTargetTrackingScalingPolicyConfigurationDescription

        if (disableScaleIn != other.disableScaleIn) return false
        if (scaleInCooldown != other.scaleInCooldown) return false
        if (scaleOutCooldown != other.scaleOutCooldown) return false
        if (targetValue != other.targetValue) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
         */
        var disableScaleIn: kotlin.Boolean? = null
        /**
         * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately.
         */
        var scaleInCooldown: kotlin.Int? = null
        /**
         * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
         */
        var scaleOutCooldown: kotlin.Int? = null
        /**
         * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
         */
        var targetValue: kotlin.Double? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription) : this() {
            this.disableScaleIn = x.disableScaleIn
            this.scaleInCooldown = x.scaleInCooldown
            this.scaleOutCooldown = x.scaleOutCooldown
            this.targetValue = x.targetValue
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription = AutoScalingTargetTrackingScalingPolicyConfigurationDescription(this)
    }
}
