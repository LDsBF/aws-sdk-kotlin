// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the authentication methods used by a Client VPN endpoint. For more information, see [Authentication](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html) in the *Client VPN Administrator Guide*.
 */
class ClientVpnAuthentication private constructor(builder: Builder) {
    /**
     * Information about the Active Directory, if applicable.
     */
    val activeDirectory: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthentication? = builder.activeDirectory
    /**
     * Information about the IAM SAML identity provider, if applicable.
     */
    val federatedAuthentication: aws.sdk.kotlin.services.ec2.model.FederatedAuthentication? = builder.federatedAuthentication
    /**
     * Information about the authentication certificates, if applicable.
     */
    val mutualAuthentication: aws.sdk.kotlin.services.ec2.model.CertificateAuthentication? = builder.mutualAuthentication
    /**
     * The authentication type used.
     */
    val type: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthentication = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnAuthentication(")
        append("activeDirectory=$activeDirectory,")
        append("federatedAuthentication=$federatedAuthentication,")
        append("mutualAuthentication=$mutualAuthentication,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = activeDirectory?.hashCode() ?: 0
        result = 31 * result + (federatedAuthentication?.hashCode() ?: 0)
        result = 31 * result + (mutualAuthentication?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClientVpnAuthentication

        if (activeDirectory != other.activeDirectory) return false
        if (federatedAuthentication != other.federatedAuthentication) return false
        if (mutualAuthentication != other.mutualAuthentication) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthentication = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the Active Directory, if applicable.
         */
        var activeDirectory: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthentication? = null
        /**
         * Information about the IAM SAML identity provider, if applicable.
         */
        var federatedAuthentication: aws.sdk.kotlin.services.ec2.model.FederatedAuthentication? = null
        /**
         * Information about the authentication certificates, if applicable.
         */
        var mutualAuthentication: aws.sdk.kotlin.services.ec2.model.CertificateAuthentication? = null
        /**
         * The authentication type used.
         */
        var type: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthentication) : this() {
            this.activeDirectory = x.activeDirectory
            this.federatedAuthentication = x.federatedAuthentication
            this.mutualAuthentication = x.mutualAuthentication
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthentication = ClientVpnAuthentication(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthentication] inside the given [block]
         */
        fun activeDirectory(block: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthentication.Builder.() -> kotlin.Unit) {
            this.activeDirectory = aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthentication.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FederatedAuthentication] inside the given [block]
         */
        fun federatedAuthentication(block: aws.sdk.kotlin.services.ec2.model.FederatedAuthentication.Builder.() -> kotlin.Unit) {
            this.federatedAuthentication = aws.sdk.kotlin.services.ec2.model.FederatedAuthentication.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CertificateAuthentication] inside the given [block]
         */
        fun mutualAuthentication(block: aws.sdk.kotlin.services.ec2.model.CertificateAuthentication.Builder.() -> kotlin.Unit) {
            this.mutualAuthentication = aws.sdk.kotlin.services.ec2.model.CertificateAuthentication.invoke(block)
        }
    }
}
