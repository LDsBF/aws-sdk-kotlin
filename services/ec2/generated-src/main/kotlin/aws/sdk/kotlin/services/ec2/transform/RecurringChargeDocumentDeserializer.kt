// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.RecurringCharge
import aws.sdk.kotlin.services.ec2.model.RecurringChargeFrequency
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

internal fun deserializeRecurringChargeDocument(deserializer: Deserializer): RecurringCharge {
    val builder = RecurringCharge.Builder()
    val AMOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, XmlSerialName("amount"))
    val FREQUENCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("frequency"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("RecurringCharge"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AMOUNT_DESCRIPTOR)
        field(FREQUENCY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AMOUNT_DESCRIPTOR.index -> builder.amount = deserializeDouble()
                FREQUENCY_DESCRIPTOR.index -> builder.frequency = deserializeString().let { RecurringChargeFrequency.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
