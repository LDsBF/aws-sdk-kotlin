// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeLocalGatewayVirtualInterfaceGroupsResponse private constructor(builder: Builder) {
    /**
     * The virtual interface groups.
     */
    val localGatewayVirtualInterfaceGroups: List<LocalGatewayVirtualInterfaceGroup>? = builder.localGatewayVirtualInterfaceGroups
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfaceGroupsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLocalGatewayVirtualInterfaceGroupsResponse(")
        append("localGatewayVirtualInterfaceGroups=$localGatewayVirtualInterfaceGroups,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = localGatewayVirtualInterfaceGroups?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeLocalGatewayVirtualInterfaceGroupsResponse

        if (localGatewayVirtualInterfaceGroups != other.localGatewayVirtualInterfaceGroups) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfaceGroupsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The virtual interface groups.
         */
        var localGatewayVirtualInterfaceGroups: List<LocalGatewayVirtualInterfaceGroup>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfaceGroupsResponse) : this() {
            this.localGatewayVirtualInterfaceGroups = x.localGatewayVirtualInterfaceGroups
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfaceGroupsResponse = DescribeLocalGatewayVirtualInterfaceGroupsResponse(this)
    }
}
