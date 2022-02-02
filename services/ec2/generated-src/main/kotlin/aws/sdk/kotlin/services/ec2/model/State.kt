// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class State {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Available"
        override fun toString(): kotlin.String = value
    }

    object Deleted : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Deleted"
        override fun toString(): kotlin.String = value
    }

    object Deleting : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Deleting"
        override fun toString(): kotlin.String = value
    }

    object Expired : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Expired"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Failed"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Pending"
        override fun toString(): kotlin.String = value
    }

    object PendingAcceptance : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "PendingAcceptance"
        override fun toString(): kotlin.String = value
    }

    object Rejected : aws.sdk.kotlin.services.ec2.model.State() {
        override val value: kotlin.String = "Rejected"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.State() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.State = when(str) {
            "Available" -> Available
            "Deleted" -> Deleted
            "Deleting" -> Deleting
            "Expired" -> Expired
            "Failed" -> Failed
            "Pending" -> Pending
            "PendingAcceptance" -> PendingAcceptance
            "Rejected" -> Rejected
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.State> = listOf(
            Available,
            Deleted,
            Deleting,
            Expired,
            Failed,
            Pending,
            PendingAcceptance,
            Rejected
        )
    }
}
