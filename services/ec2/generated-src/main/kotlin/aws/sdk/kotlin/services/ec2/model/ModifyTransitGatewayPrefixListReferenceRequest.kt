// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayPrefixListReferenceRequest private constructor(builder: Builder) {
    /**
     * Indicates whether to drop traffic that matches this route.
     */
    val blackhole: kotlin.Boolean? = builder.blackhole
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the prefix list.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * The ID of the attachment to which traffic is routed.
     */
    val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway route table.
     */
    val transitGatewayRouteTableId: kotlin.String? = builder.transitGatewayRouteTableId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayPrefixListReferenceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayPrefixListReferenceRequest(")
        append("blackhole=$blackhole,")
        append("dryRun=$dryRun,")
        append("prefixListId=$prefixListId,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayRouteTableId=$transitGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blackhole?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTransitGatewayPrefixListReferenceRequest

        if (blackhole != other.blackhole) return false
        if (dryRun != other.dryRun) return false
        if (prefixListId != other.prefixListId) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayRouteTableId != other.transitGatewayRouteTableId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayPrefixListReferenceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether to drop traffic that matches this route.
         */
        var blackhole: kotlin.Boolean? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the prefix list.
         */
        var prefixListId: kotlin.String? = null
        /**
         * The ID of the attachment to which traffic is routed.
         */
        var transitGatewayAttachmentId: kotlin.String? = null
        /**
         * The ID of the transit gateway route table.
         */
        var transitGatewayRouteTableId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayPrefixListReferenceRequest) : this() {
            this.blackhole = x.blackhole
            this.dryRun = x.dryRun
            this.prefixListId = x.prefixListId
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayRouteTableId = x.transitGatewayRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayPrefixListReferenceRequest = ModifyTransitGatewayPrefixListReferenceRequest(this)
    }
}
