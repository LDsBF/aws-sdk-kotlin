// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ClientLoginBannerResponseOptions private constructor(builder: Builder) {
    val bannerText: kotlin.String? = builder.bannerText
    val enabled: kotlin.Boolean? = builder.enabled

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClientLoginBannerResponseOptions(")
        append("bannerText=$bannerText,")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bannerText?.hashCode() ?: 0
        result = 31 * result + (enabled?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClientLoginBannerResponseOptions

        if (bannerText != other.bannerText) return false
        if (enabled != other.enabled) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions = Builder(this).apply(block).build()

    class Builder {
        var bannerText: kotlin.String? = null
        var enabled: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions) : this() {
            this.bannerText = x.bannerText
            this.enabled = x.enabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions = ClientLoginBannerResponseOptions(this)
    }
}
