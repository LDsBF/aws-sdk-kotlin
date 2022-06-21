// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeImportImageTasksRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Filter tasks using the `task-state` filter and one of the following values: `active`, `completed`, `deleting`, or `deleted`.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the import image tasks.
     */
    val importTaskIds: List<String>? = builder.importTaskIds
    /**
     * The maximum number of results to return in a single call.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * A token that indicates the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeImportImageTasksRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("importTaskIds=$importTaskIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (importTaskIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeImportImageTasksRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (importTaskIds != other.importTaskIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Filter tasks using the `task-state` filter and one of the following values: `active`, `completed`, `deleting`, or `deleted`.
         */
        var filters: List<Filter>? = null
        /**
         * The IDs of the import image tasks.
         */
        var importTaskIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call.
         */
        var maxResults: kotlin.Int? = null
        /**
         * A token that indicates the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.importTaskIds = x.importTaskIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksRequest = DescribeImportImageTasksRequest(this)
    }
}
