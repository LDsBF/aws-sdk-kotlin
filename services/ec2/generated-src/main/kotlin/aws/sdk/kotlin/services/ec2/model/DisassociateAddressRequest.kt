// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateAddressRequest private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; The association ID. Required for EC2-VPC.
     */
    val associationId: kotlin.String? = builder.associationId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * &#91;EC2-Classic&#93; The Elastic IP address. Required for EC2-Classic.
     */
    val publicIp: kotlin.String? = builder.publicIp

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateAddressRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateAddressRequest(")
        append("associationId=$associationId,")
        append("dryRun=$dryRun,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateAddressRequest

        if (associationId != other.associationId) return false
        if (dryRun != other.dryRun) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateAddressRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * &#91;EC2-VPC&#93; The association ID. Required for EC2-VPC.
         */
        var associationId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * &#91;EC2-Classic&#93; The Elastic IP address. Required for EC2-Classic.
         */
        var publicIp: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateAddressRequest) : this() {
            this.associationId = x.associationId
            this.dryRun = x.dryRun
            this.publicIp = x.publicIp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateAddressRequest = DisassociateAddressRequest(this)
    }
}
