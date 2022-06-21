// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a launch template.
 */
class LaunchTemplate private constructor(builder: Builder) {
    /**
     * The time launch template was created.
     */
    val createTime: aws.smithy.kotlin.runtime.time.Instant? = builder.createTime
    /**
     * The principal that created the launch template.
     */
    val createdBy: kotlin.String? = builder.createdBy
    /**
     * The version number of the default version of the launch template.
     */
    val defaultVersionNumber: kotlin.Long? = builder.defaultVersionNumber
    /**
     * The version number of the latest version of the launch template.
     */
    val latestVersionNumber: kotlin.Long? = builder.latestVersionNumber
    /**
     * The ID of the launch template.
     */
    val launchTemplateId: kotlin.String? = builder.launchTemplateId
    /**
     * The name of the launch template.
     */
    val launchTemplateName: kotlin.String? = builder.launchTemplateName
    /**
     * The tags for the launch template.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplate = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplate(")
        append("createTime=$createTime,")
        append("createdBy=$createdBy,")
        append("defaultVersionNumber=$defaultVersionNumber,")
        append("latestVersionNumber=$latestVersionNumber,")
        append("launchTemplateId=$launchTemplateId,")
        append("launchTemplateName=$launchTemplateName,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = createTime?.hashCode() ?: 0
        result = 31 * result + (createdBy?.hashCode() ?: 0)
        result = 31 * result + (defaultVersionNumber?.hashCode() ?: 0)
        result = 31 * result + (latestVersionNumber?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateId?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateName?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplate

        if (createTime != other.createTime) return false
        if (createdBy != other.createdBy) return false
        if (defaultVersionNumber != other.defaultVersionNumber) return false
        if (latestVersionNumber != other.latestVersionNumber) return false
        if (launchTemplateId != other.launchTemplateId) return false
        if (launchTemplateName != other.launchTemplateName) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplate = Builder(this).apply(block).build()

    class Builder {
        /**
         * The time launch template was created.
         */
        var createTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The principal that created the launch template.
         */
        var createdBy: kotlin.String? = null
        /**
         * The version number of the default version of the launch template.
         */
        var defaultVersionNumber: kotlin.Long? = null
        /**
         * The version number of the latest version of the launch template.
         */
        var latestVersionNumber: kotlin.Long? = null
        /**
         * The ID of the launch template.
         */
        var launchTemplateId: kotlin.String? = null
        /**
         * The name of the launch template.
         */
        var launchTemplateName: kotlin.String? = null
        /**
         * The tags for the launch template.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplate) : this() {
            this.createTime = x.createTime
            this.createdBy = x.createdBy
            this.defaultVersionNumber = x.defaultVersionNumber
            this.latestVersionNumber = x.latestVersionNumber
            this.launchTemplateId = x.launchTemplateId
            this.launchTemplateName = x.launchTemplateName
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplate = LaunchTemplate(this)
    }
}
