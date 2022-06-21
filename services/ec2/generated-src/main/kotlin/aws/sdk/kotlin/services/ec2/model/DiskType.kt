// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class DiskType {

    abstract val value: kotlin.String

    object Hdd : aws.sdk.kotlin.services.ec2.model.DiskType() {
        override val value: kotlin.String = "hdd"
        override fun toString(): kotlin.String = value
    }

    object Ssd : aws.sdk.kotlin.services.ec2.model.DiskType() {
        override val value: kotlin.String = "ssd"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.DiskType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.DiskType = when(str) {
            "hdd" -> Hdd
            "ssd" -> Ssd
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.DiskType> = listOf(
            Hdd,
            Ssd
        )
    }
}
