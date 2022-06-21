// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * An entry for a prefix list.
 */
class AddPrefixListEntry private constructor(builder: Builder) {
    /**
     * The CIDR block.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * A description for the entry.
     *
     * Constraints: Up to 255 characters in length.
     */
    val description: kotlin.String? = builder.description

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AddPrefixListEntry = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AddPrefixListEntry(")
        append("cidr=$cidr,")
        append("description=$description)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AddPrefixListEntry

        if (cidr != other.cidr) return false
        if (description != other.description) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AddPrefixListEntry = Builder(this).apply(block).build()

    class Builder {
        /**
         * The CIDR block.
         */
        var cidr: kotlin.String? = null
        /**
         * A description for the entry.
         *
         * Constraints: Up to 255 characters in length.
         */
        var description: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AddPrefixListEntry) : this() {
            this.cidr = x.cidr
            this.description = x.description
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AddPrefixListEntry = AddPrefixListEntry(this)
    }
}
