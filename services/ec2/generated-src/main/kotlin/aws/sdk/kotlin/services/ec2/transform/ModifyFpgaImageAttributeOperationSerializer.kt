// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName
import aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications
import aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeRequest
import aws.sdk.kotlin.services.ec2.model.OperationType
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


internal class ModifyFpgaImageAttributeOperationSerializer: HttpSerialize<ModifyFpgaImageAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyFpgaImageAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyFpgaImageAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyFpgaImageAttributeOperationBody(context: ExecutionContext, input: ModifyFpgaImageAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ATTRIBUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Attribute"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FPGAIMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("FpgaImageId"))
    val LOADPERMISSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("LoadPermission"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val OPERATIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OperationType"))
    val PRODUCTCODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ProductCode"), FormUrlFlattened)
    val USERGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("UserGroup"), FormUrlFlattened)
    val USERIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("UserId"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyFpgaImageAttributeRequest"))
        trait(QueryLiteral("Action", "ModifyFpgaImageAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ATTRIBUTE_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(FPGAIMAGEID_DESCRIPTOR)
        field(LOADPERMISSION_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(OPERATIONTYPE_DESCRIPTOR)
        field(PRODUCTCODES_DESCRIPTOR)
        field(USERGROUPS_DESCRIPTOR)
        field(USERIDS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.attribute?.let { field(ATTRIBUTE_DESCRIPTOR, it.value) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.fpgaImageId?.let { field(FPGAIMAGEID_DESCRIPTOR, it) }
        input.loadPermission?.let { field(LOADPERMISSION_DESCRIPTOR, it, ::serializeLoadPermissionModificationsDocument) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
        input.operationType?.let { field(OPERATIONTYPE_DESCRIPTOR, it.value) }
        if (input.productCodes != null) {
            listField(PRODUCTCODES_DESCRIPTOR) {
                for (el0 in input.productCodes) {
                    serializeString(el0)
                }
            }
        }
        if (input.userGroups != null) {
            listField(USERGROUPS_DESCRIPTOR) {
                for (el0 in input.userGroups) {
                    serializeString(el0)
                }
            }
        }
        if (input.userIds != null) {
            listField(USERIDS_DESCRIPTOR) {
                for (el0 in input.userIds) {
                    serializeString(el0)
                }
            }
        }
    }
    return serializer.toByteArray()
}
