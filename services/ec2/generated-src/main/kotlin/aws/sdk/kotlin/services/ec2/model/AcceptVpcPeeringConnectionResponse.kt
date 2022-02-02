// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AcceptVpcPeeringConnectionResponse private constructor(builder: Builder) {
    /**
     * Information about the VPC peering connection.
     */
    val vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection? = builder.vpcPeeringConnection

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AcceptVpcPeeringConnectionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AcceptVpcPeeringConnectionResponse(")
        append("vpcPeeringConnection=$vpcPeeringConnection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = vpcPeeringConnection?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AcceptVpcPeeringConnectionResponse

        if (vpcPeeringConnection != other.vpcPeeringConnection) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AcceptVpcPeeringConnectionResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the VPC peering connection.
         */
        var vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AcceptVpcPeeringConnectionResponse) : this() {
            this.vpcPeeringConnection = x.vpcPeeringConnection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AcceptVpcPeeringConnectionResponse = AcceptVpcPeeringConnectionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection] inside the given [block]
         */
        fun vpcPeeringConnection(block: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection.Builder.() -> kotlin.Unit) {
            this.vpcPeeringConnection = aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection.invoke(block)
        }
    }
}
