// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.ContributorInsightsStatus
import aws.sdk.kotlin.services.dynamodb.model.DescribeContributorInsightsResponse
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.FailureException
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
import aws.smithy.kotlin.runtime.time.Instant


internal class DescribeContributorInsightsOperationDeserializer: HttpDeserialize<DescribeContributorInsightsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeContributorInsightsResponse {
        if (!response.status.isSuccess()) {
            throwDescribeContributorInsightsError(context, response)
        }
        val builder = DescribeContributorInsightsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeContributorInsightsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDescribeContributorInsightsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeDescribeContributorInsightsOperationBody(builder: DescribeContributorInsightsResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val CONTRIBUTORINSIGHTSRULELIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ContributorInsightsRuleList"))
    val CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ContributorInsightsStatus"))
    val FAILUREEXCEPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("FailureException"))
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val LASTUPDATEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("LastUpdateDateTime"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONTRIBUTORINSIGHTSRULELIST_DESCRIPTOR)
        field(CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR)
        field(FAILUREEXCEPTION_DESCRIPTOR)
        field(INDEXNAME_DESCRIPTOR)
        field(LASTUPDATEDATETIME_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONTRIBUTORINSIGHTSRULELIST_DESCRIPTOR.index -> builder.contributorInsightsRuleList =
                    deserializer.deserializeList(CONTRIBUTORINSIGHTSRULELIST_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CONTRIBUTORINSIGHTSSTATUS_DESCRIPTOR.index -> builder.contributorInsightsStatus = deserializeString().let { ContributorInsightsStatus.fromValue(it) }
                FAILUREEXCEPTION_DESCRIPTOR.index -> builder.failureException = deserializeFailureExceptionDocument(deserializer)
                INDEXNAME_DESCRIPTOR.index -> builder.indexName = deserializeString()
                LASTUPDATEDATETIME_DESCRIPTOR.index -> builder.lastUpdateDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                TABLENAME_DESCRIPTOR.index -> builder.tableName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
