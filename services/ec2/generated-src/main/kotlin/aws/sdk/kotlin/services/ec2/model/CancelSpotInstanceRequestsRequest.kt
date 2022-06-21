// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for CancelSpotInstanceRequests.
 */
class CancelSpotInstanceRequestsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more Spot Instance request IDs.
     */
    val spotInstanceRequestIds: List<String>? = builder.spotInstanceRequestIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CancelSpotInstanceRequestsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CancelSpotInstanceRequestsRequest(")
        append("dryRun=$dryRun,")
        append("spotInstanceRequestIds=$spotInstanceRequestIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (spotInstanceRequestIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CancelSpotInstanceRequestsRequest

        if (dryRun != other.dryRun) return false
        if (spotInstanceRequestIds != other.spotInstanceRequestIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CancelSpotInstanceRequestsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more Spot Instance request IDs.
         */
        var spotInstanceRequestIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CancelSpotInstanceRequestsRequest) : this() {
            this.dryRun = x.dryRun
            this.spotInstanceRequestIds = x.spotInstanceRequestIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CancelSpotInstanceRequestsRequest = CancelSpotInstanceRequestsRequest(this)
    }
}
