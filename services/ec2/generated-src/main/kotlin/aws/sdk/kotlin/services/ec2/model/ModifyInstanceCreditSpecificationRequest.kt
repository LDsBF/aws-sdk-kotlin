// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyInstanceCreditSpecificationRequest private constructor(builder: Builder) {
    /**
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Information about the credit option for CPU usage.
     */
    val instanceCreditSpecifications: List<InstanceCreditSpecificationRequest>? = builder.instanceCreditSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyInstanceCreditSpecificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstanceCreditSpecificationRequest(")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("instanceCreditSpecifications=$instanceCreditSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceCreditSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyInstanceCreditSpecificationRequest

        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (instanceCreditSpecifications != other.instanceCreditSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyInstanceCreditSpecificationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Information about the credit option for CPU usage.
         */
        var instanceCreditSpecifications: List<InstanceCreditSpecificationRequest>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyInstanceCreditSpecificationRequest) : this() {
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.instanceCreditSpecifications = x.instanceCreditSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyInstanceCreditSpecificationRequest = ModifyInstanceCreditSpecificationRequest(this)
    }
}
