// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will
 * identify instance types with these attributes.
 * When you specify multiple parameters, you get instance types that satisfy all of the
 * specified parameters. If you specify multiple values for a parameter, you get instance
 * types that satisfy any of the specified values.
 * You must specify VCpuCount and MemoryMiB. All other parameters
 * are optional. Any unspecified optional parameter is set to its default.
 * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html">Attribute-based instance type selection for EC2 Fleet, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html">Attribute-based instance type selection for Spot Fleet, and <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html">Spot
 * placement score in the Amazon EC2 User Guide.
 */
class InstanceRequirementsRequest private constructor(builder: Builder) {
    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     * an instance.
     * To exclude accelerator-enabled instance types, set Max to 0.
     * Default: No minimum or maximum limits
     */
    val acceleratorCount: aws.sdk.kotlin.services.ec2.model.AcceleratorCountRequest? = builder.acceleratorCount
    /**
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * For instance types with NVIDIA devices, specify nvidia.
     * For instance types with AMD devices, specify amd.
     * For instance types with Amazon Web Services devices, specify amazon-web-services.
     * For instance types with Xilinx devices, specify xilinx.
     * Default: Any manufacturer
     */
    val acceleratorManufacturers: List<AcceleratorManufacturer>? = builder.acceleratorManufacturers
    /**
     * The accelerators that must be on the instance type.
     * For instance types with NVIDIA A100 GPUs, specify a100.
     * For instance types with NVIDIA V100 GPUs, specify v100.
     * For instance types with NVIDIA K80 GPUs, specify k80.
     * For instance types with NVIDIA T4 GPUs, specify t4.
     * For instance types with NVIDIA M60 GPUs, specify m60.
     * For instance types with AMD Radeon Pro V520 GPUs, specify radeon-pro-v520.
     * For instance types with Xilinx VU9P FPGAs, specify  vu9p.
     * Default: Any accelerator
     */
    val acceleratorNames: List<AcceleratorName>? = builder.acceleratorNames
    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * Default: No minimum or maximum limits
     */
    val acceleratorTotalMemoryMib: aws.sdk.kotlin.services.ec2.model.AcceleratorTotalMemoryMiBRequest? = builder.acceleratorTotalMemoryMib
    /**
     * The accelerator types that must be on the instance type.
     * To include instance types with GPU hardware, specify gpu.
     * To include instance types with FPGA hardware, specify fpga.
     * To include instance types with inference hardware, specify inference.
     * Default: Any accelerator type
     */
    val acceleratorTypes: List<AcceleratorType>? = builder.acceleratorTypes
    /**
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * To include bare metal instance types, specify included.
     * To require only bare metal instance types, specify required.
     * To exclude bare metal instance types, specify excluded.
     * Default: excluded
     */
    val bareMetal: aws.sdk.kotlin.services.ec2.model.BareMetal? = builder.bareMetal
    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
     * EBS–optimized instances in the Amazon EC2 User Guide.
     * Default: No minimum or maximum limits
     */
    val baselineEbsBandwidthMbps: aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest? = builder.baselineEbsBandwidthMbps
    /**
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable performance instances.
     * To include burstable performance instance types, specify included.
     * To require only burstable performance instance types, specify required.
     * To exclude burstable performance instance types, specify excluded.
     * Default: excluded
     */
    val burstablePerformance: aws.sdk.kotlin.services.ec2.model.BurstablePerformance? = builder.burstablePerformance
    /**
     * The CPU manufacturers to include.
     * For instance types with Intel CPUs, specify intel.
     * For instance types with AMD CPUs, specify amd.
     * For instance types with Amazon Web Services CPUs, specify amazon-web-services.
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will
     * be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you
     * specify in your launch template.
     * Default: Any manufacturer
     */
    val cpuManufacturers: List<CpuManufacturer>? = builder.cpuManufacturers
    /**
     * The instance types to exclude. You can use strings with one or more wild cards, represented by
     * an asterisk (*), to exclude an instance family, type, size, or generation. The
     * following are examples: m5.8xlarge, c5*.*, m5a.*,
     * r*, *3*.
     * For example, if you specify c5*,Amazon EC2 will exclude the entire C5 instance
     * family, which includes all C5a and C5n instance types. If you specify
     * m5a.*, Amazon EC2 will exclude all the M5a instance types, but not the M5n
     * instance types.
     * Default: No excluded instance types
     */
    val excludedInstanceTypes: List<String>? = builder.excludedInstanceTypes
    /**
     * Indicates whether current or previous generation instance types are included. The
     * current generation instance types are recommended for use. Current generation instance types are
     * typically the latest two to three generations in each instance family. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types in the
     * Amazon EC2 User Guide.
     * For current generation instance types, specify current.
     * For previous generation instance types, specify previous.
     * Default: Current and previous generation instance types
     */
    val instanceGenerations: List<InstanceGeneration>? = builder.instanceGenerations
    /**
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more information,
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     * EC2 instance store in the Amazon EC2 User Guide.
     * To include instance types with instance store volumes, specify
     * included.
     * To require only instance types with instance store volumes, specify
     * required.
     * To exclude instance types with instance store volumes, specify
     * excluded.
     * Default: included
     */
    val localStorage: aws.sdk.kotlin.services.ec2.model.LocalStorage? = builder.localStorage
    /**
     * The type of local storage that is required.
     * For instance types with hard disk drive (HDD) storage, specify hdd.
     * For instance types with solid state drive (SDD) storage, specify sdd.
     * Default: hdd and sdd
     */
    val localStorageTypes: List<LocalStorageType>? = builder.localStorageTypes
    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * Default: No minimum or maximum limits
     */
    val memoryGiBPerVCpu: aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest? = builder.memoryGiBPerVCpu
    /**
     * The minimum and maximum amount of memory, in MiB.
     */
    val memoryMib: aws.sdk.kotlin.services.ec2.model.MemoryMiBRequest? = builder.memoryMib
    /**
     * The minimum and maximum number of network interfaces.
     * Default: No minimum or maximum limits
     */
    val networkInterfaceCount: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCountRequest? = builder.networkInterfaceCount
    /**
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage above the cheapest M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     * types priced above your threshold.
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * To turn off price protection, specify a high value, such as 999999.
     * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html">GetInstanceTypesFromInstanceRequirements.
     * Default: 20
     */
    val onDemandMaxPricePercentageOverLowestPrice: kotlin.Int? = builder.onDemandMaxPricePercentageOverLowestPrice
    /**
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores.
     * Default: false
     */
    val requireHibernateSupport: kotlin.Boolean? = builder.requireHibernateSupport
    /**
     * The price protection threshold for Spot Instance. This is the maximum you’ll pay for an Spot Instance,
     * expressed as a percentage above the cheapest M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     * types priced above your threshold.
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * To turn off price protection, specify a high value, such as 999999.
     * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html">GetInstanceTypesFromInstanceRequirements.
     * Default: 100
     */
    val spotMaxPricePercentageOverLowestPrice: kotlin.Int? = builder.spotMaxPricePercentageOverLowestPrice
    /**
     * The minimum and maximum amount of total local storage, in GB.
     * Default: No minimum or maximum limits
     */
    val totalLocalStorageGb: aws.sdk.kotlin.services.ec2.model.TotalLocalStorageGbRequest? = builder.totalLocalStorageGb
    /**
     * The minimum and maximum number of vCPUs.
     */
    val vCpuCount: aws.sdk.kotlin.services.ec2.model.VCpuCountRangeRequest? = builder.vCpuCount

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceRequirementsRequest(")
        append("acceleratorCount=$acceleratorCount,")
        append("acceleratorManufacturers=$acceleratorManufacturers,")
        append("acceleratorNames=$acceleratorNames,")
        append("acceleratorTotalMemoryMib=$acceleratorTotalMemoryMib,")
        append("acceleratorTypes=$acceleratorTypes,")
        append("bareMetal=$bareMetal,")
        append("baselineEbsBandwidthMbps=$baselineEbsBandwidthMbps,")
        append("burstablePerformance=$burstablePerformance,")
        append("cpuManufacturers=$cpuManufacturers,")
        append("excludedInstanceTypes=$excludedInstanceTypes,")
        append("instanceGenerations=$instanceGenerations,")
        append("localStorage=$localStorage,")
        append("localStorageTypes=$localStorageTypes,")
        append("memoryGiBPerVCpu=$memoryGiBPerVCpu,")
        append("memoryMib=$memoryMib,")
        append("networkInterfaceCount=$networkInterfaceCount,")
        append("onDemandMaxPricePercentageOverLowestPrice=$onDemandMaxPricePercentageOverLowestPrice,")
        append("requireHibernateSupport=$requireHibernateSupport,")
        append("spotMaxPricePercentageOverLowestPrice=$spotMaxPricePercentageOverLowestPrice,")
        append("totalLocalStorageGb=$totalLocalStorageGb,")
        append("vCpuCount=$vCpuCount)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceleratorCount?.hashCode() ?: 0
        result = 31 * result + (acceleratorManufacturers?.hashCode() ?: 0)
        result = 31 * result + (acceleratorNames?.hashCode() ?: 0)
        result = 31 * result + (acceleratorTotalMemoryMib?.hashCode() ?: 0)
        result = 31 * result + (acceleratorTypes?.hashCode() ?: 0)
        result = 31 * result + (bareMetal?.hashCode() ?: 0)
        result = 31 * result + (baselineEbsBandwidthMbps?.hashCode() ?: 0)
        result = 31 * result + (burstablePerformance?.hashCode() ?: 0)
        result = 31 * result + (cpuManufacturers?.hashCode() ?: 0)
        result = 31 * result + (excludedInstanceTypes?.hashCode() ?: 0)
        result = 31 * result + (instanceGenerations?.hashCode() ?: 0)
        result = 31 * result + (localStorage?.hashCode() ?: 0)
        result = 31 * result + (localStorageTypes?.hashCode() ?: 0)
        result = 31 * result + (memoryGiBPerVCpu?.hashCode() ?: 0)
        result = 31 * result + (memoryMib?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceCount?.hashCode() ?: 0)
        result = 31 * result + (onDemandMaxPricePercentageOverLowestPrice ?: 0)
        result = 31 * result + (requireHibernateSupport?.hashCode() ?: 0)
        result = 31 * result + (spotMaxPricePercentageOverLowestPrice ?: 0)
        result = 31 * result + (totalLocalStorageGb?.hashCode() ?: 0)
        result = 31 * result + (vCpuCount?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceRequirementsRequest

        if (acceleratorCount != other.acceleratorCount) return false
        if (acceleratorManufacturers != other.acceleratorManufacturers) return false
        if (acceleratorNames != other.acceleratorNames) return false
        if (acceleratorTotalMemoryMib != other.acceleratorTotalMemoryMib) return false
        if (acceleratorTypes != other.acceleratorTypes) return false
        if (bareMetal != other.bareMetal) return false
        if (baselineEbsBandwidthMbps != other.baselineEbsBandwidthMbps) return false
        if (burstablePerformance != other.burstablePerformance) return false
        if (cpuManufacturers != other.cpuManufacturers) return false
        if (excludedInstanceTypes != other.excludedInstanceTypes) return false
        if (instanceGenerations != other.instanceGenerations) return false
        if (localStorage != other.localStorage) return false
        if (localStorageTypes != other.localStorageTypes) return false
        if (memoryGiBPerVCpu != other.memoryGiBPerVCpu) return false
        if (memoryMib != other.memoryMib) return false
        if (networkInterfaceCount != other.networkInterfaceCount) return false
        if (onDemandMaxPricePercentageOverLowestPrice != other.onDemandMaxPricePercentageOverLowestPrice) return false
        if (requireHibernateSupport != other.requireHibernateSupport) return false
        if (spotMaxPricePercentageOverLowestPrice != other.spotMaxPricePercentageOverLowestPrice) return false
        if (totalLocalStorageGb != other.totalLocalStorageGb) return false
        if (vCpuCount != other.vCpuCount) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
         * an instance.
         * To exclude accelerator-enabled instance types, set Max to 0.
         * Default: No minimum or maximum limits
         */
        var acceleratorCount: aws.sdk.kotlin.services.ec2.model.AcceleratorCountRequest? = null
        /**
         * Indicates whether instance types must have accelerators by specific manufacturers.
         * For instance types with NVIDIA devices, specify nvidia.
         * For instance types with AMD devices, specify amd.
         * For instance types with Amazon Web Services devices, specify amazon-web-services.
         * For instance types with Xilinx devices, specify xilinx.
         * Default: Any manufacturer
         */
        var acceleratorManufacturers: List<AcceleratorManufacturer>? = null
        /**
         * The accelerators that must be on the instance type.
         * For instance types with NVIDIA A100 GPUs, specify a100.
         * For instance types with NVIDIA V100 GPUs, specify v100.
         * For instance types with NVIDIA K80 GPUs, specify k80.
         * For instance types with NVIDIA T4 GPUs, specify t4.
         * For instance types with NVIDIA M60 GPUs, specify m60.
         * For instance types with AMD Radeon Pro V520 GPUs, specify radeon-pro-v520.
         * For instance types with Xilinx VU9P FPGAs, specify  vu9p.
         * Default: Any accelerator
         */
        var acceleratorNames: List<AcceleratorName>? = null
        /**
         * The minimum and maximum amount of total accelerator memory, in MiB.
         * Default: No minimum or maximum limits
         */
        var acceleratorTotalMemoryMib: aws.sdk.kotlin.services.ec2.model.AcceleratorTotalMemoryMiBRequest? = null
        /**
         * The accelerator types that must be on the instance type.
         * To include instance types with GPU hardware, specify gpu.
         * To include instance types with FPGA hardware, specify fpga.
         * To include instance types with inference hardware, specify inference.
         * Default: Any accelerator type
         */
        var acceleratorTypes: List<AcceleratorType>? = null
        /**
         * Indicates whether bare metal instance types must be included, excluded, or required.
         * To include bare metal instance types, specify included.
         * To require only bare metal instance types, specify required.
         * To exclude bare metal instance types, specify excluded.
         * Default: excluded
         */
        var bareMetal: aws.sdk.kotlin.services.ec2.model.BareMetal? = null
        /**
         * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
         * EBS–optimized instances in the Amazon EC2 User Guide.
         * Default: No minimum or maximum limits
         */
        var baselineEbsBandwidthMbps: aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest? = null
        /**
         * Indicates whether burstable performance T instance types are included, excluded, or required. For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable performance instances.
         * To include burstable performance instance types, specify included.
         * To require only burstable performance instance types, specify required.
         * To exclude burstable performance instance types, specify excluded.
         * Default: excluded
         */
        var burstablePerformance: aws.sdk.kotlin.services.ec2.model.BurstablePerformance? = null
        /**
         * The CPU manufacturers to include.
         * For instance types with Intel CPUs, specify intel.
         * For instance types with AMD CPUs, specify amd.
         * For instance types with Amazon Web Services CPUs, specify amazon-web-services.
         * Don't confuse the CPU manufacturer with the CPU architecture. Instances will
         * be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you
         * specify in your launch template.
         * Default: Any manufacturer
         */
        var cpuManufacturers: List<CpuManufacturer>? = null
        /**
         * The instance types to exclude. You can use strings with one or more wild cards, represented by
         * an asterisk (*), to exclude an instance family, type, size, or generation. The
         * following are examples: m5.8xlarge, c5*.*, m5a.*,
         * r*, *3*.
         * For example, if you specify c5*,Amazon EC2 will exclude the entire C5 instance
         * family, which includes all C5a and C5n instance types. If you specify
         * m5a.*, Amazon EC2 will exclude all the M5a instance types, but not the M5n
         * instance types.
         * Default: No excluded instance types
         */
        var excludedInstanceTypes: List<String>? = null
        /**
         * Indicates whether current or previous generation instance types are included. The
         * current generation instance types are recommended for use. Current generation instance types are
         * typically the latest two to three generations in each instance family. For more
         * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types in the
         * Amazon EC2 User Guide.
         * For current generation instance types, specify current.
         * For previous generation instance types, specify previous.
         * Default: Current and previous generation instance types
         */
        var instanceGenerations: List<InstanceGeneration>? = null
        /**
         * Indicates whether instance types with instance store volumes are included, excluded, or required. For more information,
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
         * EC2 instance store in the Amazon EC2 User Guide.
         * To include instance types with instance store volumes, specify
         * included.
         * To require only instance types with instance store volumes, specify
         * required.
         * To exclude instance types with instance store volumes, specify
         * excluded.
         * Default: included
         */
        var localStorage: aws.sdk.kotlin.services.ec2.model.LocalStorage? = null
        /**
         * The type of local storage that is required.
         * For instance types with hard disk drive (HDD) storage, specify hdd.
         * For instance types with solid state drive (SDD) storage, specify sdd.
         * Default: hdd and sdd
         */
        var localStorageTypes: List<LocalStorageType>? = null
        /**
         * The minimum and maximum amount of memory per vCPU, in GiB.
         * Default: No minimum or maximum limits
         */
        var memoryGiBPerVCpu: aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest? = null
        /**
         * The minimum and maximum amount of memory, in MiB.
         */
        var memoryMib: aws.sdk.kotlin.services.ec2.model.MemoryMiBRequest? = null
        /**
         * The minimum and maximum number of network interfaces.
         * Default: No minimum or maximum limits
         */
        var networkInterfaceCount: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCountRequest? = null
        /**
         * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
         * expressed as a percentage above the cheapest M, C, or R instance type with your specified
         * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
         * types priced above your threshold.
         * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
         * To turn off price protection, specify a high value, such as 999999.
         * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html">GetInstanceTypesFromInstanceRequirements.
         * Default: 20
         */
        var onDemandMaxPricePercentageOverLowestPrice: kotlin.Int? = null
        /**
         * Indicates whether instance types must support hibernation for On-Demand Instances.
         * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores.
         * Default: false
         */
        var requireHibernateSupport: kotlin.Boolean? = null
        /**
         * The price protection threshold for Spot Instance. This is the maximum you’ll pay for an Spot Instance,
         * expressed as a percentage above the cheapest M, C, or R instance type with your specified
         * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
         * types priced above your threshold.
         * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
         * To turn off price protection, specify a high value, such as 999999.
         * This parameter is not supported for <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html">GetSpotPlacementScores and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html">GetInstanceTypesFromInstanceRequirements.
         * Default: 100
         */
        var spotMaxPricePercentageOverLowestPrice: kotlin.Int? = null
        /**
         * The minimum and maximum amount of total local storage, in GB.
         * Default: No minimum or maximum limits
         */
        var totalLocalStorageGb: aws.sdk.kotlin.services.ec2.model.TotalLocalStorageGbRequest? = null
        /**
         * The minimum and maximum number of vCPUs.
         */
        var vCpuCount: aws.sdk.kotlin.services.ec2.model.VCpuCountRangeRequest? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest) : this() {
            this.acceleratorCount = x.acceleratorCount
            this.acceleratorManufacturers = x.acceleratorManufacturers
            this.acceleratorNames = x.acceleratorNames
            this.acceleratorTotalMemoryMib = x.acceleratorTotalMemoryMib
            this.acceleratorTypes = x.acceleratorTypes
            this.bareMetal = x.bareMetal
            this.baselineEbsBandwidthMbps = x.baselineEbsBandwidthMbps
            this.burstablePerformance = x.burstablePerformance
            this.cpuManufacturers = x.cpuManufacturers
            this.excludedInstanceTypes = x.excludedInstanceTypes
            this.instanceGenerations = x.instanceGenerations
            this.localStorage = x.localStorage
            this.localStorageTypes = x.localStorageTypes
            this.memoryGiBPerVCpu = x.memoryGiBPerVCpu
            this.memoryMib = x.memoryMib
            this.networkInterfaceCount = x.networkInterfaceCount
            this.onDemandMaxPricePercentageOverLowestPrice = x.onDemandMaxPricePercentageOverLowestPrice
            this.requireHibernateSupport = x.requireHibernateSupport
            this.spotMaxPricePercentageOverLowestPrice = x.spotMaxPricePercentageOverLowestPrice
            this.totalLocalStorageGb = x.totalLocalStorageGb
            this.vCpuCount = x.vCpuCount
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest = InstanceRequirementsRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AcceleratorCountRequest] inside the given [block]
         */
        fun acceleratorCount(block: aws.sdk.kotlin.services.ec2.model.AcceleratorCountRequest.Builder.() -> kotlin.Unit) {
            this.acceleratorCount = aws.sdk.kotlin.services.ec2.model.AcceleratorCountRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AcceleratorTotalMemoryMiBRequest] inside the given [block]
         */
        fun acceleratorTotalMemoryMib(block: aws.sdk.kotlin.services.ec2.model.AcceleratorTotalMemoryMiBRequest.Builder.() -> kotlin.Unit) {
            this.acceleratorTotalMemoryMib = aws.sdk.kotlin.services.ec2.model.AcceleratorTotalMemoryMiBRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest] inside the given [block]
         */
        fun baselineEbsBandwidthMbps(block: aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest.Builder.() -> kotlin.Unit) {
            this.baselineEbsBandwidthMbps = aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest] inside the given [block]
         */
        fun memoryGiBPerVCpu(block: aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest.Builder.() -> kotlin.Unit) {
            this.memoryGiBPerVCpu = aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.MemoryMiBRequest] inside the given [block]
         */
        fun memoryMib(block: aws.sdk.kotlin.services.ec2.model.MemoryMiBRequest.Builder.() -> kotlin.Unit) {
            this.memoryMib = aws.sdk.kotlin.services.ec2.model.MemoryMiBRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCountRequest] inside the given [block]
         */
        fun networkInterfaceCount(block: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCountRequest.Builder.() -> kotlin.Unit) {
            this.networkInterfaceCount = aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCountRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TotalLocalStorageGbRequest] inside the given [block]
         */
        fun totalLocalStorageGb(block: aws.sdk.kotlin.services.ec2.model.TotalLocalStorageGbRequest.Builder.() -> kotlin.Unit) {
            this.totalLocalStorageGb = aws.sdk.kotlin.services.ec2.model.TotalLocalStorageGbRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VCpuCountRangeRequest] inside the given [block]
         */
        fun vCpuCount(block: aws.sdk.kotlin.services.ec2.model.VCpuCountRangeRequest.Builder.() -> kotlin.Unit) {
            this.vCpuCount = aws.sdk.kotlin.services.ec2.model.VCpuCountRangeRequest.invoke(block)
        }
    }
}
