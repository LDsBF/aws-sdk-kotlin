// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a linked EC2-Classic instance.
 */
class ClassicLinkInstance private constructor(builder: Builder) {
    /**
     * A list of security groups.
     */
    val groups: List<GroupIdentifier>? = builder.groups
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * Any tags assigned to the instance.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClassicLinkInstance = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClassicLinkInstance(")
        append("groups=$groups,")
        append("instanceId=$instanceId,")
        append("tags=$tags,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groups?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClassicLinkInstance

        if (groups != other.groups) return false
        if (instanceId != other.instanceId) return false
        if (tags != other.tags) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClassicLinkInstance = Builder(this).apply(block).build()

    class Builder {
        /**
         * A list of security groups.
         */
        var groups: List<GroupIdentifier>? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * Any tags assigned to the instance.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClassicLinkInstance) : this() {
            this.groups = x.groups
            this.instanceId = x.instanceId
            this.tags = x.tags
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClassicLinkInstance = ClassicLinkInstance(this)
    }
}
