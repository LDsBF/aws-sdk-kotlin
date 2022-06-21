// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ArchitectureValues
import aws.sdk.kotlin.services.ec2.model.BlockDeviceMapping
import aws.sdk.kotlin.services.ec2.model.BootModeValues
import aws.sdk.kotlin.services.ec2.model.RegisterImageRequest
import aws.sdk.kotlin.services.ec2.model.TpmSupportValues
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class RegisterImageOperationSerializer: HttpSerialize<RegisterImageRequest> {
    override suspend fun serialize(context: ExecutionContext, input: RegisterImageRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeRegisterImageOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeRegisterImageOperationBody(context: ExecutionContext, input: RegisterImageRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ARCHITECTURE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Architecture"))
    val BILLINGPRODUCTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("BillingProduct"), FormUrlFlattened)
    val BLOCKDEVICEMAPPINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("BlockDeviceMapping"), FormUrlFlattened)
    val BOOTMODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("BootMode"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val ENASUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EnaSupport"))
    val IMAGELOCATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImageLocation"))
    val KERNELID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KernelId"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val RAMDISKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RamdiskId"))
    val ROOTDEVICENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RootDeviceName"))
    val SRIOVNETSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SriovNetSupport"))
    val TPMSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TpmSupport"))
    val UEFIDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("UefiData"))
    val VIRTUALIZATIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VirtualizationType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("RegisterImageRequest"))
        trait(QueryLiteral("Action", "RegisterImage"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ARCHITECTURE_DESCRIPTOR)
        field(BILLINGPRODUCTS_DESCRIPTOR)
        field(BLOCKDEVICEMAPPINGS_DESCRIPTOR)
        field(BOOTMODE_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(ENASUPPORT_DESCRIPTOR)
        field(IMAGELOCATION_DESCRIPTOR)
        field(KERNELID_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(RAMDISKID_DESCRIPTOR)
        field(ROOTDEVICENAME_DESCRIPTOR)
        field(SRIOVNETSUPPORT_DESCRIPTOR)
        field(TPMSUPPORT_DESCRIPTOR)
        field(UEFIDATA_DESCRIPTOR)
        field(VIRTUALIZATIONTYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.architecture?.let { field(ARCHITECTURE_DESCRIPTOR, it.value) }
        if (input.billingProducts != null) {
            listField(BILLINGPRODUCTS_DESCRIPTOR) {
                for (el0 in input.billingProducts) {
                    serializeString(el0)
                }
            }
        }
        if (input.blockDeviceMappings != null) {
            listField(BLOCKDEVICEMAPPINGS_DESCRIPTOR) {
                for (el0 in input.blockDeviceMappings) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeBlockDeviceMappingDocument))
                }
            }
        }
        input.bootMode?.let { field(BOOTMODE_DESCRIPTOR, it.value) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.enaSupport?.let { field(ENASUPPORT_DESCRIPTOR, it) }
        input.imageLocation?.let { field(IMAGELOCATION_DESCRIPTOR, it) }
        input.kernelId?.let { field(KERNELID_DESCRIPTOR, it) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
        input.ramdiskId?.let { field(RAMDISKID_DESCRIPTOR, it) }
        input.rootDeviceName?.let { field(ROOTDEVICENAME_DESCRIPTOR, it) }
        input.sriovNetSupport?.let { field(SRIOVNETSUPPORT_DESCRIPTOR, it) }
        input.tpmSupport?.let { field(TPMSUPPORT_DESCRIPTOR, it.value) }
        input.uefiData?.let { field(UEFIDATA_DESCRIPTOR, it) }
        input.virtualizationType?.let { field(VIRTUALIZATIONTYPE_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
