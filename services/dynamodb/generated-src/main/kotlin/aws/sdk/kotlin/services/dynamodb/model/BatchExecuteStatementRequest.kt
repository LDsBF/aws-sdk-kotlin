// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class BatchExecuteStatementRequest private constructor(builder: Builder) {
    /**
     * Determines the level of detail about either provisioned or on-demand throughput consumption that is returned in the response:
     * + `INDEXES` - The response includes the aggregate `ConsumedCapacity` for the operation, together with `ConsumedCapacity` for each table and secondary index that was accessed.Note that some operations, such as `GetItem` and `BatchGetItem`, do not access any indexes at all. In these cases, specifying `INDEXES` will only return `ConsumedCapacity` information for table(s).
     * + `TOTAL` - The response includes only the aggregate `ConsumedCapacity` for the operation.
     * + `NONE` - No `ConsumedCapacity` details are included in the response.
     */
    val returnConsumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ReturnConsumedCapacity? = builder.returnConsumedCapacity
    /**
     * The list of PartiQL statements representing the batch to run.
     */
    val statements: List<BatchStatementRequest>? = builder.statements

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.BatchExecuteStatementRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BatchExecuteStatementRequest(")
        append("returnConsumedCapacity=$returnConsumedCapacity,")
        append("statements=$statements)")
    }

    override fun hashCode(): kotlin.Int {
        var result = returnConsumedCapacity?.hashCode() ?: 0
        result = 31 * result + (statements?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BatchExecuteStatementRequest

        if (returnConsumedCapacity != other.returnConsumedCapacity) return false
        if (statements != other.statements) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.BatchExecuteStatementRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Determines the level of detail about either provisioned or on-demand throughput consumption that is returned in the response:
         * + `INDEXES` - The response includes the aggregate `ConsumedCapacity` for the operation, together with `ConsumedCapacity` for each table and secondary index that was accessed.Note that some operations, such as `GetItem` and `BatchGetItem`, do not access any indexes at all. In these cases, specifying `INDEXES` will only return `ConsumedCapacity` information for table(s).
         * + `TOTAL` - The response includes only the aggregate `ConsumedCapacity` for the operation.
         * + `NONE` - No `ConsumedCapacity` details are included in the response.
         */
        var returnConsumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ReturnConsumedCapacity? = null
        /**
         * The list of PartiQL statements representing the batch to run.
         */
        var statements: List<BatchStatementRequest>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.BatchExecuteStatementRequest) : this() {
            this.returnConsumedCapacity = x.returnConsumedCapacity
            this.statements = x.statements
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.BatchExecuteStatementRequest = BatchExecuteStatementRequest(this)
    }
}
