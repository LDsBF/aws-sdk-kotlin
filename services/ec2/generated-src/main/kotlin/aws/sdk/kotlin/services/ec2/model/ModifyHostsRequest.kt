// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyHostsRequest private constructor(builder: Builder) {
    /**
     * Specify whether to enable or disable auto-placement.
     */
    val autoPlacement: aws.sdk.kotlin.services.ec2.model.AutoPlacement? = builder.autoPlacement
    /**
     * The IDs of the Dedicated Hosts to modify.
     */
    val hostIds: List<String>? = builder.hostIds
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see [ Host recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in the *Amazon EC2 User Guide*.
     */
    val hostRecovery: aws.sdk.kotlin.services.ec2.model.HostRecovery? = builder.hostRecovery
    /**
     * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support multiple instance types within its current instance family.
     *
     * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify **InstanceType** instead. You cannot specify **InstanceFamily** and **InstanceType** in the same request.
     */
    val instanceFamily: kotlin.String? = builder.instanceFamily
    /**
     * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support only a specific instance type.
     *
     * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit this parameter and specify **InstanceFamily** instead. You cannot specify **InstanceType** and **InstanceFamily** in the same request.
     */
    val instanceType: kotlin.String? = builder.instanceType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyHostsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyHostsRequest(")
        append("autoPlacement=$autoPlacement,")
        append("hostIds=$hostIds,")
        append("hostRecovery=$hostRecovery,")
        append("instanceFamily=$instanceFamily,")
        append("instanceType=$instanceType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = autoPlacement?.hashCode() ?: 0
        result = 31 * result + (hostIds?.hashCode() ?: 0)
        result = 31 * result + (hostRecovery?.hashCode() ?: 0)
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyHostsRequest

        if (autoPlacement != other.autoPlacement) return false
        if (hostIds != other.hostIds) return false
        if (hostRecovery != other.hostRecovery) return false
        if (instanceFamily != other.instanceFamily) return false
        if (instanceType != other.instanceType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyHostsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specify whether to enable or disable auto-placement.
         */
        var autoPlacement: aws.sdk.kotlin.services.ec2.model.AutoPlacement? = null
        /**
         * The IDs of the Dedicated Hosts to modify.
         */
        var hostIds: List<String>? = null
        /**
         * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see [ Host recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in the *Amazon EC2 User Guide*.
         */
        var hostRecovery: aws.sdk.kotlin.services.ec2.model.HostRecovery? = null
        /**
         * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support multiple instance types within its current instance family.
         *
         * If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify **InstanceType** instead. You cannot specify **InstanceFamily** and **InstanceType** in the same request.
         */
        var instanceFamily: kotlin.String? = null
        /**
         * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support only a specific instance type.
         *
         * If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit this parameter and specify **InstanceFamily** instead. You cannot specify **InstanceType** and **InstanceFamily** in the same request.
         */
        var instanceType: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyHostsRequest) : this() {
            this.autoPlacement = x.autoPlacement
            this.hostIds = x.hostIds
            this.hostRecovery = x.hostRecovery
            this.instanceFamily = x.instanceFamily
            this.instanceType = x.instanceType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyHostsRequest = ModifyHostsRequest(this)
    }
}
