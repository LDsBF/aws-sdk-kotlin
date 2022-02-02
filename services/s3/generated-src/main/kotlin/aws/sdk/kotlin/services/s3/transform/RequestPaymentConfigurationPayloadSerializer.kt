// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.RequestPaymentConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer

/**
 * Payload serializer for RequestPaymentConfiguration with a different XML name trait (RequestPaymentConfiguration)
 */
internal fun serializeRequestPaymentConfigurationPayloadWithXmlNameRequestPaymentConfiguration(input: RequestPaymentConfiguration): ByteArray {
    val serializer = XmlSerializer()
    val PAYER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Payer"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("RequestPaymentConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(PAYER_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.payer?.let { field(PAYER_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
