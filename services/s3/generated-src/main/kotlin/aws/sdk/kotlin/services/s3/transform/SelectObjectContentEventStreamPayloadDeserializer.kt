// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.SelectObjectContentEventStream
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer

internal fun deserializeSelectObjectContentEventStreamPayload(payload: ByteArray): SelectObjectContentEventStream {
    val deserializer = XmlDeserializer(payload)
    return deserializeSelectObjectContentEventStreamDocument(deserializer)
}
