// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.IndexStatus
import aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexAutoScalingDescription
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

internal fun deserializeReplicaGlobalSecondaryIndexAutoScalingDescriptionDocument(deserializer: Deserializer): ReplicaGlobalSecondaryIndexAutoScalingDescription {
    val builder = ReplicaGlobalSecondaryIndexAutoScalingDescription.Builder()
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val INDEXSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexStatus"))
    val PROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ProvisionedReadCapacityAutoScalingSettings"))
    val PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ProvisionedWriteCapacityAutoScalingSettings"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(INDEXNAME_DESCRIPTOR)
        field(INDEXSTATUS_DESCRIPTOR)
        field(PROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR)
        field(PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INDEXNAME_DESCRIPTOR.index -> builder.indexName = deserializeString()
                INDEXSTATUS_DESCRIPTOR.index -> builder.indexStatus = deserializeString().let { IndexStatus.fromValue(it) }
                PROVISIONEDREADCAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR.index -> builder.provisionedReadCapacityAutoScalingSettings = deserializeAutoScalingSettingsDescriptionDocument(deserializer)
                PROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGS_DESCRIPTOR.index -> builder.provisionedWriteCapacityAutoScalingSettings = deserializeAutoScalingSettingsDescriptionDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
