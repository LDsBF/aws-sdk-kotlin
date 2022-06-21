// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class EnableVpcClassicLinkResponse private constructor(builder: Builder) {
    /**
     * Returns `true` if the request succeeds; otherwise, it returns an error.
     */
    val `return`: kotlin.Boolean? = builder.`return`

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableVpcClassicLinkResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableVpcClassicLinkResponse(")
        append("return=$`return`)")
    }

    override fun hashCode(): kotlin.Int {
        var result = `return`?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableVpcClassicLinkResponse

        if (`return` != other.`return`) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableVpcClassicLinkResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Returns `true` if the request succeeds; otherwise, it returns an error.
         */
        var `return`: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableVpcClassicLinkResponse) : this() {
            this.`return` = x.`return`
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableVpcClassicLinkResponse = EnableVpcClassicLinkResponse(this)
    }
}
