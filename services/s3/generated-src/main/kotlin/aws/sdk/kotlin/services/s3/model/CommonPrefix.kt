// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter. CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/.
 */
class CommonPrefix private constructor(builder: Builder) {
    /**
     * Container for the specified common prefix.
     */
    val prefix: kotlin.String? = builder.prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.CommonPrefix = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CommonPrefix(")
        append("prefix=$prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = prefix?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CommonPrefix

        if (prefix != other.prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.CommonPrefix = Builder(this).apply(block).build()

    class Builder {
        /**
         * Container for the specified common prefix.
         */
        var prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.CommonPrefix) : this() {
            this.prefix = x.prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.CommonPrefix = CommonPrefix(this)
    }
}
