// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ConnectivityType
import aws.sdk.kotlin.services.ec2.model.NatGateway
import aws.sdk.kotlin.services.ec2.model.NatGatewayAddress
import aws.sdk.kotlin.services.ec2.model.NatGatewayState
import aws.sdk.kotlin.services.ec2.model.Tag
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
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeNatGatewayDocument(deserializer: Deserializer): NatGateway {
    val builder = NatGateway.Builder()
    val CONNECTIVITYTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("connectivityType"))
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val DELETETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("deleteTime"))
    val FAILURECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("failureCode"))
    val FAILUREMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("failureMessage"))
    val NATGATEWAYADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("natGatewayAddressSet"), XmlCollectionName("item"))
    val NATGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("natGatewayId"))
    val PROVISIONEDBANDWIDTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("provisionedBandwidth"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NatGateway"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CONNECTIVITYTYPE_DESCRIPTOR)
        field(CREATETIME_DESCRIPTOR)
        field(DELETETIME_DESCRIPTOR)
        field(FAILURECODE_DESCRIPTOR)
        field(FAILUREMESSAGE_DESCRIPTOR)
        field(NATGATEWAYADDRESSES_DESCRIPTOR)
        field(NATGATEWAYID_DESCRIPTOR)
        field(PROVISIONEDBANDWIDTH_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONNECTIVITYTYPE_DESCRIPTOR.index -> builder.connectivityType = deserializeString().let { ConnectivityType.fromValue(it) }
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                DELETETIME_DESCRIPTOR.index -> builder.deleteTime = deserializeString().let { Instant.fromIso8601(it) }
                FAILURECODE_DESCRIPTOR.index -> builder.failureCode = deserializeString()
                FAILUREMESSAGE_DESCRIPTOR.index -> builder.failureMessage = deserializeString()
                NATGATEWAYADDRESSES_DESCRIPTOR.index -> builder.natGatewayAddresses =
                    deserializer.deserializeList(NATGATEWAYADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<NatGatewayAddress>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNatGatewayAddressDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NATGATEWAYID_DESCRIPTOR.index -> builder.natGatewayId = deserializeString()
                PROVISIONEDBANDWIDTH_DESCRIPTOR.index -> builder.provisionedBandwidth = deserializeProvisionedBandwidthDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { NatGatewayState.fromValue(it) }
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
