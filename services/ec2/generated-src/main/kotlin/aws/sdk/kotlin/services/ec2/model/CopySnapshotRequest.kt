// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CopySnapshotRequest private constructor(builder: Builder) {
    /**
     * A description for the EBS snapshot.
     */
    val description: kotlin.String? = builder.description
    /**
     * The Amazon Resource Name (ARN) of the Outpost to which to copy the snapshot. Only specify this parameter when copying a snapshot from an Amazon Web Services Region to an Outpost. The snapshot must be in the Region for the destination Outpost. You cannot copy a snapshot from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
     *
     * For more information, see [ Copy snapshots from an Amazon Web Services Region to an Outpost](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-snapshots) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    val destinationOutpostArn: kotlin.String? = builder.destinationOutpostArn
    /**
     * The destination Region to use in the `PresignedUrl` parameter of a snapshot copy operation. This parameter is only valid for specifying the destination Region in a `PresignedUrl` parameter, where it is required.
     *
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example, `ec2.us-east-1.amazonaws.com`). With the CLI, this is specified using the `--region` parameter or the default Region in your Amazon Web Services configuration file.
     */
    val destinationRegion: kotlin.String? = builder.destinationRegion
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information, see [Amazon EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption. If this parameter is not specified, your KMS key for Amazon EBS is used. If `KmsKeyId` is specified, the encrypted state must be `true`.
     *
     * You can specify the KMS key using any of the following:
     * + Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * + Key alias. For example, alias/ExampleAlias.
     * + Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * + Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     *
     * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId
    /**
     * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This parameter is optional for unencrypted snapshots. For more information, see [Query requests](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html).
     *
     * The `PresignedUrl` should use the snapshot source endpoint, the `CopySnapshot` action, and include the `SourceRegion`, `SourceSnapshotId`, and `DestinationRegion` parameters. The `PresignedUrl` must be signed using Amazon Web Services Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in [Authenticating Requests: Using Query Parameters (Amazon Web Services Signature Version 4)](https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html) in the *Amazon Simple Storage Service API Reference*. An invalid or improperly signed `PresignedUrl` will cause the copy operation to fail asynchronously, and the snapshot will move to an `error` state.
     */
    val presignedUrl: kotlin.String? = builder.presignedUrl
    /**
     * The ID of the Region that contains the snapshot to be copied.
     */
    val sourceRegion: kotlin.String? = builder.sourceRegion
    /**
     * The ID of the EBS snapshot to copy.
     */
    val sourceSnapshotId: kotlin.String? = builder.sourceSnapshotId
    /**
     * The tags to apply to the new snapshot.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CopySnapshotRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CopySnapshotRequest(")
        append("description=$description,")
        append("destinationOutpostArn=$destinationOutpostArn,")
        append("destinationRegion=$destinationRegion,")
        append("dryRun=$dryRun,")
        append("encrypted=$encrypted,")
        append("kmsKeyId=$kmsKeyId,")
        append("presignedUrl=$presignedUrl,")
        append("sourceRegion=$sourceRegion,")
        append("sourceSnapshotId=$sourceSnapshotId,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (destinationOutpostArn?.hashCode() ?: 0)
        result = 31 * result + (destinationRegion?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (presignedUrl?.hashCode() ?: 0)
        result = 31 * result + (sourceRegion?.hashCode() ?: 0)
        result = 31 * result + (sourceSnapshotId?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CopySnapshotRequest

        if (description != other.description) return false
        if (destinationOutpostArn != other.destinationOutpostArn) return false
        if (destinationRegion != other.destinationRegion) return false
        if (dryRun != other.dryRun) return false
        if (encrypted != other.encrypted) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (presignedUrl != other.presignedUrl) return false
        if (sourceRegion != other.sourceRegion) return false
        if (sourceSnapshotId != other.sourceSnapshotId) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CopySnapshotRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A description for the EBS snapshot.
         */
        var description: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the Outpost to which to copy the snapshot. Only specify this parameter when copying a snapshot from an Amazon Web Services Region to an Outpost. The snapshot must be in the Region for the destination Outpost. You cannot copy a snapshot from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
         *
         * For more information, see [ Copy snapshots from an Amazon Web Services Region to an Outpost](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-snapshots) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        var destinationOutpostArn: kotlin.String? = null
        /**
         * The destination Region to use in the `PresignedUrl` parameter of a snapshot copy operation. This parameter is only valid for specifying the destination Region in a `PresignedUrl` parameter, where it is required.
         *
         * The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example, `ec2.us-east-1.amazonaws.com`). With the CLI, this is specified using the `--region` parameter or the default Region in your Amazon Web Services configuration file.
         */
        var destinationRegion: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information, see [Amazon EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption. If this parameter is not specified, your KMS key for Amazon EBS is used. If `KmsKeyId` is specified, the encrypted state must be `true`.
         *
         * You can specify the KMS key using any of the following:
         * + Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
         * + Key alias. For example, alias/ExampleAlias.
         * + Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
         * + Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         *
         * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
         */
        var kmsKeyId: kotlin.String? = null
        /**
         * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This parameter is optional for unencrypted snapshots. For more information, see [Query requests](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html).
         *
         * The `PresignedUrl` should use the snapshot source endpoint, the `CopySnapshot` action, and include the `SourceRegion`, `SourceSnapshotId`, and `DestinationRegion` parameters. The `PresignedUrl` must be signed using Amazon Web Services Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in [Authenticating Requests: Using Query Parameters (Amazon Web Services Signature Version 4)](https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html) in the *Amazon Simple Storage Service API Reference*. An invalid or improperly signed `PresignedUrl` will cause the copy operation to fail asynchronously, and the snapshot will move to an `error` state.
         */
        var presignedUrl: kotlin.String? = null
        /**
         * The ID of the Region that contains the snapshot to be copied.
         */
        var sourceRegion: kotlin.String? = null
        /**
         * The ID of the EBS snapshot to copy.
         */
        var sourceSnapshotId: kotlin.String? = null
        /**
         * The tags to apply to the new snapshot.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CopySnapshotRequest) : this() {
            this.description = x.description
            this.destinationOutpostArn = x.destinationOutpostArn
            this.destinationRegion = x.destinationRegion
            this.dryRun = x.dryRun
            this.encrypted = x.encrypted
            this.kmsKeyId = x.kmsKeyId
            this.presignedUrl = x.presignedUrl
            this.sourceRegion = x.sourceRegion
            this.sourceSnapshotId = x.sourceSnapshotId
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CopySnapshotRequest = CopySnapshotRequest(this)
    }
}
