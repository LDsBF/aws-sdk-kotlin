// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

sealed class InventoryOptionalField {

    abstract val value: kotlin.String

    object BucketKeyStatus : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "BucketKeyStatus"
        override fun toString(): kotlin.String = value
    }

    object ChecksumAlgorithm : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ChecksumAlgorithm"
        override fun toString(): kotlin.String = value
    }

    object ETag : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ETag"
        override fun toString(): kotlin.String = value
    }

    object EncryptionStatus : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "EncryptionStatus"
        override fun toString(): kotlin.String = value
    }

    object IntelligentTieringAccessTier : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "IntelligentTieringAccessTier"
        override fun toString(): kotlin.String = value
    }

    object IsMultipartUploaded : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "IsMultipartUploaded"
        override fun toString(): kotlin.String = value
    }

    object LastModifiedDate : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "LastModifiedDate"
        override fun toString(): kotlin.String = value
    }

    object ObjectLockLegalHoldStatus : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ObjectLockLegalHoldStatus"
        override fun toString(): kotlin.String = value
    }

    object ObjectLockMode : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ObjectLockMode"
        override fun toString(): kotlin.String = value
    }

    object ObjectLockRetainUntilDate : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ObjectLockRetainUntilDate"
        override fun toString(): kotlin.String = value
    }

    object ReplicationStatus : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "ReplicationStatus"
        override fun toString(): kotlin.String = value
    }

    object Size : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "Size"
        override fun toString(): kotlin.String = value
    }

    object StorageClass : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override val value: kotlin.String = "StorageClass"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.InventoryOptionalField() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.InventoryOptionalField = when(str) {
            "BucketKeyStatus" -> BucketKeyStatus
            "ChecksumAlgorithm" -> ChecksumAlgorithm
            "ETag" -> ETag
            "EncryptionStatus" -> EncryptionStatus
            "IntelligentTieringAccessTier" -> IntelligentTieringAccessTier
            "IsMultipartUploaded" -> IsMultipartUploaded
            "LastModifiedDate" -> LastModifiedDate
            "ObjectLockLegalHoldStatus" -> ObjectLockLegalHoldStatus
            "ObjectLockMode" -> ObjectLockMode
            "ObjectLockRetainUntilDate" -> ObjectLockRetainUntilDate
            "ReplicationStatus" -> ReplicationStatus
            "Size" -> Size
            "StorageClass" -> StorageClass
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.InventoryOptionalField> = listOf(
            BucketKeyStatus,
            ChecksumAlgorithm,
            ETag,
            EncryptionStatus,
            IntelligentTieringAccessTier,
            IsMultipartUploaded,
            LastModifiedDate,
            ObjectLockLegalHoldStatus,
            ObjectLockMode,
            ObjectLockRetainUntilDate,
            ReplicationStatus,
            Size,
            StorageClass
        )
    }
}
