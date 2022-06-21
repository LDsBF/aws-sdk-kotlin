// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the settings used to enable server-side encryption.
 */
class SseSpecification private constructor(builder: Builder) {
    /**
     * Indicates whether server-side encryption is done using an Amazon Web Services managed key or an Amazon Web Services owned key. If enabled (true), server-side encryption type is set to `KMS` and an Amazon Web Services managed key is used (KMS charges apply). If disabled (false) or not specified, server-side encryption is set to Amazon Web Services owned key.
     */
    val enabled: kotlin.Boolean? = builder.enabled
    /**
     * The KMS key that should be used for the KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB key `alias/aws/dynamodb`.
     */
    val kmsMasterKeyId: kotlin.String? = builder.kmsMasterKeyId
    /**
     * Server-side encryption type. The only supported value is:
     * + `KMS` - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).
     */
    val sseType: aws.sdk.kotlin.services.dynamodb.model.SseType? = builder.sseType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.SseSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SseSpecification(")
        append("enabled=$enabled,")
        append("kmsMasterKeyId=$kmsMasterKeyId,")
        append("sseType=$sseType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        result = 31 * result + (kmsMasterKeyId?.hashCode() ?: 0)
        result = 31 * result + (sseType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SseSpecification

        if (enabled != other.enabled) return false
        if (kmsMasterKeyId != other.kmsMasterKeyId) return false
        if (sseType != other.sseType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.SseSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether server-side encryption is done using an Amazon Web Services managed key or an Amazon Web Services owned key. If enabled (true), server-side encryption type is set to `KMS` and an Amazon Web Services managed key is used (KMS charges apply). If disabled (false) or not specified, server-side encryption is set to Amazon Web Services owned key.
         */
        var enabled: kotlin.Boolean? = null
        /**
         * The KMS key that should be used for the KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB key `alias/aws/dynamodb`.
         */
        var kmsMasterKeyId: kotlin.String? = null
        /**
         * Server-side encryption type. The only supported value is:
         * + `KMS` - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).
         */
        var sseType: aws.sdk.kotlin.services.dynamodb.model.SseType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.SseSpecification) : this() {
            this.enabled = x.enabled
            this.kmsMasterKeyId = x.kmsMasterKeyId
            this.sseType = x.sseType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.SseSpecification = SseSpecification(this)
    }
}
