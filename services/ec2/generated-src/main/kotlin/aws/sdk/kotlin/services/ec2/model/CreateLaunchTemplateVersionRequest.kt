// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateLaunchTemplateVersionRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     *
     * Constraint: Maximum 128 ASCII characters.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The information for the launch template.
     */
    val launchTemplateData: aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData? = builder.launchTemplateData
    /**
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
     */
    val launchTemplateId: kotlin.String? = builder.launchTemplateId
    /**
     * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
     */
    val launchTemplateName: kotlin.String? = builder.launchTemplateName
    /**
     * The version number of the launch template version on which to base the new version. The new version inherits the same launch parameters as the source version, except for parameters that you specify in `LaunchTemplateData`. Snapshots applied to the block device mapping are ignored when creating a new version unless they are explicitly included.
     */
    val sourceVersion: kotlin.String? = builder.sourceVersion
    /**
     * A description for the version of the launch template.
     */
    val versionDescription: kotlin.String? = builder.versionDescription

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateVersionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateLaunchTemplateVersionRequest(")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("launchTemplateData=$launchTemplateData,")
        append("launchTemplateId=$launchTemplateId,")
        append("launchTemplateName=$launchTemplateName,")
        append("sourceVersion=$sourceVersion,")
        append("versionDescription=$versionDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateData?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateId?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateName?.hashCode() ?: 0)
        result = 31 * result + (sourceVersion?.hashCode() ?: 0)
        result = 31 * result + (versionDescription?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateLaunchTemplateVersionRequest

        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (launchTemplateData != other.launchTemplateData) return false
        if (launchTemplateId != other.launchTemplateId) return false
        if (launchTemplateName != other.launchTemplateName) return false
        if (sourceVersion != other.sourceVersion) return false
        if (versionDescription != other.versionDescription) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateVersionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         *
         * Constraint: Maximum 128 ASCII characters.
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The information for the launch template.
         */
        var launchTemplateData: aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData? = null
        /**
         * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
         */
        var launchTemplateId: kotlin.String? = null
        /**
         * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
         */
        var launchTemplateName: kotlin.String? = null
        /**
         * The version number of the launch template version on which to base the new version. The new version inherits the same launch parameters as the source version, except for parameters that you specify in `LaunchTemplateData`. Snapshots applied to the block device mapping are ignored when creating a new version unless they are explicitly included.
         */
        var sourceVersion: kotlin.String? = null
        /**
         * A description for the version of the launch template.
         */
        var versionDescription: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateVersionRequest) : this() {
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.launchTemplateData = x.launchTemplateData
            this.launchTemplateId = x.launchTemplateId
            this.launchTemplateName = x.launchTemplateName
            this.sourceVersion = x.sourceVersion
            this.versionDescription = x.versionDescription
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateVersionRequest = CreateLaunchTemplateVersionRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData] inside the given [block]
         */
        fun launchTemplateData(block: aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData.Builder.() -> kotlin.Unit) {
            this.launchTemplateData = aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData.invoke(block)
        }
    }
}
