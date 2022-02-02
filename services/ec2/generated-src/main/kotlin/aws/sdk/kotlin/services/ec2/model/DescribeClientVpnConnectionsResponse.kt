// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeClientVpnConnectionsResponse private constructor(builder: Builder) {
    /**
     * Information about the active and terminated client connections.
     */
    val connections: List<ClientVpnConnection>? = builder.connections
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnConnectionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeClientVpnConnectionsResponse(")
        append("connections=$connections,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = connections?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeClientVpnConnectionsResponse

        if (connections != other.connections) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnConnectionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the active and terminated client connections.
         */
        var connections: List<ClientVpnConnection>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeClientVpnConnectionsResponse) : this() {
            this.connections = x.connections
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnConnectionsResponse = DescribeClientVpnConnectionsResponse(this)
    }
}
