// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AuthorizeClientVpnIngressRequest private constructor(builder: Builder) {
    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity provider (IdP) group. Required if `AuthorizeAllGroups` is `false` or not specified.
     */
    val accessGroupId: kotlin.String? = builder.accessGroupId
    /**
     * Indicates whether to grant access to all clients. Specify `true` to grant all clients who successfully establish a VPN connection access to the network. Must be set to `true` if `AccessGroupId` is not specified.
     */
    val authorizeAllGroups: kotlin.Boolean? = builder.authorizeAllGroups
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The ID of the Client VPN endpoint.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * A brief description of the authorization rule.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
     */
    val targetNetworkCidr: kotlin.String? = builder.targetNetworkCidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AuthorizeClientVpnIngressRequest(")
        append("accessGroupId=$accessGroupId,")
        append("authorizeAllGroups=$authorizeAllGroups,")
        append("clientToken=$clientToken,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("targetNetworkCidr=$targetNetworkCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accessGroupId?.hashCode() ?: 0
        result = 31 * result + (authorizeAllGroups?.hashCode() ?: 0)
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (targetNetworkCidr?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AuthorizeClientVpnIngressRequest

        if (accessGroupId != other.accessGroupId) return false
        if (authorizeAllGroups != other.authorizeAllGroups) return false
        if (clientToken != other.clientToken) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (targetNetworkCidr != other.targetNetworkCidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the group to grant access to, for example, the Active Directory group or identity provider (IdP) group. Required if `AuthorizeAllGroups` is `false` or not specified.
         */
        var accessGroupId: kotlin.String? = null
        /**
         * Indicates whether to grant access to all clients. Specify `true` to grant all clients who successfully establish a VPN connection access to the network. Must be set to `true` if `AccessGroupId` is not specified.
         */
        var authorizeAllGroups: kotlin.Boolean? = null
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * The ID of the Client VPN endpoint.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * A brief description of the authorization rule.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
         */
        var targetNetworkCidr: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressRequest) : this() {
            this.accessGroupId = x.accessGroupId
            this.authorizeAllGroups = x.authorizeAllGroups
            this.clientToken = x.clientToken
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.description = x.description
            this.dryRun = x.dryRun
            this.targetNetworkCidr = x.targetNetworkCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressRequest = AuthorizeClientVpnIngressRequest(this)
    }
}
