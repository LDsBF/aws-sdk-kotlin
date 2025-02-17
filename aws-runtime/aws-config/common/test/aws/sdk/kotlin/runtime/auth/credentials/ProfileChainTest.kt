/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.auth.credentials

import aws.sdk.kotlin.runtime.auth.credentials.profile.LeafProvider
import aws.sdk.kotlin.runtime.auth.credentials.profile.ProfileChain
import aws.sdk.kotlin.runtime.auth.credentials.profile.RoleArn
import aws.sdk.kotlin.runtime.config.profile.FileType
import aws.sdk.kotlin.runtime.config.profile.parse
import aws.smithy.kotlin.runtime.auth.awscredentials.Credentials
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class ProfileChainTest {

    private sealed class TestOutput {
        data class Chain(val chain: ProfileChain) : TestOutput()
        data class Error(val message: String) : TestOutput()
    }

    private class TestCase(
        val description: String,
        val profile: String,
        val output: TestOutput,
        val activeProfile: String = "A",
    )

    private fun chain(leaf: LeafProvider, vararg roles: RoleArn): TestOutput =
        TestOutput.Chain(ProfileChain(leaf, roles.toList()))

    private val tests = listOf(
        TestCase(
            "basic role arn backed by static credentials",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = B

            [profile B]
            aws_access_key_id = abc123
            aws_secret_access_key = def456
            """,
            chain(
                LeafProvider.AccessKey(Credentials("abc123", "def456")),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "ignore explicit credentials when source profile is specified",
            """
            [profile A]
            aws_access_key_id = abc123
            aws_secret_access_key = def456
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = B

            [profile B]
            aws_access_key_id = ghi890
            aws_secret_access_key = jkl123
            """,
            chain(
                LeafProvider.AccessKey(Credentials("ghi890", "jkl123")),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "load role_session_name for the AssumeRole provider",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            role_session_name = my_session_name
            source_profile = B

            [profile B]
            aws_access_key_id = abc123
            aws_secret_access_key = def456
            """,
            chain(
                LeafProvider.AccessKey(Credentials("abc123", "def456")),
                RoleArn("arn:aws:iam::123456789:role/RoleA", "my_session_name")
            )
        ),
        TestCase(
            "load external id for the AssumeRole provider",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            external_id = my_external_id
            source_profile = B

            [profile B]
            aws_access_key_id = abc123
            aws_secret_access_key = def456
            """,
            chain(
                LeafProvider.AccessKey(Credentials("abc123", "def456")),
                RoleArn("arn:aws:iam::123456789:role/RoleA", externalId = "my_external_id")
            )
        ),
        TestCase(
            "self referential profile (first load base creds, then use for the role)",
            """
            [profile A]
            aws_access_key_id = abc123
            aws_secret_access_key = def456
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = A
            """,
            chain(
                LeafProvider.AccessKey(Credentials("abc123", "def456")),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "Load credentials from a credential_source",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            credential_source = Ec2InstanceMetadata
            """,
            chain(
                LeafProvider.NamedSource("Ec2InstanceMetadata"),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "role_arn without source source_profile",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            """,
            TestOutput.Error("profile (A) must contain `source_profile` or `credential_source` but neither were defined")
        ),
        TestCase(
            "source profile and credential source both present",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            credential_source = Environment
            source_profile = B

            [profile B]
            aws_access_key_id = !23
            aws_secret_access_key = 456
            """,
            TestOutput.Error("profile (A) contained both `source_profile` and `credential_source`. Only one or the other can be defined.")
        ),
        TestCase(
            "partial credentials error (missing secret)",
            """
            [profile A]
            role_arn = arn:foo
            source_profile = B

            [profile B]
            aws_access_key_id = abc123
            """,
            TestOutput.Error("profile (B) missing `aws_secret_access_key`")
        ),
        TestCase(
            "partial credentials error (missing access key)",
            """
            [profile A]
            role_arn = arn:foo
            source_profile = B

            [profile B]
            aws_secret_access_key = abc123
            """,
            TestOutput.Error("profile (B) missing `aws_access_key_id`")
        ),
        TestCase(
            "missing credentials error (empty source profile)",
            """
            [profile A]
            role_arn = arn:foo
            source_profile = B

            [profile B]
            """,
            TestOutput.Error("profile (B) did not contain credential information")
        ),
        TestCase(
            "profile only contains configuration",
            """
            [profile A]
            ec2_metadata_service_endpoint_mode = IPv6
            """,
            TestOutput.Error("profile (A) did not contain credential information")
        ),
        TestCase(
            "missing source profile",
            """
            [profile A]
            role_arn = arn:foo
            source_profile = B
            """,
            TestOutput.Error("could not find source profile B referenced from A")
        ),
        TestCase(
            "multiple chained assume role profiles",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = B

            [profile B]
            role_arn = arn:aws:iam::123456789:role/RoleB
            source_profile = C

            [profile C]
            aws_access_key_id = mno456
            aws_secret_access_key = pqr789
            """,
            chain(
                LeafProvider.AccessKey(Credentials("mno456", "pqr789")),
                RoleArn("arn:aws:iam::123456789:role/RoleB"),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "chained assume role profiles with static credentials (ignore assume role when static credentials present)",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            aws_access_key_id = bug_if_returned
            aws_secret_access_key = bug_if_returned
            source_profile = B

            [profile B]
            role_arn = arn:aws:iam::123456789:role/RoleB
            source_profile = C
            aws_access_key_id = profile_b_key
            aws_secret_access_key = profile_b_secret

            [profile C]
            aws_access_key_id = bug_if_returned
            aws_secret_access_key = bug_if_returned
            """,
            chain(
                LeafProvider.AccessKey(Credentials("profile_b_key", "profile_b_secret")),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "assume role profile infinite loop",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = B

            [profile B]
            role_arn = arn:aws:iam::123456789:role/RoleB
            source_profile = A
            """,
            TestOutput.Error("profile formed an infinite loop: A -> B -> A")
        ),
        TestCase(
            "infinite loop with static credentials",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            aws_access_key_id = bug_if_returned
            aws_secret_access_key = bug_if_returned
            source_profile = B

            [profile B]
            role_arn = arn:aws:iam::123456789:role/RoleB
            source_profile = A
            """,
            TestOutput.Error("profile formed an infinite loop: A -> B -> A")
        ),
        TestCase(
            "web identity role",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            web_identity_token_file = /var/token.jwt
            """,
            chain(
                LeafProvider.WebIdentityTokenRole("arn:aws:iam::123456789:role/RoleA", "/var/token.jwt")
            )
        ),
        TestCase(
            "web identity role with session name",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            web_identity_token_file = /var/token.jwt
            role_session_name = some_session_name
            """,
            chain(
                LeafProvider.WebIdentityTokenRole("arn:aws:iam::123456789:role/RoleA", "/var/token.jwt", "some_session_name")
            )
        ),
        TestCase(
            "web identity missing role arn",
            """
            [profile A]
            web_identity_token_file = /var/token.jwt
            """,
            TestOutput.Error("profile (A) missing `role_arn`")
        ),
        TestCase(
            "web identity token as source profile",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            source_profile = B

            [profile B]
            role_arn = arn:aws:iam::123456789:role/RoleB
            web_identity_token_file = /var/token.jwt
            role_session_name = some_session_name
            """,
            chain(
                LeafProvider.WebIdentityTokenRole("arn:aws:iam::123456789:role/RoleB", "/var/token.jwt", "some_session_name"),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "single sign on",
            """
            [profile A]
            sso_start_url = https://d-92671207e4.awsapps.com/start
            sso_region = us-east-2
            sso_account_id = 1234567
            sso_role_name = RoleA
            """,
            chain(
                LeafProvider.Sso("https://d-92671207e4.awsapps.com/start", "us-east-2", "1234567", "RoleA")
            )
        ),
        TestCase(
            "single sign on as source profile",
            """
            [profile A]
            role_arn = arn:aws:iam::123456789:role/RoleA
            region = us-west-1
            source_profile = B
            
            [profile B]
            sso_start_url = https://d-92671207e4.awsapps.com/start
            sso_region = us-east-2
            sso_account_id = 1234567
            sso_role_name = RoleA
            """,
            chain(
                LeafProvider.Sso("https://d-92671207e4.awsapps.com/start", "us-east-2", "1234567", "RoleA"),
                RoleArn("arn:aws:iam::123456789:role/RoleA")
            )
        ),
        TestCase(
            "single sign on missing start url",
            """
            [profile A]
            sso_region = us-east-2
            sso_account_id = 1234567
            sso_role_name = RoleA
            """,
            TestOutput.Error("profile (A) missing `sso_start_url`")
        ),
        TestCase(
            "single sign on missing sso region",
            """
            [profile A]
            sso_start_url = https://d-92671207e4.awsapps.com/start
            sso_account_id = 1234567
            sso_role_name = RoleA
            """,
            TestOutput.Error("profile (A) missing `sso_region`")
        ),
        TestCase(
            "single sign on missing account id",
            """
            [profile A]
            sso_start_url = https://d-92671207e4.awsapps.com/start
            sso_region = us-east-2
            sso_role_name = RoleA
            """,
            TestOutput.Error("profile (A) missing `sso_account_id`")
        ),
        TestCase(
            "single sign on missing role name",
            """
            [profile A]
            sso_start_url = https://d-92671207e4.awsapps.com/start
            sso_region = us-east-2
            sso_account_id = 1234567
            """,
            TestOutput.Error("profile (A) missing `sso_role_name`")
        ),
    )

    @Test
    fun testProfileChainResolution() {

        tests.forEachIndexed { idx, test ->
            val profiles = parse(FileType.CONFIGURATION, test.profile.trimIndent())
            val result = runCatching { ProfileChain.resolve(profiles, test.activeProfile) }

            when {
                result.isFailure && test.output is TestOutput.Chain -> fail("[idx=$idx, desc=${test.description}]: expected success but chain failed to resolve: $result")
                result.isSuccess && test.output is TestOutput.Error -> fail("[idx=$idx, desc=${test.description}]: expected failure but chain resolved successfully: $result")
                result.isFailure && test.output is TestOutput.Error -> {
                    val ex = result.exceptionOrNull() ?: fail("[idx=$idx, desc=${test.description}]: expected exception")
                    assertEquals(test.output.message, ex.message, "[idx=$idx, desc=${test.description}]: expected exception")
                }
                else -> {
                    val actual = result.getOrThrow()
                    val expected = test.output as TestOutput.Chain
                    assertEquals(expected.chain, actual, "[idx=$idx, desc=${test.description}]: chains not equal")
                }
            }
        }
    }
}
