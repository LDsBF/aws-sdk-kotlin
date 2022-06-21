// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class RestoreSnapshotTierResponse private constructor(builder: Builder) {
    /**
     * Indicates whether the snapshot is permanently restored. `true` indicates a permanent restore. `false` indicates a temporary restore.
     */
    val isPermanentRestore: kotlin.Boolean? = builder.isPermanentRestore
    /**
     * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     */
    val restoreDuration: kotlin.Int? = builder.restoreDuration
    /**
     * The date and time when the snapshot restore process started.
     */
    val restoreStartTime: aws.smithy.kotlin.runtime.time.Instant? = builder.restoreStartTime
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RestoreSnapshotTierResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreSnapshotTierResponse(")
        append("isPermanentRestore=$isPermanentRestore,")
        append("restoreDuration=$restoreDuration,")
        append("restoreStartTime=$restoreStartTime,")
        append("snapshotId=$snapshotId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = isPermanentRestore?.hashCode() ?: 0
        result = 31 * result + (restoreDuration ?: 0)
        result = 31 * result + (restoreStartTime?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RestoreSnapshotTierResponse

        if (isPermanentRestore != other.isPermanentRestore) return false
        if (restoreDuration != other.restoreDuration) return false
        if (restoreStartTime != other.restoreStartTime) return false
        if (snapshotId != other.snapshotId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RestoreSnapshotTierResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the snapshot is permanently restored. `true` indicates a permanent restore. `false` indicates a temporary restore.
         */
        var isPermanentRestore: kotlin.Boolean? = null
        /**
         * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
         */
        var restoreDuration: kotlin.Int? = null
        /**
         * The date and time when the snapshot restore process started.
         */
        var restoreStartTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RestoreSnapshotTierResponse) : this() {
            this.isPermanentRestore = x.isPermanentRestore
            this.restoreDuration = x.restoreDuration
            this.restoreStartTime = x.restoreStartTime
            this.snapshotId = x.snapshotId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RestoreSnapshotTierResponse = RestoreSnapshotTierResponse(this)
    }
}
