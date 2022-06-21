// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeSpotFleetInstances.
 */
class DescribeSpotFleetInstancesResponse private constructor(builder: Builder) {
    /**
     * The running instances. This list is refreshed periodically and might be out of date.
     */
    val activeInstances: List<ActiveInstance>? = builder.activeInstances
    /**
     * The token required to retrieve the next set of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The ID of the Spot Fleet request.
     */
    val spotFleetRequestId: kotlin.String? = builder.spotFleetRequestId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeSpotFleetInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeSpotFleetInstancesResponse(")
        append("activeInstances=$activeInstances,")
        append("nextToken=$nextToken,")
        append("spotFleetRequestId=$spotFleetRequestId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = activeInstances?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (spotFleetRequestId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeSpotFleetInstancesResponse

        if (activeInstances != other.activeInstances) return false
        if (nextToken != other.nextToken) return false
        if (spotFleetRequestId != other.spotFleetRequestId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeSpotFleetInstancesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The running instances. This list is refreshed periodically and might be out of date.
         */
        var activeInstances: List<ActiveInstance>? = null
        /**
         * The token required to retrieve the next set of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * The ID of the Spot Fleet request.
         */
        var spotFleetRequestId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeSpotFleetInstancesResponse) : this() {
            this.activeInstances = x.activeInstances
            this.nextToken = x.nextToken
            this.spotFleetRequestId = x.spotFleetRequestId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeSpotFleetInstancesResponse = DescribeSpotFleetInstancesResponse(this)
    }
}
