// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



class ListLexiconsResponse private constructor(builder: Builder) {
    /**
     * A list of lexicon names and attributes.
     */
    val lexicons: List<LexiconDescription>? = builder.lexicons
    /**
     * The pagination token to use in the next request to continue the listing of lexicons. `NextToken` is returned only if the response is truncated.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.ListLexiconsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListLexiconsResponse(")
        append("lexicons=$lexicons,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = lexicons?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListLexiconsResponse

        if (lexicons != other.lexicons) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.ListLexiconsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * A list of lexicon names and attributes.
         */
        var lexicons: List<LexiconDescription>? = null
        /**
         * The pagination token to use in the next request to continue the listing of lexicons. `NextToken` is returned only if the response is truncated.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.ListLexiconsResponse) : this() {
            this.lexicons = x.lexicons
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.ListLexiconsResponse = ListLexiconsResponse(this)
    }
}
