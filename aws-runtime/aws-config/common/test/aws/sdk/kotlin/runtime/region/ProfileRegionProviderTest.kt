/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.region

import aws.sdk.kotlin.runtime.testing.TestPlatformProvider
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class ProfileRegionProviderTest {
    @Test
    fun testSuccessDefaultProfile() = runTest {
        val platform = TestPlatformProvider(
            env = mapOf(
                "AWS_CONFIG_FILE" to "config"
            ),
            fs = mapOf(
                "config" to "[default]\nregion = us-east-2"
            )
        )

        val provider = ProfileRegionProvider(platform)
        assertEquals("us-east-2", provider.getRegion())
    }

    @Test
    fun testSuccessProfileOverride() = runTest {
        val platform = TestPlatformProvider(
            env = mapOf(
                "AWS_CONFIG_FILE" to "config",
                "AWS_PROFILE" to "test-profile"
            ),
            fs = mapOf(
                "config" to "[default]\nregion = us-east-2\n[profile test-profile]\nregion = us-west-2"
            )
        )

        val provider = ProfileRegionProvider(platform)
        assertEquals("us-west-2", provider.getRegion())
    }

    @Test
    fun testNoRegion() = runTest {
        val platform = TestPlatformProvider(
            env = mapOf(
                "AWS_CONFIG_FILE" to "config",
            ),
            fs = mapOf(
                "config" to "[default]\naccess_key_id=AKID"
            )
        )

        val provider = ProfileRegionProvider(platform)
        assertEquals(null, provider.getRegion())
    }
}
