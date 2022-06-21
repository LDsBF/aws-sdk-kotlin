// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.AssociateSubnetCidrBlockResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.SubnetIpv6CidrBlockAssociation
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


internal class AssociateSubnetCidrBlockOperationDeserializer: HttpDeserialize<AssociateSubnetCidrBlockResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): AssociateSubnetCidrBlockResponse {
        if (!response.status.isSuccess()) {
            throwAssociateSubnetCidrBlockError(context, response)
        }
        val builder = AssociateSubnetCidrBlockResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeAssociateSubnetCidrBlockOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwAssociateSubnetCidrBlockError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeAssociateSubnetCidrBlockOperationBody(builder: AssociateSubnetCidrBlockResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val IPV6CIDRBLOCKASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ipv6CidrBlockAssociation"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("AssociateSubnetCidrBlockResult"))
        field(IPV6CIDRBLOCKASSOCIATION_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                IPV6CIDRBLOCKASSOCIATION_DESCRIPTOR.index -> builder.ipv6CidrBlockAssociation = deserializeSubnetIpv6CidrBlockAssociationDocument(deserializer)
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
