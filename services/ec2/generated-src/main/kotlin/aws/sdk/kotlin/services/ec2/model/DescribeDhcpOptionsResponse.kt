// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeDhcpOptionsResponse private constructor(builder: Builder) {
    /**
     * Information about one or more DHCP options sets.
     */
    val dhcpOptions: List<DhcpOptions>? = builder.dhcpOptions
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeDhcpOptionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeDhcpOptionsResponse(")
        append("dhcpOptions=$dhcpOptions,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dhcpOptions?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeDhcpOptionsResponse

        if (dhcpOptions != other.dhcpOptions) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeDhcpOptionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about one or more DHCP options sets.
         */
        var dhcpOptions: List<DhcpOptions>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeDhcpOptionsResponse) : this() {
            this.dhcpOptions = x.dhcpOptions
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeDhcpOptionsResponse = DescribeDhcpOptionsResponse(this)
    }
}
