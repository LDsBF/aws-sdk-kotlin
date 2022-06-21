// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeFleetError
import aws.sdk.kotlin.services.ec2.model.InstanceLifecycle
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

internal fun deserializeDescribeFleetErrorDocument(deserializer: Deserializer): DescribeFleetError {
    val builder = DescribeFleetError.Builder()
    val ERRORCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("errorCode"))
    val ERRORMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("errorMessage"))
    val LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("launchTemplateAndOverrides"))
    val LIFECYCLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("lifecycle"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DescribeFleetError"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ERRORCODE_DESCRIPTOR)
        field(ERRORMESSAGE_DESCRIPTOR)
        field(LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR)
        field(LIFECYCLE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ERRORCODE_DESCRIPTOR.index -> builder.errorCode = deserializeString()
                ERRORMESSAGE_DESCRIPTOR.index -> builder.errorMessage = deserializeString()
                LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR.index -> builder.launchTemplateAndOverrides = deserializeLaunchTemplateAndOverridesResponseDocument(deserializer)
                LIFECYCLE_DESCRIPTOR.index -> builder.lifecycle = deserializeString().let { InstanceLifecycle.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
