// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class ObjectVersionStorageClass {

    abstract val value: kotlin.String

    object Standard : aws.sdk.kotlin.services.s3.model.ObjectVersionStorageClass() {
        override val value: kotlin.String = "STANDARD"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.ObjectVersionStorageClass() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.ObjectVersionStorageClass = when(str) {
            "STANDARD" -> Standard
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.ObjectVersionStorageClass> = listOf(
            Standard
        )
    }
}
