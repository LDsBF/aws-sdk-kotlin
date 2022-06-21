// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a running instance in a Spot Fleet.
 */
class ActiveInstance private constructor(builder: Builder) {
    /**
     * The health status of the instance. If the status of either the instance status check or the system status check is `impaired`, the health status of the instance is `unhealthy`. Otherwise, the health status is `healthy`.
     */
    val instanceHealth: aws.sdk.kotlin.services.ec2.model.InstanceHealthStatus? = builder.instanceHealth
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The instance type.
     */
    val instanceType: kotlin.String? = builder.instanceType
    /**
     * The ID of the Spot Instance request.
     */
    val spotInstanceRequestId: kotlin.String? = builder.spotInstanceRequestId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ActiveInstance = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ActiveInstance(")
        append("instanceHealth=$instanceHealth,")
        append("instanceId=$instanceId,")
        append("instanceType=$instanceType,")
        append("spotInstanceRequestId=$spotInstanceRequestId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceHealth?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (spotInstanceRequestId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ActiveInstance

        if (instanceHealth != other.instanceHealth) return false
        if (instanceId != other.instanceId) return false
        if (instanceType != other.instanceType) return false
        if (spotInstanceRequestId != other.spotInstanceRequestId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ActiveInstance = Builder(this).apply(block).build()

    class Builder {
        /**
         * The health status of the instance. If the status of either the instance status check or the system status check is `impaired`, the health status of the instance is `unhealthy`. Otherwise, the health status is `healthy`.
         */
        var instanceHealth: aws.sdk.kotlin.services.ec2.model.InstanceHealthStatus? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * The instance type.
         */
        var instanceType: kotlin.String? = null
        /**
         * The ID of the Spot Instance request.
         */
        var spotInstanceRequestId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ActiveInstance) : this() {
            this.instanceHealth = x.instanceHealth
            this.instanceId = x.instanceId
            this.instanceType = x.instanceType
            this.spotInstanceRequestId = x.spotInstanceRequestId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ActiveInstance = ActiveInstance(this)
    }
}
