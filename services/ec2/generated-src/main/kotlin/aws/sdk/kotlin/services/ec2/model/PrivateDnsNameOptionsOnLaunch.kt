// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the options for instance hostnames.
 */
class PrivateDnsNameOptionsOnLaunch private constructor(builder: Builder) {
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */
    val enableResourceNameDnsARecord: kotlin.Boolean? = builder.enableResourceNameDnsARecord
    /**
     * Indicates whether to respond to DNS queries for instance hostname with DNS AAAA records.
     */
    val enableResourceNameDnsAaaaRecord: kotlin.Boolean? = builder.enableResourceNameDnsAaaaRecord
    /**
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     */
    val hostnameType: aws.sdk.kotlin.services.ec2.model.HostnameType? = builder.hostnameType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PrivateDnsNameOptionsOnLaunch = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PrivateDnsNameOptionsOnLaunch(")
        append("enableResourceNameDnsARecord=$enableResourceNameDnsARecord,")
        append("enableResourceNameDnsAaaaRecord=$enableResourceNameDnsAaaaRecord,")
        append("hostnameType=$hostnameType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enableResourceNameDnsARecord?.hashCode() ?: 0
        result = 31 * result + (enableResourceNameDnsAaaaRecord?.hashCode() ?: 0)
        result = 31 * result + (hostnameType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PrivateDnsNameOptionsOnLaunch

        if (enableResourceNameDnsARecord != other.enableResourceNameDnsARecord) return false
        if (enableResourceNameDnsAaaaRecord != other.enableResourceNameDnsAaaaRecord) return false
        if (hostnameType != other.hostnameType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PrivateDnsNameOptionsOnLaunch = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
         */
        var enableResourceNameDnsARecord: kotlin.Boolean? = null
        /**
         * Indicates whether to respond to DNS queries for instance hostname with DNS AAAA records.
         */
        var enableResourceNameDnsAaaaRecord: kotlin.Boolean? = null
        /**
         * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
         */
        var hostnameType: aws.sdk.kotlin.services.ec2.model.HostnameType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PrivateDnsNameOptionsOnLaunch) : this() {
            this.enableResourceNameDnsARecord = x.enableResourceNameDnsARecord
            this.enableResourceNameDnsAaaaRecord = x.enableResourceNameDnsAaaaRecord
            this.hostnameType = x.hostnameType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PrivateDnsNameOptionsOnLaunch = PrivateDnsNameOptionsOnLaunch(this)
    }
}
