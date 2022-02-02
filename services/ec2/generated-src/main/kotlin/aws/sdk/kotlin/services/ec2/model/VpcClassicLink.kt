// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes whether a VPC is enabled for ClassicLink.
 */
class VpcClassicLink private constructor(builder: Builder) {
    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     */
    val classicLinkEnabled: kotlin.Boolean? = builder.classicLinkEnabled
    /**
     * Any tags assigned to the VPC.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VpcClassicLink = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VpcClassicLink(")
        append("classicLinkEnabled=$classicLinkEnabled,")
        append("tags=$tags,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = classicLinkEnabled?.hashCode() ?: 0
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VpcClassicLink

        if (classicLinkEnabled != other.classicLinkEnabled) return false
        if (tags != other.tags) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VpcClassicLink = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the VPC is enabled for ClassicLink.
         */
        var classicLinkEnabled: kotlin.Boolean? = null
        /**
         * Any tags assigned to the VPC.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VpcClassicLink) : this() {
            this.classicLinkEnabled = x.classicLinkEnabled
            this.tags = x.tags
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VpcClassicLink = VpcClassicLink(this)
    }
}
