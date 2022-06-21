// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpcEndpointServicePermissionsRequest private constructor(builder: Builder) {
    /**
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*).
     */
    val addAllowedPrincipals: List<String>? = builder.addAllowedPrincipals
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
     */
    val removeAllowedPrincipals: List<String>? = builder.removeAllowedPrincipals
    /**
     * The ID of the service.
     */
    val serviceId: kotlin.String? = builder.serviceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpcEndpointServicePermissionsRequest(")
        append("addAllowedPrincipals=$addAllowedPrincipals,")
        append("dryRun=$dryRun,")
        append("removeAllowedPrincipals=$removeAllowedPrincipals,")
        append("serviceId=$serviceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addAllowedPrincipals?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (removeAllowedPrincipals?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpcEndpointServicePermissionsRequest

        if (addAllowedPrincipals != other.addAllowedPrincipals) return false
        if (dryRun != other.dryRun) return false
        if (removeAllowedPrincipals != other.removeAllowedPrincipals) return false
        if (serviceId != other.serviceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*).
         */
        var addAllowedPrincipals: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
         */
        var removeAllowedPrincipals: List<String>? = null
        /**
         * The ID of the service.
         */
        var serviceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest) : this() {
            this.addAllowedPrincipals = x.addAllowedPrincipals
            this.dryRun = x.dryRun
            this.removeAllowedPrincipals = x.removeAllowedPrincipals
            this.serviceId = x.serviceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest = ModifyVpcEndpointServicePermissionsRequest(this)
    }
}
