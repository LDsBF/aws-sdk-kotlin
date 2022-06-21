// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ElasticGpuSpecificationResponse
import aws.sdk.kotlin.services.ec2.model.InstanceType
import aws.sdk.kotlin.services.ec2.model.LaunchTemplateBlockDeviceMapping
import aws.sdk.kotlin.services.ec2.model.LaunchTemplateElasticInferenceAcceleratorResponse
import aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceNetworkInterfaceSpecification
import aws.sdk.kotlin.services.ec2.model.LaunchTemplateLicenseConfiguration
import aws.sdk.kotlin.services.ec2.model.LaunchTemplateTagSpecification
import aws.sdk.kotlin.services.ec2.model.ResponseLaunchTemplateData
import aws.sdk.kotlin.services.ec2.model.ShutdownBehavior
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

internal fun deserializeResponseLaunchTemplateDataDocument(deserializer: Deserializer): ResponseLaunchTemplateData {
    val builder = ResponseLaunchTemplateData.Builder()
    val BLOCKDEVICEMAPPINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("blockDeviceMappingSet"), XmlCollectionName("item"))
    val CAPACITYRESERVATIONSPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("capacityReservationSpecification"))
    val CPUOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("cpuOptions"))
    val CREDITSPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("creditSpecification"))
    val DISABLEAPISTOP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("disableApiStop"))
    val DISABLEAPITERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("disableApiTermination"))
    val EBSOPTIMIZED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("ebsOptimized"))
    val ELASTICGPUSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("elasticGpuSpecificationSet"), XmlCollectionName("item"))
    val ELASTICINFERENCEACCELERATORS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("elasticInferenceAcceleratorSet"), XmlCollectionName("item"))
    val ENCLAVEOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("enclaveOptions"))
    val HIBERNATIONOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("hibernationOptions"))
    val IAMINSTANCEPROFILE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("iamInstanceProfile"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val INSTANCEINITIATEDSHUTDOWNBEHAVIOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceInitiatedShutdownBehavior"))
    val INSTANCEMARKETOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceMarketOptions"))
    val INSTANCEREQUIREMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceRequirements"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val KERNELID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kernelId"))
    val KEYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyName"))
    val LICENSESPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("licenseSet"), XmlCollectionName("item"))
    val MAINTENANCEOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("maintenanceOptions"))
    val METADATAOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("metadataOptions"))
    val MONITORING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("monitoring"))
    val NETWORKINTERFACES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("networkInterfaceSet"), XmlCollectionName("item"))
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("placement"))
    val PRIVATEDNSNAMEOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("privateDnsNameOptions"))
    val RAMDISKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ramDiskId"))
    val SECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("securityGroupIdSet"), XmlCollectionName("item"))
    val SECURITYGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("securityGroupSet"), XmlCollectionName("item"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSpecificationSet"), XmlCollectionName("item"))
    val USERDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("userData"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ResponseLaunchTemplateData"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(BLOCKDEVICEMAPPINGS_DESCRIPTOR)
        field(CAPACITYRESERVATIONSPECIFICATION_DESCRIPTOR)
        field(CPUOPTIONS_DESCRIPTOR)
        field(CREDITSPECIFICATION_DESCRIPTOR)
        field(DISABLEAPISTOP_DESCRIPTOR)
        field(DISABLEAPITERMINATION_DESCRIPTOR)
        field(EBSOPTIMIZED_DESCRIPTOR)
        field(ELASTICGPUSPECIFICATIONS_DESCRIPTOR)
        field(ELASTICINFERENCEACCELERATORS_DESCRIPTOR)
        field(ENCLAVEOPTIONS_DESCRIPTOR)
        field(HIBERNATIONOPTIONS_DESCRIPTOR)
        field(IAMINSTANCEPROFILE_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(INSTANCEINITIATEDSHUTDOWNBEHAVIOR_DESCRIPTOR)
        field(INSTANCEMARKETOPTIONS_DESCRIPTOR)
        field(INSTANCEREQUIREMENTS_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(KERNELID_DESCRIPTOR)
        field(KEYNAME_DESCRIPTOR)
        field(LICENSESPECIFICATIONS_DESCRIPTOR)
        field(MAINTENANCEOPTIONS_DESCRIPTOR)
        field(METADATAOPTIONS_DESCRIPTOR)
        field(MONITORING_DESCRIPTOR)
        field(NETWORKINTERFACES_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(PRIVATEDNSNAMEOPTIONS_DESCRIPTOR)
        field(RAMDISKID_DESCRIPTOR)
        field(SECURITYGROUPIDS_DESCRIPTOR)
        field(SECURITYGROUPS_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(USERDATA_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BLOCKDEVICEMAPPINGS_DESCRIPTOR.index -> builder.blockDeviceMappings =
                    deserializer.deserializeList(BLOCKDEVICEMAPPINGS_DESCRIPTOR) {
                        val col0 = mutableListOf<LaunchTemplateBlockDeviceMapping>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLaunchTemplateBlockDeviceMappingDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CAPACITYRESERVATIONSPECIFICATION_DESCRIPTOR.index -> builder.capacityReservationSpecification = deserializeLaunchTemplateCapacityReservationSpecificationResponseDocument(deserializer)
                CPUOPTIONS_DESCRIPTOR.index -> builder.cpuOptions = deserializeLaunchTemplateCpuOptionsDocument(deserializer)
                CREDITSPECIFICATION_DESCRIPTOR.index -> builder.creditSpecification = deserializeCreditSpecificationDocument(deserializer)
                DISABLEAPISTOP_DESCRIPTOR.index -> builder.disableApiStop = deserializeBoolean()
                DISABLEAPITERMINATION_DESCRIPTOR.index -> builder.disableApiTermination = deserializeBoolean()
                EBSOPTIMIZED_DESCRIPTOR.index -> builder.ebsOptimized = deserializeBoolean()
                ELASTICGPUSPECIFICATIONS_DESCRIPTOR.index -> builder.elasticGpuSpecifications =
                    deserializer.deserializeList(ELASTICGPUSPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<ElasticGpuSpecificationResponse>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeElasticGpuSpecificationResponseDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ELASTICINFERENCEACCELERATORS_DESCRIPTOR.index -> builder.elasticInferenceAccelerators =
                    deserializer.deserializeList(ELASTICINFERENCEACCELERATORS_DESCRIPTOR) {
                        val col0 = mutableListOf<LaunchTemplateElasticInferenceAcceleratorResponse>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLaunchTemplateElasticInferenceAcceleratorResponseDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ENCLAVEOPTIONS_DESCRIPTOR.index -> builder.enclaveOptions = deserializeLaunchTemplateEnclaveOptionsDocument(deserializer)
                HIBERNATIONOPTIONS_DESCRIPTOR.index -> builder.hibernationOptions = deserializeLaunchTemplateHibernationOptionsDocument(deserializer)
                IAMINSTANCEPROFILE_DESCRIPTOR.index -> builder.iamInstanceProfile = deserializeLaunchTemplateIamInstanceProfileSpecificationDocument(deserializer)
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                INSTANCEINITIATEDSHUTDOWNBEHAVIOR_DESCRIPTOR.index -> builder.instanceInitiatedShutdownBehavior = deserializeString().let { ShutdownBehavior.fromValue(it) }
                INSTANCEMARKETOPTIONS_DESCRIPTOR.index -> builder.instanceMarketOptions = deserializeLaunchTemplateInstanceMarketOptionsDocument(deserializer)
                INSTANCEREQUIREMENTS_DESCRIPTOR.index -> builder.instanceRequirements = deserializeInstanceRequirementsDocument(deserializer)
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString().let { InstanceType.fromValue(it) }
                KERNELID_DESCRIPTOR.index -> builder.kernelId = deserializeString()
                KEYNAME_DESCRIPTOR.index -> builder.keyName = deserializeString()
                LICENSESPECIFICATIONS_DESCRIPTOR.index -> builder.licenseSpecifications =
                    deserializer.deserializeList(LICENSESPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<LaunchTemplateLicenseConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLaunchTemplateLicenseConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                MAINTENANCEOPTIONS_DESCRIPTOR.index -> builder.maintenanceOptions = deserializeLaunchTemplateInstanceMaintenanceOptionsDocument(deserializer)
                METADATAOPTIONS_DESCRIPTOR.index -> builder.metadataOptions = deserializeLaunchTemplateInstanceMetadataOptionsDocument(deserializer)
                MONITORING_DESCRIPTOR.index -> builder.monitoring = deserializeLaunchTemplatesMonitoringDocument(deserializer)
                NETWORKINTERFACES_DESCRIPTOR.index -> builder.networkInterfaces =
                    deserializer.deserializeList(NETWORKINTERFACES_DESCRIPTOR) {
                        val col0 = mutableListOf<LaunchTemplateInstanceNetworkInterfaceSpecification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLaunchTemplateInstanceNetworkInterfaceSpecificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PLACEMENT_DESCRIPTOR.index -> builder.placement = deserializeLaunchTemplatePlacementDocument(deserializer)
                PRIVATEDNSNAMEOPTIONS_DESCRIPTOR.index -> builder.privateDnsNameOptions = deserializeLaunchTemplatePrivateDnsNameOptionsDocument(deserializer)
                RAMDISKID_DESCRIPTOR.index -> builder.ramDiskId = deserializeString()
                SECURITYGROUPIDS_DESCRIPTOR.index -> builder.securityGroupIds =
                    deserializer.deserializeList(SECURITYGROUPIDS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SECURITYGROUPS_DESCRIPTOR.index -> builder.securityGroups =
                    deserializer.deserializeList(SECURITYGROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TAGSPECIFICATIONS_DESCRIPTOR.index -> builder.tagSpecifications =
                    deserializer.deserializeList(TAGSPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<LaunchTemplateTagSpecification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLaunchTemplateTagSpecificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                USERDATA_DESCRIPTOR.index -> builder.userData = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
