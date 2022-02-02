// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a failure a contributor insights operation.
 */
class FailureException private constructor(builder: Builder) {
    /**
     * Description of the failure.
     */
    val exceptionDescription: kotlin.String? = builder.exceptionDescription
    /**
     * Exception name.
     */
    val exceptionName: kotlin.String? = builder.exceptionName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.FailureException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FailureException(")
        append("exceptionDescription=$exceptionDescription,")
        append("exceptionName=$exceptionName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exceptionDescription?.hashCode() ?: 0
        result = 31 * result + (exceptionName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FailureException

        if (exceptionDescription != other.exceptionDescription) return false
        if (exceptionName != other.exceptionName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.FailureException = Builder(this).apply(block).build()

    class Builder {
        /**
         * Description of the failure.
         */
        var exceptionDescription: kotlin.String? = null
        /**
         * Exception name.
         */
        var exceptionName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.FailureException) : this() {
            this.exceptionDescription = x.exceptionDescription
            this.exceptionName = x.exceptionName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.FailureException = FailureException(this)
    }
}
