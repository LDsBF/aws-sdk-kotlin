// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class ImageAttributeName {

    abstract val value: kotlin.String

    object BlockDeviceMapping : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "blockDeviceMapping"
        override fun toString(): kotlin.String = value
    }

    object BootMode : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "bootMode"
        override fun toString(): kotlin.String = value
    }

    object Description : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "description"
        override fun toString(): kotlin.String = value
    }

    object Kernel : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "kernel"
        override fun toString(): kotlin.String = value
    }

    object LastLaunchedTime : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "lastLaunchedTime"
        override fun toString(): kotlin.String = value
    }

    object LaunchPermission : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "launchPermission"
        override fun toString(): kotlin.String = value
    }

    object ProductCodes : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "productCodes"
        override fun toString(): kotlin.String = value
    }

    object Ramdisk : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "ramdisk"
        override fun toString(): kotlin.String = value
    }

    object SriovNetSupport : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "sriovNetSupport"
        override fun toString(): kotlin.String = value
    }

    object TpmSupport : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "tpmSupport"
        override fun toString(): kotlin.String = value
    }

    object UefiData : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override val value: kotlin.String = "uefiData"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ImageAttributeName() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ImageAttributeName = when(str) {
            "blockDeviceMapping" -> BlockDeviceMapping
            "bootMode" -> BootMode
            "description" -> Description
            "kernel" -> Kernel
            "lastLaunchedTime" -> LastLaunchedTime
            "launchPermission" -> LaunchPermission
            "productCodes" -> ProductCodes
            "ramdisk" -> Ramdisk
            "sriovNetSupport" -> SriovNetSupport
            "tpmSupport" -> TpmSupport
            "uefiData" -> UefiData
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ImageAttributeName> = listOf(
            BlockDeviceMapping,
            BootMode,
            Description,
            Kernel,
            LastLaunchedTime,
            LaunchPermission,
            ProductCodes,
            Ramdisk,
            SriovNetSupport,
            TpmSupport,
            UefiData
        )
    }
}
