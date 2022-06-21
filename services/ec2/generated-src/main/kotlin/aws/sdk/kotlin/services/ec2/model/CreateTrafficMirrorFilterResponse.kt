// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTrafficMirrorFilterResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the Traffic Mirror filter.
     */
    val trafficMirrorFilter: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter? = builder.trafficMirrorFilter

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTrafficMirrorFilterResponse(")
        append("clientToken=$clientToken,")
        append("trafficMirrorFilter=$trafficMirrorFilter)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (trafficMirrorFilter?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTrafficMirrorFilterResponse

        if (clientToken != other.clientToken) return false
        if (trafficMirrorFilter != other.trafficMirrorFilter) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        var clientToken: kotlin.String? = null
        /**
         * Information about the Traffic Mirror filter.
         */
        var trafficMirrorFilter: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterResponse) : this() {
            this.clientToken = x.clientToken
            this.trafficMirrorFilter = x.trafficMirrorFilter
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorFilterResponse = CreateTrafficMirrorFilterResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter] inside the given [block]
         */
        fun trafficMirrorFilter(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter.Builder.() -> kotlin.Unit) {
            this.trafficMirrorFilter = aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter.invoke(block)
        }
    }
}
