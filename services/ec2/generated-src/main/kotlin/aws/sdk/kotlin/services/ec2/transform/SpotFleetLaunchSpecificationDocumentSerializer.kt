// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SpotFleetLaunchSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeSpotFleetLaunchSpecificationDocument(serializer: Serializer, input: SpotFleetLaunchSpecification) {
    val ADDRESSINGTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AddressingType"))
    val BLOCKDEVICEMAPPINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("BlockDeviceMapping"), FormUrlFlattened)
    val EBSOPTIMIZED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EbsOptimized"))
    val IAMINSTANCEPROFILE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("IamInstanceProfile"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImageId"))
    val INSTANCEREQUIREMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("InstanceRequirements"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceType"))
    val KERNELID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KernelId"))
    val KEYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KeyName"))
    val MONITORING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Monitoring"))
    val NETWORKINTERFACES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkInterfaceSet"), FormUrlFlattened)
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Placement"))
    val RAMDISKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RamdiskId"))
    val SECURITYGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("GroupSet"), FormUrlFlattened)
    val SPOTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SpotPrice"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecificationSet"), FormUrlFlattened)
    val USERDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("UserData"))
    val WEIGHTEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("WeightedCapacity"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SpotFleetLaunchSpecification"))
        field(ADDRESSINGTYPE_DESCRIPTOR)
        field(BLOCKDEVICEMAPPINGS_DESCRIPTOR)
        field(EBSOPTIMIZED_DESCRIPTOR)
        field(IAMINSTANCEPROFILE_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(INSTANCEREQUIREMENTS_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(KERNELID_DESCRIPTOR)
        field(KEYNAME_DESCRIPTOR)
        field(MONITORING_DESCRIPTOR)
        field(NETWORKINTERFACES_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(RAMDISKID_DESCRIPTOR)
        field(SECURITYGROUPS_DESCRIPTOR)
        field(SPOTPRICE_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(USERDATA_DESCRIPTOR)
        field(WEIGHTEDCAPACITY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.securityGroups != null) {
            listField(SECURITYGROUPS_DESCRIPTOR) {
                for (el0 in input.securityGroups) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGroupIdentifierDocument))
                }
            }
        }
        input.addressingType?.let { field(ADDRESSINGTYPE_DESCRIPTOR, it) }
        if (input.blockDeviceMappings != null) {
            listField(BLOCKDEVICEMAPPINGS_DESCRIPTOR) {
                for (el0 in input.blockDeviceMappings) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeBlockDeviceMappingDocument))
                }
            }
        }
        input.ebsOptimized?.let { field(EBSOPTIMIZED_DESCRIPTOR, it) }
        input.iamInstanceProfile?.let { field(IAMINSTANCEPROFILE_DESCRIPTOR, it, ::serializeIamInstanceProfileSpecificationDocument) }
        input.imageId?.let { field(IMAGEID_DESCRIPTOR, it) }
        input.instanceType?.let { field(INSTANCETYPE_DESCRIPTOR, it.value) }
        input.kernelId?.let { field(KERNELID_DESCRIPTOR, it) }
        input.keyName?.let { field(KEYNAME_DESCRIPTOR, it) }
        input.monitoring?.let { field(MONITORING_DESCRIPTOR, it, ::serializeSpotFleetMonitoringDocument) }
        if (input.networkInterfaces != null) {
            listField(NETWORKINTERFACES_DESCRIPTOR) {
                for (el0 in input.networkInterfaces) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeInstanceNetworkInterfaceSpecificationDocument))
                }
            }
        }
        input.placement?.let { field(PLACEMENT_DESCRIPTOR, it, ::serializeSpotPlacementDocument) }
        input.ramdiskId?.let { field(RAMDISKID_DESCRIPTOR, it) }
        input.spotPrice?.let { field(SPOTPRICE_DESCRIPTOR, it) }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
        input.userData?.let { field(USERDATA_DESCRIPTOR, it) }
        input.weightedCapacity?.let { field(WEIGHTEDCAPACITY_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeSpotFleetTagSpecificationDocument))
                }
            }
        }
        input.instanceRequirements?.let { field(INSTANCEREQUIREMENTS_DESCRIPTOR, it, ::serializeInstanceRequirementsDocument) }
    }
}
