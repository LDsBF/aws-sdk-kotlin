// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus
import aws.smithy.kotlin.runtime.serde.Deserializer
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

internal fun deserializeTerminateConnectionStatusDocument(deserializer: Deserializer): TerminateConnectionStatus {
    val builder = TerminateConnectionStatus.Builder()
    val CONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("connectionId"))
    val CURRENTSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("currentStatus"))
    val PREVIOUSSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("previousStatus"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TerminateConnectionStatus"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CONNECTIONID_DESCRIPTOR)
        field(CURRENTSTATUS_DESCRIPTOR)
        field(PREVIOUSSTATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONNECTIONID_DESCRIPTOR.index -> builder.connectionId = deserializeString()
                CURRENTSTATUS_DESCRIPTOR.index -> builder.currentStatus = deserializeClientVpnConnectionStatusDocument(deserializer)
                PREVIOUSSTATUS_DESCRIPTOR.index -> builder.previousStatus = deserializeClientVpnConnectionStatusDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
