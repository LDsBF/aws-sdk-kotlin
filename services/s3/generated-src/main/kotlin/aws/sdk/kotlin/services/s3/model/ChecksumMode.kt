// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class ChecksumMode {

    abstract val value: kotlin.String

    object Enabled : aws.sdk.kotlin.services.s3.model.ChecksumMode() {
        override val value: kotlin.String = "ENABLED"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.ChecksumMode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.ChecksumMode = when(str) {
            "ENABLED" -> Enabled
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.ChecksumMode> = listOf(
            Enabled
        )
    }
}
