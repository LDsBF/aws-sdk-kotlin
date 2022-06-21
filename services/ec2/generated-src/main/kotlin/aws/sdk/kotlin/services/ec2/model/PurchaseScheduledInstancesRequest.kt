// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for PurchaseScheduledInstances.
 */
class PurchaseScheduledInstancesRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The purchase requests.
     */
    val purchaseRequests: List<PurchaseRequest>? = builder.purchaseRequests

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PurchaseScheduledInstancesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PurchaseScheduledInstancesRequest(")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("purchaseRequests=$purchaseRequests)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (purchaseRequests?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PurchaseScheduledInstancesRequest

        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (purchaseRequests != other.purchaseRequests) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PurchaseScheduledInstancesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The purchase requests.
         */
        var purchaseRequests: List<PurchaseRequest>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PurchaseScheduledInstancesRequest) : this() {
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.purchaseRequests = x.purchaseRequests
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PurchaseScheduledInstancesRequest = PurchaseScheduledInstancesRequest(this)
    }
}
