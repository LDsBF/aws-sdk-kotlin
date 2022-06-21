// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class StorageClassAnalysisSchemaVersion {

    abstract val value: kotlin.String

    object V1 : aws.sdk.kotlin.services.s3.model.StorageClassAnalysisSchemaVersion() {
        override val value: kotlin.String = "V_1"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.StorageClassAnalysisSchemaVersion() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.StorageClassAnalysisSchemaVersion = when(str) {
            "V_1" -> V1
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.StorageClassAnalysisSchemaVersion> = listOf(
            V1
        )
    }
}
