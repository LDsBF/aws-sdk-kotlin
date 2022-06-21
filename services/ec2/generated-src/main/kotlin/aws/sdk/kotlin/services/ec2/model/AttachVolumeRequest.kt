// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AttachVolumeRequest private constructor(builder: Builder) {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh`).
     */
    val device: kotlin.String? = builder.device
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
     */
    val volumeId: kotlin.String? = builder.volumeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AttachVolumeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AttachVolumeRequest(")
        append("device=$device,")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId,")
        append("volumeId=$volumeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = device?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AttachVolumeRequest

        if (device != other.device) return false
        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false
        if (volumeId != other.volumeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AttachVolumeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The device name (for example, `/dev/sdh` or `xvdh`).
         */
        var device: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
         */
        var volumeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AttachVolumeRequest) : this() {
            this.device = x.device
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
            this.volumeId = x.volumeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AttachVolumeRequest = AttachVolumeRequest(this)
    }
}
