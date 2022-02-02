// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the result of the purchase.
 */
class Purchase private constructor(builder: Builder) {
    /**
     * The currency in which the UpfrontPrice and HourlyPrice
     * amounts are specified. At this time, the only supported currency is
     * USD.
     */
    val currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = builder.currencyCode
    /**
     * The duration of the reservation's term in seconds.
     */
    val duration: kotlin.Int? = builder.duration
    /**
     * The IDs of the Dedicated Hosts associated with the reservation.
     */
    val hostIdSet: List<String>? = builder.hostIdSet
    /**
     * The ID of the reservation.
     */
    val hostReservationId: kotlin.String? = builder.hostReservationId
    /**
     * The hourly price of the reservation per hour.
     */
    val hourlyPrice: kotlin.String? = builder.hourlyPrice
    /**
     * The instance family on the Dedicated Host that the reservation can be associated
     * with.
     */
    val instanceFamily: kotlin.String? = builder.instanceFamily
    /**
     * The payment option for the reservation.
     */
    val paymentOption: aws.sdk.kotlin.services.ec2.model.PaymentOption? = builder.paymentOption
    /**
     * The upfront price of the reservation.
     */
    val upfrontPrice: kotlin.String? = builder.upfrontPrice

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Purchase = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Purchase(")
        append("currencyCode=$currencyCode,")
        append("duration=$duration,")
        append("hostIdSet=$hostIdSet,")
        append("hostReservationId=$hostReservationId,")
        append("hourlyPrice=$hourlyPrice,")
        append("instanceFamily=$instanceFamily,")
        append("paymentOption=$paymentOption,")
        append("upfrontPrice=$upfrontPrice)")
    }

    override fun hashCode(): kotlin.Int {
        var result = currencyCode?.hashCode() ?: 0
        result = 31 * result + (duration ?: 0)
        result = 31 * result + (hostIdSet?.hashCode() ?: 0)
        result = 31 * result + (hostReservationId?.hashCode() ?: 0)
        result = 31 * result + (hourlyPrice?.hashCode() ?: 0)
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        result = 31 * result + (paymentOption?.hashCode() ?: 0)
        result = 31 * result + (upfrontPrice?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Purchase

        if (currencyCode != other.currencyCode) return false
        if (duration != other.duration) return false
        if (hostIdSet != other.hostIdSet) return false
        if (hostReservationId != other.hostReservationId) return false
        if (hourlyPrice != other.hourlyPrice) return false
        if (instanceFamily != other.instanceFamily) return false
        if (paymentOption != other.paymentOption) return false
        if (upfrontPrice != other.upfrontPrice) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Purchase = Builder(this).apply(block).build()

    class Builder {
        /**
         * The currency in which the UpfrontPrice and HourlyPrice
         * amounts are specified. At this time, the only supported currency is
         * USD.
         */
        var currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = null
        /**
         * The duration of the reservation's term in seconds.
         */
        var duration: kotlin.Int? = null
        /**
         * The IDs of the Dedicated Hosts associated with the reservation.
         */
        var hostIdSet: List<String>? = null
        /**
         * The ID of the reservation.
         */
        var hostReservationId: kotlin.String? = null
        /**
         * The hourly price of the reservation per hour.
         */
        var hourlyPrice: kotlin.String? = null
        /**
         * The instance family on the Dedicated Host that the reservation can be associated
         * with.
         */
        var instanceFamily: kotlin.String? = null
        /**
         * The payment option for the reservation.
         */
        var paymentOption: aws.sdk.kotlin.services.ec2.model.PaymentOption? = null
        /**
         * The upfront price of the reservation.
         */
        var upfrontPrice: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Purchase) : this() {
            this.currencyCode = x.currencyCode
            this.duration = x.duration
            this.hostIdSet = x.hostIdSet
            this.hostReservationId = x.hostReservationId
            this.hourlyPrice = x.hourlyPrice
            this.instanceFamily = x.instanceFamily
            this.paymentOption = x.paymentOption
            this.upfrontPrice = x.upfrontPrice
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Purchase = Purchase(this)
    }
}
