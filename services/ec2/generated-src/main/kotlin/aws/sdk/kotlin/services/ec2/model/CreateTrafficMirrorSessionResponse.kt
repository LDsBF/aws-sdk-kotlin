// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTrafficMirrorSessionResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the Traffic Mirror session.
     */
    val trafficMirrorSession: aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession? = builder.trafficMirrorSession

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorSessionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTrafficMirrorSessionResponse(")
        append("clientToken=$clientToken,")
        append("trafficMirrorSession=$trafficMirrorSession)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (trafficMirrorSession?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTrafficMirrorSessionResponse

        if (clientToken != other.clientToken) return false
        if (trafficMirrorSession != other.trafficMirrorSession) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorSessionResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Information about the Traffic Mirror session.
         */
        var trafficMirrorSession: aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorSessionResponse) : this() {
            this.clientToken = x.clientToken
            this.trafficMirrorSession = x.trafficMirrorSession
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorSessionResponse = CreateTrafficMirrorSessionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession] inside the given [block]
         */
        fun trafficMirrorSession(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession.Builder.() -> kotlin.Unit) {
            this.trafficMirrorSession = aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession.invoke(block)
        }
    }
}
