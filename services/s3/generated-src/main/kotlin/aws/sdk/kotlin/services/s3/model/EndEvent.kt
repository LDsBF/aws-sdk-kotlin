// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A message that indicates the request is complete and no more messages will be sent. You
 * should not assume that the request is complete until the client receives an
 * EndEvent.
 */
class EndEvent private constructor(builder: Builder) {

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.EndEvent = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EndEvent(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        return this::class.hashCode()
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EndEvent

        return true
    }

    class Builder {

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.EndEvent) : this() {
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.EndEvent = EndEvent(this)
    }
}
