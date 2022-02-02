// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ImportInstanceRequest private constructor(builder: Builder) {
    /**
     * A description for the instance being imported.
     */
    val description: kotlin.String? = builder.description
    /**
     * The disk image.
     */
    val diskImages: List<DiskImage>? = builder.diskImages
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The launch specification.
     */
    val launchSpecification: aws.sdk.kotlin.services.ec2.model.ImportInstanceLaunchSpecification? = builder.launchSpecification
    /**
     * The instance operating system.
     */
    val platform: aws.sdk.kotlin.services.ec2.model.PlatformValues? = builder.platform

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportInstanceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportInstanceRequest(")
        append("description=$description,")
        append("diskImages=$diskImages,")
        append("dryRun=$dryRun,")
        append("launchSpecification=$launchSpecification,")
        append("platform=$platform)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (diskImages?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (launchSpecification?.hashCode() ?: 0)
        result = 31 * result + (platform?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportInstanceRequest

        if (description != other.description) return false
        if (diskImages != other.diskImages) return false
        if (dryRun != other.dryRun) return false
        if (launchSpecification != other.launchSpecification) return false
        if (platform != other.platform) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportInstanceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A description for the instance being imported.
         */
        var description: kotlin.String? = null
        /**
         * The disk image.
         */
        var diskImages: List<DiskImage>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The launch specification.
         */
        var launchSpecification: aws.sdk.kotlin.services.ec2.model.ImportInstanceLaunchSpecification? = null
        /**
         * The instance operating system.
         */
        var platform: aws.sdk.kotlin.services.ec2.model.PlatformValues? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportInstanceRequest) : this() {
            this.description = x.description
            this.diskImages = x.diskImages
            this.dryRun = x.dryRun
            this.launchSpecification = x.launchSpecification
            this.platform = x.platform
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportInstanceRequest = ImportInstanceRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ImportInstanceLaunchSpecification] inside the given [block]
         */
        fun launchSpecification(block: aws.sdk.kotlin.services.ec2.model.ImportInstanceLaunchSpecification.Builder.() -> kotlin.Unit) {
            this.launchSpecification = aws.sdk.kotlin.services.ec2.model.ImportInstanceLaunchSpecification.invoke(block)
        }
    }
}
