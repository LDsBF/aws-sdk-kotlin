// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EndDateType
import aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationRequest
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
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class ModifyCapacityReservationOperationSerializer: HttpSerialize<ModifyCapacityReservationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyCapacityReservationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyCapacityReservationOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyCapacityReservationOperationBody(context: ExecutionContext, input: ModifyCapacityReservationRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ACCEPT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("Accept"))
    val ADDITIONALINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AdditionalInfo"))
    val CAPACITYRESERVATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CapacityReservationId"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val ENDDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("EndDate"))
    val ENDDATETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("EndDateType"))
    val INSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("InstanceCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyCapacityReservationRequest"))
        trait(QueryLiteral("Action", "ModifyCapacityReservation"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ACCEPT_DESCRIPTOR)
        field(ADDITIONALINFO_DESCRIPTOR)
        field(CAPACITYRESERVATIONID_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(ENDDATE_DESCRIPTOR)
        field(ENDDATETYPE_DESCRIPTOR)
        field(INSTANCECOUNT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.accept?.let { field(ACCEPT_DESCRIPTOR, it) }
        input.additionalInfo?.let { field(ADDITIONALINFO_DESCRIPTOR, it) }
        input.capacityReservationId?.let { field(CAPACITYRESERVATIONID_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.endDate?.let { field(ENDDATE_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.endDateType?.let { field(ENDDATETYPE_DESCRIPTOR, it.value) }
        input.instanceCount?.let { field(INSTANCECOUNT_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
