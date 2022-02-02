// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyEbsDefaultKmsKeyIdRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption.
     * If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is
     * specified, the encrypted state must be true.
     * You can specify the KMS key using any of the following:
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * Key alias. For example, alias/ExampleAlias.
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid,
     * the action can appear to complete, but eventually fails.
     * Amazon EBS does not support asymmetric KMS keys.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyEbsDefaultKmsKeyIdRequest(")
        append("dryRun=$dryRun,")
        append("kmsKeyId=$kmsKeyId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyEbsDefaultKmsKeyIdRequest

        if (dryRun != other.dryRun) return false
        if (kmsKeyId != other.kmsKeyId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption.
         * If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is
         * specified, the encrypted state must be true.
         * You can specify the KMS key using any of the following:
         * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
         * Key alias. For example, alias/ExampleAlias.
         * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
         * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
         * Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid,
         * the action can appear to complete, but eventually fails.
         * Amazon EBS does not support asymmetric KMS keys.
         */
        var kmsKeyId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest) : this() {
            this.dryRun = x.dryRun
            this.kmsKeyId = x.kmsKeyId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest = ModifyEbsDefaultKmsKeyIdRequest(this)
    }
}
