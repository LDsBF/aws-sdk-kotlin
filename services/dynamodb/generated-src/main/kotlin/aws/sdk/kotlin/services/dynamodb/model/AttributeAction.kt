// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



sealed class AttributeAction {

    abstract val value: kotlin.String

    object Add : aws.sdk.kotlin.services.dynamodb.model.AttributeAction() {
        override val value: kotlin.String = "ADD"
        override fun toString(): kotlin.String = value
    }

    object Delete : aws.sdk.kotlin.services.dynamodb.model.AttributeAction() {
        override val value: kotlin.String = "DELETE"
        override fun toString(): kotlin.String = value
    }

    object Put : aws.sdk.kotlin.services.dynamodb.model.AttributeAction() {
        override val value: kotlin.String = "PUT"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.AttributeAction() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.AttributeAction = when(str) {
            "ADD" -> Add
            "DELETE" -> Delete
            "PUT" -> Put
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.AttributeAction> = listOf(
            Add,
            Delete,
            Put
        )
    }
}
