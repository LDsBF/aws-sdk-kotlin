// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class EnableSerialConsoleAccessResponse private constructor(builder: Builder) {
    /**
     * If `true`, access to the EC2 serial console of all instances is enabled for your account. If `false`, access to the EC2 serial console of all instances is disabled for your account.
     */
    val serialConsoleAccessEnabled: kotlin.Boolean? = builder.serialConsoleAccessEnabled

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableSerialConsoleAccessResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableSerialConsoleAccessResponse(")
        append("serialConsoleAccessEnabled=$serialConsoleAccessEnabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = serialConsoleAccessEnabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableSerialConsoleAccessResponse

        if (serialConsoleAccessEnabled != other.serialConsoleAccessEnabled) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableSerialConsoleAccessResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * If `true`, access to the EC2 serial console of all instances is enabled for your account. If `false`, access to the EC2 serial console of all instances is disabled for your account.
         */
        var serialConsoleAccessEnabled: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableSerialConsoleAccessResponse) : this() {
            this.serialConsoleAccessEnabled = x.serialConsoleAccessEnabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableSerialConsoleAccessResponse = EnableSerialConsoleAccessResponse(this)
    }
}
