// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RevokeSecurityGroupEgressResponse private constructor(builder: Builder) {
    /**
     * Returns `true` if the request succeeds; otherwise, returns an error.
     */
    val `return`: kotlin.Boolean? = builder.`return`
    /**
     * The outbound rules that were unknown to the service. In some cases, `unknownIpPermissionSet` might be in a different format from the request parameter.
     */
    val unknownIpPermissions: List<IpPermission>? = builder.unknownIpPermissions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RevokeSecurityGroupEgressResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RevokeSecurityGroupEgressResponse(")
        append("return=$`return`,")
        append("unknownIpPermissions=$unknownIpPermissions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = `return`?.hashCode() ?: 0
        result = 31 * result + (unknownIpPermissions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RevokeSecurityGroupEgressResponse

        if (`return` != other.`return`) return false
        if (unknownIpPermissions != other.unknownIpPermissions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RevokeSecurityGroupEgressResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Returns `true` if the request succeeds; otherwise, returns an error.
         */
        var `return`: kotlin.Boolean? = null
        /**
         * The outbound rules that were unknown to the service. In some cases, `unknownIpPermissionSet` might be in a different format from the request parameter.
         */
        var unknownIpPermissions: List<IpPermission>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RevokeSecurityGroupEgressResponse) : this() {
            this.`return` = x.`return`
            this.unknownIpPermissions = x.unknownIpPermissions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RevokeSecurityGroupEgressResponse = RevokeSecurityGroupEgressResponse(this)
    }
}
