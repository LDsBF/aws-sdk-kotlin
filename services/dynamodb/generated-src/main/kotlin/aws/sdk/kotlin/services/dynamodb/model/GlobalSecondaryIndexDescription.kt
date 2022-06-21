// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a global secondary index.
 */
class GlobalSecondaryIndexDescription private constructor(builder: Builder) {
    /**
     * Indicates whether the index is currently backfilling. *Backfilling* is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and `Backfilling` is false.
     *
     * You can delete an index that is being created during the `Backfilling` phase when `IndexStatus` is set to CREATING and `Backfilling` is true. You can't delete the index that is being created when `IndexStatus` is set to CREATING and `Backfilling` is false.
     *
     * For indexes that were created during a `CreateTable` operation, the `Backfilling` attribute does not appear in the `DescribeTable` output.
     */
    val backfilling: kotlin.Boolean? = builder.backfilling
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     */
    val indexArn: kotlin.String? = builder.indexArn
    /**
     * The name of the global secondary index.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
     */
    val indexSizeBytes: kotlin.Long = builder.indexSizeBytes
    /**
     * The current state of the global secondary index:
     * + `CREATING` - The index is being created.
     * + `UPDATING` - The index is being updated.
     * + `DELETING` - The index is being deleted.
     * + `ACTIVE` - The index is ready for use.
     */
    val indexStatus: aws.sdk.kotlin.services.dynamodb.model.IndexStatus? = builder.indexStatus
    /**
     * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
     */
    val itemCount: kotlin.Long = builder.itemCount
    /**
     * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:
     * + `HASH` - partition key
     * + `RANGE` - sort key
     *
     * The partition key of an item is also known as its *hash attribute*. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute*. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
     */
    val keySchema: List<KeySchemaElement>? = builder.keySchema
    /**
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
     */
    val projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = builder.projection
    /**
     * Represents the provisioned throughput settings for the specified global secondary index.
     *
     * For current minimum and maximum provisioned throughput values, see [Service, Account, and Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the *Amazon DynamoDB Developer Guide*.
     */
    val provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription? = builder.provisionedThroughput

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GlobalSecondaryIndexDescription(")
        append("backfilling=$backfilling,")
        append("indexArn=$indexArn,")
        append("indexName=$indexName,")
        append("indexSizeBytes=$indexSizeBytes,")
        append("indexStatus=$indexStatus,")
        append("itemCount=$itemCount,")
        append("keySchema=$keySchema,")
        append("projection=$projection,")
        append("provisionedThroughput=$provisionedThroughput)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backfilling?.hashCode() ?: 0
        result = 31 * result + (indexArn?.hashCode() ?: 0)
        result = 31 * result + (indexName?.hashCode() ?: 0)
        result = 31 * result + (indexSizeBytes.hashCode())
        result = 31 * result + (indexStatus?.hashCode() ?: 0)
        result = 31 * result + (itemCount.hashCode())
        result = 31 * result + (keySchema?.hashCode() ?: 0)
        result = 31 * result + (projection?.hashCode() ?: 0)
        result = 31 * result + (provisionedThroughput?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GlobalSecondaryIndexDescription

        if (backfilling != other.backfilling) return false
        if (indexArn != other.indexArn) return false
        if (indexName != other.indexName) return false
        if (indexSizeBytes != other.indexSizeBytes) return false
        if (indexStatus != other.indexStatus) return false
        if (itemCount != other.itemCount) return false
        if (keySchema != other.keySchema) return false
        if (projection != other.projection) return false
        if (provisionedThroughput != other.provisionedThroughput) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the index is currently backfilling. *Backfilling* is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and `Backfilling` is false.
         *
         * You can delete an index that is being created during the `Backfilling` phase when `IndexStatus` is set to CREATING and `Backfilling` is true. You can't delete the index that is being created when `IndexStatus` is set to CREATING and `Backfilling` is false.
         *
         * For indexes that were created during a `CreateTable` operation, the `Backfilling` attribute does not appear in the `DescribeTable` output.
         */
        var backfilling: kotlin.Boolean? = null
        /**
         * The Amazon Resource Name (ARN) that uniquely identifies the index.
         */
        var indexArn: kotlin.String? = null
        /**
         * The name of the global secondary index.
         */
        var indexName: kotlin.String? = null
        /**
         * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
         */
        var indexSizeBytes: kotlin.Long = 0L
        /**
         * The current state of the global secondary index:
         * + `CREATING` - The index is being created.
         * + `UPDATING` - The index is being updated.
         * + `DELETING` - The index is being deleted.
         * + `ACTIVE` - The index is ready for use.
         */
        var indexStatus: aws.sdk.kotlin.services.dynamodb.model.IndexStatus? = null
        /**
         * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
         */
        var itemCount: kotlin.Long = 0L
        /**
         * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:
         * + `HASH` - partition key
         * + `RANGE` - sort key
         *
         * The partition key of an item is also known as its *hash attribute*. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
         *
         * The sort key of an item is also known as its *range attribute*. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
         */
        var keySchema: List<KeySchemaElement>? = null
        /**
         * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
         */
        var projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = null
        /**
         * Represents the provisioned throughput settings for the specified global secondary index.
         *
         * For current minimum and maximum provisioned throughput values, see [Service, Account, and Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the *Amazon DynamoDB Developer Guide*.
         */
        var provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexDescription) : this() {
            this.backfilling = x.backfilling
            this.indexArn = x.indexArn
            this.indexName = x.indexName
            this.indexSizeBytes = x.indexSizeBytes
            this.indexStatus = x.indexStatus
            this.itemCount = x.itemCount
            this.keySchema = x.keySchema
            this.projection = x.projection
            this.provisionedThroughput = x.provisionedThroughput
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexDescription = GlobalSecondaryIndexDescription(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.Projection] inside the given [block]
         */
        fun projection(block: aws.sdk.kotlin.services.dynamodb.model.Projection.Builder.() -> kotlin.Unit) {
            this.projection = aws.sdk.kotlin.services.dynamodb.model.Projection.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription] inside the given [block]
         */
        fun provisionedThroughput(block: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription.Builder.() -> kotlin.Unit) {
            this.provisionedThroughput = aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription.invoke(block)
        }
    }
}
