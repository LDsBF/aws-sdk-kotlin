// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.ContributorInsightsStatus
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsResponse
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class UpdateContributorInsightsOperationDeserializer: HttpDeserialize<UpdateContributorInsightsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): UpdateContributorInsightsResponse {
        if (!response.status.isSuccess()) {
            throwUpdateContributorInsightsError(context, response)
        }
        val builder = UpdateContributorInsightsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeUpdateContributorInsightsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwUpdateContributorInsightsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        RestJsonErrorDeserializer.deserialize(response.headers, payload)
    } catch (ex: Exception) {
        throw DynamoDbException("Failed to parse response as 'awsJson1_0' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        "InternalServerError" -> InternalServerErrorDeserializer().deserialize(context, wrappedResponse)
        "ResourceNotFoundException" -> ResourceNotFoundExceptionDeserializer().deserialize(context, wrappedResponse)
        else -> DynamoDbException(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeUpdateContributorInsightsOperationBody(builder: UpdateContributorInsightsResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ContributorInsightsStatus"))
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR)
        field(INDEXNAME_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR.index -> builder.contributorInsightsStatus = deserializeString().let { ContributorInsightsStatus.fromValue(it) }
                INDEXNAME_DESCRIPTOR.index -> builder.indexName = deserializeString()
                TABLENAME_DESCRIPTOR.index -> builder.tableName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
