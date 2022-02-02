// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ExportFormat
import aws.sdk.kotlin.services.dynamodb.model.ExportTableToPointInTimeRequest
import aws.sdk.kotlin.services.dynamodb.model.S3SseAlgorithm
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.client.idempotencyTokenProvider
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class ExportTableToPointInTimeOperationSerializer: HttpSerialize<ExportTableToPointInTimeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ExportTableToPointInTimeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeExportTableToPointInTimeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeExportTableToPointInTimeOperationBody(context: ExecutionContext, input: ExportTableToPointInTimeRequest): ByteArray {
    val serializer = JsonSerializer()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ClientToken"))
    val EXPORTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExportFormat"))
    val EXPORTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("ExportTime"))
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3Bucket"))
    val S3BUCKETOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3BucketOwner"))
    val S3PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3Prefix"))
    val S3SSEALGORITHM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3SseAlgorithm"))
    val S3SSEKMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3SseKmsKeyId"))
    val TABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableArn"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CLIENTTOKEN_DESCRIPTOR)
        field(EXPORTFORMAT_DESCRIPTOR)
        field(EXPORTTIME_DESCRIPTOR)
        field(S3BUCKET_DESCRIPTOR)
        field(S3BUCKETOWNER_DESCRIPTOR)
        field(S3PREFIX_DESCRIPTOR)
        field(S3SSEALGORITHM_DESCRIPTOR)
        field(S3SSEKMSKEYID_DESCRIPTOR)
        field(TABLEARN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) } ?: field(CLIENTTOKEN_DESCRIPTOR, context.idempotencyTokenProvider.generateToken())
        input.exportFormat?.let { field(EXPORTFORMAT_DESCRIPTOR, it.value) }
        input.exportTime?.let { field(EXPORTTIME_DESCRIPTOR, it, TimestampFormat.EPOCH_SECONDS) }
        input.s3Bucket?.let { field(S3BUCKET_DESCRIPTOR, it) }
        input.s3BucketOwner?.let { field(S3BUCKETOWNER_DESCRIPTOR, it) }
        input.s3Prefix?.let { field(S3PREFIX_DESCRIPTOR, it) }
        input.s3SseAlgorithm?.let { field(S3SSEALGORITHM_DESCRIPTOR, it.value) }
        input.s3SseKmsKeyId?.let { field(S3SSEKMSKEYID_DESCRIPTOR, it) }
        input.tableArn?.let { field(TABLEARN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
