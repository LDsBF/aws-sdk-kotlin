// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration
import aws.sdk.kotlin.services.s3.model.PutPublicAccessBlockRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel


internal class PutPublicAccessBlockOperationSerializer: HttpSerialize<PutPublicAccessBlockRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutPublicAccessBlockRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("publicAccessBlock", "")
            }
        }

        builder.headers {
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
        }

        if (input.publicAccessBlockConfiguration != null) {
            val payload = serializePublicAccessBlockConfigurationPayloadWithXmlNamePublicAccessBlockConfiguration(input.publicAccessBlockConfiguration)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}
