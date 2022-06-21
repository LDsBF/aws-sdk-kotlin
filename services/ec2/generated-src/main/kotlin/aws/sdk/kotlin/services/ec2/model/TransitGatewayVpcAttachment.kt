// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a VPC attachment.
 */
class TransitGatewayVpcAttachment private constructor(builder: Builder) {
    /**
     * The creation time.
     */
    val creationTime: aws.smithy.kotlin.runtime.time.Instant? = builder.creationTime
    /**
     * The VPC attachment options.
     */
    val options: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachmentOptions? = builder.options
    /**
     * The state of the VPC attachment. Note that the `initiating` state has been deprecated.
     */
    val state: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentState? = builder.state
    /**
     * The IDs of the subnets.
     */
    val subnetIds: List<String>? = builder.subnetIds
    /**
     * The tags for the VPC attachment.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the attachment.
     */
    val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway.
     */
    val transitGatewayId: kotlin.String? = builder.transitGatewayId
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId
    /**
     * The ID of the Amazon Web Services account that owns the VPC.
     */
    val vpcOwnerId: kotlin.String? = builder.vpcOwnerId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayVpcAttachment(")
        append("creationTime=$creationTime,")
        append("options=$options,")
        append("state=$state,")
        append("subnetIds=$subnetIds,")
        append("tags=$tags,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayId=$transitGatewayId,")
        append("vpcId=$vpcId,")
        append("vpcOwnerId=$vpcOwnerId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = creationTime?.hashCode() ?: 0
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (subnetIds?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpcOwnerId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayVpcAttachment

        if (creationTime != other.creationTime) return false
        if (options != other.options) return false
        if (state != other.state) return false
        if (subnetIds != other.subnetIds) return false
        if (tags != other.tags) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (vpcId != other.vpcId) return false
        if (vpcOwnerId != other.vpcOwnerId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment = Builder(this).apply(block).build()

    class Builder {
        /**
         * The creation time.
         */
        var creationTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The VPC attachment options.
         */
        var options: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachmentOptions? = null
        /**
         * The state of the VPC attachment. Note that the `initiating` state has been deprecated.
         */
        var state: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentState? = null
        /**
         * The IDs of the subnets.
         */
        var subnetIds: List<String>? = null
        /**
         * The tags for the VPC attachment.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the attachment.
         */
        var transitGatewayAttachmentId: kotlin.String? = null
        /**
         * The ID of the transit gateway.
         */
        var transitGatewayId: kotlin.String? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the VPC.
         */
        var vpcOwnerId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment) : this() {
            this.creationTime = x.creationTime
            this.options = x.options
            this.state = x.state
            this.subnetIds = x.subnetIds
            this.tags = x.tags
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayId = x.transitGatewayId
            this.vpcId = x.vpcId
            this.vpcOwnerId = x.vpcOwnerId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment = TransitGatewayVpcAttachment(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachmentOptions] inside the given [block]
         */
        fun options(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachmentOptions.Builder.() -> kotlin.Unit) {
            this.options = aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachmentOptions.invoke(block)
        }
    }
}
