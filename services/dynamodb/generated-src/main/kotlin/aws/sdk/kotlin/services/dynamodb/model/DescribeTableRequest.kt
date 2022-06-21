// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a `DescribeTable` operation.
 */
class DescribeTableRequest private constructor(builder: Builder) {
    /**
     * The name of the table to describe.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DescribeTableRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTableRequest(")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tableName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTableRequest

        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DescribeTableRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the table to describe.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DescribeTableRequest) : this() {
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DescribeTableRequest = DescribeTableRequest(this)
    }
}
