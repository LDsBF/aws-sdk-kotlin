/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.codegen.customization.s3

import software.amazon.smithy.kotlin.codegen.KotlinSettings
import software.amazon.smithy.kotlin.codegen.core.KotlinWriter
import software.amazon.smithy.kotlin.codegen.core.RuntimeTypes
import software.amazon.smithy.kotlin.codegen.integration.KotlinIntegration
import software.amazon.smithy.kotlin.codegen.model.expectShape
import software.amazon.smithy.kotlin.codegen.rendering.protocol.ProtocolGenerator
import software.amazon.smithy.kotlin.codegen.rendering.protocol.ProtocolMiddleware
import software.amazon.smithy.kotlin.codegen.rendering.protocol.replace
import software.amazon.smithy.kotlin.codegen.signing.AwsSignatureVersion4
import software.amazon.smithy.model.Model
import software.amazon.smithy.model.shapes.OperationShape
import software.amazon.smithy.model.shapes.ServiceShape

/**
 * Overrides the SigV4 signing middleware config for S3.
 */
class S3SigningConfig : KotlinIntegration {

    override val order: Byte
        get() = 127

    override fun enabledForService(model: Model, settings: KotlinSettings) =
        model.expectShape<ServiceShape>(settings.service).isS3

    override fun customizeMiddleware(
        ctx: ProtocolGenerator.GenerationContext,
        resolved: List<ProtocolMiddleware>
    ): List<ProtocolMiddleware> {
        val signingServiceName = AwsSignatureVersion4.signingServiceName(ctx.service)

        return resolved.replace(newValue = S3SigningMiddleware(signingServiceName)) { middleware ->
            middleware.name == RuntimeTypes.Auth.Signing.AwsSigningCommon.AwsSigningMiddleware.name
        }
    }
}

private class S3SigningMiddleware(signingServiceName: String) : AwsSignatureVersion4(signingServiceName) {
    override fun renderSigningConfig(op: OperationShape, writer: KotlinWriter) {
        super.renderSigningConfig(op, writer)
        val sbh = RuntimeTypes.Auth.Signing.AwsSigningCommon.AwsSignedBodyHeader
        writer.write("signedBodyHeader = #T.X_AMZ_CONTENT_SHA256", sbh)

        // https://github.com/awslabs/aws-sdk-kotlin/issues/200
        writer.write("useDoubleUriEncode = false")
        writer.write("normalizeUriPath = false")
    }
}
