// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class IpamPoolCidrState {

    abstract val value: kotlin.String

    object Deprovisioned : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "deprovisioned"
        override fun toString(): kotlin.String = value
    }

    object FailedDeprovision : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "failed-deprovision"
        override fun toString(): kotlin.String = value
    }

    object FailedImport : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "failed-import"
        override fun toString(): kotlin.String = value
    }

    object FailedProvision : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "failed-provision"
        override fun toString(): kotlin.String = value
    }

    object PendingDeprovision : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "pending-deprovision"
        override fun toString(): kotlin.String = value
    }

    object PendingImport : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "pending-import"
        override fun toString(): kotlin.String = value
    }

    object PendingProvision : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "pending-provision"
        override fun toString(): kotlin.String = value
    }

    object Provisioned : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override val value: kotlin.String = "provisioned"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState = when(str) {
            "deprovisioned" -> Deprovisioned
            "failed-deprovision" -> FailedDeprovision
            "failed-import" -> FailedImport
            "failed-provision" -> FailedProvision
            "pending-deprovision" -> PendingDeprovision
            "pending-import" -> PendingImport
            "pending-provision" -> PendingProvision
            "provisioned" -> Provisioned
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState> = listOf(
            Deprovisioned,
            FailedDeprovision,
            FailedImport,
            FailedProvision,
            PendingDeprovision,
            PendingImport,
            PendingProvision,
            Provisioned
        )
    }
}
