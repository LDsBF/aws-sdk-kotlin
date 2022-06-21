// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class ClientVpnConnectionStatusCode {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    object FailedToTerminate : aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode() {
        override val value: kotlin.String = "failed-to-terminate"
        override fun toString(): kotlin.String = value
    }

    object Terminated : aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode() {
        override val value: kotlin.String = "terminated"
        override fun toString(): kotlin.String = value
    }

    object Terminating : aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode() {
        override val value: kotlin.String = "terminating"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode = when(str) {
            "active" -> Active
            "failed-to-terminate" -> FailedToTerminate
            "terminated" -> Terminated
            "terminating" -> Terminating
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatusCode> = listOf(
            Active,
            FailedToTerminate,
            Terminated,
            Terminating
        )
    }
}
