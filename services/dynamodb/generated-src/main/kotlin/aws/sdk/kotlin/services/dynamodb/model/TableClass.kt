// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



sealed class TableClass {

    abstract val value: kotlin.String

    object Standard : aws.sdk.kotlin.services.dynamodb.model.TableClass() {
        override val value: kotlin.String = "STANDARD"
        override fun toString(): kotlin.String = value
    }

    object StandardInfrequentAccess : aws.sdk.kotlin.services.dynamodb.model.TableClass() {
        override val value: kotlin.String = "STANDARD_INFREQUENT_ACCESS"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.TableClass() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.TableClass = when(str) {
            "STANDARD" -> Standard
            "STANDARD_INFREQUENT_ACCESS" -> StandardInfrequentAccess
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.TableClass> = listOf(
            Standard,
            StandardInfrequentAccess
        )
    }
}
