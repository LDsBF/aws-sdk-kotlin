// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ClientConnectOptions
import aws.sdk.kotlin.services.ec2.model.ClientLoginBannerOptions
import aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions
import aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure
import aws.sdk.kotlin.services.ec2.model.ModifyClientVpnEndpointRequest
import aws.sdk.kotlin.services.ec2.model.SelfServicePortal
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


internal class ModifyClientVpnEndpointOperationSerializer: HttpSerialize<ModifyClientVpnEndpointRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyClientVpnEndpointRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyClientVpnEndpointOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyClientVpnEndpointOperationBody(context: ExecutionContext, input: ModifyClientVpnEndpointRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CLIENTCONNECTOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ClientConnectOptions"))
    val CLIENTLOGINBANNEROPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ClientLoginBannerOptions"))
    val CLIENTVPNENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientVpnEndpointId"))
    val CONNECTIONLOGOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ConnectionLogOptions"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DNSSERVERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("DnsServers"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val SECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SecurityGroupId"), FormUrlFlattened)
    val SELFSERVICEPORTAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SelfServicePortal"))
    val SERVERCERTIFICATEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ServerCertificateArn"))
    val SESSIONTIMEOUTHOURS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SessionTimeoutHours"))
    val SPLITTUNNEL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("SplitTunnel"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcId"))
    val VPNPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("VpnPort"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyClientVpnEndpointRequest"))
        trait(QueryLiteral("Action", "ModifyClientVpnEndpoint"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CLIENTCONNECTOPTIONS_DESCRIPTOR)
        field(CLIENTLOGINBANNEROPTIONS_DESCRIPTOR)
        field(CLIENTVPNENDPOINTID_DESCRIPTOR)
        field(CONNECTIONLOGOPTIONS_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DNSSERVERS_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(SECURITYGROUPIDS_DESCRIPTOR)
        field(SELFSERVICEPORTAL_DESCRIPTOR)
        field(SERVERCERTIFICATEARN_DESCRIPTOR)
        field(SESSIONTIMEOUTHOURS_DESCRIPTOR)
        field(SPLITTUNNEL_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
        field(VPNPORT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.clientConnectOptions?.let { field(CLIENTCONNECTOPTIONS_DESCRIPTOR, it, ::serializeClientConnectOptionsDocument) }
        input.clientLoginBannerOptions?.let { field(CLIENTLOGINBANNEROPTIONS_DESCRIPTOR, it, ::serializeClientLoginBannerOptionsDocument) }
        input.clientVpnEndpointId?.let { field(CLIENTVPNENDPOINTID_DESCRIPTOR, it) }
        input.connectionLogOptions?.let { field(CONNECTIONLOGOPTIONS_DESCRIPTOR, it, ::serializeConnectionLogOptionsDocument) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.dnsServers?.let { field(DNSSERVERS_DESCRIPTOR, it, ::serializeDnsServersOptionsModifyStructureDocument) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.securityGroupIds != null) {
            listField(SECURITYGROUPIDS_DESCRIPTOR) {
                for (el0 in input.securityGroupIds) {
                    serializeString(el0)
                }
            }
        }
        input.selfServicePortal?.let { field(SELFSERVICEPORTAL_DESCRIPTOR, it.value) }
        input.serverCertificateArn?.let { field(SERVERCERTIFICATEARN_DESCRIPTOR, it) }
        input.sessionTimeoutHours?.let { field(SESSIONTIMEOUTHOURS_DESCRIPTOR, it) }
        input.splitTunnel?.let { field(SPLITTUNNEL_DESCRIPTOR, it) }
        input.vpcId?.let { field(VPCID_DESCRIPTOR, it) }
        input.vpnPort?.let { field(VPNPORT_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
