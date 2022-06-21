// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the optimized EBS performance for supported instance types.
 */
class EbsOptimizedInfo private constructor(builder: Builder) {
    /**
     * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
     */
    val baselineBandwidthInMbps: kotlin.Int? = builder.baselineBandwidthInMbps
    /**
     * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
     */
    val baselineIops: kotlin.Int? = builder.baselineIops
    /**
     * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
     */
    val baselineThroughputInMBps: kotlin.Double? = builder.baselineThroughputInMBps
    /**
     * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
     */
    val maximumBandwidthInMbps: kotlin.Int? = builder.maximumBandwidthInMbps
    /**
     * The maximum input/output storage operations per second for an EBS-optimized instance type.
     */
    val maximumIops: kotlin.Int? = builder.maximumIops
    /**
     * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
     */
    val maximumThroughputInMBps: kotlin.Double? = builder.maximumThroughputInMBps

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EbsOptimizedInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EbsOptimizedInfo(")
        append("baselineBandwidthInMbps=$baselineBandwidthInMbps,")
        append("baselineIops=$baselineIops,")
        append("baselineThroughputInMBps=$baselineThroughputInMBps,")
        append("maximumBandwidthInMbps=$maximumBandwidthInMbps,")
        append("maximumIops=$maximumIops,")
        append("maximumThroughputInMBps=$maximumThroughputInMBps)")
    }

    override fun hashCode(): kotlin.Int {
        var result = baselineBandwidthInMbps ?: 0
        result = 31 * result + (baselineIops ?: 0)
        result = 31 * result + (baselineThroughputInMBps?.hashCode() ?: 0)
        result = 31 * result + (maximumBandwidthInMbps ?: 0)
        result = 31 * result + (maximumIops ?: 0)
        result = 31 * result + (maximumThroughputInMBps?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EbsOptimizedInfo

        if (baselineBandwidthInMbps != other.baselineBandwidthInMbps) return false
        if (baselineIops != other.baselineIops) return false
        if (baselineThroughputInMBps != other.baselineThroughputInMBps) return false
        if (maximumBandwidthInMbps != other.maximumBandwidthInMbps) return false
        if (maximumIops != other.maximumIops) return false
        if (maximumThroughputInMBps != other.maximumThroughputInMBps) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EbsOptimizedInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
         */
        var baselineBandwidthInMbps: kotlin.Int? = null
        /**
         * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
         */
        var baselineIops: kotlin.Int? = null
        /**
         * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
         */
        var baselineThroughputInMBps: kotlin.Double? = null
        /**
         * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
         */
        var maximumBandwidthInMbps: kotlin.Int? = null
        /**
         * The maximum input/output storage operations per second for an EBS-optimized instance type.
         */
        var maximumIops: kotlin.Int? = null
        /**
         * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
         */
        var maximumThroughputInMBps: kotlin.Double? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EbsOptimizedInfo) : this() {
            this.baselineBandwidthInMbps = x.baselineBandwidthInMbps
            this.baselineIops = x.baselineIops
            this.baselineThroughputInMBps = x.baselineThroughputInMBps
            this.maximumBandwidthInMbps = x.maximumBandwidthInMbps
            this.maximumIops = x.maximumIops
            this.maximumThroughputInMBps = x.maximumThroughputInMBps
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EbsOptimizedInfo = EbsOptimizedInfo(this)
    }
}
