// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class VolumeAttributeName {

    abstract val value: kotlin.String

    object AutoEnableIo : aws.sdk.kotlin.services.ec2.model.VolumeAttributeName() {
        override val value: kotlin.String = "autoEnableIO"
        override fun toString(): kotlin.String = value
    }

    object ProductCodes : aws.sdk.kotlin.services.ec2.model.VolumeAttributeName() {
        override val value: kotlin.String = "productCodes"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.VolumeAttributeName() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.VolumeAttributeName = when(str) {
            "autoEnableIO" -> AutoEnableIo
            "productCodes" -> ProductCodes
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.VolumeAttributeName> = listOf(
            AutoEnableIo,
            ProductCodes
        )
    }
}
