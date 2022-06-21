// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIdentityIdFormatRequest private constructor(builder: Builder) {
    /**
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify `all` to modify the ID format for all IAM users, IAM roles, and the root user of the account.
     */
    val principalArn: kotlin.String? = builder.principalArn
    /**
     * The type of resource: `bundle` | `conversion-task` | `customer-gateway` | `dhcp-options` | `elastic-ip-allocation` | `elastic-ip-association` | `export-task` | `flow-log` | `image` | `import-task` | `internet-gateway` | `network-acl` | `network-acl-association` | `network-interface` | `network-interface-attachment` | `prefix-list` | `route-table` | `route-table-association` | `security-group` | `subnet` | `subnet-cidr-block-association` | `vpc` | `vpc-cidr-block-association` | `vpc-endpoint` | `vpc-peering-connection` | `vpn-connection` | `vpn-gateway`.
     *
     * Alternatively, use the `all-current` option to include all resource types that are currently within their opt-in period for longer IDs.
     */
    val resource: kotlin.String? = builder.resource
    /**
     * Indicates whether the resource should use longer IDs (17-character IDs)
     */
    val useLongIds: kotlin.Boolean? = builder.useLongIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIdentityIdFormatRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIdentityIdFormatRequest(")
        append("principalArn=$principalArn,")
        append("resource=$resource,")
        append("useLongIds=$useLongIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = principalArn?.hashCode() ?: 0
        result = 31 * result + (resource?.hashCode() ?: 0)
        result = 31 * result + (useLongIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIdentityIdFormatRequest

        if (principalArn != other.principalArn) return false
        if (resource != other.resource) return false
        if (useLongIds != other.useLongIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIdentityIdFormatRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify `all` to modify the ID format for all IAM users, IAM roles, and the root user of the account.
         */
        var principalArn: kotlin.String? = null
        /**
         * The type of resource: `bundle` | `conversion-task` | `customer-gateway` | `dhcp-options` | `elastic-ip-allocation` | `elastic-ip-association` | `export-task` | `flow-log` | `image` | `import-task` | `internet-gateway` | `network-acl` | `network-acl-association` | `network-interface` | `network-interface-attachment` | `prefix-list` | `route-table` | `route-table-association` | `security-group` | `subnet` | `subnet-cidr-block-association` | `vpc` | `vpc-cidr-block-association` | `vpc-endpoint` | `vpc-peering-connection` | `vpn-connection` | `vpn-gateway`.
         *
         * Alternatively, use the `all-current` option to include all resource types that are currently within their opt-in period for longer IDs.
         */
        var resource: kotlin.String? = null
        /**
         * Indicates whether the resource should use longer IDs (17-character IDs)
         */
        var useLongIds: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIdentityIdFormatRequest) : this() {
            this.principalArn = x.principalArn
            this.resource = x.resource
            this.useLongIds = x.useLongIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIdentityIdFormatRequest = ModifyIdentityIdFormatRequest(this)
    }
}
