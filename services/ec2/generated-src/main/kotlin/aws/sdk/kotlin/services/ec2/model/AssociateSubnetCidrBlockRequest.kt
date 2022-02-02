// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateSubnetCidrBlockRequest private constructor(builder: Builder) {
    /**
     * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
     * length.
     */
    val ipv6CidrBlock: kotlin.String? = builder.ipv6CidrBlock
    /**
     * The ID of your subnet.
     */
    val subnetId: kotlin.String? = builder.subnetId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateSubnetCidrBlockRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateSubnetCidrBlockRequest(")
        append("ipv6CidrBlock=$ipv6CidrBlock,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv6CidrBlock?.hashCode() ?: 0
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateSubnetCidrBlockRequest

        if (ipv6CidrBlock != other.ipv6CidrBlock) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateSubnetCidrBlockRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix
         * length.
         */
        var ipv6CidrBlock: kotlin.String? = null
        /**
         * The ID of your subnet.
         */
        var subnetId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateSubnetCidrBlockRequest) : this() {
            this.ipv6CidrBlock = x.ipv6CidrBlock
            this.subnetId = x.subnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateSubnetCidrBlockRequest = AssociateSubnetCidrBlockRequest(this)
    }
}
