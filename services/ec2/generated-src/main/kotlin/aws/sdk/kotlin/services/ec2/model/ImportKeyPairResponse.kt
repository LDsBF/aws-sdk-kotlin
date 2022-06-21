// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ImportKeyPairResponse private constructor(builder: Builder) {
    /**
     * + For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * + For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with [OpenSSH 6.8](http://www.openssh.com/txt/release-6.8).
     */
    val keyFingerprint: kotlin.String? = builder.keyFingerprint
    /**
     * The key pair name that you provided.
     */
    val keyName: kotlin.String? = builder.keyName
    /**
     * The ID of the resulting key pair.
     */
    val keyPairId: kotlin.String? = builder.keyPairId
    /**
     * The tags applied to the imported key pair.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportKeyPairResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportKeyPairResponse(")
        append("keyFingerprint=$keyFingerprint,")
        append("keyName=$keyName,")
        append("keyPairId=$keyPairId,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = keyFingerprint?.hashCode() ?: 0
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (keyPairId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportKeyPairResponse

        if (keyFingerprint != other.keyFingerprint) return false
        if (keyName != other.keyName) return false
        if (keyPairId != other.keyPairId) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportKeyPairResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * + For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC 4716.
         * + For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with [OpenSSH 6.8](http://www.openssh.com/txt/release-6.8).
         */
        var keyFingerprint: kotlin.String? = null
        /**
         * The key pair name that you provided.
         */
        var keyName: kotlin.String? = null
        /**
         * The ID of the resulting key pair.
         */
        var keyPairId: kotlin.String? = null
        /**
         * The tags applied to the imported key pair.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportKeyPairResponse) : this() {
            this.keyFingerprint = x.keyFingerprint
            this.keyName = x.keyName
            this.keyPairId = x.keyPairId
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportKeyPairResponse = ImportKeyPairResponse(this)
    }
}
