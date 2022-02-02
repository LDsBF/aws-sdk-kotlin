// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the time period for a Scheduled Instance to start its first schedule.
 */
class SlotStartTimeRangeRequest private constructor(builder: Builder) {
    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     */
    val earliestTime: aws.smithy.kotlin.runtime.time.Instant? = builder.earliestTime
    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     */
    val latestTime: aws.smithy.kotlin.runtime.time.Instant? = builder.latestTime

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SlotStartTimeRangeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SlotStartTimeRangeRequest(")
        append("earliestTime=$earliestTime,")
        append("latestTime=$latestTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = earliestTime?.hashCode() ?: 0
        result = 31 * result + (latestTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SlotStartTimeRangeRequest

        if (earliestTime != other.earliestTime) return false
        if (latestTime != other.latestTime) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SlotStartTimeRangeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The earliest date and time, in UTC, for the Scheduled Instance to start.
         */
        var earliestTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The latest date and time, in UTC, for the Scheduled Instance to start.
         */
        var latestTime: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SlotStartTimeRangeRequest) : this() {
            this.earliestTime = x.earliestTime
            this.latestTime = x.latestTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SlotStartTimeRangeRequest = SlotStartTimeRangeRequest(this)
    }
}
