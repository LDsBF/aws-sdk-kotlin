// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.ListTablesResponse
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


internal class ListTablesOperationDeserializer: HttpDeserialize<ListTablesResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListTablesResponse {
        if (!response.status.isSuccess()) {
            throwListTablesError(context, response)
        }
        val builder = ListTablesResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListTablesOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwListTablesError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
        "InvalidEndpointException" -> InvalidEndpointExceptionDeserializer().deserialize(context, wrappedResponse)
        else -> DynamoDbException(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeListTablesOperationBody(builder: ListTablesResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val LASTEVALUATEDTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("LastEvaluatedTableName"))
    val TABLENAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("TableNames"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(LASTEVALUATEDTABLENAME_DESCRIPTOR)
        field(TABLENAMES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LASTEVALUATEDTABLENAME_DESCRIPTOR.index -> builder.lastEvaluatedTableName = deserializeString()
                TABLENAMES_DESCRIPTOR.index -> builder.tableNames =
                    deserializer.deserializeList(TABLENAMES_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
