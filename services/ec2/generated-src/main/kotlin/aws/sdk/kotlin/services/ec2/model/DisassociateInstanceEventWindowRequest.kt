// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateInstanceEventWindowRequest private constructor(builder: Builder) {
    /**
     * One or more targets to disassociate from the specified event window.
     */
    val associationTarget: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest? = builder.associationTarget
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the event window.
     */
    val instanceEventWindowId: kotlin.String? = builder.instanceEventWindowId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateInstanceEventWindowRequest(")
        append("associationTarget=$associationTarget,")
        append("dryRun=$dryRun,")
        append("instanceEventWindowId=$instanceEventWindowId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationTarget?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceEventWindowId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateInstanceEventWindowRequest

        if (associationTarget != other.associationTarget) return false
        if (dryRun != other.dryRun) return false
        if (instanceEventWindowId != other.instanceEventWindowId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * One or more targets to disassociate from the specified event window.
         */
        var associationTarget: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the event window.
         */
        var instanceEventWindowId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowRequest) : this() {
            this.associationTarget = x.associationTarget
            this.dryRun = x.dryRun
            this.instanceEventWindowId = x.instanceEventWindowId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowRequest = DisassociateInstanceEventWindowRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest] inside the given [block]
         */
        fun associationTarget(block: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest.Builder.() -> kotlin.Unit) {
            this.associationTarget = aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest.invoke(block)
        }
    }
}
