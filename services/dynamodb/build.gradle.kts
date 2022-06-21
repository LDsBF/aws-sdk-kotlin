
description = "AWS SDK codegen tasks"
val kotlinVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation("aws.smithy.kotlin:aws-credentials:0.11.0-SNAPSHOT")
                implementation(project(":aws-runtime:aws-http"))
                implementation(project(":aws-runtime:protocols:aws-json-protocols"))
                implementation("aws.smithy.kotlin:aws-signing-common:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:aws-signing-default:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:http:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:http-client-engine-default:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:io:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:serde:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:serde-json:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:utils:0.11.0-SNAPSHOT")
                api(project(":aws-runtime:aws-config"))
                api(project(":aws-runtime:aws-core"))
                api(project(":aws-runtime:aws-endpoint"))
                api("aws.smithy.kotlin:runtime-core:0.11.0-SNAPSHOT")
            }
        }
    }
}
