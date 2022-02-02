// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteClientVpnRouteRequest private constructor(builder: Builder) {
    /**
     * The ID of the Client VPN endpoint from which the route is to be deleted.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * The IPv4 address range, in CIDR notation, of the route to be deleted.
     */
    val destinationCidrBlock: kotlin.String? = builder.destinationCidrBlock
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the target subnet used by the route.
     */
    val targetVpcSubnetId: kotlin.String? = builder.targetVpcSubnetId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteClientVpnRouteRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteClientVpnRouteRequest(")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("destinationCidrBlock=$destinationCidrBlock,")
        append("dryRun=$dryRun,")
        append("targetVpcSubnetId=$targetVpcSubnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientVpnEndpointId?.hashCode() ?: 0
        result = 31 * result + (destinationCidrBlock?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (targetVpcSubnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteClientVpnRouteRequest

        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (destinationCidrBlock != other.destinationCidrBlock) return false
        if (dryRun != other.dryRun) return false
        if (targetVpcSubnetId != other.targetVpcSubnetId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteClientVpnRouteRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the Client VPN endpoint from which the route is to be deleted.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * The IPv4 address range, in CIDR notation, of the route to be deleted.
         */
        var destinationCidrBlock: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the target subnet used by the route.
         */
        var targetVpcSubnetId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteClientVpnRouteRequest) : this() {
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.destinationCidrBlock = x.destinationCidrBlock
            this.dryRun = x.dryRun
            this.targetVpcSubnetId = x.targetVpcSubnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteClientVpnRouteRequest = DeleteClientVpnRouteRequest(this)
    }
}
