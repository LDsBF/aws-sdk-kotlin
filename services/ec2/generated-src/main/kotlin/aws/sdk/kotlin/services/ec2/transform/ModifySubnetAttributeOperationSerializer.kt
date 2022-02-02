// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AttributeBooleanValue
import aws.sdk.kotlin.services.ec2.model.HostnameType
import aws.sdk.kotlin.services.ec2.model.ModifySubnetAttributeRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ModifySubnetAttributeOperationSerializer: HttpSerialize<ModifySubnetAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifySubnetAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifySubnetAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifySubnetAttributeOperationBody(context: ExecutionContext, input: ModifySubnetAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ASSIGNIPV6ADDRESSONCREATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("AssignIpv6AddressOnCreation"))
    val CUSTOMEROWNEDIPV4POOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CustomerOwnedIpv4Pool"))
    val DISABLELNIATDEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("DisableLniAtDeviceIndex"))
    val ENABLEDNS64_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("EnableDns64"))
    val ENABLELNIATDEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("EnableLniAtDeviceIndex"))
    val ENABLERESOURCENAMEDNSAAAARECORDONLAUNCH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("EnableResourceNameDnsAAAARecordOnLaunch"))
    val ENABLERESOURCENAMEDNSARECORDONLAUNCH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("EnableResourceNameDnsARecordOnLaunch"))
    val MAPCUSTOMEROWNEDIPONLAUNCH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MapCustomerOwnedIpOnLaunch"))
    val MAPPUBLICIPONLAUNCH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MapPublicIpOnLaunch"))
    val PRIVATEDNSHOSTNAMETYPEONLAUNCH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrivateDnsHostnameTypeOnLaunch"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifySubnetAttributeRequest"))
        trait(QueryLiteral("Action", "ModifySubnetAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ASSIGNIPV6ADDRESSONCREATION_DESCRIPTOR)
        field(CUSTOMEROWNEDIPV4POOL_DESCRIPTOR)
        field(DISABLELNIATDEVICEINDEX_DESCRIPTOR)
        field(ENABLEDNS64_DESCRIPTOR)
        field(ENABLELNIATDEVICEINDEX_DESCRIPTOR)
        field(ENABLERESOURCENAMEDNSAAAARECORDONLAUNCH_DESCRIPTOR)
        field(ENABLERESOURCENAMEDNSARECORDONLAUNCH_DESCRIPTOR)
        field(MAPCUSTOMEROWNEDIPONLAUNCH_DESCRIPTOR)
        field(MAPPUBLICIPONLAUNCH_DESCRIPTOR)
        field(PRIVATEDNSHOSTNAMETYPEONLAUNCH_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.assignIpv6AddressOnCreation?.let { field(ASSIGNIPV6ADDRESSONCREATION_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.customerOwnedIpv4Pool?.let { field(CUSTOMEROWNEDIPV4POOL_DESCRIPTOR, it) }
        input.disableLniAtDeviceIndex?.let { field(DISABLELNIATDEVICEINDEX_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.enableDns64?.let { field(ENABLEDNS64_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.enableLniAtDeviceIndex?.let { field(ENABLELNIATDEVICEINDEX_DESCRIPTOR, it) }
        input.enableResourceNameDnsAaaaRecordOnLaunch?.let { field(ENABLERESOURCENAMEDNSAAAARECORDONLAUNCH_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.enableResourceNameDnsARecordOnLaunch?.let { field(ENABLERESOURCENAMEDNSARECORDONLAUNCH_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.mapCustomerOwnedIpOnLaunch?.let { field(MAPCUSTOMEROWNEDIPONLAUNCH_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.mapPublicIpOnLaunch?.let { field(MAPPUBLICIPONLAUNCH_DESCRIPTOR, it, ::serializeAttributeBooleanValueDocument) }
        input.privateDnsHostnameTypeOnLaunch?.let { field(PRIVATEDNSHOSTNAMETYPEONLAUNCH_DESCRIPTOR, it.value) }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
