/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */
package aws.sdk.kotlin.runtime

import aws.smithy.kotlin.runtime.ServiceErrorMetadata
import aws.smithy.kotlin.runtime.util.AttributeKey
import aws.smithy.kotlin.runtime.ClientException as SmithyClientException
import aws.smithy.kotlin.runtime.ServiceException as SmithyServiceException

public open class AwsErrorMetadata : ServiceErrorMetadata() {
    public companion object {
        public val ErrorMessage: AttributeKey<String> = AttributeKey("AwsErrorMessage")
    }

    /**
     * Returns the human readable error message. For errors with a `message` field as part of the model
     * this will match the `message` property of the exception.
     */
    public val errorMessage: String?
        get() = attributes.getOrNull(ErrorMessage)
}

/**
 * Base class for all AWS modeled service exceptions
 */
public open class AwsServiceException : SmithyServiceException {

    public constructor() : super()

    public constructor(message: String?) : super(message)

    public constructor(message: String?, cause: Throwable?) : super(message, cause)

    public constructor(cause: Throwable?) : super(cause)

    override val sdkErrorMetadata: AwsErrorMetadata = AwsErrorMetadata()
}

/**
 * Base class for all exceptions originating from the AWS runtime
 */
public open class ClientException : SmithyClientException {

    public constructor() : super()

    public constructor(message: String?) : super(message)

    public constructor(message: String?, cause: Throwable?) : super(message, cause)

    public constructor(cause: Throwable?) : super(cause)
}

/**
 * Indicates an error with client-side configuration.
 */
public open class ConfigurationException : ClientException {

    public constructor() : super()

    public constructor(message: String?) : super(message)

    public constructor(message: String?, cause: Throwable?) : super(message, cause)

    public constructor(cause: Throwable?) : super(cause)
}
