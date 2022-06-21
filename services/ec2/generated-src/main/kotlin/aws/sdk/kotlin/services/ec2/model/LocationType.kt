// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

sealed class LocationType {

    abstract val value: kotlin.String

    object AvailabilityZone : aws.sdk.kotlin.services.ec2.model.LocationType() {
        override val value: kotlin.String = "availability-zone"
        override fun toString(): kotlin.String = value
    }

    object AvailabilityZoneId : aws.sdk.kotlin.services.ec2.model.LocationType() {
        override val value: kotlin.String = "availability-zone-id"
        override fun toString(): kotlin.String = value
    }

    object Region : aws.sdk.kotlin.services.ec2.model.LocationType() {
        override val value: kotlin.String = "region"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.LocationType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.LocationType = when(str) {
            "availability-zone" -> AvailabilityZone
            "availability-zone-id" -> AvailabilityZoneId
            "region" -> Region
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.LocationType> = listOf(
            AvailabilityZone,
            AvailabilityZoneId,
            Region
        )
    }
}
