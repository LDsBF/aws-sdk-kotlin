// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIamInstanceProfileAssociationsResponse private constructor(builder: Builder) {
    /**
     * Information about the IAM instance profile associations.
     */
    val iamInstanceProfileAssociations: List<IamInstanceProfileAssociation>? = builder.iamInstanceProfileAssociations
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIamInstanceProfileAssociationsResponse(")
        append("iamInstanceProfileAssociations=$iamInstanceProfileAssociations,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = iamInstanceProfileAssociations?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeIamInstanceProfileAssociationsResponse

        if (iamInstanceProfileAssociations != other.iamInstanceProfileAssociations) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the IAM instance profile associations.
         */
        var iamInstanceProfileAssociations: List<IamInstanceProfileAssociation>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsResponse) : this() {
            this.iamInstanceProfileAssociations = x.iamInstanceProfileAssociations
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsResponse = DescribeIamInstanceProfileAssociationsResponse(this)
    }
}
