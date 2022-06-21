// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyInstancePlacementRequest private constructor(builder: Builder) {
    /**
     * The affinity setting for the instance.
     */
    val affinity: aws.sdk.kotlin.services.ec2.model.Affinity? = builder.affinity
    /**
     * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of `default`. For cluster and partition placement groups, the instance must have a tenancy of `default` or `dedicated`.
     *
     * To remove an instance from a placement group, specify an empty string ("").
     */
    val groupName: kotlin.String? = builder.groupName
    /**
     * The ID of the Dedicated Host with which to associate the instance.
     */
    val hostId: kotlin.String? = builder.hostId
    /**
     * The ARN of the host resource group in which to place the instance.
     */
    val hostResourceGroupArn: kotlin.String? = builder.hostResourceGroupArn
    /**
     * The ID of the instance that you are modifying.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The number of the partition in which to place the instance. Valid only if the placement group strategy is set to `partition`.
     */
    val partitionNumber: kotlin.Int? = builder.partitionNumber
    /**
     * The tenancy for the instance.
     *
     * For T3 instances, you can't change the tenancy from `dedicated` to `host`, or from `host` to `dedicated`. Attempting to make one of these unsupported tenancy changes results in the `InvalidTenancy` error code.
     */
    val tenancy: aws.sdk.kotlin.services.ec2.model.HostTenancy? = builder.tenancy

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyInstancePlacementRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstancePlacementRequest(")
        append("affinity=$affinity,")
        append("groupName=$groupName,")
        append("hostId=$hostId,")
        append("hostResourceGroupArn=$hostResourceGroupArn,")
        append("instanceId=$instanceId,")
        append("partitionNumber=$partitionNumber,")
        append("tenancy=$tenancy)")
    }

    override fun hashCode(): kotlin.Int {
        var result = affinity?.hashCode() ?: 0
        result = 31 * result + (groupName?.hashCode() ?: 0)
        result = 31 * result + (hostId?.hashCode() ?: 0)
        result = 31 * result + (hostResourceGroupArn?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (partitionNumber ?: 0)
        result = 31 * result + (tenancy?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyInstancePlacementRequest

        if (affinity != other.affinity) return false
        if (groupName != other.groupName) return false
        if (hostId != other.hostId) return false
        if (hostResourceGroupArn != other.hostResourceGroupArn) return false
        if (instanceId != other.instanceId) return false
        if (partitionNumber != other.partitionNumber) return false
        if (tenancy != other.tenancy) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyInstancePlacementRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The affinity setting for the instance.
         */
        var affinity: aws.sdk.kotlin.services.ec2.model.Affinity? = null
        /**
         * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of `default`. For cluster and partition placement groups, the instance must have a tenancy of `default` or `dedicated`.
         *
         * To remove an instance from a placement group, specify an empty string ("").
         */
        var groupName: kotlin.String? = null
        /**
         * The ID of the Dedicated Host with which to associate the instance.
         */
        var hostId: kotlin.String? = null
        /**
         * The ARN of the host resource group in which to place the instance.
         */
        var hostResourceGroupArn: kotlin.String? = null
        /**
         * The ID of the instance that you are modifying.
         */
        var instanceId: kotlin.String? = null
        /**
         * The number of the partition in which to place the instance. Valid only if the placement group strategy is set to `partition`.
         */
        var partitionNumber: kotlin.Int? = null
        /**
         * The tenancy for the instance.
         *
         * For T3 instances, you can't change the tenancy from `dedicated` to `host`, or from `host` to `dedicated`. Attempting to make one of these unsupported tenancy changes results in the `InvalidTenancy` error code.
         */
        var tenancy: aws.sdk.kotlin.services.ec2.model.HostTenancy? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyInstancePlacementRequest) : this() {
            this.affinity = x.affinity
            this.groupName = x.groupName
            this.hostId = x.hostId
            this.hostResourceGroupArn = x.hostResourceGroupArn
            this.instanceId = x.instanceId
            this.partitionNumber = x.partitionNumber
            this.tenancy = x.tenancy
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyInstancePlacementRequest = ModifyInstancePlacementRequest(this)
    }
}
