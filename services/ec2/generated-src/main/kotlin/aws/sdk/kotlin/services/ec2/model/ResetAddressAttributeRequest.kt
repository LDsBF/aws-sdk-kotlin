// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetAddressAttributeRequest private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; The allocation ID.
     */
    val allocationId: kotlin.String? = builder.allocationId
    /**
     * The attribute of the IP address.
     */
    val attribute: aws.sdk.kotlin.services.ec2.model.AddressAttributeName? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ResetAddressAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ResetAddressAttributeRequest(")
        append("allocationId=$allocationId,")
        append("attribute=$attribute,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (attribute?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ResetAddressAttributeRequest

        if (allocationId != other.allocationId) return false
        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ResetAddressAttributeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * &#91;EC2-VPC&#93; The allocation ID.
         */
        var allocationId: kotlin.String? = null
        /**
         * The attribute of the IP address.
         */
        var attribute: aws.sdk.kotlin.services.ec2.model.AddressAttributeName? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ResetAddressAttributeRequest) : this() {
            this.allocationId = x.allocationId
            this.attribute = x.attribute
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ResetAddressAttributeRequest = ResetAddressAttributeRequest(this)
    }
}
