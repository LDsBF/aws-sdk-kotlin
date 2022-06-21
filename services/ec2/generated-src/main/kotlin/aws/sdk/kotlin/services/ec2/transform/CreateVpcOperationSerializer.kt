// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateVpcRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
import aws.sdk.kotlin.services.ec2.model.Tenancy
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


internal class CreateVpcOperationSerializer: HttpSerialize<CreateVpcRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateVpcRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateVpcOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreateVpcOperationBody(context: ExecutionContext, input: CreateVpcRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AmazonProvidedIpv6CidrBlock"))
    val CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CidrBlock"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val INSTANCETENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceTenancy"))
    val IPV4IPAMPOOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv4IpamPoolId"))
    val IPV4NETMASKLENGTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv4NetmaskLength"))
    val IPV6CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6CidrBlock"))
    val IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6CidrBlockNetworkBorderGroup"))
    val IPV6IPAMPOOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6IpamPoolId"))
    val IPV6NETMASKLENGTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv6NetmaskLength"))
    val IPV6POOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Ipv6Pool"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateVpcRequest"))
        trait(QueryLiteral("Action", "CreateVpc"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR)
        field(CIDRBLOCK_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(INSTANCETENANCY_DESCRIPTOR)
        field(IPV4IPAMPOOLID_DESCRIPTOR)
        field(IPV4NETMASKLENGTH_DESCRIPTOR)
        field(IPV6CIDRBLOCK_DESCRIPTOR)
        field(IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR)
        field(IPV6IPAMPOOLID_DESCRIPTOR)
        field(IPV6NETMASKLENGTH_DESCRIPTOR)
        field(IPV6POOL_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.amazonProvidedIpv6CidrBlock?.let { field(AMAZONPROVIDEDIPV6CIDRBLOCK_DESCRIPTOR, it) }
        input.cidrBlock?.let { field(CIDRBLOCK_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.instanceTenancy?.let { field(INSTANCETENANCY_DESCRIPTOR, it.value) }
        input.ipv4IpamPoolId?.let { field(IPV4IPAMPOOLID_DESCRIPTOR, it) }
        input.ipv4NetmaskLength?.let { field(IPV4NETMASKLENGTH_DESCRIPTOR, it) }
        input.ipv6CidrBlock?.let { field(IPV6CIDRBLOCK_DESCRIPTOR, it) }
        input.ipv6CidrBlockNetworkBorderGroup?.let { field(IPV6CIDRBLOCKNETWORKBORDERGROUP_DESCRIPTOR, it) }
        input.ipv6IpamPoolId?.let { field(IPV6IPAMPOOLID_DESCRIPTOR, it) }
        input.ipv6NetmaskLength?.let { field(IPV6NETMASKLENGTH_DESCRIPTOR, it) }
        input.ipv6Pool?.let { field(IPV6POOL_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
