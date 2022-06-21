// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion
import aws.sdk.kotlin.services.ec2.model.TunnelOption
import aws.sdk.kotlin.services.ec2.model.VpnConnectionOptions
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

internal fun deserializeVpnConnectionOptionsDocument(deserializer: Deserializer): VpnConnectionOptions {
    val builder = VpnConnectionOptions.Builder()
    val ENABLEACCELERATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("enableAcceleration"))
    val LOCALIPV4NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localIpv4NetworkCidr"))
    val LOCALIPV6NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localIpv6NetworkCidr"))
    val REMOTEIPV4NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("remoteIpv4NetworkCidr"))
    val REMOTEIPV6NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("remoteIpv6NetworkCidr"))
    val STATICROUTESONLY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("staticRoutesOnly"))
    val TUNNELINSIDEIPVERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("tunnelInsideIpVersion"))
    val TUNNELOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tunnelOptionSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpnConnectionOptions"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ENABLEACCELERATION_DESCRIPTOR)
        field(LOCALIPV4NETWORKCIDR_DESCRIPTOR)
        field(LOCALIPV6NETWORKCIDR_DESCRIPTOR)
        field(REMOTEIPV4NETWORKCIDR_DESCRIPTOR)
        field(REMOTEIPV6NETWORKCIDR_DESCRIPTOR)
        field(STATICROUTESONLY_DESCRIPTOR)
        field(TUNNELINSIDEIPVERSION_DESCRIPTOR)
        field(TUNNELOPTIONS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ENABLEACCELERATION_DESCRIPTOR.index -> builder.enableAcceleration = deserializeBoolean()
                LOCALIPV4NETWORKCIDR_DESCRIPTOR.index -> builder.localIpv4NetworkCidr = deserializeString()
                LOCALIPV6NETWORKCIDR_DESCRIPTOR.index -> builder.localIpv6NetworkCidr = deserializeString()
                REMOTEIPV4NETWORKCIDR_DESCRIPTOR.index -> builder.remoteIpv4NetworkCidr = deserializeString()
                REMOTEIPV6NETWORKCIDR_DESCRIPTOR.index -> builder.remoteIpv6NetworkCidr = deserializeString()
                STATICROUTESONLY_DESCRIPTOR.index -> builder.staticRoutesOnly = deserializeBoolean()
                TUNNELINSIDEIPVERSION_DESCRIPTOR.index -> builder.tunnelInsideIpVersion = deserializeString().let { TunnelInsideIpVersion.fromValue(it) }
                TUNNELOPTIONS_DESCRIPTOR.index -> builder.tunnelOptions =
                    deserializer.deserializeList(TUNNELOPTIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<TunnelOption>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTunnelOptionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
