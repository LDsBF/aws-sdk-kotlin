// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class TrafficType {

    abstract val value: kotlin.String

    object Accept : aws.sdk.kotlin.services.ec2.model.TrafficType() {
        override val value: kotlin.String = "ACCEPT"
        override fun toString(): kotlin.String = value
    }

    object All : aws.sdk.kotlin.services.ec2.model.TrafficType() {
        override val value: kotlin.String = "ALL"
        override fun toString(): kotlin.String = value
    }

    object Reject : aws.sdk.kotlin.services.ec2.model.TrafficType() {
        override val value: kotlin.String = "REJECT"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TrafficType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TrafficType = when(str) {
            "ACCEPT" -> Accept
            "ALL" -> All
            "REJECT" -> Reject
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TrafficType> = listOf(
            Accept,
            All,
            Reject
        )
    }
}
