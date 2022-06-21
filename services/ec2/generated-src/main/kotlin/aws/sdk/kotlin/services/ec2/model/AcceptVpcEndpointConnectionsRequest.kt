// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AcceptVpcEndpointConnectionsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC endpoint service.
     */
    val serviceId: kotlin.String? = builder.serviceId
    /**
     * The IDs of one or more interface VPC endpoints.
     */
    val vpcEndpointIds: List<String>? = builder.vpcEndpointIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AcceptVpcEndpointConnectionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AcceptVpcEndpointConnectionsRequest(")
        append("dryRun=$dryRun,")
        append("serviceId=$serviceId,")
        append("vpcEndpointIds=$vpcEndpointIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (vpcEndpointIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AcceptVpcEndpointConnectionsRequest

        if (dryRun != other.dryRun) return false
        if (serviceId != other.serviceId) return false
        if (vpcEndpointIds != other.vpcEndpointIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AcceptVpcEndpointConnectionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC endpoint service.
         */
        var serviceId: kotlin.String? = null
        /**
         * The IDs of one or more interface VPC endpoints.
         */
        var vpcEndpointIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AcceptVpcEndpointConnectionsRequest) : this() {
            this.dryRun = x.dryRun
            this.serviceId = x.serviceId
            this.vpcEndpointIds = x.vpcEndpointIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AcceptVpcEndpointConnectionsRequest = AcceptVpcEndpointConnectionsRequest(this)
    }
}
