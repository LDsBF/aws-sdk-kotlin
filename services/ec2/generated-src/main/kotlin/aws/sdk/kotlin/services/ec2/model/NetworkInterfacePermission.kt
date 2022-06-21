// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a permission for a network interface.
 */
class NetworkInterfacePermission private constructor(builder: Builder) {
    /**
     * The Amazon Web Services account ID.
     */
    val awsAccountId: kotlin.String? = builder.awsAccountId
    /**
     * The Amazon Web Service.
     */
    val awsService: kotlin.String? = builder.awsService
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The ID of the network interface permission.
     */
    val networkInterfacePermissionId: kotlin.String? = builder.networkInterfacePermissionId
    /**
     * The type of permission.
     */
    val permission: aws.sdk.kotlin.services.ec2.model.InterfacePermissionType? = builder.permission
    /**
     * Information about the state of the permission.
     */
    val permissionState: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionState? = builder.permissionState

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NetworkInterfacePermission(")
        append("awsAccountId=$awsAccountId,")
        append("awsService=$awsService,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("networkInterfacePermissionId=$networkInterfacePermissionId,")
        append("permission=$permission,")
        append("permissionState=$permissionState)")
    }

    override fun hashCode(): kotlin.Int {
        var result = awsAccountId?.hashCode() ?: 0
        result = 31 * result + (awsService?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (networkInterfacePermissionId?.hashCode() ?: 0)
        result = 31 * result + (permission?.hashCode() ?: 0)
        result = 31 * result + (permissionState?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NetworkInterfacePermission

        if (awsAccountId != other.awsAccountId) return false
        if (awsService != other.awsService) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (networkInterfacePermissionId != other.networkInterfacePermissionId) return false
        if (permission != other.permission) return false
        if (permissionState != other.permissionState) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Web Services account ID.
         */
        var awsAccountId: kotlin.String? = null
        /**
         * The Amazon Web Service.
         */
        var awsService: kotlin.String? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The ID of the network interface permission.
         */
        var networkInterfacePermissionId: kotlin.String? = null
        /**
         * The type of permission.
         */
        var permission: aws.sdk.kotlin.services.ec2.model.InterfacePermissionType? = null
        /**
         * Information about the state of the permission.
         */
        var permissionState: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionState? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission) : this() {
            this.awsAccountId = x.awsAccountId
            this.awsService = x.awsService
            this.networkInterfaceId = x.networkInterfaceId
            this.networkInterfacePermissionId = x.networkInterfacePermissionId
            this.permission = x.permission
            this.permissionState = x.permissionState
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission = NetworkInterfacePermission(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionState] inside the given [block]
         */
        fun permissionState(block: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionState.Builder.() -> kotlin.Unit) {
            this.permissionState = aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionState.invoke(block)
        }
    }
}
