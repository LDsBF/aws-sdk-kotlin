// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcPeeringConnectionRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The Amazon Web Services account ID of the owner of the accepter VPC.
     *
     * Default: Your Amazon Web Services account ID
     */
    val peerOwnerId: kotlin.String? = builder.peerOwnerId
    /**
     * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request.
     *
     * Default: The Region in which you make the request.
     */
    val peerRegion: kotlin.String? = builder.peerRegion
    /**
     * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
     */
    val peerVpcId: kotlin.String? = builder.peerVpcId
    /**
     * The tags to assign to the peering connection.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the requester VPC. You must specify this parameter in the request.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcPeeringConnectionRequest(")
        append("dryRun=$dryRun,")
        append("peerOwnerId=$peerOwnerId,")
        append("peerRegion=$peerRegion,")
        append("peerVpcId=$peerVpcId,")
        append("tagSpecifications=$tagSpecifications,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (peerOwnerId?.hashCode() ?: 0)
        result = 31 * result + (peerRegion?.hashCode() ?: 0)
        result = 31 * result + (peerVpcId?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcPeeringConnectionRequest

        if (dryRun != other.dryRun) return false
        if (peerOwnerId != other.peerOwnerId) return false
        if (peerRegion != other.peerRegion) return false
        if (peerVpcId != other.peerVpcId) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The Amazon Web Services account ID of the owner of the accepter VPC.
         *
         * Default: Your Amazon Web Services account ID
         */
        var peerOwnerId: kotlin.String? = null
        /**
         * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request.
         *
         * Default: The Region in which you make the request.
         */
        var peerRegion: kotlin.String? = null
        /**
         * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
         */
        var peerVpcId: kotlin.String? = null
        /**
         * The tags to assign to the peering connection.
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The ID of the requester VPC. You must specify this parameter in the request.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionRequest) : this() {
            this.dryRun = x.dryRun
            this.peerOwnerId = x.peerOwnerId
            this.peerRegion = x.peerRegion
            this.peerVpcId = x.peerVpcId
            this.tagSpecifications = x.tagSpecifications
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionRequest = CreateVpcPeeringConnectionRequest(this)
    }
}
