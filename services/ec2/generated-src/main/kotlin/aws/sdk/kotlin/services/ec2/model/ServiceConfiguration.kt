// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a service configuration for a VPC endpoint service.
 */
class ServiceConfiguration private constructor(builder: Builder) {
    /**
     * Indicates whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be accepted.
     */
    val acceptanceRequired: kotlin.Boolean? = builder.acceptanceRequired
    /**
     * The Availability Zones in which the service is available.
     */
    val availabilityZones: List<String>? = builder.availabilityZones
    /**
     * The DNS names for the service.
     */
    val baseEndpointDnsNames: List<String>? = builder.baseEndpointDnsNames
    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
     */
    val gatewayLoadBalancerArns: List<String>? = builder.gatewayLoadBalancerArns
    /**
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
     */
    val managesVpcEndpoints: kotlin.Boolean? = builder.managesVpcEndpoints
    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
     */
    val networkLoadBalancerArns: List<String>? = builder.networkLoadBalancerArns
    /**
     * The payer responsibility.
     */
    val payerResponsibility: aws.sdk.kotlin.services.ec2.model.PayerResponsibility? = builder.payerResponsibility
    /**
     * The private DNS name for the service.
     */
    val privateDnsName: kotlin.String? = builder.privateDnsName
    /**
     * Information about the endpoint service private DNS name configuration.
     */
    val privateDnsNameConfiguration: aws.sdk.kotlin.services.ec2.model.PrivateDnsNameConfiguration? = builder.privateDnsNameConfiguration
    /**
     * The ID of the service.
     */
    val serviceId: kotlin.String? = builder.serviceId
    /**
     * The name of the service.
     */
    val serviceName: kotlin.String? = builder.serviceName
    /**
     * The service state.
     */
    val serviceState: aws.sdk.kotlin.services.ec2.model.ServiceState? = builder.serviceState
    /**
     * The type of service.
     */
    val serviceType: List<ServiceTypeDetail>? = builder.serviceType
    /**
     * The supported IP address types.
     */
    val supportedIpAddressTypes: List<ServiceConnectivityType>? = builder.supportedIpAddressTypes
    /**
     * Any tags assigned to the service.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ServiceConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ServiceConfiguration(")
        append("acceptanceRequired=$acceptanceRequired,")
        append("availabilityZones=$availabilityZones,")
        append("baseEndpointDnsNames=$baseEndpointDnsNames,")
        append("gatewayLoadBalancerArns=$gatewayLoadBalancerArns,")
        append("managesVpcEndpoints=$managesVpcEndpoints,")
        append("networkLoadBalancerArns=$networkLoadBalancerArns,")
        append("payerResponsibility=$payerResponsibility,")
        append("privateDnsName=$privateDnsName,")
        append("privateDnsNameConfiguration=$privateDnsNameConfiguration,")
        append("serviceId=$serviceId,")
        append("serviceName=$serviceName,")
        append("serviceState=$serviceState,")
        append("serviceType=$serviceType,")
        append("supportedIpAddressTypes=$supportedIpAddressTypes,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceptanceRequired?.hashCode() ?: 0
        result = 31 * result + (availabilityZones?.hashCode() ?: 0)
        result = 31 * result + (baseEndpointDnsNames?.hashCode() ?: 0)
        result = 31 * result + (gatewayLoadBalancerArns?.hashCode() ?: 0)
        result = 31 * result + (managesVpcEndpoints?.hashCode() ?: 0)
        result = 31 * result + (networkLoadBalancerArns?.hashCode() ?: 0)
        result = 31 * result + (payerResponsibility?.hashCode() ?: 0)
        result = 31 * result + (privateDnsName?.hashCode() ?: 0)
        result = 31 * result + (privateDnsNameConfiguration?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (serviceName?.hashCode() ?: 0)
        result = 31 * result + (serviceState?.hashCode() ?: 0)
        result = 31 * result + (serviceType?.hashCode() ?: 0)
        result = 31 * result + (supportedIpAddressTypes?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ServiceConfiguration

        if (acceptanceRequired != other.acceptanceRequired) return false
        if (availabilityZones != other.availabilityZones) return false
        if (baseEndpointDnsNames != other.baseEndpointDnsNames) return false
        if (gatewayLoadBalancerArns != other.gatewayLoadBalancerArns) return false
        if (managesVpcEndpoints != other.managesVpcEndpoints) return false
        if (networkLoadBalancerArns != other.networkLoadBalancerArns) return false
        if (payerResponsibility != other.payerResponsibility) return false
        if (privateDnsName != other.privateDnsName) return false
        if (privateDnsNameConfiguration != other.privateDnsNameConfiguration) return false
        if (serviceId != other.serviceId) return false
        if (serviceName != other.serviceName) return false
        if (serviceState != other.serviceState) return false
        if (serviceType != other.serviceType) return false
        if (supportedIpAddressTypes != other.supportedIpAddressTypes) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ServiceConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether requests from other Amazon Web Services accounts to create an endpoint to the service must first be accepted.
         */
        var acceptanceRequired: kotlin.Boolean? = null
        /**
         * The Availability Zones in which the service is available.
         */
        var availabilityZones: List<String>? = null
        /**
         * The DNS names for the service.
         */
        var baseEndpointDnsNames: List<String>? = null
        /**
         * The Amazon Resource Names (ARNs) of the Gateway Load Balancers for the service.
         */
        var gatewayLoadBalancerArns: List<String>? = null
        /**
         * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
         */
        var managesVpcEndpoints: kotlin.Boolean? = null
        /**
         * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
         */
        var networkLoadBalancerArns: List<String>? = null
        /**
         * The payer responsibility.
         */
        var payerResponsibility: aws.sdk.kotlin.services.ec2.model.PayerResponsibility? = null
        /**
         * The private DNS name for the service.
         */
        var privateDnsName: kotlin.String? = null
        /**
         * Information about the endpoint service private DNS name configuration.
         */
        var privateDnsNameConfiguration: aws.sdk.kotlin.services.ec2.model.PrivateDnsNameConfiguration? = null
        /**
         * The ID of the service.
         */
        var serviceId: kotlin.String? = null
        /**
         * The name of the service.
         */
        var serviceName: kotlin.String? = null
        /**
         * The service state.
         */
        var serviceState: aws.sdk.kotlin.services.ec2.model.ServiceState? = null
        /**
         * The type of service.
         */
        var serviceType: List<ServiceTypeDetail>? = null
        /**
         * The supported IP address types.
         */
        var supportedIpAddressTypes: List<ServiceConnectivityType>? = null
        /**
         * Any tags assigned to the service.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ServiceConfiguration) : this() {
            this.acceptanceRequired = x.acceptanceRequired
            this.availabilityZones = x.availabilityZones
            this.baseEndpointDnsNames = x.baseEndpointDnsNames
            this.gatewayLoadBalancerArns = x.gatewayLoadBalancerArns
            this.managesVpcEndpoints = x.managesVpcEndpoints
            this.networkLoadBalancerArns = x.networkLoadBalancerArns
            this.payerResponsibility = x.payerResponsibility
            this.privateDnsName = x.privateDnsName
            this.privateDnsNameConfiguration = x.privateDnsNameConfiguration
            this.serviceId = x.serviceId
            this.serviceName = x.serviceName
            this.serviceState = x.serviceState
            this.serviceType = x.serviceType
            this.supportedIpAddressTypes = x.supportedIpAddressTypes
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ServiceConfiguration = ServiceConfiguration(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PrivateDnsNameConfiguration] inside the given [block]
         */
        fun privateDnsNameConfiguration(block: aws.sdk.kotlin.services.ec2.model.PrivateDnsNameConfiguration.Builder.() -> kotlin.Unit) {
            this.privateDnsNameConfiguration = aws.sdk.kotlin.services.ec2.model.PrivateDnsNameConfiguration.invoke(block)
        }
    }
}
