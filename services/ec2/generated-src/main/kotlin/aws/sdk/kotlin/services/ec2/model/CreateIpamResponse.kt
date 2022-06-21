// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateIpamResponse private constructor(builder: Builder) {
    /**
     * Information about the IPAM created.
     */
    val ipam: aws.sdk.kotlin.services.ec2.model.Ipam? = builder.ipam

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateIpamResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateIpamResponse(")
        append("ipam=$ipam)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipam?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateIpamResponse

        if (ipam != other.ipam) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateIpamResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the IPAM created.
         */
        var ipam: aws.sdk.kotlin.services.ec2.model.Ipam? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateIpamResponse) : this() {
            this.ipam = x.ipam
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateIpamResponse = CreateIpamResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.Ipam] inside the given [block]
         */
        fun ipam(block: aws.sdk.kotlin.services.ec2.model.Ipam.Builder.() -> kotlin.Unit) {
            this.ipam = aws.sdk.kotlin.services.ec2.model.Ipam.invoke(block)
        }
    }
}
