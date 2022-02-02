// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AttributeValue
import aws.sdk.kotlin.services.dynamodb.model.BatchStatementResponse
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

internal fun deserializeBatchStatementResponseDocument(deserializer: Deserializer): BatchStatementResponse {
    val builder = BatchStatementResponse.Builder()
    val ERROR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Error"))
    val ITEM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Item"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ERROR_DESCRIPTOR)
        field(ITEM_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ERROR_DESCRIPTOR.index -> builder.error = deserializeBatchStatementErrorDocument(deserializer)
                ITEM_DESCRIPTOR.index -> builder.item =
                    deserializer.deserializeMap(ITEM_DESCRIPTOR) {
                        val map0 = mutableMapOf<String, AttributeValue>()
                        while (hasNextEntry()) {
                            val k0 = key()
                            val v0 = if (nextHasValue()) { deserializeAttributeValueDocument(deserializer) } else { deserializeNull(); continue }
                            map0[k0] = v0
                        }
                        map0
                    }
                TABLENAME_DESCRIPTOR.index -> builder.tableName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
