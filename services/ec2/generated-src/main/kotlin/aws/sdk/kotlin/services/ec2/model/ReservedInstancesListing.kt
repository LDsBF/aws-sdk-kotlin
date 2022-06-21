// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a Reserved Instance listing.
 */
class ReservedInstancesListing private constructor(builder: Builder) {
    /**
     * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The time the listing was created.
     */
    val createDate: aws.smithy.kotlin.runtime.time.Instant? = builder.createDate
    /**
     * The number of instances in this state.
     */
    val instanceCounts: List<InstanceCount>? = builder.instanceCounts
    /**
     * The price of the Reserved Instance listing.
     */
    val priceSchedules: List<PriceSchedule>? = builder.priceSchedules
    /**
     * The ID of the Reserved Instance.
     */
    val reservedInstancesId: kotlin.String? = builder.reservedInstancesId
    /**
     * The ID of the Reserved Instance listing.
     */
    val reservedInstancesListingId: kotlin.String? = builder.reservedInstancesListingId
    /**
     * The status of the Reserved Instance listing.
     */
    val status: aws.sdk.kotlin.services.ec2.model.ListingStatus? = builder.status
    /**
     * The reason for the current status of the Reserved Instance listing. The response can be blank.
     */
    val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * Any tags assigned to the resource.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The last modified timestamp of the listing.
     */
    val updateDate: aws.smithy.kotlin.runtime.time.Instant? = builder.updateDate

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReservedInstancesListing = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReservedInstancesListing(")
        append("clientToken=$clientToken,")
        append("createDate=$createDate,")
        append("instanceCounts=$instanceCounts,")
        append("priceSchedules=$priceSchedules,")
        append("reservedInstancesId=$reservedInstancesId,")
        append("reservedInstancesListingId=$reservedInstancesListingId,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("tags=$tags,")
        append("updateDate=$updateDate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (createDate?.hashCode() ?: 0)
        result = 31 * result + (instanceCounts?.hashCode() ?: 0)
        result = 31 * result + (priceSchedules?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesId?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesListingId?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (updateDate?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReservedInstancesListing

        if (clientToken != other.clientToken) return false
        if (createDate != other.createDate) return false
        if (instanceCounts != other.instanceCounts) return false
        if (priceSchedules != other.priceSchedules) return false
        if (reservedInstancesId != other.reservedInstancesId) return false
        if (reservedInstancesListingId != other.reservedInstancesListingId) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (tags != other.tags) return false
        if (updateDate != other.updateDate) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReservedInstancesListing = Builder(this).apply(block).build()

    class Builder {
        /**
         * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * The time the listing was created.
         */
        var createDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The number of instances in this state.
         */
        var instanceCounts: List<InstanceCount>? = null
        /**
         * The price of the Reserved Instance listing.
         */
        var priceSchedules: List<PriceSchedule>? = null
        /**
         * The ID of the Reserved Instance.
         */
        var reservedInstancesId: kotlin.String? = null
        /**
         * The ID of the Reserved Instance listing.
         */
        var reservedInstancesListingId: kotlin.String? = null
        /**
         * The status of the Reserved Instance listing.
         */
        var status: aws.sdk.kotlin.services.ec2.model.ListingStatus? = null
        /**
         * The reason for the current status of the Reserved Instance listing. The response can be blank.
         */
        var statusMessage: kotlin.String? = null
        /**
         * Any tags assigned to the resource.
         */
        var tags: List<Tag>? = null
        /**
         * The last modified timestamp of the listing.
         */
        var updateDate: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReservedInstancesListing) : this() {
            this.clientToken = x.clientToken
            this.createDate = x.createDate
            this.instanceCounts = x.instanceCounts
            this.priceSchedules = x.priceSchedules
            this.reservedInstancesId = x.reservedInstancesId
            this.reservedInstancesListingId = x.reservedInstancesListingId
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.tags = x.tags
            this.updateDate = x.updateDate
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReservedInstancesListing = ReservedInstancesListing(this)
    }
}
