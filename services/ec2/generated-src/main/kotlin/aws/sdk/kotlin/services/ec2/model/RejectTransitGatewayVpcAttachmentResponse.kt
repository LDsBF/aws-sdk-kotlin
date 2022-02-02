// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RejectTransitGatewayVpcAttachmentResponse private constructor(builder: Builder) {
    /**
     * Information about the attachment.
     */
    val transitGatewayVpcAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment? = builder.transitGatewayVpcAttachment

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayVpcAttachmentResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RejectTransitGatewayVpcAttachmentResponse(")
        append("transitGatewayVpcAttachment=$transitGatewayVpcAttachment)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayVpcAttachment?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RejectTransitGatewayVpcAttachmentResponse

        if (transitGatewayVpcAttachment != other.transitGatewayVpcAttachment) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayVpcAttachmentResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the attachment.
         */
        var transitGatewayVpcAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayVpcAttachmentResponse) : this() {
            this.transitGatewayVpcAttachment = x.transitGatewayVpcAttachment
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayVpcAttachmentResponse = RejectTransitGatewayVpcAttachmentResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment] inside the given [block]
         */
        fun transitGatewayVpcAttachment(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment.Builder.() -> kotlin.Unit) {
            this.transitGatewayVpcAttachment = aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment.invoke(block)
        }
    }
}
