// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.polly.model.ListSpeechSynthesisTasksResponse
import aws.sdk.kotlin.services.polly.model.PollyException
import aws.sdk.kotlin.services.polly.model.SynthesisTask
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


internal class ListSpeechSynthesisTasksOperationDeserializer: HttpDeserialize<ListSpeechSynthesisTasksResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListSpeechSynthesisTasksResponse {
        if (!response.status.isSuccess()) {
            throwListSpeechSynthesisTasksError(context, response)
        }
        val builder = ListSpeechSynthesisTasksResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListSpeechSynthesisTasksOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwListSpeechSynthesisTasksError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        RestJsonErrorDeserializer.deserialize(response.headers, payload)
    } catch (ex: Exception) {
        throw PollyException("Failed to parse response as 'restJson1' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        "InvalidNextTokenException" -> InvalidNextTokenExceptionDeserializer().deserialize(context, wrappedResponse)
        "ServiceFailureException" -> ServiceFailureExceptionDeserializer().deserialize(context, wrappedResponse)
        else -> PollyException(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeListSpeechSynthesisTasksOperationBody(builder: ListSpeechSynthesisTasksResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("NextToken"))
    val SYNTHESISTASKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("SynthesisTasks"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(NEXTTOKEN_DESCRIPTOR)
        field(SYNTHESISTASKS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                SYNTHESISTASKS_DESCRIPTOR.index -> builder.synthesisTasks =
                    deserializer.deserializeList(SYNTHESISTASKS_DESCRIPTOR) {
                        val col0 = mutableListOf<SynthesisTask>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeSynthesisTaskDocument(deserializer) } else { deserializeNull(); continue }
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
