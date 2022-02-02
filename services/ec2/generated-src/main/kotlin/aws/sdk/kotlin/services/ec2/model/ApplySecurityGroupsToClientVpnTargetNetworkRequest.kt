// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ApplySecurityGroupsToClientVpnTargetNetworkRequest private constructor(builder: Builder) {
    /**
     * The ID of the Client VPN endpoint.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can
     * be applied to an associated target network.
     */
    val securityGroupIds: List<String>? = builder.securityGroupIds
    /**
     * The ID of the VPC in which the associated target network is located.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ApplySecurityGroupsToClientVpnTargetNetworkRequest(")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("dryRun=$dryRun,")
        append("securityGroupIds=$securityGroupIds,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientVpnEndpointId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (securityGroupIds?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ApplySecurityGroupsToClientVpnTargetNetworkRequest

        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (dryRun != other.dryRun) return false
        if (securityGroupIds != other.securityGroupIds) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the Client VPN endpoint.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can
         * be applied to an associated target network.
         */
        var securityGroupIds: List<String>? = null
        /**
         * The ID of the VPC in which the associated target network is located.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest) : this() {
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.dryRun = x.dryRun
            this.securityGroupIds = x.securityGroupIds
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest = ApplySecurityGroupsToClientVpnTargetNetworkRequest(this)
    }
}
