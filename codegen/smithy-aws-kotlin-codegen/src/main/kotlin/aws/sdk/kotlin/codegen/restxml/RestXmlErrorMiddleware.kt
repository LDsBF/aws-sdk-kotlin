package aws.sdk.kotlin.codegen.restxml

import aws.sdk.kotlin.codegen.AwsKotlinDependency
import aws.sdk.kotlin.codegen.middleware.ModeledExceptionsMiddleware
import software.amazon.smithy.kotlin.codegen.KotlinWriter
import software.amazon.smithy.kotlin.codegen.addImport
import software.amazon.smithy.kotlin.codegen.getTrait
import software.amazon.smithy.kotlin.codegen.integration.HttpBindingResolver
import software.amazon.smithy.kotlin.codegen.integration.ProtocolGenerator
import software.amazon.smithy.model.traits.HttpErrorTrait

class RestXmlErrorMiddleware(
    ctx: ProtocolGenerator.GenerationContext,
    httpBindingResolver: HttpBindingResolver
) : ModeledExceptionsMiddleware(ctx, httpBindingResolver) {
    override val name: String = "RestXmlError"

    override fun addImportsAndDependencies(writer: KotlinWriter) {
        super.addImportsAndDependencies(writer)
        writer.addImport("RestXmlError", AwsKotlinDependency.AWS_CLIENT_RT_XML_PROTOCOLS)
    }

    override fun renderRegisterErrors(writer: KotlinWriter) {
        val errors = getModeledErrors()

        errors.forEach { errShape ->
            val code = errShape.id.name
            val symbol = ctx.symbolProvider.toSymbol(errShape)
            val deserializerName = "${symbol.name}Deserializer"
            // If model specifies error code use it or default to 400.
            // See https://awslabs.github.io/smithy/1.0/spec/core/http-traits.html#httperror-trait
            val httpStatusCode = errShape.getTrait<HttpErrorTrait>()?.code ?: 400
            writer.write("register(code = #S, deserializer = $deserializerName(), httpStatusCode = $httpStatusCode)", code)
        }
    }
}
