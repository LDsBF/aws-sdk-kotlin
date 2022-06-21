// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class EndDateType {

    abstract val value: kotlin.String

    object Limited : aws.sdk.kotlin.services.ec2.model.EndDateType() {
        override val value: kotlin.String = "limited"
        override fun toString(): kotlin.String = value
    }

    object Unlimited : aws.sdk.kotlin.services.ec2.model.EndDateType() {
        override val value: kotlin.String = "unlimited"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.EndDateType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.EndDateType = when(str) {
            "limited" -> Limited
            "unlimited" -> Unlimited
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.EndDateType> = listOf(
            Limited,
            Unlimited
        )
    }
}
