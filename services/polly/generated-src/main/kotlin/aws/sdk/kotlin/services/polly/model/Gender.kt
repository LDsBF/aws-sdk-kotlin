// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



sealed class Gender {

    abstract val value: kotlin.String

    object Female : aws.sdk.kotlin.services.polly.model.Gender() {
        override val value: kotlin.String = "Female"
        override fun toString(): kotlin.String = value
    }

    object Male : aws.sdk.kotlin.services.polly.model.Gender() {
        override val value: kotlin.String = "Male"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.polly.model.Gender() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.polly.model.Gender = when(str) {
            "Female" -> Female
            "Male" -> Male
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.polly.model.Gender> = listOf(
            Female,
            Male
        )
    }
}
