// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DescribeExportRequest private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) associated with the export.
     */
    val exportArn: kotlin.String? = builder.exportArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DescribeExportRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeExportRequest(")
        append("exportArn=$exportArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exportArn?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeExportRequest

        if (exportArn != other.exportArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DescribeExportRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) associated with the export.
         */
        var exportArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DescribeExportRequest) : this() {
            this.exportArn = x.exportArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DescribeExportRequest = DescribeExportRequest(this)
    }
}
