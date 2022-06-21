// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the output of a `DeleteTable` operation.
 */
class DeleteTableResponse private constructor(builder: Builder) {
    /**
     * Represents the properties of a table.
     */
    val tableDescription: aws.sdk.kotlin.services.dynamodb.model.TableDescription? = builder.tableDescription

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteTableResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTableResponse(")
        append("tableDescription=$tableDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tableDescription?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTableResponse

        if (tableDescription != other.tableDescription) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteTableResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Represents the properties of a table.
         */
        var tableDescription: aws.sdk.kotlin.services.dynamodb.model.TableDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteTableResponse) : this() {
            this.tableDescription = x.tableDescription
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteTableResponse = DeleteTableResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.TableDescription] inside the given [block]
         */
        fun tableDescription(block: aws.sdk.kotlin.services.dynamodb.model.TableDescription.Builder.() -> kotlin.Unit) {
            this.tableDescription = aws.sdk.kotlin.services.dynamodb.model.TableDescription.invoke(block)
        }
    }
}
