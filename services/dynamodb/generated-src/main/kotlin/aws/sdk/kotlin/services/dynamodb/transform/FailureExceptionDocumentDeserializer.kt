// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.FailureException
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun deserializeFailureExceptionDocument(deserializer: Deserializer): FailureException {
    val builder = FailureException.Builder()
    val EXCEPTIONDESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExceptionDescription"))
    val EXCEPTIONNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExceptionName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(EXCEPTIONDESCRIPTION_DESCRIPTOR)
        field(EXCEPTIONNAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EXCEPTIONDESCRIPTION_DESCRIPTOR.index -> builder.exceptionDescription = deserializeString()
                EXCEPTIONNAME_DESCRIPTOR.index -> builder.exceptionName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
