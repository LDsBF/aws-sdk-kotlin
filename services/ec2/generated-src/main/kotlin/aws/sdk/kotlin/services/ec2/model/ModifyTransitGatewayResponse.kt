// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayResponse private constructor(builder: Builder) {
    /**
     * Describes a transit gateway.
     */
    val transitGateway: aws.sdk.kotlin.services.ec2.model.TransitGateway? = builder.transitGateway

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayResponse(")
        append("transitGateway=$transitGateway)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGateway?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTransitGatewayResponse

        if (transitGateway != other.transitGateway) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Describes a transit gateway.
         */
        var transitGateway: aws.sdk.kotlin.services.ec2.model.TransitGateway? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayResponse) : this() {
            this.transitGateway = x.transitGateway
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayResponse = ModifyTransitGatewayResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGateway] inside the given [block]
         */
        fun transitGateway(block: aws.sdk.kotlin.services.ec2.model.TransitGateway.Builder.() -> kotlin.Unit) {
            this.transitGateway = aws.sdk.kotlin.services.ec2.model.TransitGateway.invoke(block)
        }
    }
}
