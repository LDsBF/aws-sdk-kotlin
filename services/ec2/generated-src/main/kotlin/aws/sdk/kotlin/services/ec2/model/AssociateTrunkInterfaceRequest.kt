// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateTrunkInterfaceRequest private constructor(builder: Builder) {
    /**
     * The ID of the branch network interface.
     */
    val branchInterfaceId: kotlin.String? = builder.branchInterfaceId
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to Ensure Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The application key. This applies to the GRE protocol.
     */
    val greKey: kotlin.Int? = builder.greKey
    /**
     * The ID of the trunk network interface.
     */
    val trunkInterfaceId: kotlin.String? = builder.trunkInterfaceId
    /**
     * The ID of the VLAN. This applies to the VLAN protocol.
     */
    val vlanId: kotlin.Int? = builder.vlanId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateTrunkInterfaceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateTrunkInterfaceRequest(")
        append("branchInterfaceId=$branchInterfaceId,")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("greKey=$greKey,")
        append("trunkInterfaceId=$trunkInterfaceId,")
        append("vlanId=$vlanId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = branchInterfaceId?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (greKey ?: 0)
        result = 31 * result + (trunkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (vlanId ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateTrunkInterfaceRequest

        if (branchInterfaceId != other.branchInterfaceId) return false
        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (greKey != other.greKey) return false
        if (trunkInterfaceId != other.trunkInterfaceId) return false
        if (vlanId != other.vlanId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateTrunkInterfaceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the branch network interface.
         */
        var branchInterfaceId: kotlin.String? = null
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to Ensure Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The application key. This applies to the GRE protocol.
         */
        var greKey: kotlin.Int? = null
        /**
         * The ID of the trunk network interface.
         */
        var trunkInterfaceId: kotlin.String? = null
        /**
         * The ID of the VLAN. This applies to the VLAN protocol.
         */
        var vlanId: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateTrunkInterfaceRequest) : this() {
            this.branchInterfaceId = x.branchInterfaceId
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.greKey = x.greKey
            this.trunkInterfaceId = x.trunkInterfaceId
            this.vlanId = x.vlanId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateTrunkInterfaceRequest = AssociateTrunkInterfaceRequest(this)
    }
}
