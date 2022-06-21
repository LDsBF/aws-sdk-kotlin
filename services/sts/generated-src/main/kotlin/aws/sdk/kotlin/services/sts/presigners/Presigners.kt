// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.presigners

import aws.sdk.kotlin.runtime.ClientException
import aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider
import aws.sdk.kotlin.runtime.endpoint.asSigningEndpointProvider
import aws.sdk.kotlin.services.sts.StsClient
import aws.sdk.kotlin.services.sts.internal.DefaultEndpointResolver
import aws.sdk.kotlin.services.sts.model.GetCallerIdentityRequest
import aws.sdk.kotlin.services.sts.transform.GetCallerIdentityOperationSerializer
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProvider
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigner
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSigner
import aws.smithy.kotlin.runtime.auth.awssigning.PresignedRequestConfig
import aws.smithy.kotlin.runtime.auth.awssigning.PresigningLocation
import aws.smithy.kotlin.runtime.auth.awssigning.ServicePresignConfig
import aws.smithy.kotlin.runtime.auth.awssigning.SigningEndpointProvider
import aws.smithy.kotlin.runtime.auth.awssigning.createPresignedRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.content.decodeToString
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.QueryParameters
import aws.smithy.kotlin.runtime.http.request.HttpRequest
import aws.smithy.kotlin.runtime.http.toByteStream
import aws.smithy.kotlin.runtime.http.util.splitAsQueryParameters
import kotlin.time.Duration

/**
 * Presign a [GetCallerIdentityRequest] using a [ServicePresignConfig].
 * @param presignConfig the configuration used to generate the presigned request
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun GetCallerIdentityRequest.presign(presignConfig: ServicePresignConfig, duration: Duration): HttpRequest {
    return createPresignedRequest(presignConfig, getCallerIdentityPresignConfig(this, duration))
}

/**
 * Presign a [GetCallerIdentityRequest] using a [StsClient].
 * @param config the client configuration used to generate the presigned request.
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun GetCallerIdentityRequest.presign(config: StsClient.Config, duration: Duration): HttpRequest {
    val presignConfig = StsPresignConfig {
        credentialsProvider = config.credentialsProvider
        endpointProvider = config.endpointResolver.asSigningEndpointProvider()
        region = config.region
    }
    return createPresignedRequest(presignConfig, getCallerIdentityPresignConfig(this, duration))
}

private suspend fun getCallerIdentityPresignConfig(input: GetCallerIdentityRequest, duration: Duration) : PresignedRequestConfig {
    require(duration.isPositive()) { "duration must be greater than zero" }
    val httpRequestBuilder = GetCallerIdentityOperationSerializer().serialize(ExecutionContext.build {  }, input)
    return PresignedRequestConfig(
        HttpMethod.GET,
        httpRequestBuilder.url.path,
        httpRequestBuilder.body.toByteStream()?.decodeToString()?.splitAsQueryParameters() ?: QueryParameters.Empty,
        duration,
        true,
        PresigningLocation.QUERY_STRING,
        httpRequestBuilder.headers.build(),
    )
}

/**
 * Provides a subset of the service client configuration necessary to presign a request.
 * This type can be used to presign requests in cases where an existing service client
 * instance is not available.
 */
class StsPresignConfig private constructor(builder: Builder): ServicePresignConfig {
    override val credentialsProvider: CredentialsProvider = requireNotNull(builder.credentialsProvider) { "credentialsProvider is a required configuration property" }
    override val endpointProvider: SigningEndpointProvider = builder.endpointProvider ?: DefaultEndpointResolver().asSigningEndpointProvider()
    override val normalizeUriPath: Boolean = true
    override val region: String = requireNotNull(builder.region) { "region is a required configuration property" }
    override val serviceId: String = "STS"
    override val signer: AwsSigner = builder.signer ?: DefaultAwsSigner
    override val signingName: String = "sts"
    override val useDoubleUriEncode: Boolean = true
    companion object {
        inline operator fun invoke(block: Builder.() -> kotlin.Unit): ServicePresignConfig = Builder().apply(block).build()
    }

    class Builder {
        /**
         * The AWS credentials provider to use for authenticating requests. If not provided a [aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider] instance will be used.
         */
        var credentialsProvider: CredentialsProvider? = null
        /**
         * Provides the endpoint (hostname) and signing context to make requests to. When not provided a default resolver is configured automatically. This is an advanced client option.
         */
        var endpointProvider: SigningEndpointProvider? = null
        /**
         * AWS region to make requests for
         */
        var region: String? = null
        /**
         * The implementation of AWS signer to use for signing requests
         */
        var signer: AwsSigner? = null

        @PublishedApi
        internal fun build(): StsPresignConfig = StsPresignConfig(this)
    }
}
