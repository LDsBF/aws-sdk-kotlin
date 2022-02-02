// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTrafficMirrorFilterRuleResponse private constructor(builder: Builder) {
    /**
     * Modifies a Traffic Mirror rule.
     */
    val trafficMirrorFilterRule: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule? = builder.trafficMirrorFilterRule

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterRuleResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTrafficMirrorFilterRuleResponse(")
        append("trafficMirrorFilterRule=$trafficMirrorFilterRule)")
    }

    override fun hashCode(): kotlin.Int {
        var result = trafficMirrorFilterRule?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTrafficMirrorFilterRuleResponse

        if (trafficMirrorFilterRule != other.trafficMirrorFilterRule) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterRuleResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Modifies a Traffic Mirror rule.
         */
        var trafficMirrorFilterRule: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterRuleResponse) : this() {
            this.trafficMirrorFilterRule = x.trafficMirrorFilterRule
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterRuleResponse = ModifyTrafficMirrorFilterRuleResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule] inside the given [block]
         */
        fun trafficMirrorFilterRule(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule.Builder.() -> kotlin.Unit) {
            this.trafficMirrorFilterRule = aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRule.invoke(block)
        }
    }
}
