// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DescribeContinuousBackupsRequest private constructor(builder: Builder) {
    /**
     * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DescribeContinuousBackupsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeContinuousBackupsRequest(")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tableName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeContinuousBackupsRequest

        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DescribeContinuousBackupsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DescribeContinuousBackupsRequest) : this() {
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DescribeContinuousBackupsRequest = DescribeContinuousBackupsRequest(this)
    }
}
