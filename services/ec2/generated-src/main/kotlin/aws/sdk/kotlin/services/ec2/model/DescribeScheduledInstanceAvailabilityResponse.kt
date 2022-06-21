// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeScheduledInstanceAvailability.
 */
class DescribeScheduledInstanceAvailabilityResponse private constructor(builder: Builder) {
    /**
     * The token required to retrieve the next set of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the available Scheduled Instances.
     */
    val scheduledInstanceAvailabilitySet: List<ScheduledInstanceAvailability>? = builder.scheduledInstanceAvailabilitySet

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeScheduledInstanceAvailabilityResponse(")
        append("nextToken=$nextToken,")
        append("scheduledInstanceAvailabilitySet=$scheduledInstanceAvailabilitySet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (scheduledInstanceAvailabilitySet?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeScheduledInstanceAvailabilityResponse

        if (nextToken != other.nextToken) return false
        if (scheduledInstanceAvailabilitySet != other.scheduledInstanceAvailabilitySet) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token required to retrieve the next set of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the available Scheduled Instances.
         */
        var scheduledInstanceAvailabilitySet: List<ScheduledInstanceAvailability>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityResponse) : this() {
            this.nextToken = x.nextToken
            this.scheduledInstanceAvailabilitySet = x.scheduledInstanceAvailabilitySet
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityResponse = DescribeScheduledInstanceAvailabilityResponse(this)
    }
}
