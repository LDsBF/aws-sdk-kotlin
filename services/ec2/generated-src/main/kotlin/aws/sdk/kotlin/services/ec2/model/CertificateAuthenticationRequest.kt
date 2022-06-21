// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about the client certificate to be used for authentication.
 */
class CertificateAuthenticationRequest private constructor(builder: Builder) {
    /**
     * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in Certificate Manager (ACM).
     */
    val clientRootCertificateChainArn: kotlin.String? = builder.clientRootCertificateChainArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CertificateAuthenticationRequest(")
        append("clientRootCertificateChainArn=$clientRootCertificateChainArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientRootCertificateChainArn?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CertificateAuthenticationRequest

        if (clientRootCertificateChainArn != other.clientRootCertificateChainArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in Certificate Manager (ACM).
         */
        var clientRootCertificateChainArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest) : this() {
            this.clientRootCertificateChainArn = x.clientRootCertificateChainArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest = CertificateAuthenticationRequest(this)
    }
}
