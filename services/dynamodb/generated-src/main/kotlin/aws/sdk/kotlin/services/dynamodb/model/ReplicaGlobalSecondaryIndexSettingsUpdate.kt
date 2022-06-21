// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the settings of a global secondary index for a global table that will be modified.
 */
class ReplicaGlobalSecondaryIndexSettingsUpdate private constructor(builder: Builder) {
    /**
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * Auto scaling settings for managing a global secondary index replica's read capacity units.
     */
    val provisionedReadCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = builder.provisionedReadCapacityAutoScalingSettingsUpdate
    /**
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a `ThrottlingException`.
     */
    val provisionedReadCapacityUnits: kotlin.Long? = builder.provisionedReadCapacityUnits

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaGlobalSecondaryIndexSettingsUpdate(")
        append("indexName=$indexName,")
        append("provisionedReadCapacityAutoScalingSettingsUpdate=$provisionedReadCapacityAutoScalingSettingsUpdate,")
        append("provisionedReadCapacityUnits=$provisionedReadCapacityUnits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        result = 31 * result + (provisionedReadCapacityAutoScalingSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (provisionedReadCapacityUnits?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicaGlobalSecondaryIndexSettingsUpdate

        if (indexName != other.indexName) return false
        if (provisionedReadCapacityAutoScalingSettingsUpdate != other.provisionedReadCapacityAutoScalingSettingsUpdate) return false
        if (provisionedReadCapacityUnits != other.provisionedReadCapacityUnits) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the global secondary index. The name must be unique among all other indexes on this table.
         */
        var indexName: kotlin.String? = null
        /**
         * Auto scaling settings for managing a global secondary index replica's read capacity units.
         */
        var provisionedReadCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = null
        /**
         * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a `ThrottlingException`.
         */
        var provisionedReadCapacityUnits: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate) : this() {
            this.indexName = x.indexName
            this.provisionedReadCapacityAutoScalingSettingsUpdate = x.provisionedReadCapacityAutoScalingSettingsUpdate
            this.provisionedReadCapacityUnits = x.provisionedReadCapacityUnits
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate = ReplicaGlobalSecondaryIndexSettingsUpdate(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate] inside the given [block]
         */
        fun provisionedReadCapacityAutoScalingSettingsUpdate(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.Builder.() -> kotlin.Unit) {
            this.provisionedReadCapacityAutoScalingSettingsUpdate = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.invoke(block)
        }
    }
}
