// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the options for a VPC attachment.
 */
class CreateTransitGatewayVpcAttachmentRequestOptions private constructor(builder: Builder) {
    /**
     * Enable or disable support for appliance mode. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. The default is `disable`.
     */
    val applianceModeSupport: aws.sdk.kotlin.services.ec2.model.ApplianceModeSupportValue? = builder.applianceModeSupport
    /**
     * Enable or disable DNS support. The default is `enable`.
     */
    val dnsSupport: aws.sdk.kotlin.services.ec2.model.DnsSupportValue? = builder.dnsSupport
    /**
     * Enable or disable IPv6 support. The default is `disable`.
     */
    val ipv6Support: aws.sdk.kotlin.services.ec2.model.Ipv6SupportValue? = builder.ipv6Support

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTransitGatewayVpcAttachmentRequestOptions(")
        append("applianceModeSupport=$applianceModeSupport,")
        append("dnsSupport=$dnsSupport,")
        append("ipv6Support=$ipv6Support)")
    }

    override fun hashCode(): kotlin.Int {
        var result = applianceModeSupport?.hashCode() ?: 0
        result = 31 * result + (dnsSupport?.hashCode() ?: 0)
        result = 31 * result + (ipv6Support?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTransitGatewayVpcAttachmentRequestOptions

        if (applianceModeSupport != other.applianceModeSupport) return false
        if (dnsSupport != other.dnsSupport) return false
        if (ipv6Support != other.ipv6Support) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions = Builder(this).apply(block).build()

    class Builder {
        /**
         * Enable or disable support for appliance mode. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. The default is `disable`.
         */
        var applianceModeSupport: aws.sdk.kotlin.services.ec2.model.ApplianceModeSupportValue? = null
        /**
         * Enable or disable DNS support. The default is `enable`.
         */
        var dnsSupport: aws.sdk.kotlin.services.ec2.model.DnsSupportValue? = null
        /**
         * Enable or disable IPv6 support. The default is `disable`.
         */
        var ipv6Support: aws.sdk.kotlin.services.ec2.model.Ipv6SupportValue? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions) : this() {
            this.applianceModeSupport = x.applianceModeSupport
            this.dnsSupport = x.dnsSupport
            this.ipv6Support = x.ipv6Support
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions = CreateTransitGatewayVpcAttachmentRequestOptions(this)
    }
}
