// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

sealed class Select {

    abstract val value: kotlin.String

    object AllAttributes : aws.sdk.kotlin.services.dynamodb.model.Select() {
        override val value: kotlin.String = "ALL_ATTRIBUTES"
        override fun toString(): kotlin.String = value
    }

    object AllProjectedAttributes : aws.sdk.kotlin.services.dynamodb.model.Select() {
        override val value: kotlin.String = "ALL_PROJECTED_ATTRIBUTES"
        override fun toString(): kotlin.String = value
    }

    object Count : aws.sdk.kotlin.services.dynamodb.model.Select() {
        override val value: kotlin.String = "COUNT"
        override fun toString(): kotlin.String = value
    }

    object SpecificAttributes : aws.sdk.kotlin.services.dynamodb.model.Select() {
        override val value: kotlin.String = "SPECIFIC_ATTRIBUTES"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.Select() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.Select = when(str) {
            "ALL_ATTRIBUTES" -> AllAttributes
            "ALL_PROJECTED_ATTRIBUTES" -> AllProjectedAttributes
            "COUNT" -> Count
            "SPECIFIC_ATTRIBUTES" -> SpecificAttributes
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.Select> = listOf(
            AllAttributes,
            AllProjectedAttributes,
            Count,
            SpecificAttributes
        )
    }
}
