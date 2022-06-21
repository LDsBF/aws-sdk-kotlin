// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the authentication method to be used by a Client VPN endpoint. For more information, see [Authentication](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication) in the *Client VPN Administrator Guide*.
 */
class ClientVpnAuthenticationRequest private constructor(builder: Builder) {
    /**
     * Information about the Active Directory to be used, if applicable. You must provide this information if **Type** is `directory-service-authentication`.
     */
    val activeDirectory: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest? = builder.activeDirectory
    /**
     * Information about the IAM SAML identity provider to be used, if applicable. You must provide this information if **Type** is `federated-authentication`.
     */
    val federatedAuthentication: aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest? = builder.federatedAuthentication
    /**
     * Information about the authentication certificates to be used, if applicable. You must provide this information if **Type** is `certificate-authentication`.
     */
    val mutualAuthentication: aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest? = builder.mutualAuthentication
    /**
     * The type of client authentication to be used.
     */
    val type: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnAuthenticationRequest(")
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

        other as ClientVpnAuthenticationRequest

        if (activeDirectory != other.activeDirectory) return false
        if (federatedAuthentication != other.federatedAuthentication) return false
        if (mutualAuthentication != other.mutualAuthentication) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the Active Directory to be used, if applicable. You must provide this information if **Type** is `directory-service-authentication`.
         */
        var activeDirectory: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest? = null
        /**
         * Information about the IAM SAML identity provider to be used, if applicable. You must provide this information if **Type** is `federated-authentication`.
         */
        var federatedAuthentication: aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest? = null
        /**
         * Information about the authentication certificates to be used, if applicable. You must provide this information if **Type** is `certificate-authentication`.
         */
        var mutualAuthentication: aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest? = null
        /**
         * The type of client authentication to be used.
         */
        var type: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationRequest) : this() {
            this.activeDirectory = x.activeDirectory
            this.federatedAuthentication = x.federatedAuthentication
            this.mutualAuthentication = x.mutualAuthentication
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationRequest = ClientVpnAuthenticationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest] inside the given [block]
         */
        fun activeDirectory(block: aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest.Builder.() -> kotlin.Unit) {
            this.activeDirectory = aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest] inside the given [block]
         */
        fun federatedAuthentication(block: aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest.Builder.() -> kotlin.Unit) {
            this.federatedAuthentication = aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest] inside the given [block]
         */
        fun mutualAuthentication(block: aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest.Builder.() -> kotlin.Unit) {
            this.mutualAuthentication = aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest.invoke(block)
        }
    }
}
