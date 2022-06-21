// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVolumesResponse private constructor(builder: Builder) {
    /**
     * The `NextToken` value to include in a future `DescribeVolumes` request. When the results of a `DescribeVolumes` request exceed `MaxResults`, this value can be used to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the volumes.
     */
    val volumes: List<Volume>? = builder.volumes

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVolumesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVolumesResponse(")
        append("nextToken=$nextToken,")
        append("volumes=$volumes)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (volumes?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVolumesResponse

        if (nextToken != other.nextToken) return false
        if (volumes != other.volumes) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVolumesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The `NextToken` value to include in a future `DescribeVolumes` request. When the results of a `DescribeVolumes` request exceed `MaxResults`, this value can be used to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the volumes.
         */
        var volumes: List<Volume>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVolumesResponse) : this() {
            this.nextToken = x.nextToken
            this.volumes = x.volumes
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVolumesResponse = DescribeVolumesResponse(this)
    }
}
