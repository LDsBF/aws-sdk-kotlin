// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EnaSupport
import aws.sdk.kotlin.services.ec2.model.NetworkCardInfo
import aws.sdk.kotlin.services.ec2.model.NetworkInfo
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

internal fun deserializeNetworkInfoDocument(deserializer: Deserializer): NetworkInfo {
    val builder = NetworkInfo.Builder()
    val DEFAULTNETWORKCARDINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("defaultNetworkCardIndex"))
    val EFAINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("efaInfo"))
    val EFASUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("efaSupported"))
    val ENASUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("enaSupport"))
    val ENCRYPTIONINTRANSITSUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encryptionInTransitSupported"))
    val IPV4ADDRESSESPERINTERFACE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("ipv4AddressesPerInterface"))
    val IPV6ADDRESSESPERINTERFACE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("ipv6AddressesPerInterface"))
    val IPV6SUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("ipv6Supported"))
    val MAXIMUMNETWORKCARDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("maximumNetworkCards"))
    val MAXIMUMNETWORKINTERFACES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("maximumNetworkInterfaces"))
    val NETWORKCARDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("networkCards"), XmlCollectionName("item"))
    val NETWORKPERFORMANCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkPerformance"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DEFAULTNETWORKCARDINDEX_DESCRIPTOR)
        field(EFAINFO_DESCRIPTOR)
        field(EFASUPPORTED_DESCRIPTOR)
        field(ENASUPPORT_DESCRIPTOR)
        field(ENCRYPTIONINTRANSITSUPPORTED_DESCRIPTOR)
        field(IPV4ADDRESSESPERINTERFACE_DESCRIPTOR)
        field(IPV6ADDRESSESPERINTERFACE_DESCRIPTOR)
        field(IPV6SUPPORTED_DESCRIPTOR)
        field(MAXIMUMNETWORKCARDS_DESCRIPTOR)
        field(MAXIMUMNETWORKINTERFACES_DESCRIPTOR)
        field(NETWORKCARDS_DESCRIPTOR)
        field(NETWORKPERFORMANCE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DEFAULTNETWORKCARDINDEX_DESCRIPTOR.index -> builder.defaultNetworkCardIndex = deserializeInt()
                EFAINFO_DESCRIPTOR.index -> builder.efaInfo = deserializeEfaInfoDocument(deserializer)
                EFASUPPORTED_DESCRIPTOR.index -> builder.efaSupported = deserializeBoolean()
                ENASUPPORT_DESCRIPTOR.index -> builder.enaSupport = deserializeString().let { EnaSupport.fromValue(it) }
                ENCRYPTIONINTRANSITSUPPORTED_DESCRIPTOR.index -> builder.encryptionInTransitSupported = deserializeBoolean()
                IPV4ADDRESSESPERINTERFACE_DESCRIPTOR.index -> builder.ipv4AddressesPerInterface = deserializeInt()
                IPV6ADDRESSESPERINTERFACE_DESCRIPTOR.index -> builder.ipv6AddressesPerInterface = deserializeInt()
                IPV6SUPPORTED_DESCRIPTOR.index -> builder.ipv6Supported = deserializeBoolean()
                MAXIMUMNETWORKCARDS_DESCRIPTOR.index -> builder.maximumNetworkCards = deserializeInt()
                MAXIMUMNETWORKINTERFACES_DESCRIPTOR.index -> builder.maximumNetworkInterfaces = deserializeInt()
                NETWORKCARDS_DESCRIPTOR.index -> builder.networkCards =
                    deserializer.deserializeList(NETWORKCARDS_DESCRIPTOR) {
                        val col0 = mutableListOf<NetworkCardInfo>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNetworkCardInfoDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NETWORKPERFORMANCE_DESCRIPTOR.index -> builder.networkPerformance = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
