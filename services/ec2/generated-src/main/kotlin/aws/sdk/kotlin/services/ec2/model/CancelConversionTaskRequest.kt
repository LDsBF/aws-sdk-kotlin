// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CancelConversionTaskRequest private constructor(builder: Builder) {
    /**
     * The ID of the conversion task.
     */
    val conversionTaskId: kotlin.String? = builder.conversionTaskId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The reason for canceling the conversion task.
     */
    val reasonMessage: kotlin.String? = builder.reasonMessage

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CancelConversionTaskRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CancelConversionTaskRequest(")
        append("conversionTaskId=$conversionTaskId,")
        append("dryRun=$dryRun,")
        append("reasonMessage=$reasonMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conversionTaskId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (reasonMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CancelConversionTaskRequest

        if (conversionTaskId != other.conversionTaskId) return false
        if (dryRun != other.dryRun) return false
        if (reasonMessage != other.reasonMessage) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CancelConversionTaskRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the conversion task.
         */
        var conversionTaskId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The reason for canceling the conversion task.
         */
        var reasonMessage: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CancelConversionTaskRequest) : this() {
            this.conversionTaskId = x.conversionTaskId
            this.dryRun = x.dryRun
            this.reasonMessage = x.reasonMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CancelConversionTaskRequest = CancelConversionTaskRequest(this)
    }
}
