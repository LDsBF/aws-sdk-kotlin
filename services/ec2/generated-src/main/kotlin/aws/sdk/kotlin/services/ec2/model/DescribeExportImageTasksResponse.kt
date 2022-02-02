// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeExportImageTasksResponse private constructor(builder: Builder) {
    /**
     * Information about the export image tasks.
     */
    val exportImageTasks: List<ExportImageTask>? = builder.exportImageTasks
    /**
     * The token to use to get the next page of results. This value is null when there are no more results
     * to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeExportImageTasksResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeExportImageTasksResponse(")
        append("exportImageTasks=$exportImageTasks,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exportImageTasks?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeExportImageTasksResponse

        if (exportImageTasks != other.exportImageTasks) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeExportImageTasksResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the export image tasks.
         */
        var exportImageTasks: List<ExportImageTask>? = null
        /**
         * The token to use to get the next page of results. This value is null when there are no more results
         * to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeExportImageTasksResponse) : this() {
            this.exportImageTasks = x.exportImageTasks
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeExportImageTasksResponse = DescribeExportImageTasksResponse(this)
    }
}
