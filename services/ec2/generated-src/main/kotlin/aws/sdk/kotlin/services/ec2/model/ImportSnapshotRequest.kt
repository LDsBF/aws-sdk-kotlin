// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ImportSnapshotRequest private constructor(builder: Builder) {
    /**
     * The client-specific data.
     */
    val clientData: aws.sdk.kotlin.services.ec2.model.ClientData? = builder.clientData
    /**
     * Token to enable idempotency for VM import requests.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The description string for the import snapshot task.
     */
    val description: kotlin.String? = builder.description
    /**
     * Information about the disk container.
     */
    val diskContainer: aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer? = builder.diskContainer
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is used unless you specify a non-default KMS key using `KmsKeyId`. For more information, see [Amazon EBS Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * An identifier for the symmetric KMS key to use when creating the encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is used. If a `KmsKeyId` is specified, the `Encrypted` flag must also be set.
     *
     * The KMS key identifier may be provided in any of the following formats:
     * + Key ID
     * + Key alias. The alias ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `alias` namespace, and then the key alias. For example, arn:aws:kms:*us-east-1*:*012345678910*:alias&#47;*ExampleAlias*.
     * + ARN using key ID. The ID ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `key` namespace, and then the key ID. For example, arn:aws:kms:*us-east-1*:*012345678910*:key&#47;*abcd1234-a123-456a-a12b-a123b4cd56ef*.
     * + ARN using key alias. The alias ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `alias` namespace, and then the key alias. For example, arn:aws:kms:*us-east-1*:*012345678910*:alias&#47;*ExampleAlias*.
     *
     * Amazon Web Services parses `KmsKeyId` asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.
     *
     * The specified KMS key must exist in the Region that the snapshot is being copied to.
     *
     * Amazon EBS does not support asymmetric KMS keys.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId
    /**
     * The name of the role to use when not using the default role, 'vmimport'.
     */
    val roleName: kotlin.String? = builder.roleName
    /**
     * The tags to apply to the import snapshot task during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportSnapshotRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportSnapshotRequest(")
        append("clientData=$clientData,")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("diskContainer=$diskContainer,")
        append("dryRun=$dryRun,")
        append("encrypted=$encrypted,")
        append("kmsKeyId=$kmsKeyId,")
        append("roleName=$roleName,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientData?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (diskContainer?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (roleName?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportSnapshotRequest

        if (clientData != other.clientData) return false
        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (diskContainer != other.diskContainer) return false
        if (dryRun != other.dryRun) return false
        if (encrypted != other.encrypted) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (roleName != other.roleName) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportSnapshotRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The client-specific data.
         */
        var clientData: aws.sdk.kotlin.services.ec2.model.ClientData? = null
        /**
         * Token to enable idempotency for VM import requests.
         */
        var clientToken: kotlin.String? = null
        /**
         * The description string for the import snapshot task.
         */
        var description: kotlin.String? = null
        /**
         * Information about the disk container.
         */
        var diskContainer: aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is used unless you specify a non-default KMS key using `KmsKeyId`. For more information, see [Amazon EBS Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * An identifier for the symmetric KMS key to use when creating the encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is used. If a `KmsKeyId` is specified, the `Encrypted` flag must also be set.
         *
         * The KMS key identifier may be provided in any of the following formats:
         * + Key ID
         * + Key alias. The alias ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `alias` namespace, and then the key alias. For example, arn:aws:kms:*us-east-1*:*012345678910*:alias&#47;*ExampleAlias*.
         * + ARN using key ID. The ID ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `key` namespace, and then the key ID. For example, arn:aws:kms:*us-east-1*:*012345678910*:key&#47;*abcd1234-a123-456a-a12b-a123b4cd56ef*.
         * + ARN using key alias. The alias ARN contains the `arn:aws:kms` namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the `alias` namespace, and then the key alias. For example, arn:aws:kms:*us-east-1*:*012345678910*:alias&#47;*ExampleAlias*.
         *
         * Amazon Web Services parses `KmsKeyId` asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.
         *
         * The specified KMS key must exist in the Region that the snapshot is being copied to.
         *
         * Amazon EBS does not support asymmetric KMS keys.
         */
        var kmsKeyId: kotlin.String? = null
        /**
         * The name of the role to use when not using the default role, 'vmimport'.
         */
        var roleName: kotlin.String? = null
        /**
         * The tags to apply to the import snapshot task during creation.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportSnapshotRequest) : this() {
            this.clientData = x.clientData
            this.clientToken = x.clientToken
            this.description = x.description
            this.diskContainer = x.diskContainer
            this.dryRun = x.dryRun
            this.encrypted = x.encrypted
            this.kmsKeyId = x.kmsKeyId
            this.roleName = x.roleName
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportSnapshotRequest = ImportSnapshotRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientData] inside the given [block]
         */
        fun clientData(block: aws.sdk.kotlin.services.ec2.model.ClientData.Builder.() -> kotlin.Unit) {
            this.clientData = aws.sdk.kotlin.services.ec2.model.ClientData.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer] inside the given [block]
         */
        fun diskContainer(block: aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer.Builder.() -> kotlin.Unit) {
            this.diskContainer = aws.sdk.kotlin.services.ec2.model.SnapshotDiskContainer.invoke(block)
        }
    }
}
