// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteInstanceEventWindowResponse private constructor(builder: Builder) {
    /**
     * The state of the event window.
     */
    val instanceEventWindowState: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowStateChange? = builder.instanceEventWindowState

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteInstanceEventWindowResponse(")
        append("instanceEventWindowState=$instanceEventWindowState)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceEventWindowState?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteInstanceEventWindowResponse

        if (instanceEventWindowState != other.instanceEventWindowState) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The state of the event window.
         */
        var instanceEventWindowState: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowStateChange? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowResponse) : this() {
            this.instanceEventWindowState = x.instanceEventWindowState
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowResponse = DeleteInstanceEventWindowResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceEventWindowStateChange] inside the given [block]
         */
        fun instanceEventWindowState(block: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowStateChange.Builder.() -> kotlin.Unit) {
            this.instanceEventWindowState = aws.sdk.kotlin.services.ec2.model.InstanceEventWindowStateChange.invoke(block)
        }
    }
}
