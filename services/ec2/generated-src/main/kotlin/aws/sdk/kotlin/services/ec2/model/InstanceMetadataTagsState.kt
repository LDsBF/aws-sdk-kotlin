// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class InstanceMetadataTagsState {

    abstract val value: kotlin.String

    object Disabled : aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState() {
        override val value: kotlin.String = "disabled"
        override fun toString(): kotlin.String = value
    }

    object Enabled : aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState() {
        override val value: kotlin.String = "enabled"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState = when(str) {
            "disabled" -> Disabled
            "enabled" -> Enabled
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState> = listOf(
            Disabled,
            Enabled
        )
    }
}
