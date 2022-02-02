// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeMovingAddressesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * moving-status - The status of the Elastic IP address
     * (MovingToVpc | RestoringToClassic).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return for the request in a single page. The remaining
     * results of the initial request can be seen by sending another request with the returned
     * NextToken value. This value can be between 5 and 1000; if
     * MaxResults is given a value outside of this range, an error is returned.
     * Default: If no value is provided, the default is 1000.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * One or more Elastic IP addresses.
     */
    val publicIps: List<String>? = builder.publicIps

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeMovingAddressesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeMovingAddressesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("publicIps=$publicIps)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (publicIps?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeMovingAddressesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (publicIps != other.publicIps) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeMovingAddressesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * moving-status - The status of the Elastic IP address
         * (MovingToVpc | RestoringToClassic).
         */
        var filters: List<Filter>? = null
        /**
         * The maximum number of results to return for the request in a single page. The remaining
         * results of the initial request can be seen by sending another request with the returned
         * NextToken value. This value can be between 5 and 1000; if
         * MaxResults is given a value outside of this range, an error is returned.
         * Default: If no value is provided, the default is 1000.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * One or more Elastic IP addresses.
         */
        var publicIps: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeMovingAddressesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.publicIps = x.publicIps
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeMovingAddressesRequest = DescribeMovingAddressesRequest(this)
    }
}
