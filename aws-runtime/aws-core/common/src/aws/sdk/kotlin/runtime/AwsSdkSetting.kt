/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime

import aws.smithy.kotlin.runtime.util.Platform

// NOTE: The JVM property names MUST match the ones defined in the Java SDK for any setting added.
// see: https://github.com/aws/aws-sdk-java-v2/blob/master/core/sdk-core/src/main/java/software/amazon/awssdk/core/SdkSystemSetting.java
// see: https://github.com/aws/aws-sdk-java-v2/blob/master/docs/LaunchChangelog.md#61-environment-variables-and-system-properties

/**
 * Settings to configure SDK runtime behavior
 */
@InternalSdkApi
public sealed class AwsSdkSetting<T>(
    /**
     * The name of the corresponding environment variable that configures the setting
     */
    public val environmentVariable: String,

    /**
     * The name of the corresponding JVM system property that configures the setting
     */
    public val jvmProperty: String,

    /**
     * The default value (if one exists)
     */
    public val defaultValue: T? = null
) {
    /**
     * Configure the AWS access key ID.
     *
     * This value will not be ignored if the [AwsSecretAccessKey] is not specified.
     */
    public object AwsAccessKeyId : AwsSdkSetting<String>("AWS_ACCESS_KEY_ID", "aws.accessKeyId")

    /**
     * Configure the AWS secret access key.
     *
     * This value will not be ignored if the [AwsAccessKeyId] is not specified.
     */
    public object AwsSecretAccessKey : AwsSdkSetting<String>("AWS_SECRET_ACCESS_KEY", "aws.secretAccessKey")

    /**
     * Configure the AWS session token.
     */
    public object AwsSessionToken : AwsSdkSetting<String>("AWS_SESSION_TOKEN", "aws.sessionToken")

    /**
     * Configure the default region.
     */
    public object AwsRegion : AwsSdkSetting<String>("AWS_REGION", "aws.region")

    /**
     * Configure the default path to the shared config file.
     */
    public object AwsConfigFile : AwsSdkSetting<String>("AWS_CONFIG_FILE", "aws.configFile")

    /**
     * Configure the default path to the shared credentials profile file.
     */
    public object AwsSharedCredentialsFile :
        AwsSdkSetting<String>("AWS_SHARED_CREDENTIALS_FILE", "aws.sharedCredentialsFile")

    /**
     * The execution environment of the SDK user. This is automatically set in certain environments by the underlying AWS service.
     * For example, AWS Lambda will automatically specify a runtime indicating that the SDK is being used within Lambda.
     */
    public object AwsExecutionEnv : AwsSdkSetting<String>("AWS_EXECUTION_ENV", "aws.executionEnvironment")

    /**
     *  The name of the default profile that should be loaded from config
     */
    public object AwsProfile : AwsSdkSetting<String>("AWS_PROFILE", "aws.profile", "default")
}

/**
 * Read the [AwsSdkSetting] by first checking JVM property, environment variable, and default value.
 * Property sources not available on a given platform will be ignored.
 *
 * @return the value of the [AwsSdkSetting] or null if undefined.
 */
@InternalSdkApi
public inline fun <reified T> AwsSdkSetting<T>.resolve(): T? =
    (Platform.getProperty(jvmProperty) ?: Platform.getenv(environmentVariable) ?: defaultValue) as T?
