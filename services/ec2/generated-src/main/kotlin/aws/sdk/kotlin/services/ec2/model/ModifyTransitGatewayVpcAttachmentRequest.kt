// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayVpcAttachmentRequest private constructor(builder: Builder) {
    /**
     * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
     */
    val addSubnetIds: List<String>? = builder.addSubnetIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The new VPC attachment options.
     */
    val options: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions? = builder.options
    /**
     * The IDs of one or more subnets to remove.
     */
    val removeSubnetIds: List<String>? = builder.removeSubnetIds
    /**
     * The ID of the attachment.
     */
    val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayVpcAttachmentRequest(")
        append("addSubnetIds=$addSubnetIds,")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("removeSubnetIds=$removeSubnetIds,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addSubnetIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (removeSubnetIds?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTransitGatewayVpcAttachmentRequest

        if (addSubnetIds != other.addSubnetIds) return false
        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (removeSubnetIds != other.removeSubnetIds) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
         */
        var addSubnetIds: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The new VPC attachment options.
         */
        var options: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions? = null
        /**
         * The IDs of one or more subnets to remove.
         */
        var removeSubnetIds: List<String>? = null
        /**
         * The ID of the attachment.
         */
        var transitGatewayAttachmentId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest) : this() {
            this.addSubnetIds = x.addSubnetIds
            this.dryRun = x.dryRun
            this.options = x.options
            this.removeSubnetIds = x.removeSubnetIds
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest = ModifyTransitGatewayVpcAttachmentRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions] inside the given [block]
         */
        fun options(block: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions.Builder.() -> kotlin.Unit) {
            this.options = aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions.invoke(block)
        }
    }
}
