// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a global secondary index for the table when the backup was created.
 */
class GlobalSecondaryIndexInfo private constructor(builder: Builder) {
    /**
     * The name of the global secondary index.
     */
    val indexName: kotlin.String? = builder.indexName
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
     */
    val provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = builder.provisionedThroughput

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GlobalSecondaryIndexInfo(")
        append("indexName=$indexName,")
        append("keySchema=$keySchema,")
        append("projection=$projection,")
        append("provisionedThroughput=$provisionedThroughput)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        result = 31 * result + (keySchema?.hashCode() ?: 0)
        result = 31 * result + (projection?.hashCode() ?: 0)
        result = 31 * result + (provisionedThroughput?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GlobalSecondaryIndexInfo

        if (indexName != other.indexName) return false
        if (keySchema != other.keySchema) return false
        if (projection != other.projection) return false
        if (provisionedThroughput != other.provisionedThroughput) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the global secondary index.
         */
        var indexName: kotlin.String? = null
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
         */
        var provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexInfo) : this() {
            this.indexName = x.indexName
            this.keySchema = x.keySchema
            this.projection = x.projection
            this.provisionedThroughput = x.provisionedThroughput
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.GlobalSecondaryIndexInfo = GlobalSecondaryIndexInfo(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.Projection] inside the given [block]
         */
        fun projection(block: aws.sdk.kotlin.services.dynamodb.model.Projection.Builder.() -> kotlin.Unit) {
            this.projection = aws.sdk.kotlin.services.dynamodb.model.Projection.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput] inside the given [block]
         */
        fun provisionedThroughput(block: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.Builder.() -> kotlin.Unit) {
            this.provisionedThroughput = aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.invoke(block)
        }
    }
}
