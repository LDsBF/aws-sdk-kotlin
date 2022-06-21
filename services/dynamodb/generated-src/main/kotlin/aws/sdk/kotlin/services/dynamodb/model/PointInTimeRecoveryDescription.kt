// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * The description of the point in time settings applied to the table.
 */
class PointInTimeRecoveryDescription private constructor(builder: Builder) {
    /**
     * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days.
     */
    val earliestRestorableDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.earliestRestorableDateTime
    /**
     * `LatestRestorableDateTime` is typically 5 minutes before the current time.
     */
    val latestRestorableDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.latestRestorableDateTime
    /**
     * The current state of point in time recovery:
     * + `ENABLED` - Point in time recovery is enabled.
     * + `DISABLED` - Point in time recovery is disabled.
     */
    val pointInTimeRecoveryStatus: aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryStatus? = builder.pointInTimeRecoveryStatus

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PointInTimeRecoveryDescription(")
        append("earliestRestorableDateTime=$earliestRestorableDateTime,")
        append("latestRestorableDateTime=$latestRestorableDateTime,")
        append("pointInTimeRecoveryStatus=$pointInTimeRecoveryStatus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = earliestRestorableDateTime?.hashCode() ?: 0
        result = 31 * result + (latestRestorableDateTime?.hashCode() ?: 0)
        result = 31 * result + (pointInTimeRecoveryStatus?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PointInTimeRecoveryDescription

        if (earliestRestorableDateTime != other.earliestRestorableDateTime) return false
        if (latestRestorableDateTime != other.latestRestorableDateTime) return false
        if (pointInTimeRecoveryStatus != other.pointInTimeRecoveryStatus) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days.
         */
        var earliestRestorableDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * `LatestRestorableDateTime` is typically 5 minutes before the current time.
         */
        var latestRestorableDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The current state of point in time recovery:
         * + `ENABLED` - Point in time recovery is enabled.
         * + `DISABLED` - Point in time recovery is disabled.
         */
        var pointInTimeRecoveryStatus: aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription) : this() {
            this.earliestRestorableDateTime = x.earliestRestorableDateTime
            this.latestRestorableDateTime = x.latestRestorableDateTime
            this.pointInTimeRecoveryStatus = x.pointInTimeRecoveryStatus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription = PointInTimeRecoveryDescription(this)
    }
}
