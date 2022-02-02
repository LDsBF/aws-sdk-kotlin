// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssociatedTargetNetwork
import aws.sdk.kotlin.services.ec2.model.ClientVpnAuthentication
import aws.sdk.kotlin.services.ec2.model.ClientVpnEndpoint
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransportProtocol
import aws.sdk.kotlin.services.ec2.model.VpnProtocol
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

internal fun deserializeClientVpnEndpointDocument(deserializer: Deserializer): ClientVpnEndpoint {
    val builder = ClientVpnEndpoint.Builder()
    val ASSOCIATEDTARGETNETWORKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("associatedTargetNetwork"), XmlCollectionName("item"))
    val AUTHENTICATIONOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("authenticationOptions"), XmlCollectionName("item"))
    val CLIENTCIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientCidrBlock"))
    val CLIENTCONNECTOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("clientConnectOptions"))
    val CLIENTLOGINBANNEROPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("clientLoginBannerOptions"))
    val CLIENTVPNENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientVpnEndpointId"))
    val CONNECTIONLOGOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("connectionLogOptions"))
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("creationTime"))
    val DELETIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("deletionTime"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val DNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("dnsName"))
    val DNSSERVERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("dnsServer"), XmlCollectionName("item"))
    val SECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("securityGroupIdSet"), XmlCollectionName("item"))
    val SELFSERVICEPORTALURL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("selfServicePortalUrl"))
    val SERVERCERTIFICATEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("serverCertificateArn"))
    val SESSIONTIMEOUTHOURS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("sessionTimeoutHours"))
    val SPLITTUNNEL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("splitTunnel"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("status"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSPORTPROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transportProtocol"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val VPNPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("vpnPort"))
    val VPNPROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpnProtocol"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ClientVpnEndpoint"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATEDTARGETNETWORKS_DESCRIPTOR)
        field(AUTHENTICATIONOPTIONS_DESCRIPTOR)
        field(CLIENTCIDRBLOCK_DESCRIPTOR)
        field(CLIENTCONNECTOPTIONS_DESCRIPTOR)
        field(CLIENTLOGINBANNEROPTIONS_DESCRIPTOR)
        field(CLIENTVPNENDPOINTID_DESCRIPTOR)
        field(CONNECTIONLOGOPTIONS_DESCRIPTOR)
        field(CREATIONTIME_DESCRIPTOR)
        field(DELETIONTIME_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DNSNAME_DESCRIPTOR)
        field(DNSSERVERS_DESCRIPTOR)
        field(SECURITYGROUPIDS_DESCRIPTOR)
        field(SELFSERVICEPORTALURL_DESCRIPTOR)
        field(SERVERCERTIFICATEARN_DESCRIPTOR)
        field(SESSIONTIMEOUTHOURS_DESCRIPTOR)
        field(SPLITTUNNEL_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSPORTPROTOCOL_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
        field(VPNPORT_DESCRIPTOR)
        field(VPNPROTOCOL_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATEDTARGETNETWORKS_DESCRIPTOR.index -> builder.associatedTargetNetworks =
                    deserializer.deserializeList(ASSOCIATEDTARGETNETWORKS_DESCRIPTOR) {
                        val col0 = mutableListOf<AssociatedTargetNetwork>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeAssociatedTargetNetworkDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                AUTHENTICATIONOPTIONS_DESCRIPTOR.index -> builder.authenticationOptions =
                    deserializer.deserializeList(AUTHENTICATIONOPTIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<ClientVpnAuthentication>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeClientVpnAuthenticationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CLIENTCIDRBLOCK_DESCRIPTOR.index -> builder.clientCidrBlock = deserializeString()
                CLIENTCONNECTOPTIONS_DESCRIPTOR.index -> builder.clientConnectOptions = deserializeClientConnectResponseOptionsDocument(deserializer)
                CLIENTLOGINBANNEROPTIONS_DESCRIPTOR.index -> builder.clientLoginBannerOptions = deserializeClientLoginBannerResponseOptionsDocument(deserializer)
                CLIENTVPNENDPOINTID_DESCRIPTOR.index -> builder.clientVpnEndpointId = deserializeString()
                CONNECTIONLOGOPTIONS_DESCRIPTOR.index -> builder.connectionLogOptions = deserializeConnectionLogResponseOptionsDocument(deserializer)
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString()
                DELETIONTIME_DESCRIPTOR.index -> builder.deletionTime = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                DNSNAME_DESCRIPTOR.index -> builder.dnsName = deserializeString()
                DNSSERVERS_DESCRIPTOR.index -> builder.dnsServers =
                    deserializer.deserializeList(DNSSERVERS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SECURITYGROUPIDS_DESCRIPTOR.index -> builder.securityGroupIds =
                    deserializer.deserializeList(SECURITYGROUPIDS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SELFSERVICEPORTALURL_DESCRIPTOR.index -> builder.selfServicePortalUrl = deserializeString()
                SERVERCERTIFICATEARN_DESCRIPTOR.index -> builder.serverCertificateArn = deserializeString()
                SESSIONTIMEOUTHOURS_DESCRIPTOR.index -> builder.sessionTimeoutHours = deserializeInt()
                SPLITTUNNEL_DESCRIPTOR.index -> builder.splitTunnel = deserializeBoolean()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeClientVpnEndpointStatusDocument(deserializer)
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRANSPORTPROTOCOL_DESCRIPTOR.index -> builder.transportProtocol = deserializeString().let { TransportProtocol.fromValue(it) }
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                VPNPORT_DESCRIPTOR.index -> builder.vpnPort = deserializeInt()
                VPNPROTOCOL_DESCRIPTOR.index -> builder.vpnProtocol = deserializeString().let { VpnProtocol.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
