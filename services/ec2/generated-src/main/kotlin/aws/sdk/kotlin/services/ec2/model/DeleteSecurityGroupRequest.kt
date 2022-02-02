// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteSecurityGroupRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the security group. Required for a nondefault VPC.
     */
    val groupId: kotlin.String? = builder.groupId
    /**
     * &#91;EC2-Classic, default VPC&#93; The name of the security group. You can specify either the security group name or the security group ID.
     */
    val groupName: kotlin.String? = builder.groupName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteSecurityGroupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteSecurityGroupRequest(")
        append("dryRun=$dryRun,")
        append("groupId=$groupId,")
        append("groupName=$groupName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groupId?.hashCode() ?: 0)
        result = 31 * result + (groupName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteSecurityGroupRequest

        if (dryRun != other.dryRun) return false
        if (groupId != other.groupId) return false
        if (groupName != other.groupName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteSecurityGroupRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the security group. Required for a nondefault VPC.
         */
        var groupId: kotlin.String? = null
        /**
         * &#91;EC2-Classic, default VPC&#93; The name of the security group. You can specify either the security group name or the security group ID.
         */
        var groupName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteSecurityGroupRequest) : this() {
            this.dryRun = x.dryRun
            this.groupId = x.groupId
            this.groupName = x.groupName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteSecurityGroupRequest = DeleteSecurityGroupRequest(this)
    }
}
