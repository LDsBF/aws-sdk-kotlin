// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ClientData
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
import aws.smithy.kotlin.runtime.time.TimestampFormat

internal fun serializeClientDataDocument(serializer: Serializer, input: ClientData) {
    val COMMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Comment"))
    val UPLOADEND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("UploadEnd"))
    val UPLOADSIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("UploadSize"))
    val UPLOADSTART_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("UploadStart"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ClientData"))
        field(COMMENT_DESCRIPTOR)
        field(UPLOADEND_DESCRIPTOR)
        field(UPLOADSIZE_DESCRIPTOR)
        field(UPLOADSTART_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.comment?.let { field(COMMENT_DESCRIPTOR, it) }
        input.uploadEnd?.let { field(UPLOADEND_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.uploadSize?.let { field(UPLOADSIZE_DESCRIPTOR, it) }
        input.uploadStart?.let { field(UPLOADSTART_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
    }
}
