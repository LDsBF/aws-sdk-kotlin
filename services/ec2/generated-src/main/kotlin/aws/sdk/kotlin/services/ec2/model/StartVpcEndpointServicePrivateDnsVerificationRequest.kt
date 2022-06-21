// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class StartVpcEndpointServicePrivateDnsVerificationRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the endpoint service.
     */
    val serviceId: kotlin.String? = builder.serviceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.StartVpcEndpointServicePrivateDnsVerificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("StartVpcEndpointServicePrivateDnsVerificationRequest(")
        append("dryRun=$dryRun,")
        append("serviceId=$serviceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as StartVpcEndpointServicePrivateDnsVerificationRequest

        if (dryRun != other.dryRun) return false
        if (serviceId != other.serviceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.StartVpcEndpointServicePrivateDnsVerificationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the endpoint service.
         */
        var serviceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.StartVpcEndpointServicePrivateDnsVerificationRequest) : this() {
            this.dryRun = x.dryRun
            this.serviceId = x.serviceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.StartVpcEndpointServicePrivateDnsVerificationRequest = StartVpcEndpointServicePrivateDnsVerificationRequest(this)
    }
}
