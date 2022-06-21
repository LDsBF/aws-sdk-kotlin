// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PlacementGroupInfo
import aws.sdk.kotlin.services.ec2.model.PlacementGroupStrategy
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

internal fun deserializePlacementGroupInfoDocument(deserializer: Deserializer): PlacementGroupInfo {
    val builder = PlacementGroupInfo.Builder()
    val SUPPORTEDSTRATEGIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("supportedStrategies"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PlacementGroupInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(SUPPORTEDSTRATEGIES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                SUPPORTEDSTRATEGIES_DESCRIPTOR.index -> builder.supportedStrategies =
                    deserializer.deserializeList(SUPPORTEDSTRATEGIES_DESCRIPTOR) {
                        val col0 = mutableListOf<PlacementGroupStrategy>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { PlacementGroupStrategy.fromValue(it) } } else { deserializeNull(); continue }
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
