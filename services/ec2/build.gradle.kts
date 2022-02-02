
description = "Amazon Elastic Compute Cloud"
val kotlinVersion: String by project

dependencies {
    implementation(project(":aws-runtime:aws-http"))
    implementation(project(":aws-runtime:protocols:aws-xml-protocols"))
    implementation("aws.smithy.kotlin:http:0.7.7-SNAPSHOT")
    implementation(project(":aws-runtime:http-client-engine-crt"))
    implementation("aws.smithy.kotlin:serde:0.7.7-SNAPSHOT")
    implementation("aws.smithy.kotlin:serde-form-url:0.7.7-SNAPSHOT")
    implementation("aws.smithy.kotlin:serde-xml:0.7.7-SNAPSHOT")
    implementation("aws.smithy.kotlin:utils:0.7.7-SNAPSHOT")
    api(project(":aws-runtime:aws-config"))
    api(project(":aws-runtime:aws-core"))
    api(project(":aws-runtime:aws-endpoint"))
    api(project(":aws-runtime:aws-signing"))
    api(project(":aws-runtime:aws-types"))
    api("aws.smithy.kotlin:runtime-core:0.7.7-SNAPSHOT")
}
