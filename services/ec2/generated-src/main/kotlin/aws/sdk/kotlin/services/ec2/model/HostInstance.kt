// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an instance running on a Dedicated Host.
 */
class HostInstance private constructor(builder: Builder) {
    /**
     * The ID of instance that is running on the Dedicated Host.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The instance type (for example, `m3.medium`) of the running instance.
     */
    val instanceType: kotlin.String? = builder.instanceType
    /**
     * The ID of the Amazon Web Services account that owns the instance.
     */
    val ownerId: kotlin.String? = builder.ownerId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.HostInstance = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("HostInstance(")
        append("instanceId=$instanceId,")
        append("instanceType=$instanceType,")
        append("ownerId=$ownerId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceId?.hashCode() ?: 0
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HostInstance

        if (instanceId != other.instanceId) return false
        if (instanceType != other.instanceType) return false
        if (ownerId != other.ownerId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.HostInstance = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of instance that is running on the Dedicated Host.
         */
        var instanceId: kotlin.String? = null
        /**
         * The instance type (for example, `m3.medium`) of the running instance.
         */
        var instanceType: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the instance.
         */
        var ownerId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.HostInstance) : this() {
            this.instanceId = x.instanceId
            this.instanceType = x.instanceType
            this.ownerId = x.ownerId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.HostInstance = HostInstance(this)
    }
}
