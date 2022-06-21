// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Provides information about a snapshot's storage tier.
 */
class SnapshotTierStatus private constructor(builder: Builder) {
    /**
     * The date and time when the last archive process was completed.
     */
    val archivalCompleteTime: aws.smithy.kotlin.runtime.time.Instant? = builder.archivalCompleteTime
    /**
     * The status of the last archive or restore process.
     */
    val lastTieringOperationStatus: aws.sdk.kotlin.services.ec2.model.TieringOperationStatus? = builder.lastTieringOperationStatus
    /**
     * A message describing the status of the last archive or restore process.
     */
    val lastTieringOperationStatusDetail: kotlin.String? = builder.lastTieringOperationStatusDetail
    /**
     * The progress of the last archive or restore process, as a percentage.
     */
    val lastTieringProgress: kotlin.Int? = builder.lastTieringProgress
    /**
     * The date and time when the last archive or restore process was started.
     */
    val lastTieringStartTime: aws.smithy.kotlin.runtime.time.Instant? = builder.lastTieringStartTime
    /**
     * The ID of the Amazon Web Services account that owns the snapshot.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily restored snapshot will be automatically re-archived.
     */
    val restoreExpiryTime: aws.smithy.kotlin.runtime.time.Instant? = builder.restoreExpiryTime
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * The state of the snapshot.
     */
    val status: aws.sdk.kotlin.services.ec2.model.SnapshotState? = builder.status
    /**
     * The storage tier in which the snapshot is stored. `standard` indicates that the snapshot is stored in the standard snapshot storage tier and that it is ready for use. `archive` indicates that the snapshot is currently archived and that it must be restored before it can be used.
     */
    val storageTier: aws.sdk.kotlin.services.ec2.model.StorageTier? = builder.storageTier
    /**
     * The tags that are assigned to the snapshot.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the volume from which the snapshot was created.
     */
    val volumeId: kotlin.String? = builder.volumeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SnapshotTierStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SnapshotTierStatus(")
        append("archivalCompleteTime=$archivalCompleteTime,")
        append("lastTieringOperationStatus=$lastTieringOperationStatus,")
        append("lastTieringOperationStatusDetail=$lastTieringOperationStatusDetail,")
        append("lastTieringProgress=$lastTieringProgress,")
        append("lastTieringStartTime=$lastTieringStartTime,")
        append("ownerId=$ownerId,")
        append("restoreExpiryTime=$restoreExpiryTime,")
        append("snapshotId=$snapshotId,")
        append("status=$status,")
        append("storageTier=$storageTier,")
        append("tags=$tags,")
        append("volumeId=$volumeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = archivalCompleteTime?.hashCode() ?: 0
        result = 31 * result + (lastTieringOperationStatus?.hashCode() ?: 0)
        result = 31 * result + (lastTieringOperationStatusDetail?.hashCode() ?: 0)
        result = 31 * result + (lastTieringProgress ?: 0)
        result = 31 * result + (lastTieringStartTime?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (restoreExpiryTime?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (storageTier?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SnapshotTierStatus

        if (archivalCompleteTime != other.archivalCompleteTime) return false
        if (lastTieringOperationStatus != other.lastTieringOperationStatus) return false
        if (lastTieringOperationStatusDetail != other.lastTieringOperationStatusDetail) return false
        if (lastTieringProgress != other.lastTieringProgress) return false
        if (lastTieringStartTime != other.lastTieringStartTime) return false
        if (ownerId != other.ownerId) return false
        if (restoreExpiryTime != other.restoreExpiryTime) return false
        if (snapshotId != other.snapshotId) return false
        if (status != other.status) return false
        if (storageTier != other.storageTier) return false
        if (tags != other.tags) return false
        if (volumeId != other.volumeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SnapshotTierStatus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The date and time when the last archive process was completed.
         */
        var archivalCompleteTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The status of the last archive or restore process.
         */
        var lastTieringOperationStatus: aws.sdk.kotlin.services.ec2.model.TieringOperationStatus? = null
        /**
         * A message describing the status of the last archive or restore process.
         */
        var lastTieringOperationStatusDetail: kotlin.String? = null
        /**
         * The progress of the last archive or restore process, as a percentage.
         */
        var lastTieringProgress: kotlin.Int? = null
        /**
         * The date and time when the last archive or restore process was started.
         */
        var lastTieringStartTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The ID of the Amazon Web Services account that owns the snapshot.
         */
        var ownerId: kotlin.String? = null
        /**
         * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily restored snapshot will be automatically re-archived.
         */
        var restoreExpiryTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null
        /**
         * The state of the snapshot.
         */
        var status: aws.sdk.kotlin.services.ec2.model.SnapshotState? = null
        /**
         * The storage tier in which the snapshot is stored. `standard` indicates that the snapshot is stored in the standard snapshot storage tier and that it is ready for use. `archive` indicates that the snapshot is currently archived and that it must be restored before it can be used.
         */
        var storageTier: aws.sdk.kotlin.services.ec2.model.StorageTier? = null
        /**
         * The tags that are assigned to the snapshot.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the volume from which the snapshot was created.
         */
        var volumeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SnapshotTierStatus) : this() {
            this.archivalCompleteTime = x.archivalCompleteTime
            this.lastTieringOperationStatus = x.lastTieringOperationStatus
            this.lastTieringOperationStatusDetail = x.lastTieringOperationStatusDetail
            this.lastTieringProgress = x.lastTieringProgress
            this.lastTieringStartTime = x.lastTieringStartTime
            this.ownerId = x.ownerId
            this.restoreExpiryTime = x.restoreExpiryTime
            this.snapshotId = x.snapshotId
            this.status = x.status
            this.storageTier = x.storageTier
            this.tags = x.tags
            this.volumeId = x.volumeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SnapshotTierStatus = SnapshotTierStatus(this)
    }
}
