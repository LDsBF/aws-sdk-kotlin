// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.LoggingEnabled
import aws.sdk.kotlin.services.s3.model.TargetGrant
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

internal fun deserializeLoggingEnabledDocument(deserializer: Deserializer): LoggingEnabled {
    val builder = LoggingEnabled.Builder()
    val TARGETBUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("TargetBucket"))
    val TARGETGRANTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("TargetGrants"), XmlCollectionName("Grant"))
    val TARGETPREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("TargetPrefix"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LoggingEnabled"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(TARGETBUCKET_DESCRIPTOR)
        field(TARGETGRANTS_DESCRIPTOR)
        field(TARGETPREFIX_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                TARGETBUCKET_DESCRIPTOR.index -> builder.targetBucket = deserializeString()
                TARGETGRANTS_DESCRIPTOR.index -> builder.targetGrants =
                    deserializer.deserializeList(TARGETGRANTS_DESCRIPTOR) {
                        val col0 = mutableListOf<TargetGrant>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTargetGrantDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TARGETPREFIX_DESCRIPTOR.index -> builder.targetPrefix = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
