// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The minimum and maximum amount of memory per vCPU, in GiB.
 */
class MemoryGiBPerVCpu private constructor(builder: Builder) {
    /**
     * The maximum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no maximum limit.
     */
    val max: kotlin.Double? = builder.max
    /**
     * The minimum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no minimum limit.
     */
    val min: kotlin.Double? = builder.min

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpu = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("MemoryGiBPerVCpu(")
        append("max=$max,")
        append("min=$min)")
    }

    override fun hashCode(): kotlin.Int {
        var result = max?.hashCode() ?: 0
        result = 31 * result + (min?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as MemoryGiBPerVCpu

        if (max != other.max) return false
        if (min != other.min) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpu = Builder(this).apply(block).build()

    class Builder {
        /**
         * The maximum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no maximum limit.
         */
        var max: kotlin.Double? = null
        /**
         * The minimum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no minimum limit.
         */
        var min: kotlin.Double? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpu) : this() {
            this.max = x.max
            this.min = x.min
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpu = MemoryGiBPerVCpu(this)
    }
}
