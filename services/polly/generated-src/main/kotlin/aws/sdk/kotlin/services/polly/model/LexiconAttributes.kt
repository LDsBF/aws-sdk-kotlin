// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains metadata describing the lexicon such as the number of lexemes, language code, and so on. For more information, see [Managing Lexicons](https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html).
 */
class LexiconAttributes private constructor(builder: Builder) {
    /**
     * Phonetic alphabet used in the lexicon. Valid values are `ipa` and `x-sampa`.
     */
    val alphabet: kotlin.String? = builder.alphabet
    /**
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     */
    val languageCode: aws.sdk.kotlin.services.polly.model.LanguageCode? = builder.languageCode
    /**
     * Date lexicon was last modified (a timestamp value).
     */
    val lastModified: aws.smithy.kotlin.runtime.time.Instant? = builder.lastModified
    /**
     * Number of lexemes in the lexicon.
     */
    val lexemesCount: kotlin.Int = builder.lexemesCount
    /**
     * Amazon Resource Name (ARN) of the lexicon.
     */
    val lexiconArn: kotlin.String? = builder.lexiconArn
    /**
     * Total size of the lexicon, in characters.
     */
    val size: kotlin.Int = builder.size

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.LexiconAttributes = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LexiconAttributes(")
        append("alphabet=$alphabet,")
        append("languageCode=$languageCode,")
        append("lastModified=$lastModified,")
        append("lexemesCount=$lexemesCount,")
        append("lexiconArn=$lexiconArn,")
        append("size=$size)")
    }

    override fun hashCode(): kotlin.Int {
        var result = alphabet?.hashCode() ?: 0
        result = 31 * result + (languageCode?.hashCode() ?: 0)
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        result = 31 * result + (lexemesCount)
        result = 31 * result + (lexiconArn?.hashCode() ?: 0)
        result = 31 * result + (size)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LexiconAttributes

        if (alphabet != other.alphabet) return false
        if (languageCode != other.languageCode) return false
        if (lastModified != other.lastModified) return false
        if (lexemesCount != other.lexemesCount) return false
        if (lexiconArn != other.lexiconArn) return false
        if (size != other.size) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.LexiconAttributes = Builder(this).apply(block).build()

    class Builder {
        /**
         * Phonetic alphabet used in the lexicon. Valid values are `ipa` and `x-sampa`.
         */
        var alphabet: kotlin.String? = null
        /**
         * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
         */
        var languageCode: aws.sdk.kotlin.services.polly.model.LanguageCode? = null
        /**
         * Date lexicon was last modified (a timestamp value).
         */
        var lastModified: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Number of lexemes in the lexicon.
         */
        var lexemesCount: kotlin.Int = 0
        /**
         * Amazon Resource Name (ARN) of the lexicon.
         */
        var lexiconArn: kotlin.String? = null
        /**
         * Total size of the lexicon, in characters.
         */
        var size: kotlin.Int = 0

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.LexiconAttributes) : this() {
            this.alphabet = x.alphabet
            this.languageCode = x.languageCode
            this.lastModified = x.lastModified
            this.lexemesCount = x.lexemesCount
            this.lexiconArn = x.lexiconArn
            this.size = x.size
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.LexiconAttributes = LexiconAttributes(this)
    }
}
