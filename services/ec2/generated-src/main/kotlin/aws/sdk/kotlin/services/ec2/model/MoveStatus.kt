// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class MoveStatus {

    abstract val value: kotlin.String

    object MovingToVpc : aws.sdk.kotlin.services.ec2.model.MoveStatus() {
        override val value: kotlin.String = "movingToVpc"
        override fun toString(): kotlin.String = value
    }

    object RestoringToClassic : aws.sdk.kotlin.services.ec2.model.MoveStatus() {
        override val value: kotlin.String = "restoringToClassic"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.MoveStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.MoveStatus = when(str) {
            "movingToVpc" -> MovingToVpc
            "restoringToClassic" -> RestoringToClassic
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.MoveStatus> = listOf(
            MovingToVpc,
            RestoringToClassic
        )
    }
}
