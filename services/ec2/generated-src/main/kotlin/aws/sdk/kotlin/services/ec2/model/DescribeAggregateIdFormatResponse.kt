// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeAggregateIdFormatResponse private constructor(builder: Builder) {
    /**
     * Information about each resource's ID format.
     */
    val statuses: List<IdFormat>? = builder.statuses
    /**
     * Indicates whether all resource types in the Region are configured to use longer IDs.
     * This value is only true if all users are configured to use longer IDs for
     * all resources types in the Region.
     */
    val useLongIdsAggregated: kotlin.Boolean? = builder.useLongIdsAggregated

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeAggregateIdFormatResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAggregateIdFormatResponse(")
        append("statuses=$statuses,")
        append("useLongIdsAggregated=$useLongIdsAggregated)")
    }

    override fun hashCode(): kotlin.Int {
        var result = statuses?.hashCode() ?: 0
        result = 31 * result + (useLongIdsAggregated?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeAggregateIdFormatResponse

        if (statuses != other.statuses) return false
        if (useLongIdsAggregated != other.useLongIdsAggregated) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeAggregateIdFormatResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about each resource's ID format.
         */
        var statuses: List<IdFormat>? = null
        /**
         * Indicates whether all resource types in the Region are configured to use longer IDs.
         * This value is only true if all users are configured to use longer IDs for
         * all resources types in the Region.
         */
        var useLongIdsAggregated: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeAggregateIdFormatResponse) : this() {
            this.statuses = x.statuses
            this.useLongIdsAggregated = x.useLongIdsAggregated
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeAggregateIdFormatResponse = DescribeAggregateIdFormatResponse(this)
    }
}
