// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class HostnameType {

    abstract val value: kotlin.String

    object IpName : aws.sdk.kotlin.services.ec2.model.HostnameType() {
        override val value: kotlin.String = "ip-name"
        override fun toString(): kotlin.String = value
    }

    object ResourceName : aws.sdk.kotlin.services.ec2.model.HostnameType() {
        override val value: kotlin.String = "resource-name"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.HostnameType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.HostnameType = when(str) {
            "ip-name" -> IpName
            "resource-name" -> ResourceName
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.HostnameType> = listOf(
            IpName,
            ResourceName
        )
    }
}
