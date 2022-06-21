// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

class ExportTableToPointInTimeRequest private constructor(builder: Builder) {
    /**
     * Providing a `ClientToken` makes the call to `ExportTableToPointInTimeInput` idempotent, meaning that multiple identical calls have the same effect as one single call.
     *
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent.
     *
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an `IdempotentParameterMismatch` exception.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The format for the exported data. Valid values for `ExportFormat` are `DYNAMODB_JSON` or `ION`.
     */
    val exportFormat: aws.sdk.kotlin.services.dynamodb.model.ExportFormat? = builder.exportFormat
    /**
     * Time in the past from which to export table data. The table export will be a snapshot of the table's state at this point in time.
     */
    val exportTime: aws.smithy.kotlin.runtime.time.Instant? = builder.exportTime
    /**
     * The name of the Amazon S3 bucket to export the snapshot to.
     */
    val s3Bucket: kotlin.String? = builder.s3Bucket
    /**
     * The ID of the Amazon Web Services account that owns the bucket the export will be stored in.
     */
    val s3BucketOwner: kotlin.String? = builder.s3BucketOwner
    /**
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     */
    val s3Prefix: kotlin.String? = builder.s3Prefix
    /**
     * Type of encryption used on the bucket where export data will be stored. Valid values for `S3SseAlgorithm` are:
     * + `AES256` - server-side encryption with Amazon S3 managed keys
     * + `KMS` - server-side encryption with KMS managed keys
     */
    val s3SseAlgorithm: aws.sdk.kotlin.services.dynamodb.model.S3SseAlgorithm? = builder.s3SseAlgorithm
    /**
     * The ID of the KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
     */
    val s3SseKmsKeyId: kotlin.String? = builder.s3SseKmsKeyId
    /**
     * The Amazon Resource Name (ARN) associated with the table to export.
     */
    val tableArn: kotlin.String? = builder.tableArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ExportTableToPointInTimeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportTableToPointInTimeRequest(")
        append("clientToken=$clientToken,")
        append("exportFormat=$exportFormat,")
        append("exportTime=$exportTime,")
        append("s3Bucket=$s3Bucket,")
        append("s3BucketOwner=$s3BucketOwner,")
        append("s3Prefix=$s3Prefix,")
        append("s3SseAlgorithm=$s3SseAlgorithm,")
        append("s3SseKmsKeyId=$s3SseKmsKeyId,")
        append("tableArn=$tableArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (exportFormat?.hashCode() ?: 0)
        result = 31 * result + (exportTime?.hashCode() ?: 0)
        result = 31 * result + (s3Bucket?.hashCode() ?: 0)
        result = 31 * result + (s3BucketOwner?.hashCode() ?: 0)
        result = 31 * result + (s3Prefix?.hashCode() ?: 0)
        result = 31 * result + (s3SseAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (s3SseKmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (tableArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportTableToPointInTimeRequest

        if (clientToken != other.clientToken) return false
        if (exportFormat != other.exportFormat) return false
        if (exportTime != other.exportTime) return false
        if (s3Bucket != other.s3Bucket) return false
        if (s3BucketOwner != other.s3BucketOwner) return false
        if (s3Prefix != other.s3Prefix) return false
        if (s3SseAlgorithm != other.s3SseAlgorithm) return false
        if (s3SseKmsKeyId != other.s3SseKmsKeyId) return false
        if (tableArn != other.tableArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ExportTableToPointInTimeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Providing a `ClientToken` makes the call to `ExportTableToPointInTimeInput` idempotent, meaning that multiple identical calls have the same effect as one single call.
         *
         * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent.
         *
         * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an `IdempotentParameterMismatch` exception.
         */
        var clientToken: kotlin.String? = null
        /**
         * The format for the exported data. Valid values for `ExportFormat` are `DYNAMODB_JSON` or `ION`.
         */
        var exportFormat: aws.sdk.kotlin.services.dynamodb.model.ExportFormat? = null
        /**
         * Time in the past from which to export table data. The table export will be a snapshot of the table's state at this point in time.
         */
        var exportTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The name of the Amazon S3 bucket to export the snapshot to.
         */
        var s3Bucket: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the bucket the export will be stored in.
         */
        var s3BucketOwner: kotlin.String? = null
        /**
         * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
         */
        var s3Prefix: kotlin.String? = null
        /**
         * Type of encryption used on the bucket where export data will be stored. Valid values for `S3SseAlgorithm` are:
         * + `AES256` - server-side encryption with Amazon S3 managed keys
         * + `KMS` - server-side encryption with KMS managed keys
         */
        var s3SseAlgorithm: aws.sdk.kotlin.services.dynamodb.model.S3SseAlgorithm? = null
        /**
         * The ID of the KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
         */
        var s3SseKmsKeyId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) associated with the table to export.
         */
        var tableArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ExportTableToPointInTimeRequest) : this() {
            this.clientToken = x.clientToken
            this.exportFormat = x.exportFormat
            this.exportTime = x.exportTime
            this.s3Bucket = x.s3Bucket
            this.s3BucketOwner = x.s3BucketOwner
            this.s3Prefix = x.s3Prefix
            this.s3SseAlgorithm = x.s3SseAlgorithm
            this.s3SseKmsKeyId = x.s3SseKmsKeyId
            this.tableArn = x.tableArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ExportTableToPointInTimeRequest = ExportTableToPointInTimeRequest(this)
    }
}
