// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a packet header statement.
 */
class PacketHeaderStatementRequest private constructor(builder: Builder) {
    /**
     * The destination addresses.
     */
    val destinationAddresses: List<String>? = builder.destinationAddresses
    /**
     * The destination ports.
     */
    val destinationPorts: List<String>? = builder.destinationPorts
    /**
     * The destination prefix lists.
     */
    val destinationPrefixLists: List<String>? = builder.destinationPrefixLists
    /**
     * The protocols.
     */
    val protocols: List<Protocol>? = builder.protocols
    /**
     * The source addresses.
     */
    val sourceAddresses: List<String>? = builder.sourceAddresses
    /**
     * The source ports.
     */
    val sourcePorts: List<String>? = builder.sourcePorts
    /**
     * The source prefix lists.
     */
    val sourcePrefixLists: List<String>? = builder.sourcePrefixLists

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PacketHeaderStatementRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PacketHeaderStatementRequest(")
        append("destinationAddresses=$destinationAddresses,")
        append("destinationPorts=$destinationPorts,")
        append("destinationPrefixLists=$destinationPrefixLists,")
        append("protocols=$protocols,")
        append("sourceAddresses=$sourceAddresses,")
        append("sourcePorts=$sourcePorts,")
        append("sourcePrefixLists=$sourcePrefixLists)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationAddresses?.hashCode() ?: 0
        result = 31 * result + (destinationPorts?.hashCode() ?: 0)
        result = 31 * result + (destinationPrefixLists?.hashCode() ?: 0)
        result = 31 * result + (protocols?.hashCode() ?: 0)
        result = 31 * result + (sourceAddresses?.hashCode() ?: 0)
        result = 31 * result + (sourcePorts?.hashCode() ?: 0)
        result = 31 * result + (sourcePrefixLists?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PacketHeaderStatementRequest

        if (destinationAddresses != other.destinationAddresses) return false
        if (destinationPorts != other.destinationPorts) return false
        if (destinationPrefixLists != other.destinationPrefixLists) return false
        if (protocols != other.protocols) return false
        if (sourceAddresses != other.sourceAddresses) return false
        if (sourcePorts != other.sourcePorts) return false
        if (sourcePrefixLists != other.sourcePrefixLists) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PacketHeaderStatementRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The destination addresses.
         */
        var destinationAddresses: List<String>? = null
        /**
         * The destination ports.
         */
        var destinationPorts: List<String>? = null
        /**
         * The destination prefix lists.
         */
        var destinationPrefixLists: List<String>? = null
        /**
         * The protocols.
         */
        var protocols: List<Protocol>? = null
        /**
         * The source addresses.
         */
        var sourceAddresses: List<String>? = null
        /**
         * The source ports.
         */
        var sourcePorts: List<String>? = null
        /**
         * The source prefix lists.
         */
        var sourcePrefixLists: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PacketHeaderStatementRequest) : this() {
            this.destinationAddresses = x.destinationAddresses
            this.destinationPorts = x.destinationPorts
            this.destinationPrefixLists = x.destinationPrefixLists
            this.protocols = x.protocols
            this.sourceAddresses = x.sourceAddresses
            this.sourcePorts = x.sourcePorts
            this.sourcePrefixLists = x.sourcePrefixLists
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PacketHeaderStatementRequest = PacketHeaderStatementRequest(this)
    }
}
