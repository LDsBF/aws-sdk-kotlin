// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CancelReservedInstancesListingRequest
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


internal class CancelReservedInstancesListingOperationSerializer: HttpSerialize<CancelReservedInstancesListingRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CancelReservedInstancesListingRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCancelReservedInstancesListingOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCancelReservedInstancesListingOperationBody(context: ExecutionContext, input: CancelReservedInstancesListingRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val RESERVEDINSTANCESLISTINGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ReservedInstancesListingId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CancelReservedInstancesListingRequest"))
        trait(QueryLiteral("Action", "CancelReservedInstancesListing"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(RESERVEDINSTANCESLISTINGID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.reservedInstancesListingId?.let { field(RESERVEDINSTANCESLISTINGID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
