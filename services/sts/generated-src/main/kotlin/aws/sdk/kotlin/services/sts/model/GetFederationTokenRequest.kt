// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



class GetFederationTokenRequest private constructor(builder: Builder) {
    /**
     * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using Amazon Web Services account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour.
     */
    val durationSeconds: kotlin.Int? = builder.durationSeconds
    /**
     * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as `Bob`). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy.
     *
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     */
    val name: kotlin.String? = builder.name
    /**
     * An IAM policy in JSON format that you want to use as an inline session policy.
     *
     * You must pass an inline or managed [session policy](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies.
     *
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.
     *
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see [Session Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) in the *IAM User Guide*.
     *
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the `Principal` element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.
     *
     * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\u0020 through \u00FF). It can also include the tab (\u0009), linefeed (\u000A), and carriage return (\u000D) characters.
     *
     * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
     */
    val policy: kotlin.String? = builder.policy
    /**
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access.
     *
     * You must pass an inline or managed [session policy](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see [Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the Amazon Web Services General Reference.
     *
     * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.
     *
     * When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see [Session Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) in the *IAM User Guide*.
     *
     * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the `Principal` element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.
     *
     * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
     */
    val policyArns: List<PolicyDescriptorType>? = builder.policyArns
    /**
     * A list of session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see [Passing Session Tags in STS](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html) in the *IAM User Guide*.
     *
     * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see [IAM and STS Character Limits](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length) in the *IAM User Guide*.
     *
     * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
     *
     * You can pass a session tag with the same key as a tag that is already attached to the user you are federating. When you do, session tags override a user tag with the same key.
     *
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate `Department` and `department` tag keys. Assume that the role has the `Department`=`Marketing` tag and you pass the `department`=`engineering` session tag. `Department` and `department` are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.GetFederationTokenRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetFederationTokenRequest(")
        append("durationSeconds=$durationSeconds,")
        append("name=$name,")
        append("policy=$policy,")
        append("policyArns=$policyArns,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = durationSeconds ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (policy?.hashCode() ?: 0)
        result = 31 * result + (policyArns?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetFederationTokenRequest

        if (durationSeconds != other.durationSeconds) return false
        if (name != other.name) return false
        if (policy != other.policy) return false
        if (policyArns != other.policyArns) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.GetFederationTokenRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using Amazon Web Services account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour.
         */
        var durationSeconds: kotlin.Int? = null
        /**
         * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as `Bob`). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy.
         *
         * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
         */
        var name: kotlin.String? = null
        /**
         * An IAM policy in JSON format that you want to use as an inline session policy.
         *
         * You must pass an inline or managed [session policy](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies.
         *
         * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.
         *
         * When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see [Session Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) in the *IAM User Guide*.
         *
         * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the `Principal` element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.
         *
         * The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\u0020 through \u00FF). It can also include the tab (\u0009), linefeed (\u000A), and carriage return (\u000D) characters.
         *
         * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
         */
        var policy: kotlin.String? = null
        /**
         * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access.
         *
         * You must pass an inline or managed [session policy](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see [Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the Amazon Web Services General Reference.
         *
         * This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.
         *
         * When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see [Session Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session) in the *IAM User Guide*.
         *
         * The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the `Principal` element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.
         *
         * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
         */
        var policyArns: List<PolicyDescriptorType>? = null
        /**
         * A list of session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see [Passing Session Tags in STS](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html) in the *IAM User Guide*.
         *
         * This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see [IAM and STS Character Limits](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length) in the *IAM User Guide*.
         *
         * An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The `PackedPolicySize` response element indicates by percentage how close the policies and tags for your request are to the upper size limit.
         *
         * You can pass a session tag with the same key as a tag that is already attached to the user you are federating. When you do, session tags override a user tag with the same key.
         *
         * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate `Department` and `department` tag keys. Assume that the role has the `Department`=`Marketing` tag and you pass the `department`=`engineering` session tag. `Department` and `department` are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.GetFederationTokenRequest) : this() {
            this.durationSeconds = x.durationSeconds
            this.name = x.name
            this.policy = x.policy
            this.policyArns = x.policyArns
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.GetFederationTokenRequest = GetFederationTokenRequest(this)
    }
}
