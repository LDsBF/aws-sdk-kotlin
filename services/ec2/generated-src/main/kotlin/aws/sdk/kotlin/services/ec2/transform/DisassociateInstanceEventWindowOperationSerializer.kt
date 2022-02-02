// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DisassociateInstanceEventWindowRequest
import aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest
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


internal class DisassociateInstanceEventWindowOperationSerializer: HttpSerialize<DisassociateInstanceEventWindowRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DisassociateInstanceEventWindowRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDisassociateInstanceEventWindowOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDisassociateInstanceEventWindowOperationBody(context: ExecutionContext, input: DisassociateInstanceEventWindowRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ASSOCIATIONTARGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("AssociationTarget"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val INSTANCEEVENTWINDOWID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceEventWindowId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DisassociateInstanceEventWindowRequest"))
        trait(QueryLiteral("Action", "DisassociateInstanceEventWindow"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ASSOCIATIONTARGET_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(INSTANCEEVENTWINDOWID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.associationTarget?.let { field(ASSOCIATIONTARGET_DESCRIPTOR, it, ::serializeInstanceEventWindowDisassociationRequestDocument) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.instanceEventWindowId?.let { field(INSTANCEEVENTWINDOWID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
