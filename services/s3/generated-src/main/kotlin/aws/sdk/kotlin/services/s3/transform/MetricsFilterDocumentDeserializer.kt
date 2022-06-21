// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.MetricsFilter
import aws.smithy.kotlin.runtime.serde.DeserializationException
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

internal fun deserializeMetricsFilterDocument(deserializer: Deserializer): MetricsFilter {
    var value: MetricsFilter? = null
    val ACCESSPOINTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("AccessPointArn"))
    val AND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("And"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val TAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Tag"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("MetricsFilter"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ACCESSPOINTARN_DESCRIPTOR)
        field(AND_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(TAG_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while(true) {
            when(findNextFieldIndex()) {
                ACCESSPOINTARN_DESCRIPTOR.index -> value = MetricsFilter.AccessPointArn(deserializeString())
                AND_DESCRIPTOR.index -> value = MetricsFilter.And(deserializeMetricsAndOperatorDocument(deserializer))
                PREFIX_DESCRIPTOR.index -> value = MetricsFilter.Prefix(deserializeString())
                TAG_DESCRIPTOR.index -> value = MetricsFilter.Tag(deserializeTagDocument(deserializer))
                null -> break@loop
                else -> value = MetricsFilter.SdkUnknown.also { skipValue() }
            }
        }
    }
    return value ?: throw DeserializationException("Deserialized union value unexpectedly null: MetricsFilter")
}
