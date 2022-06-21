// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DeleteVpnGateway.
 */
class DeleteVpnGatewayRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the virtual private gateway.
     */
    val vpnGatewayId: kotlin.String? = builder.vpnGatewayId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpnGatewayRequest(")
        append("dryRun=$dryRun,")
        append("vpnGatewayId=$vpnGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (vpnGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteVpnGatewayRequest

        if (dryRun != other.dryRun) return false
        if (vpnGatewayId != other.vpnGatewayId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the virtual private gateway.
         */
        var vpnGatewayId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayRequest) : this() {
            this.dryRun = x.dryRun
            this.vpnGatewayId = x.vpnGatewayId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayRequest = DeleteVpnGatewayRequest(this)
    }
}
