// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.GlobalTable
import aws.sdk.kotlin.services.dynamodb.model.Replica
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

internal fun deserializeGlobalTableDocument(deserializer: Deserializer): GlobalTable {
    val builder = GlobalTable.Builder()
    val GLOBALTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableName"))
    val REPLICATIONGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ReplicationGroup"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALTABLENAME_DESCRIPTOR)
        field(REPLICATIONGROUP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GLOBALTABLENAME_DESCRIPTOR.index -> builder.globalTableName = deserializeString()
                REPLICATIONGROUP_DESCRIPTOR.index -> builder.replicationGroup =
                    deserializer.deserializeList(REPLICATIONGROUP_DESCRIPTOR) {
                        val col0 = mutableListOf<Replica>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeReplicaDocument(deserializer) } else { deserializeNull(); continue }
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
