// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class AutoAcceptSharedAssociationsValue {

    abstract val value: kotlin.String

    object Disable : aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAssociationsValue() {
        override val value: kotlin.String = "disable"
        override fun toString(): kotlin.String = value
    }

    object Enable : aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAssociationsValue() {
        override val value: kotlin.String = "enable"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAssociationsValue() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAssociationsValue = when(str) {
            "disable" -> Disable
            "enable" -> Enable
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAssociationsValue> = listOf(
            Disable,
            Enable
        )
    }
}
