// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeNetworkInterfaceAttribute.
 */
class DescribeNetworkInterfaceAttributeRequest private constructor(builder: Builder) {
    /**
     * The attribute of the network interface. This parameter is required.
     */
    val attribute: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttribute? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfaceAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkInterfaceAttributeRequest(")
        append("attribute=$attribute,")
        append("dryRun=$dryRun,")
        append("networkInterfaceId=$networkInterfaceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkInterfaceAttributeRequest

        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false
        if (networkInterfaceId != other.networkInterfaceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfaceAttributeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The attribute of the network interface. This parameter is required.
         */
        var attribute: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttribute? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfaceAttributeRequest) : this() {
            this.attribute = x.attribute
            this.dryRun = x.dryRun
            this.networkInterfaceId = x.networkInterfaceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfaceAttributeRequest = DescribeNetworkInterfaceAttributeRequest(this)
    }
}
