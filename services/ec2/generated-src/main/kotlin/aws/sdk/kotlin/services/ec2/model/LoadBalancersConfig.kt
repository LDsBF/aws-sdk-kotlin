// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Classic Load Balancers and target groups to attach to a Spot Fleet request.
 */
class LoadBalancersConfig private constructor(builder: Builder) {
    /**
     * The Classic Load Balancers.
     */
    val classicLoadBalancersConfig: aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig? = builder.classicLoadBalancersConfig
    /**
     * The target groups.
     */
    val targetGroupsConfig: aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig? = builder.targetGroupsConfig

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LoadBalancersConfig(")
        append("classicLoadBalancersConfig=$classicLoadBalancersConfig,")
        append("targetGroupsConfig=$targetGroupsConfig)")
    }

    override fun hashCode(): kotlin.Int {
        var result = classicLoadBalancersConfig?.hashCode() ?: 0
        result = 31 * result + (targetGroupsConfig?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LoadBalancersConfig

        if (classicLoadBalancersConfig != other.classicLoadBalancersConfig) return false
        if (targetGroupsConfig != other.targetGroupsConfig) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Classic Load Balancers.
         */
        var classicLoadBalancersConfig: aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig? = null
        /**
         * The target groups.
         */
        var targetGroupsConfig: aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig) : this() {
            this.classicLoadBalancersConfig = x.classicLoadBalancersConfig
            this.targetGroupsConfig = x.targetGroupsConfig
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig = LoadBalancersConfig(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig] inside the given [block]
         */
        fun classicLoadBalancersConfig(block: aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig.Builder.() -> kotlin.Unit) {
            this.classicLoadBalancersConfig = aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig] inside the given [block]
         */
        fun targetGroupsConfig(block: aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig.Builder.() -> kotlin.Unit) {
            this.targetGroupsConfig = aws.sdk.kotlin.services.ec2.model.TargetGroupsConfig.invoke(block)
        }
    }
}
