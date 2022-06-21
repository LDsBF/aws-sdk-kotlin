// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class AllowsMultipleInstanceTypes {

    abstract val value: kotlin.String

    object Off : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override val value: kotlin.String = "off"
        override fun toString(): kotlin.String = value
    }

    object On : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override val value: kotlin.String = "on"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes = when(str) {
            "off" -> Off
            "on" -> On
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes> = listOf(
            Off,
            On
        )
    }
}
