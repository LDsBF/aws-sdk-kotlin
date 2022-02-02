// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun deserializeTrafficMirrorSessionDocument(deserializer: Deserializer): TrafficMirrorSession {
    val builder = TrafficMirrorSession.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PACKETLENGTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("packetLength"))
    val SESSIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("sessionNumber"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRAFFICMIRRORFILTERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("trafficMirrorFilterId"))
    val TRAFFICMIRRORSESSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("trafficMirrorSessionId"))
    val TRAFFICMIRRORTARGETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("trafficMirrorTargetId"))
    val VIRTUALNETWORKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("virtualNetworkId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TrafficMirrorSession"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PACKETLENGTH_DESCRIPTOR)
        field(SESSIONNUMBER_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRAFFICMIRRORFILTERID_DESCRIPTOR)
        field(TRAFFICMIRRORSESSIONID_DESCRIPTOR)
        field(TRAFFICMIRRORTARGETID_DESCRIPTOR)
        field(VIRTUALNETWORKID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PACKETLENGTH_DESCRIPTOR.index -> builder.packetLength = deserializeInt()
                SESSIONNUMBER_DESCRIPTOR.index -> builder.sessionNumber = deserializeInt()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRAFFICMIRRORFILTERID_DESCRIPTOR.index -> builder.trafficMirrorFilterId = deserializeString()
                TRAFFICMIRRORSESSIONID_DESCRIPTOR.index -> builder.trafficMirrorSessionId = deserializeString()
                TRAFFICMIRRORTARGETID_DESCRIPTOR.index -> builder.trafficMirrorTargetId = deserializeString()
                VIRTUALNETWORKID_DESCRIPTOR.index -> builder.virtualNetworkId = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
