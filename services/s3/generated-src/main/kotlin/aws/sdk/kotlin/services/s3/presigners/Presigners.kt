// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.presigners

import aws.sdk.kotlin.runtime.ClientException
import aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider
import aws.sdk.kotlin.runtime.endpoint.asSigningEndpointProvider
import aws.sdk.kotlin.services.s3.S3Client
import aws.sdk.kotlin.services.s3.internal.DefaultEndpointResolver
import aws.sdk.kotlin.services.s3.model.GetObjectRequest
import aws.sdk.kotlin.services.s3.model.PutObjectRequest
import aws.sdk.kotlin.services.s3.model.UploadPartRequest
import aws.sdk.kotlin.services.s3.transform.GetObjectOperationSerializer
import aws.sdk.kotlin.services.s3.transform.PutObjectOperationSerializer
import aws.sdk.kotlin.services.s3.transform.UploadPartOperationSerializer
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProvider
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigner
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSigner
import aws.smithy.kotlin.runtime.auth.awssigning.PresignedRequestConfig
import aws.smithy.kotlin.runtime.auth.awssigning.PresigningLocation
import aws.smithy.kotlin.runtime.auth.awssigning.ServicePresignConfig
import aws.smithy.kotlin.runtime.auth.awssigning.SigningEndpointProvider
import aws.smithy.kotlin.runtime.auth.awssigning.createPresignedRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.QueryParameters
import aws.smithy.kotlin.runtime.http.request.HttpRequest
import kotlin.time.Duration

/**
 * Presign a [GetObjectRequest] using a [ServicePresignConfig].
 * @param presignConfig the configuration used to generate the presigned request
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun GetObjectRequest.presign(presignConfig: ServicePresignConfig, duration: Duration): HttpRequest {
    return createPresignedRequest(presignConfig, getObjectPresignConfig(this, duration))
}

/**
 * Presign a [GetObjectRequest] using a [S3Client].
 * @param config the client configuration used to generate the presigned request.
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun GetObjectRequest.presign(config: S3Client.Config, duration: Duration): HttpRequest {
    val presignConfig = S3PresignConfig {
        credentialsProvider = config.credentialsProvider
        endpointProvider = config.endpointResolver.asSigningEndpointProvider()
        region = config.region
    }
    return createPresignedRequest(presignConfig, getObjectPresignConfig(this, duration))
}

private suspend fun getObjectPresignConfig(input: GetObjectRequest, duration: Duration) : PresignedRequestConfig {
    require(duration.isPositive()) { "duration must be greater than zero" }
    val httpRequestBuilder = GetObjectOperationSerializer().serialize(ExecutionContext.build {  }, input)
    return PresignedRequestConfig(
        httpRequestBuilder.method,
        httpRequestBuilder.url.path,
        httpRequestBuilder.url.parameters.build(),
        duration,
        false,
        PresigningLocation.QUERY_STRING,
        httpRequestBuilder.headers.build(),
    )
}

/**
 * Presign a [PutObjectRequest] using a [ServicePresignConfig].
 * @param presignConfig the configuration used to generate the presigned request
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun PutObjectRequest.presign(presignConfig: ServicePresignConfig, duration: Duration): HttpRequest {
    return createPresignedRequest(presignConfig, putObjectPresignConfig(this, duration))
}

/**
 * Presign a [PutObjectRequest] using a [S3Client].
 * @param config the client configuration used to generate the presigned request.
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun PutObjectRequest.presign(config: S3Client.Config, duration: Duration): HttpRequest {
    val presignConfig = S3PresignConfig {
        credentialsProvider = config.credentialsProvider
        endpointProvider = config.endpointResolver.asSigningEndpointProvider()
        region = config.region
    }
    return createPresignedRequest(presignConfig, putObjectPresignConfig(this, duration))
}

private suspend fun putObjectPresignConfig(input: PutObjectRequest, duration: Duration) : PresignedRequestConfig {
    require(duration.isPositive()) { "duration must be greater than zero" }
    val httpRequestBuilder = PutObjectOperationSerializer().serialize(ExecutionContext.build {  }, input)
    return PresignedRequestConfig(
        httpRequestBuilder.method,
        httpRequestBuilder.url.path,
        httpRequestBuilder.url.parameters.build(),
        duration,
        false,
        PresigningLocation.QUERY_STRING,
        httpRequestBuilder.headers.build(),
    )
}

/**
 * Presign a [UploadPartRequest] using a [ServicePresignConfig].
 * @param presignConfig the configuration used to generate the presigned request
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun UploadPartRequest.presign(presignConfig: ServicePresignConfig, duration: Duration): HttpRequest {
    return createPresignedRequest(presignConfig, uploadPartPresignConfig(this, duration))
}

/**
 * Presign a [UploadPartRequest] using a [S3Client].
 * @param config the client configuration used to generate the presigned request.
 * @param duration the amount of time from signing for which the request is valid, with seconds granularity.
 * @return The [HttpRequest] that can be invoked within the specified time window.
 */
suspend fun UploadPartRequest.presign(config: S3Client.Config, duration: Duration): HttpRequest {
    val presignConfig = S3PresignConfig {
        credentialsProvider = config.credentialsProvider
        endpointProvider = config.endpointResolver.asSigningEndpointProvider()
        region = config.region
    }
    return createPresignedRequest(presignConfig, uploadPartPresignConfig(this, duration))
}

private suspend fun uploadPartPresignConfig(input: UploadPartRequest, duration: Duration) : PresignedRequestConfig {
    require(duration.isPositive()) { "duration must be greater than zero" }
    val httpRequestBuilder = UploadPartOperationSerializer().serialize(ExecutionContext.build {  }, input)
    return PresignedRequestConfig(
        httpRequestBuilder.method,
        httpRequestBuilder.url.path,
        httpRequestBuilder.url.parameters.build(),
        duration,
        false,
        PresigningLocation.QUERY_STRING,
        httpRequestBuilder.headers.build(),
    )
}

/**
 * Provides a subset of the service client configuration necessary to presign a request.
 * This type can be used to presign requests in cases where an existing service client
 * instance is not available.
 */
class S3PresignConfig private constructor(builder: Builder): ServicePresignConfig {
    override val credentialsProvider: CredentialsProvider = requireNotNull(builder.credentialsProvider) { "credentialsProvider is a required configuration property" }
    override val endpointProvider: SigningEndpointProvider = builder.endpointProvider ?: DefaultEndpointResolver().asSigningEndpointProvider()
    override val normalizeUriPath: Boolean = false
    override val region: String = requireNotNull(builder.region) { "region is a required configuration property" }
    override val serviceId: String = "S3"
    override val signer: AwsSigner = builder.signer ?: DefaultAwsSigner
    override val signingName: String = "s3"
    override val useDoubleUriEncode: Boolean = false
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
        internal fun build(): S3PresignConfig = S3PresignConfig(this)
    }
}
