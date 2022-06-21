// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateDhcpOptionsRequest private constructor(builder: Builder) {
    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     */
    val dhcpOptionsId: kotlin.String? = builder.dhcpOptionsId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateDhcpOptionsRequest(")
        append("dhcpOptionsId=$dhcpOptionsId,")
        append("dryRun=$dryRun,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dhcpOptionsId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateDhcpOptionsRequest

        if (dhcpOptionsId != other.dhcpOptionsId) return false
        if (dryRun != other.dryRun) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
         */
        var dhcpOptionsId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest) : this() {
            this.dhcpOptionsId = x.dhcpOptionsId
            this.dryRun = x.dryRun
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = AssociateDhcpOptionsRequest(this)
    }
}
