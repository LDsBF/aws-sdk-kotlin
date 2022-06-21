// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class UpdateTableReplicaAutoScalingRequest private constructor(builder: Builder) {
    /**
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     */
    val globalSecondaryIndexUpdates: List<GlobalSecondaryIndexAutoScalingUpdate>? = builder.globalSecondaryIndexUpdates
    /**
     * Represents the auto scaling settings to be modified for a global table or global secondary index.
     */
    val provisionedWriteCapacityAutoScalingUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = builder.provisionedWriteCapacityAutoScalingUpdate
    /**
     * Represents the auto scaling settings of replicas of the table that will be modified.
     */
    val replicaUpdates: List<ReplicaAutoScalingUpdate>? = builder.replicaUpdates
    /**
     * The name of the global table to be updated.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.UpdateTableReplicaAutoScalingRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateTableReplicaAutoScalingRequest(")
        append("globalSecondaryIndexUpdates=$globalSecondaryIndexUpdates,")
        append("provisionedWriteCapacityAutoScalingUpdate=$provisionedWriteCapacityAutoScalingUpdate,")
        append("replicaUpdates=$replicaUpdates,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalSecondaryIndexUpdates?.hashCode() ?: 0
        result = 31 * result + (provisionedWriteCapacityAutoScalingUpdate?.hashCode() ?: 0)
        result = 31 * result + (replicaUpdates?.hashCode() ?: 0)
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateTableReplicaAutoScalingRequest

        if (globalSecondaryIndexUpdates != other.globalSecondaryIndexUpdates) return false
        if (provisionedWriteCapacityAutoScalingUpdate != other.provisionedWriteCapacityAutoScalingUpdate) return false
        if (replicaUpdates != other.replicaUpdates) return false
        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.UpdateTableReplicaAutoScalingRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
         */
        var globalSecondaryIndexUpdates: List<GlobalSecondaryIndexAutoScalingUpdate>? = null
        /**
         * Represents the auto scaling settings to be modified for a global table or global secondary index.
         */
        var provisionedWriteCapacityAutoScalingUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = null
        /**
         * Represents the auto scaling settings of replicas of the table that will be modified.
         */
        var replicaUpdates: List<ReplicaAutoScalingUpdate>? = null
        /**
         * The name of the global table to be updated.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.UpdateTableReplicaAutoScalingRequest) : this() {
            this.globalSecondaryIndexUpdates = x.globalSecondaryIndexUpdates
            this.provisionedWriteCapacityAutoScalingUpdate = x.provisionedWriteCapacityAutoScalingUpdate
            this.replicaUpdates = x.replicaUpdates
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.UpdateTableReplicaAutoScalingRequest = UpdateTableReplicaAutoScalingRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate] inside the given [block]
         */
        fun provisionedWriteCapacityAutoScalingUpdate(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.Builder.() -> kotlin.Unit) {
            this.provisionedWriteCapacityAutoScalingUpdate = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.invoke(block)
        }
    }
}
