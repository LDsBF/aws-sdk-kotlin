// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpecification
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

internal fun serializeLaunchTemplateSpecificationDocument(serializer: Serializer, input: LaunchTemplateSpecification) {
    val LAUNCHTEMPLATEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LaunchTemplateId"))
    val LAUNCHTEMPLATENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LaunchTemplateName"))
    val VERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Version"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateSpecification"))
        field(LAUNCHTEMPLATEID_DESCRIPTOR)
        field(LAUNCHTEMPLATENAME_DESCRIPTOR)
        field(VERSION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.launchTemplateId?.let { field(LAUNCHTEMPLATEID_DESCRIPTOR, it) }
        input.launchTemplateName?.let { field(LAUNCHTEMPLATENAME_DESCRIPTOR, it) }
        input.version?.let { field(VERSION_DESCRIPTOR, it) }
    }
}
