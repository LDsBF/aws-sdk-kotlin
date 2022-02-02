// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.TimeToLiveSpecification
import aws.sdk.kotlin.services.dynamodb.model.UpdateTimeToLiveRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
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


internal class UpdateTimeToLiveOperationSerializer: HttpSerialize<UpdateTimeToLiveRequest> {
    override suspend fun serialize(context: ExecutionContext, input: UpdateTimeToLiveRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeUpdateTimeToLiveOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeUpdateTimeToLiveOperationBody(context: ExecutionContext, input: UpdateTimeToLiveRequest): ByteArray {
    val serializer = JsonSerializer()
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val TIMETOLIVESPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("TimeToLiveSpecification"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(TABLENAME_DESCRIPTOR)
        field(TIMETOLIVESPECIFICATION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.tableName?.let { field(TABLENAME_DESCRIPTOR, it) }
        input.timeToLiveSpecification?.let { field(TIMETOLIVESPECIFICATION_DESCRIPTOR, it, ::serializeTimeToLiveSpecificationDocument) }
    }
    return serializer.toByteArray()
}
