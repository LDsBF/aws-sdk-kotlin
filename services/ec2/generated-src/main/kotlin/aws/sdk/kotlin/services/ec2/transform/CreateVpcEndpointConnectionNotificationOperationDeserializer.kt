// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.ConnectionNotification
import aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class CreateVpcEndpointConnectionNotificationOperationDeserializer: HttpDeserialize<CreateVpcEndpointConnectionNotificationResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CreateVpcEndpointConnectionNotificationResponse {
        if (!response.status.isSuccess()) {
            throwCreateVpcEndpointConnectionNotificationError(context, response)
        }
        val builder = CreateVpcEndpointConnectionNotificationResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCreateVpcEndpointConnectionNotificationOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwCreateVpcEndpointConnectionNotificationError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeCreateVpcEndpointConnectionNotificationOperationBody(builder: CreateVpcEndpointConnectionNotificationResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientToken"))
    val CONNECTIONNOTIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("connectionNotification"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("CreateVpcEndpointConnectionNotificationResult"))
        field(CLIENTTOKEN_DESCRIPTOR)
        field(CONNECTIONNOTIFICATION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLIENTTOKEN_DESCRIPTOR.index -> builder.clientToken = deserializeString()
                CONNECTIONNOTIFICATION_DESCRIPTOR.index -> builder.connectionNotification = deserializeConnectionNotificationDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
