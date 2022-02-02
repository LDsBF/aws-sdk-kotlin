// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ResetImageAttributeName
import aws.sdk.kotlin.services.ec2.model.ResetImageAttributeRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ResetImageAttributeOperationSerializer: HttpSerialize<ResetImageAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ResetImageAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeResetImageAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeResetImageAttributeOperationBody(context: ExecutionContext, input: ResetImageAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ATTRIBUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Attribute"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImageId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ResetImageAttributeRequest"))
        trait(QueryLiteral("Action", "ResetImageAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ATTRIBUTE_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.attribute?.let { field(ATTRIBUTE_DESCRIPTOR, it.value) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.imageId?.let { field(IMAGEID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
