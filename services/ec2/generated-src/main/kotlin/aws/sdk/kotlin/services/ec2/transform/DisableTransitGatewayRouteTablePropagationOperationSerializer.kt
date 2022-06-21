// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest
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


internal class DisableTransitGatewayRouteTablePropagationOperationSerializer: HttpSerialize<DisableTransitGatewayRouteTablePropagationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DisableTransitGatewayRouteTablePropagationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDisableTransitGatewayRouteTablePropagationOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeDisableTransitGatewayRouteTablePropagationOperationBody(context: ExecutionContext, input: DisableTransitGatewayRouteTablePropagationRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayAttachmentId"))
    val TRANSITGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayRouteTableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DisableTransitGatewayRouteTablePropagationRequest"))
        trait(QueryLiteral("Action", "DisableTransitGatewayRouteTablePropagation"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYROUTETABLEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.transitGatewayAttachmentId?.let { field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR, it) }
        input.transitGatewayRouteTableId?.let { field(TRANSITGATEWAYROUTETABLEID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
