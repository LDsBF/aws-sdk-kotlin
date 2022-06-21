// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DeregisterImage.
 */
class DeregisterImageRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the AMI.
     */
    val imageId: kotlin.String? = builder.imageId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeregisterImageRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeregisterImageRequest(")
        append("dryRun=$dryRun,")
        append("imageId=$imageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (imageId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeregisterImageRequest

        if (dryRun != other.dryRun) return false
        if (imageId != other.imageId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeregisterImageRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the AMI.
         */
        var imageId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeregisterImageRequest) : this() {
            this.dryRun = x.dryRun
            this.imageId = x.imageId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeregisterImageRequest = DeregisterImageRequest(this)
    }
}
