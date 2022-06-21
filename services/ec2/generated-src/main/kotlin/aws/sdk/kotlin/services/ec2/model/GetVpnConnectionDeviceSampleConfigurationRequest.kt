// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetVpnConnectionDeviceSampleConfigurationRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one of the following versions: `ikev1` or `ikev2`.
     */
    val internetKeyExchangeVersion: kotlin.String? = builder.internetKeyExchangeVersion
    /**
     * Device identifier provided by the `GetVpnConnectionDeviceTypes` API.
     */
    val vpnConnectionDeviceTypeId: kotlin.String? = builder.vpnConnectionDeviceTypeId
    /**
     * The `VpnConnectionId` specifies the Site-to-Site VPN connection used for the sample configuration.
     */
    val vpnConnectionId: kotlin.String? = builder.vpnConnectionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetVpnConnectionDeviceSampleConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetVpnConnectionDeviceSampleConfigurationRequest(")
        append("dryRun=$dryRun,")
        append("internetKeyExchangeVersion=$internetKeyExchangeVersion,")
        append("vpnConnectionDeviceTypeId=$vpnConnectionDeviceTypeId,")
        append("vpnConnectionId=$vpnConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (internetKeyExchangeVersion?.hashCode() ?: 0)
        result = 31 * result + (vpnConnectionDeviceTypeId?.hashCode() ?: 0)
        result = 31 * result + (vpnConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetVpnConnectionDeviceSampleConfigurationRequest

        if (dryRun != other.dryRun) return false
        if (internetKeyExchangeVersion != other.internetKeyExchangeVersion) return false
        if (vpnConnectionDeviceTypeId != other.vpnConnectionDeviceTypeId) return false
        if (vpnConnectionId != other.vpnConnectionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetVpnConnectionDeviceSampleConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one of the following versions: `ikev1` or `ikev2`.
         */
        var internetKeyExchangeVersion: kotlin.String? = null
        /**
         * Device identifier provided by the `GetVpnConnectionDeviceTypes` API.
         */
        var vpnConnectionDeviceTypeId: kotlin.String? = null
        /**
         * The `VpnConnectionId` specifies the Site-to-Site VPN connection used for the sample configuration.
         */
        var vpnConnectionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetVpnConnectionDeviceSampleConfigurationRequest) : this() {
            this.dryRun = x.dryRun
            this.internetKeyExchangeVersion = x.internetKeyExchangeVersion
            this.vpnConnectionDeviceTypeId = x.vpnConnectionDeviceTypeId
            this.vpnConnectionId = x.vpnConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetVpnConnectionDeviceSampleConfigurationRequest = GetVpnConnectionDeviceSampleConfigurationRequest(this)
    }
}
