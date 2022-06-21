// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateCarrierGatewayRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The tags to associate with the carrier gateway.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the VPC to associate with the carrier gateway.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateCarrierGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateCarrierGatewayRequest(")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("tagSpecifications=$tagSpecifications,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateCarrierGatewayRequest

        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateCarrierGatewayRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The tags to associate with the carrier gateway.
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The ID of the VPC to associate with the carrier gateway.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateCarrierGatewayRequest) : this() {
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.tagSpecifications = x.tagSpecifications
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateCarrierGatewayRequest = CreateCarrierGatewayRequest(this)
    }
}
