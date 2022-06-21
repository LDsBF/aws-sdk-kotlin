// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTrafficMirrorFiltersResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. The value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about one or more Traffic Mirror filters.
     */
    val trafficMirrorFilters: List<TrafficMirrorFilter>? = builder.trafficMirrorFilters

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTrafficMirrorFiltersResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTrafficMirrorFiltersResponse(")
        append("nextToken=$nextToken,")
        append("trafficMirrorFilters=$trafficMirrorFilters)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (trafficMirrorFilters?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTrafficMirrorFiltersResponse

        if (nextToken != other.nextToken) return false
        if (trafficMirrorFilters != other.trafficMirrorFilters) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTrafficMirrorFiltersResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. The value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about one or more Traffic Mirror filters.
         */
        var trafficMirrorFilters: List<TrafficMirrorFilter>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTrafficMirrorFiltersResponse) : this() {
            this.nextToken = x.nextToken
            this.trafficMirrorFilters = x.trafficMirrorFilters
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTrafficMirrorFiltersResponse = DescribeTrafficMirrorFiltersResponse(this)
    }
}
