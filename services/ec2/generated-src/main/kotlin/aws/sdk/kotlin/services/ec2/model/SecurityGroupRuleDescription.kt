// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the description of a security group rule.
 *
 * You can use this when you want to update the security group rule description for either an inbound or outbound rule.
 */
class SecurityGroupRuleDescription private constructor(builder: Builder) {
    /**
     * The description of the security group rule.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ID of the security group rule.
     */
    val securityGroupRuleId: kotlin.String? = builder.securityGroupRuleId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SecurityGroupRuleDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SecurityGroupRuleDescription(")
        append("description=$description,")
        append("securityGroupRuleId=$securityGroupRuleId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (securityGroupRuleId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SecurityGroupRuleDescription

        if (description != other.description) return false
        if (securityGroupRuleId != other.securityGroupRuleId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SecurityGroupRuleDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * The description of the security group rule.
         */
        var description: kotlin.String? = null
        /**
         * The ID of the security group rule.
         */
        var securityGroupRuleId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SecurityGroupRuleDescription) : this() {
            this.description = x.description
            this.securityGroupRuleId = x.securityGroupRuleId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SecurityGroupRuleDescription = SecurityGroupRuleDescription(this)
    }
}
