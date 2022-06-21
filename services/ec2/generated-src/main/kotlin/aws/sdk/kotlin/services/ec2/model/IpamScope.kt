// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope represents the IP space for a single network. The private scope is intended for all private IP address space. The public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple unconnected networks without causing IP address overlap or conflict.
 *
 * For more information, see [How IPAM works](/vpc/latest/ipam/how-it-works-ipam.html) in the *Amazon VPC IPAM User Guide*.
 */
class IpamScope private constructor(builder: Builder) {
    /**
     * The description of the scope.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ARN of the IPAM.
     */
    val ipamArn: kotlin.String? = builder.ipamArn
    /**
     * The Amazon Web Services Region of the IPAM scope.
     */
    val ipamRegion: kotlin.String? = builder.ipamRegion
    /**
     * The ARN of the scope.
     */
    val ipamScopeArn: kotlin.String? = builder.ipamScopeArn
    /**
     * The ID of the scope.
     */
    val ipamScopeId: kotlin.String? = builder.ipamScopeId
    /**
     * The type of the scope.
     */
    val ipamScopeType: aws.sdk.kotlin.services.ec2.model.IpamScopeType? = builder.ipamScopeType
    /**
     * Defines if the scope is the default scope or not.
     */
    val isDefault: kotlin.Boolean? = builder.isDefault
    /**
     * The Amazon Web Services account ID of the owner of the scope.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The number of pools in the scope.
     */
    val poolCount: kotlin.Int? = builder.poolCount
    /**
     * The state of the IPAM scope.
     */
    val state: aws.sdk.kotlin.services.ec2.model.IpamScopeState? = builder.state
    /**
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.IpamScope = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IpamScope(")
        append("description=$description,")
        append("ipamArn=$ipamArn,")
        append("ipamRegion=$ipamRegion,")
        append("ipamScopeArn=$ipamScopeArn,")
        append("ipamScopeId=$ipamScopeId,")
        append("ipamScopeType=$ipamScopeType,")
        append("isDefault=$isDefault,")
        append("ownerId=$ownerId,")
        append("poolCount=$poolCount,")
        append("state=$state,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (ipamArn?.hashCode() ?: 0)
        result = 31 * result + (ipamRegion?.hashCode() ?: 0)
        result = 31 * result + (ipamScopeArn?.hashCode() ?: 0)
        result = 31 * result + (ipamScopeId?.hashCode() ?: 0)
        result = 31 * result + (ipamScopeType?.hashCode() ?: 0)
        result = 31 * result + (isDefault?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (poolCount ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IpamScope

        if (description != other.description) return false
        if (ipamArn != other.ipamArn) return false
        if (ipamRegion != other.ipamRegion) return false
        if (ipamScopeArn != other.ipamScopeArn) return false
        if (ipamScopeId != other.ipamScopeId) return false
        if (ipamScopeType != other.ipamScopeType) return false
        if (isDefault != other.isDefault) return false
        if (ownerId != other.ownerId) return false
        if (poolCount != other.poolCount) return false
        if (state != other.state) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.IpamScope = Builder(this).apply(block).build()

    class Builder {
        /**
         * The description of the scope.
         */
        var description: kotlin.String? = null
        /**
         * The ARN of the IPAM.
         */
        var ipamArn: kotlin.String? = null
        /**
         * The Amazon Web Services Region of the IPAM scope.
         */
        var ipamRegion: kotlin.String? = null
        /**
         * The ARN of the scope.
         */
        var ipamScopeArn: kotlin.String? = null
        /**
         * The ID of the scope.
         */
        var ipamScopeId: kotlin.String? = null
        /**
         * The type of the scope.
         */
        var ipamScopeType: aws.sdk.kotlin.services.ec2.model.IpamScopeType? = null
        /**
         * Defines if the scope is the default scope or not.
         */
        var isDefault: kotlin.Boolean? = null
        /**
         * The Amazon Web Services account ID of the owner of the scope.
         */
        var ownerId: kotlin.String? = null
        /**
         * The number of pools in the scope.
         */
        var poolCount: kotlin.Int? = null
        /**
         * The state of the IPAM scope.
         */
        var state: aws.sdk.kotlin.services.ec2.model.IpamScopeState? = null
        /**
         * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.IpamScope) : this() {
            this.description = x.description
            this.ipamArn = x.ipamArn
            this.ipamRegion = x.ipamRegion
            this.ipamScopeArn = x.ipamScopeArn
            this.ipamScopeId = x.ipamScopeId
            this.ipamScopeType = x.ipamScopeType
            this.isDefault = x.isDefault
            this.ownerId = x.ownerId
            this.poolCount = x.poolCount
            this.state = x.state
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.IpamScope = IpamScope(this)
    }
}
