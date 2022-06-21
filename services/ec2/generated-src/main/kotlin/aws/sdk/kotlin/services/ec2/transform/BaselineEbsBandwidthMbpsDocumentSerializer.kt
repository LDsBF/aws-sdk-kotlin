// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbps
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeBaselineEbsBandwidthMbpsDocument(serializer: Serializer, input: BaselineEbsBandwidthMbps) {
    val MAX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Max"))
    val MIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Min"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("BaselineEbsBandwidthMbps"))
        field(MAX_DESCRIPTOR)
        field(MIN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.min?.let { field(MIN_DESCRIPTOR, it) }
        input.max?.let { field(MAX_DESCRIPTOR, it) }
    }
}
