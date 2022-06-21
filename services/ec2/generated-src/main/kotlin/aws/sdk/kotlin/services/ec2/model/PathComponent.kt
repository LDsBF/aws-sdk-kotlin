// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a path component.
 */
class PathComponent private constructor(builder: Builder) {
    /**
     * The network ACL rule.
     */
    val aclRule: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule? = builder.aclRule
    /**
     * The additional details.
     */
    val additionalDetails: List<AdditionalDetail>? = builder.additionalDetails
    /**
     * The resource to which the path component is attached.
     */
    val attachedTo: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.attachedTo
    /**
     * The component.
     */
    val component: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.component
    /**
     * The destination VPC.
     */
    val destinationVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.destinationVpc
    /**
     * The inbound header.
     */
    val inboundHeader: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader? = builder.inboundHeader
    /**
     * The outbound header.
     */
    val outboundHeader: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader? = builder.outboundHeader
    /**
     * The route table route.
     */
    val routeTableRoute: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute? = builder.routeTableRoute
    /**
     * The security group rule.
     */
    val securityGroupRule: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule? = builder.securityGroupRule
    /**
     * The sequence number.
     */
    val sequenceNumber: kotlin.Int? = builder.sequenceNumber
    /**
     * The source VPC.
     */
    val sourceVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.sourceVpc
    /**
     * The subnet.
     */
    val subnet: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.subnet
    /**
     * Describes a path component.
     */
    val transitGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.transitGateway
    /**
     * The route in a transit gateway route table.
     */
    val transitGatewayRouteTableRoute: aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableRoute? = builder.transitGatewayRouteTableRoute
    /**
     * The component VPC.
     */
    val vpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpc

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PathComponent = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PathComponent(")
        append("aclRule=$aclRule,")
        append("additionalDetails=$additionalDetails,")
        append("attachedTo=$attachedTo,")
        append("component=$component,")
        append("destinationVpc=$destinationVpc,")
        append("inboundHeader=$inboundHeader,")
        append("outboundHeader=$outboundHeader,")
        append("routeTableRoute=$routeTableRoute,")
        append("securityGroupRule=$securityGroupRule,")
        append("sequenceNumber=$sequenceNumber,")
        append("sourceVpc=$sourceVpc,")
        append("subnet=$subnet,")
        append("transitGateway=$transitGateway,")
        append("transitGatewayRouteTableRoute=$transitGatewayRouteTableRoute,")
        append("vpc=$vpc)")
    }

    override fun hashCode(): kotlin.Int {
        var result = aclRule?.hashCode() ?: 0
        result = 31 * result + (additionalDetails?.hashCode() ?: 0)
        result = 31 * result + (attachedTo?.hashCode() ?: 0)
        result = 31 * result + (component?.hashCode() ?: 0)
        result = 31 * result + (destinationVpc?.hashCode() ?: 0)
        result = 31 * result + (inboundHeader?.hashCode() ?: 0)
        result = 31 * result + (outboundHeader?.hashCode() ?: 0)
        result = 31 * result + (routeTableRoute?.hashCode() ?: 0)
        result = 31 * result + (securityGroupRule?.hashCode() ?: 0)
        result = 31 * result + (sequenceNumber ?: 0)
        result = 31 * result + (sourceVpc?.hashCode() ?: 0)
        result = 31 * result + (subnet?.hashCode() ?: 0)
        result = 31 * result + (transitGateway?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableRoute?.hashCode() ?: 0)
        result = 31 * result + (vpc?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PathComponent

        if (aclRule != other.aclRule) return false
        if (additionalDetails != other.additionalDetails) return false
        if (attachedTo != other.attachedTo) return false
        if (component != other.component) return false
        if (destinationVpc != other.destinationVpc) return false
        if (inboundHeader != other.inboundHeader) return false
        if (outboundHeader != other.outboundHeader) return false
        if (routeTableRoute != other.routeTableRoute) return false
        if (securityGroupRule != other.securityGroupRule) return false
        if (sequenceNumber != other.sequenceNumber) return false
        if (sourceVpc != other.sourceVpc) return false
        if (subnet != other.subnet) return false
        if (transitGateway != other.transitGateway) return false
        if (transitGatewayRouteTableRoute != other.transitGatewayRouteTableRoute) return false
        if (vpc != other.vpc) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PathComponent = Builder(this).apply(block).build()

    class Builder {
        /**
         * The network ACL rule.
         */
        var aclRule: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule? = null
        /**
         * The additional details.
         */
        var additionalDetails: List<AdditionalDetail>? = null
        /**
         * The resource to which the path component is attached.
         */
        var attachedTo: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The component.
         */
        var component: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The destination VPC.
         */
        var destinationVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The inbound header.
         */
        var inboundHeader: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader? = null
        /**
         * The outbound header.
         */
        var outboundHeader: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader? = null
        /**
         * The route table route.
         */
        var routeTableRoute: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute? = null
        /**
         * The security group rule.
         */
        var securityGroupRule: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule? = null
        /**
         * The sequence number.
         */
        var sequenceNumber: kotlin.Int? = null
        /**
         * The source VPC.
         */
        var sourceVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The subnet.
         */
        var subnet: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * Describes a path component.
         */
        var transitGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The route in a transit gateway route table.
         */
        var transitGatewayRouteTableRoute: aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableRoute? = null
        /**
         * The component VPC.
         */
        var vpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PathComponent) : this() {
            this.aclRule = x.aclRule
            this.additionalDetails = x.additionalDetails
            this.attachedTo = x.attachedTo
            this.component = x.component
            this.destinationVpc = x.destinationVpc
            this.inboundHeader = x.inboundHeader
            this.outboundHeader = x.outboundHeader
            this.routeTableRoute = x.routeTableRoute
            this.securityGroupRule = x.securityGroupRule
            this.sequenceNumber = x.sequenceNumber
            this.sourceVpc = x.sourceVpc
            this.subnet = x.subnet
            this.transitGateway = x.transitGateway
            this.transitGatewayRouteTableRoute = x.transitGatewayRouteTableRoute
            this.vpc = x.vpc
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PathComponent = PathComponent(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisAclRule] inside the given [block]
         */
        fun aclRule(block: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule.Builder.() -> kotlin.Unit) {
            this.aclRule = aws.sdk.kotlin.services.ec2.model.AnalysisAclRule.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun attachedTo(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.attachedTo = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun component(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.component = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun destinationVpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.destinationVpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader] inside the given [block]
         */
        fun inboundHeader(block: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader.Builder.() -> kotlin.Unit) {
            this.inboundHeader = aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader] inside the given [block]
         */
        fun outboundHeader(block: aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader.Builder.() -> kotlin.Unit) {
            this.outboundHeader = aws.sdk.kotlin.services.ec2.model.AnalysisPacketHeader.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute] inside the given [block]
         */
        fun routeTableRoute(block: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute.Builder.() -> kotlin.Unit) {
            this.routeTableRoute = aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule] inside the given [block]
         */
        fun securityGroupRule(block: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule.Builder.() -> kotlin.Unit) {
            this.securityGroupRule = aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun sourceVpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.sourceVpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun subnet(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.subnet = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun transitGateway(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.transitGateway = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableRoute] inside the given [block]
         */
        fun transitGatewayRouteTableRoute(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableRoute.Builder.() -> kotlin.Unit) {
            this.transitGatewayRouteTableRoute = aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableRoute.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }
    }
}
