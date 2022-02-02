// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class ListGlobalTablesRequest private constructor(builder: Builder) {
    /**
     * The first global table name that this operation will evaluate.
     */
    val exclusiveStartGlobalTableName: kotlin.String? = builder.exclusiveStartGlobalTableName
    /**
     * The maximum number of table names to return, if the parameter is not specified
     * DynamoDB defaults to 100.
     * If the number of global tables DynamoDB finds reaches this limit, it stops the
     * operation and returns the table names collected up to that point, with a table name in
     * the LastEvaluatedGlobalTableName to apply in a subsequent operation to the
     * ExclusiveStartGlobalTableName parameter.
     */
    val limit: kotlin.Int? = builder.limit
    /**
     * Lists the global tables in a specific Region.
     */
    val regionName: kotlin.String? = builder.regionName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ListGlobalTablesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListGlobalTablesRequest(")
        append("exclusiveStartGlobalTableName=$exclusiveStartGlobalTableName,")
        append("limit=$limit,")
        append("regionName=$regionName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exclusiveStartGlobalTableName?.hashCode() ?: 0
        result = 31 * result + (limit ?: 0)
        result = 31 * result + (regionName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListGlobalTablesRequest

        if (exclusiveStartGlobalTableName != other.exclusiveStartGlobalTableName) return false
        if (limit != other.limit) return false
        if (regionName != other.regionName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ListGlobalTablesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The first global table name that this operation will evaluate.
         */
        var exclusiveStartGlobalTableName: kotlin.String? = null
        /**
         * The maximum number of table names to return, if the parameter is not specified
         * DynamoDB defaults to 100.
         * If the number of global tables DynamoDB finds reaches this limit, it stops the
         * operation and returns the table names collected up to that point, with a table name in
         * the LastEvaluatedGlobalTableName to apply in a subsequent operation to the
         * ExclusiveStartGlobalTableName parameter.
         */
        var limit: kotlin.Int? = null
        /**
         * Lists the global tables in a specific Region.
         */
        var regionName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ListGlobalTablesRequest) : this() {
            this.exclusiveStartGlobalTableName = x.exclusiveStartGlobalTableName
            this.limit = x.limit
            this.regionName = x.regionName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ListGlobalTablesRequest = ListGlobalTablesRequest(this)
    }
}
