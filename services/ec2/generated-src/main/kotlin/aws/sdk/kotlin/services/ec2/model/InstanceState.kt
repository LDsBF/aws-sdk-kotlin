// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the current state of an instance.
 */
class InstanceState private constructor(builder: Builder) {
    /**
     * The state of the instance as a 16-bit unsigned integer.
     *
     * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored.
     *
     * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
     *
     * The valid values for instance-state-code will all be in the range of the low byte and they are:
     * + `0` : `pending`
     * + `16` : `running`
     * + `32` : `shutting-down`
     * + `48` : `terminated`
     * + `64` : `stopping`
     * + `80` : `stopped`
     *
     * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
     */
    val code: kotlin.Int? = builder.code
    /**
     * The current state of the instance.
     */
    val name: aws.sdk.kotlin.services.ec2.model.InstanceStateName? = builder.name

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceState = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceState(")
        append("code=$code,")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceState

        if (code != other.code) return false
        if (name != other.name) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceState = Builder(this).apply(block).build()

    class Builder {
        /**
         * The state of the instance as a 16-bit unsigned integer.
         *
         * The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored.
         *
         * The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.
         *
         * The valid values for instance-state-code will all be in the range of the low byte and they are:
         * + `0` : `pending`
         * + `16` : `running`
         * + `32` : `shutting-down`
         * + `48` : `terminated`
         * + `64` : `stopping`
         * + `80` : `stopped`
         *
         * You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
         */
        var code: kotlin.Int? = null
        /**
         * The current state of the instance.
         */
        var name: aws.sdk.kotlin.services.ec2.model.InstanceStateName? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceState) : this() {
            this.code = x.code
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceState = InstanceState(this)
    }
}
