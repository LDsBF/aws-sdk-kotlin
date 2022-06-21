// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class RuleAction {

    abstract val value: kotlin.String

    object Allow : aws.sdk.kotlin.services.ec2.model.RuleAction() {
        override val value: kotlin.String = "allow"
        override fun toString(): kotlin.String = value
    }

    object Deny : aws.sdk.kotlin.services.ec2.model.RuleAction() {
        override val value: kotlin.String = "deny"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.RuleAction() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.RuleAction = when(str) {
            "allow" -> Allow
            "deny" -> Deny
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.RuleAction> = listOf(
            Allow,
            Deny
        )
    }
}
