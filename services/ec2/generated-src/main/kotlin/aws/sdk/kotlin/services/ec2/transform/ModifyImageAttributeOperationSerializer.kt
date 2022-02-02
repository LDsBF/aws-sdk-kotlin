// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AttributeValue
import aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications
import aws.sdk.kotlin.services.ec2.model.ModifyImageAttributeRequest
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


internal class ModifyImageAttributeOperationSerializer: HttpSerialize<ModifyImageAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyImageAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyImageAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyImageAttributeOperationBody(context: ExecutionContext, input: ModifyImageAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ATTRIBUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Attribute"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Description"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImageId"))
    val LAUNCHPERMISSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("LaunchPermission"))
    val OPERATIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OperationType"))
    val ORGANIZATIONARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("OrganizationArn"), FormUrlFlattened)
    val ORGANIZATIONALUNITARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("OrganizationalUnitArn"), FormUrlFlattened)
    val PRODUCTCODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ProductCode"), FormUrlFlattened)
    val USERGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("UserGroup"), FormUrlFlattened)
    val USERIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("UserId"), FormUrlFlattened)
    val VALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Value"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyImageAttributeRequest"))
        trait(QueryLiteral("Action", "ModifyImageAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ATTRIBUTE_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(LAUNCHPERMISSION_DESCRIPTOR)
        field(OPERATIONTYPE_DESCRIPTOR)
        field(ORGANIZATIONARNS_DESCRIPTOR)
        field(ORGANIZATIONALUNITARNS_DESCRIPTOR)
        field(PRODUCTCODES_DESCRIPTOR)
        field(USERGROUPS_DESCRIPTOR)
        field(USERIDS_DESCRIPTOR)
        field(VALUE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.attribute?.let { field(ATTRIBUTE_DESCRIPTOR, it) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it, ::serializeAttributeValueDocument) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.imageId?.let { field(IMAGEID_DESCRIPTOR, it) }
        input.launchPermission?.let { field(LAUNCHPERMISSION_DESCRIPTOR, it, ::serializeLaunchPermissionModificationsDocument) }
        input.operationType?.let { field(OPERATIONTYPE_DESCRIPTOR, it.value) }
        if (input.organizationArns != null) {
            listField(ORGANIZATIONARNS_DESCRIPTOR) {
                for (el0 in input.organizationArns) {
                    serializeString(el0)
                }
            }
        }
        if (input.organizationalUnitArns != null) {
            listField(ORGANIZATIONALUNITARNS_DESCRIPTOR) {
                for (el0 in input.organizationalUnitArns) {
                    serializeString(el0)
                }
            }
        }
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
        input.value?.let { field(VALUE_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
