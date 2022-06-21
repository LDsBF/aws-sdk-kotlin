// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The container element for an Object Lock rule.
 */
class ObjectLockRule private constructor(builder: Builder) {
    /**
     * The default Object Lock retention mode and period that you want to apply to new objects placed in the specified bucket. Bucket settings require both a mode and a period. The period can be either `Days` or `Years` but you must select one. You cannot specify `Days` and `Years` at the same time.
     */
    val defaultRetention: aws.sdk.kotlin.services.s3.model.DefaultRetention? = builder.defaultRetention

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ObjectLockRule = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ObjectLockRule(")
        append("defaultRetention=$defaultRetention)")
    }

    override fun hashCode(): kotlin.Int {
        var result = defaultRetention?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ObjectLockRule

        if (defaultRetention != other.defaultRetention) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ObjectLockRule = Builder(this).apply(block).build()

    class Builder {
        /**
         * The default Object Lock retention mode and period that you want to apply to new objects placed in the specified bucket. Bucket settings require both a mode and a period. The period can be either `Days` or `Years` but you must select one. You cannot specify `Days` and `Years` at the same time.
         */
        var defaultRetention: aws.sdk.kotlin.services.s3.model.DefaultRetention? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ObjectLockRule) : this() {
            this.defaultRetention = x.defaultRetention
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ObjectLockRule = ObjectLockRule(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.DefaultRetention] inside the given [block]
         */
        fun defaultRetention(block: aws.sdk.kotlin.services.s3.model.DefaultRetention.Builder.() -> kotlin.Unit) {
            this.defaultRetention = aws.sdk.kotlin.services.s3.model.DefaultRetention.invoke(block)
        }
    }
}
