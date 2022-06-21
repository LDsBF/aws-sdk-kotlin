// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * Your request rate is too high. The Amazon Web Services SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to [Error Retries and Exponential Backoff](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff) in the *Amazon DynamoDB Developer Guide*.
 */
class ProvisionedThroughputExceededException private constructor(builder: Builder) : DynamoDbException() {

    /**
     * You exceeded your maximum allowed provisioned throughput.
     */
    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputExceededException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ProvisionedThroughputExceededException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ProvisionedThroughputExceededException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputExceededException = Builder(this).apply(block).build()

    class Builder {
        /**
         * You exceeded your maximum allowed provisioned throughput.
         */
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputExceededException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputExceededException = ProvisionedThroughputExceededException(this)
    }
}
