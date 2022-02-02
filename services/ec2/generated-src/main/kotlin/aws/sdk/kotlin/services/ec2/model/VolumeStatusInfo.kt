// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the status of a volume.
 */
class VolumeStatusInfo private constructor(builder: Builder) {
    /**
     * The details of the volume status.
     */
    val details: List<VolumeStatusDetails>? = builder.details
    /**
     * The status of the volume.
     */
    val status: aws.sdk.kotlin.services.ec2.model.VolumeStatusInfoStatus? = builder.status

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VolumeStatusInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VolumeStatusInfo(")
        append("details=$details,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = details?.hashCode() ?: 0
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VolumeStatusInfo

        if (details != other.details) return false
        if (status != other.status) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VolumeStatusInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The details of the volume status.
         */
        var details: List<VolumeStatusDetails>? = null
        /**
         * The status of the volume.
         */
        var status: aws.sdk.kotlin.services.ec2.model.VolumeStatusInfoStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VolumeStatusInfo) : this() {
            this.details = x.details
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VolumeStatusInfo = VolumeStatusInfo(this)
    }
}
