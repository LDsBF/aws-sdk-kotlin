/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.http.retries

import aws.smithy.kotlin.runtime.ServiceErrorMetadata
import aws.smithy.kotlin.runtime.ServiceException
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.retries.policy.RetryDirective
import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType.*
import aws.smithy.kotlin.runtime.retries.policy.StandardRetryPolicy

public object AwsDefaultRetryPolicy : StandardRetryPolicy() {
    internal val knownErrorTypes = mapOf(
        "BandwidthLimitExceeded" to Throttling,
        "EC2ThrottledException" to Throttling,
        "IDPCommunicationError" to Timeout,
        "LimitExceededException" to Throttling,
        "PriorRequestNotComplete" to Throttling,
        "ProvisionedThroughputExceededException" to Throttling,
        "RequestLimitExceeded" to Throttling,
        "RequestThrottled" to Throttling,
        "RequestThrottledException" to Throttling,
        "RequestTimeout" to Timeout,
        "RequestTimeoutException" to Timeout,
        "SlowDown" to Throttling,
        "ThrottledException" to Throttling,
        "Throttling" to Throttling,
        "ThrottlingException" to Throttling,
        "TooManyRequestsException" to Throttling,
        "TransactionInProgressException" to Throttling,
    )

    internal val knownStatusCodes = mapOf(
        500 to Timeout,
        502 to Timeout,
        503 to Timeout,
        504 to Timeout,
    )

    override fun evaluateSpecificExceptions(ex: Throwable): RetryDirective? = when (ex) {
        is ServiceException -> evaluateServiceException(ex)
        else -> null
    }

    private fun evaluateServiceException(ex: ServiceException): RetryDirective? = with(ex.sdkErrorMetadata) {
        (knownErrorTypes[errorCode] ?: knownStatusCodes[statusCode])
            ?.let { RetryDirective.RetryError(it) }
    }

    private val ServiceErrorMetadata.statusCode: Int?
        get() = (protocolResponse as? HttpResponse)?.status?.value
}
