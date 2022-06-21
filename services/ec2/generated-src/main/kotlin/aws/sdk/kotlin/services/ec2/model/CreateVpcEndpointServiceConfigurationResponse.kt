// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcEndpointServiceConfigurationResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the service configuration.
     */
    val serviceConfiguration: aws.sdk.kotlin.services.ec2.model.ServiceConfiguration? = builder.serviceConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointServiceConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcEndpointServiceConfigurationResponse(")
        append("clientToken=$clientToken,")
        append("serviceConfiguration=$serviceConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (serviceConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcEndpointServiceConfigurationResponse

        if (clientToken != other.clientToken) return false
        if (serviceConfiguration != other.serviceConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointServiceConfigurationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
         */
        var clientToken: kotlin.String? = null
        /**
         * Information about the service configuration.
         */
        var serviceConfiguration: aws.sdk.kotlin.services.ec2.model.ServiceConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointServiceConfigurationResponse) : this() {
            this.clientToken = x.clientToken
            this.serviceConfiguration = x.serviceConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointServiceConfigurationResponse = CreateVpcEndpointServiceConfigurationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ServiceConfiguration] inside the given [block]
         */
        fun serviceConfiguration(block: aws.sdk.kotlin.services.ec2.model.ServiceConfiguration.Builder.() -> kotlin.Unit) {
            this.serviceConfiguration = aws.sdk.kotlin.services.ec2.model.ServiceConfiguration.invoke(block)
        }
    }
}
