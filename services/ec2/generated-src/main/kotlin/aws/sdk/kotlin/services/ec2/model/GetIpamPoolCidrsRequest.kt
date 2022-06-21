// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetIpamPoolCidrsRequest private constructor(builder: Builder) {
    /**
     * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters for the request. For more information about filtering, see [Filtering CLI output](https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The ID of the IPAM pool you want the CIDR for.
     */
    val ipamPoolId: kotlin.String? = builder.ipamPoolId
    /**
     * The maximum number of results to return in the request.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetIpamPoolCidrsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetIpamPoolCidrsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("ipamPoolId=$ipamPoolId,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (ipamPoolId?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetIpamPoolCidrsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (ipamPoolId != other.ipamPoolId) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetIpamPoolCidrsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters for the request. For more information about filtering, see [Filtering CLI output](https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html).
         */
        var filters: List<Filter>? = null
        /**
         * The ID of the IPAM pool you want the CIDR for.
         */
        var ipamPoolId: kotlin.String? = null
        /**
         * The maximum number of results to return in the request.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetIpamPoolCidrsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.ipamPoolId = x.ipamPoolId
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetIpamPoolCidrsRequest = GetIpamPoolCidrsRequest(this)
    }
}
