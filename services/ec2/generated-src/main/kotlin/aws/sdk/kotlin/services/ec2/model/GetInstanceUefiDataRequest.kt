// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetInstanceUefiDataRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the instance from which to retrieve the UEFI data.
     */
    val instanceId: kotlin.String? = builder.instanceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetInstanceUefiDataRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetInstanceUefiDataRequest(")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetInstanceUefiDataRequest

        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetInstanceUefiDataRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the instance from which to retrieve the UEFI data.
         */
        var instanceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetInstanceUefiDataRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetInstanceUefiDataRequest = GetInstanceUefiDataRequest(this)
    }
}
