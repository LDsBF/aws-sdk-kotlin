// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the properties of a Dedicated Host.
 */
class HostProperties private constructor(builder: Builder) {
    /**
     * The number of cores on the Dedicated Host.
     */
    val cores: kotlin.Int? = builder.cores
    /**
     * The instance family supported by the Dedicated Host. For example, `m5`.
     */
    val instanceFamily: kotlin.String? = builder.instanceFamily
    /**
     * The instance type supported by the Dedicated Host. For example, `m5.large`. If the host supports multiple instance types, no **instanceType** is returned.
     */
    val instanceType: kotlin.String? = builder.instanceType
    /**
     * The number of sockets on the Dedicated Host.
     */
    val sockets: kotlin.Int? = builder.sockets
    /**
     * The total number of vCPUs on the Dedicated Host.
     */
    val totalVCpus: kotlin.Int? = builder.totalVCpus

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.HostProperties = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("HostProperties(")
        append("cores=$cores,")
        append("instanceFamily=$instanceFamily,")
        append("instanceType=$instanceType,")
        append("sockets=$sockets,")
        append("totalVCpus=$totalVCpus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cores ?: 0
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (sockets ?: 0)
        result = 31 * result + (totalVCpus ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HostProperties

        if (cores != other.cores) return false
        if (instanceFamily != other.instanceFamily) return false
        if (instanceType != other.instanceType) return false
        if (sockets != other.sockets) return false
        if (totalVCpus != other.totalVCpus) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.HostProperties = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of cores on the Dedicated Host.
         */
        var cores: kotlin.Int? = null
        /**
         * The instance family supported by the Dedicated Host. For example, `m5`.
         */
        var instanceFamily: kotlin.String? = null
        /**
         * The instance type supported by the Dedicated Host. For example, `m5.large`. If the host supports multiple instance types, no **instanceType** is returned.
         */
        var instanceType: kotlin.String? = null
        /**
         * The number of sockets on the Dedicated Host.
         */
        var sockets: kotlin.Int? = null
        /**
         * The total number of vCPUs on the Dedicated Host.
         */
        var totalVCpus: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.HostProperties) : this() {
            this.cores = x.cores
            this.instanceFamily = x.instanceFamily
            this.instanceType = x.instanceType
            this.sockets = x.sockets
            this.totalVCpus = x.totalVCpus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.HostProperties = HostProperties(this)
    }
}
