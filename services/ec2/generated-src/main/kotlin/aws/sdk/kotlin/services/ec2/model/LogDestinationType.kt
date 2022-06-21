// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class LogDestinationType {

    abstract val value: kotlin.String

    object CloudWatchLogs : aws.sdk.kotlin.services.ec2.model.LogDestinationType() {
        override val value: kotlin.String = "cloud-watch-logs"
        override fun toString(): kotlin.String = value
    }

    object S3 : aws.sdk.kotlin.services.ec2.model.LogDestinationType() {
        override val value: kotlin.String = "s3"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.LogDestinationType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.LogDestinationType = when(str) {
            "cloud-watch-logs" -> CloudWatchLogs
            "s3" -> S3
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.LogDestinationType> = listOf(
            CloudWatchLogs,
            S3
        )
    }
}
