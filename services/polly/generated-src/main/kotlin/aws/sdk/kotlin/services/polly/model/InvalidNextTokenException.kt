// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The NextToken is invalid. Verify that it's spelled correctly, and then try again.
 */
class InvalidNextTokenException private constructor(builder: Builder) : PollyException() {

    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.InvalidNextTokenException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InvalidNextTokenException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InvalidNextTokenException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.InvalidNextTokenException = Builder(this).apply(block).build()

    class Builder {
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.InvalidNextTokenException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.InvalidNextTokenException = InvalidNextTokenException(this)
    }
}
