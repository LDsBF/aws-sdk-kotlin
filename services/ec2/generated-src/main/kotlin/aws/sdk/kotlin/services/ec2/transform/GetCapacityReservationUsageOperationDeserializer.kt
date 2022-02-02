// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CapacityReservationState
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.GetCapacityReservationUsageResponse
import aws.sdk.kotlin.services.ec2.model.InstanceUsage
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class GetCapacityReservationUsageOperationDeserializer: HttpDeserialize<GetCapacityReservationUsageResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetCapacityReservationUsageResponse {
        if (!response.status.isSuccess()) {
            throwGetCapacityReservationUsageError(context, response)
        }
        val builder = GetCapacityReservationUsageResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetCapacityReservationUsageOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwGetCapacityReservationUsageError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw Ec2Exception("Failed to parse response as 'ec2Query' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        else -> Ec2Exception(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeGetCapacityReservationUsageOperationBody(builder: GetCapacityReservationUsageResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val AVAILABLEINSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("availableInstanceCount"))
    val CAPACITYRESERVATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("capacityReservationId"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val INSTANCEUSAGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("instanceUsageSet"), XmlCollectionName("item"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TOTALINSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalInstanceCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("GetCapacityReservationUsageResult"))
        field(AVAILABLEINSTANCECOUNT_DESCRIPTOR)
        field(CAPACITYRESERVATIONID_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(INSTANCEUSAGES_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TOTALINSTANCECOUNT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABLEINSTANCECOUNT_DESCRIPTOR.index -> builder.availableInstanceCount = deserializeInt()
                CAPACITYRESERVATIONID_DESCRIPTOR.index -> builder.capacityReservationId = deserializeString()
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString()
                INSTANCEUSAGES_DESCRIPTOR.index -> builder.instanceUsages =
                    deserializer.deserializeList(INSTANCEUSAGES_DESCRIPTOR) {
                        val col0 = mutableListOf<InstanceUsage>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceUsageDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { CapacityReservationState.fromValue(it) }
                TOTALINSTANCECOUNT_DESCRIPTOR.index -> builder.totalInstanceCount = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
