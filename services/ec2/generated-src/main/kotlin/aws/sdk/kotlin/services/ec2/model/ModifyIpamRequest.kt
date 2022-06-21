// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIpamRequest private constructor(builder: Builder) {
    /**
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions.
     *
     * For more information about operating Regions, see [Create an IPAM](/vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User Guide*.
     */
    val addOperatingRegions: List<AddIpamOperatingRegion>? = builder.addOperatingRegions
    /**
     * The description of the IPAM you want to modify.
     */
    val description: kotlin.String? = builder.description
    /**
     * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the IPAM you want to modify.
     */
    val ipamId: kotlin.String? = builder.ipamId
    /**
     * The operating Regions to remove.
     */
    val removeOperatingRegions: List<RemoveIpamOperatingRegion>? = builder.removeOperatingRegions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIpamRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIpamRequest(")
        append("addOperatingRegions=$addOperatingRegions,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("ipamId=$ipamId,")
        append("removeOperatingRegions=$removeOperatingRegions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addOperatingRegions?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (ipamId?.hashCode() ?: 0)
        result = 31 * result + (removeOperatingRegions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIpamRequest

        if (addOperatingRegions != other.addOperatingRegions) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (ipamId != other.ipamId) return false
        if (removeOperatingRegions != other.removeOperatingRegions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIpamRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions.
         *
         * For more information about operating Regions, see [Create an IPAM](/vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User Guide*.
         */
        var addOperatingRegions: List<AddIpamOperatingRegion>? = null
        /**
         * The description of the IPAM you want to modify.
         */
        var description: kotlin.String? = null
        /**
         * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the IPAM you want to modify.
         */
        var ipamId: kotlin.String? = null
        /**
         * The operating Regions to remove.
         */
        var removeOperatingRegions: List<RemoveIpamOperatingRegion>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIpamRequest) : this() {
            this.addOperatingRegions = x.addOperatingRegions
            this.description = x.description
            this.dryRun = x.dryRun
            this.ipamId = x.ipamId
            this.removeOperatingRegions = x.removeOperatingRegions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIpamRequest = ModifyIpamRequest(this)
    }
}
