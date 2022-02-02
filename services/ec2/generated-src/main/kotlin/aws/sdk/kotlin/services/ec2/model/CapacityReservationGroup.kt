// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a resource group to which a Capacity Reservation has been added.
 */
class CapacityReservationGroup private constructor(builder: Builder) {
    /**
     * The ARN of the resource group.
     */
    val groupArn: kotlin.String? = builder.groupArn
    /**
     * The ID of the Amazon Web Services account that owns the resource group.
     */
    val ownerId: kotlin.String? = builder.ownerId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CapacityReservationGroup = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CapacityReservationGroup(")
        append("groupArn=$groupArn,")
        append("ownerId=$ownerId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groupArn?.hashCode() ?: 0
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CapacityReservationGroup

        if (groupArn != other.groupArn) return false
        if (ownerId != other.ownerId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CapacityReservationGroup = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the resource group.
         */
        var groupArn: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the resource group.
         */
        var ownerId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CapacityReservationGroup) : this() {
            this.groupArn = x.groupArn
            this.ownerId = x.ownerId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CapacityReservationGroup = CapacityReservationGroup(this)
    }
}
