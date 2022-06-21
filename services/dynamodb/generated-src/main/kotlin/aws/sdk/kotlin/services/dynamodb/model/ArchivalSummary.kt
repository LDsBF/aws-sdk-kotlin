// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains details of a table archival operation.
 */
class ArchivalSummary private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
     */
    val archivalBackupArn: kotlin.String? = builder.archivalBackupArn
    /**
     * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     */
    val archivalDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.archivalDateTime
    /**
     * The reason DynamoDB archived the table. Currently, the only possible value is:
     * + `INACCESSIBLE_ENCRYPTION_CREDENTIALS` - The table was archived due to the table's KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     */
    val archivalReason: kotlin.String? = builder.archivalReason

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ArchivalSummary = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ArchivalSummary(")
        append("archivalBackupArn=$archivalBackupArn,")
        append("archivalDateTime=$archivalDateTime,")
        append("archivalReason=$archivalReason)")
    }

    override fun hashCode(): kotlin.Int {
        var result = archivalBackupArn?.hashCode() ?: 0
        result = 31 * result + (archivalDateTime?.hashCode() ?: 0)
        result = 31 * result + (archivalReason?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ArchivalSummary

        if (archivalBackupArn != other.archivalBackupArn) return false
        if (archivalDateTime != other.archivalDateTime) return false
        if (archivalReason != other.archivalReason) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ArchivalSummary = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
         */
        var archivalBackupArn: kotlin.String? = null
        /**
         * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
         */
        var archivalDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The reason DynamoDB archived the table. Currently, the only possible value is:
         * + `INACCESSIBLE_ENCRYPTION_CREDENTIALS` - The table was archived due to the table's KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.
         */
        var archivalReason: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ArchivalSummary) : this() {
            this.archivalBackupArn = x.archivalBackupArn
            this.archivalDateTime = x.archivalDateTime
            this.archivalReason = x.archivalReason
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ArchivalSummary = ArchivalSummary(this)
    }
}
