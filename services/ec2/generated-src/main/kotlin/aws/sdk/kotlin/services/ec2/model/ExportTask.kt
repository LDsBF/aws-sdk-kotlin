// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an export instance task.
 */
class ExportTask private constructor(builder: Builder) {
    /**
     * A description of the resource being exported.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ID of the export task.
     */
    val exportTaskId: kotlin.String? = builder.exportTaskId
    /**
     * Information about the export task.
     */
    val exportToS3Task: aws.sdk.kotlin.services.ec2.model.ExportToS3Task? = builder.exportToS3Task
    /**
     * Information about the instance to export.
     */
    val instanceExportDetails: aws.sdk.kotlin.services.ec2.model.InstanceExportDetails? = builder.instanceExportDetails
    /**
     * The state of the export task.
     */
    val state: aws.sdk.kotlin.services.ec2.model.ExportTaskState? = builder.state
    /**
     * The status message related to the export task.
     */
    val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * The tags for the export task.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportTask = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportTask(")
        append("description=$description,")
        append("exportTaskId=$exportTaskId,")
        append("exportToS3Task=$exportToS3Task,")
        append("instanceExportDetails=$instanceExportDetails,")
        append("state=$state,")
        append("statusMessage=$statusMessage,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (exportTaskId?.hashCode() ?: 0)
        result = 31 * result + (exportToS3Task?.hashCode() ?: 0)
        result = 31 * result + (instanceExportDetails?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportTask

        if (description != other.description) return false
        if (exportTaskId != other.exportTaskId) return false
        if (exportToS3Task != other.exportToS3Task) return false
        if (instanceExportDetails != other.instanceExportDetails) return false
        if (state != other.state) return false
        if (statusMessage != other.statusMessage) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportTask = Builder(this).apply(block).build()

    class Builder {
        /**
         * A description of the resource being exported.
         */
        var description: kotlin.String? = null
        /**
         * The ID of the export task.
         */
        var exportTaskId: kotlin.String? = null
        /**
         * Information about the export task.
         */
        var exportToS3Task: aws.sdk.kotlin.services.ec2.model.ExportToS3Task? = null
        /**
         * Information about the instance to export.
         */
        var instanceExportDetails: aws.sdk.kotlin.services.ec2.model.InstanceExportDetails? = null
        /**
         * The state of the export task.
         */
        var state: aws.sdk.kotlin.services.ec2.model.ExportTaskState? = null
        /**
         * The status message related to the export task.
         */
        var statusMessage: kotlin.String? = null
        /**
         * The tags for the export task.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportTask) : this() {
            this.description = x.description
            this.exportTaskId = x.exportTaskId
            this.exportToS3Task = x.exportToS3Task
            this.instanceExportDetails = x.instanceExportDetails
            this.state = x.state
            this.statusMessage = x.statusMessage
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportTask = ExportTask(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ExportToS3Task] inside the given [block]
         */
        fun exportToS3Task(block: aws.sdk.kotlin.services.ec2.model.ExportToS3Task.Builder.() -> kotlin.Unit) {
            this.exportToS3Task = aws.sdk.kotlin.services.ec2.model.ExportToS3Task.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceExportDetails] inside the given [block]
         */
        fun instanceExportDetails(block: aws.sdk.kotlin.services.ec2.model.InstanceExportDetails.Builder.() -> kotlin.Unit) {
            this.instanceExportDetails = aws.sdk.kotlin.services.ec2.model.InstanceExportDetails.invoke(block)
        }
    }
}
