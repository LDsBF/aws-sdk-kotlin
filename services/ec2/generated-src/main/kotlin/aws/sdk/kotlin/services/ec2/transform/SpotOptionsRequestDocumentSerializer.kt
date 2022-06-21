// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest
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

internal fun serializeSpotOptionsRequestDocument(serializer: Serializer, input: SpotOptionsRequest) {
    val ALLOCATIONSTRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AllocationStrategy"))
    val INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceInterruptionBehavior"))
    val INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("InstancePoolsToUseCount"))
    val MAINTENANCESTRATEGIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MaintenanceStrategies"))
    val MAXTOTALPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("MaxTotalPrice"))
    val MINTARGETCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MinTargetCapacity"))
    val SINGLEAVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("SingleAvailabilityZone"))
    val SINGLEINSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("SingleInstanceType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SpotOptionsRequest"))
        field(ALLOCATIONSTRATEGY_DESCRIPTOR)
        field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR)
        field(INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR)
        field(MAINTENANCESTRATEGIES_DESCRIPTOR)
        field(MAXTOTALPRICE_DESCRIPTOR)
        field(MINTARGETCAPACITY_DESCRIPTOR)
        field(SINGLEAVAILABILITYZONE_DESCRIPTOR)
        field(SINGLEINSTANCETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.allocationStrategy?.let { field(ALLOCATIONSTRATEGY_DESCRIPTOR, it.value) }
        input.maintenanceStrategies?.let { field(MAINTENANCESTRATEGIES_DESCRIPTOR, it, ::serializeFleetSpotMaintenanceStrategiesRequestDocument) }
        input.instanceInterruptionBehavior?.let { field(INSTANCEINTERRUPTIONBEHAVIOR_DESCRIPTOR, it.value) }
        input.instancePoolsToUseCount?.let { field(INSTANCEPOOLSTOUSECOUNT_DESCRIPTOR, it) }
        input.singleInstanceType?.let { field(SINGLEINSTANCETYPE_DESCRIPTOR, it) }
        input.singleAvailabilityZone?.let { field(SINGLEAVAILABILITYZONE_DESCRIPTOR, it) }
        input.minTargetCapacity?.let { field(MINTARGETCAPACITY_DESCRIPTOR, it) }
        input.maxTotalPrice?.let { field(MAXTOTALPRICE_DESCRIPTOR, it) }
    }
}
