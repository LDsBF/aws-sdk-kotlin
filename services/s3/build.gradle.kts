
description = "AWS SDK codegen tasks"
val kotlinVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation("aws.smithy.kotlin:aws-credentials:0.11.0-SNAPSHOT")
                implementation(project(":aws-runtime:aws-http"))
                implementation("aws.smithy.kotlin:aws-signing-common:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:aws-signing-default:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:http:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:http-client-engine-default:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:io:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:serde:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:serde-xml:0.11.0-SNAPSHOT")
                implementation("aws.smithy.kotlin:utils:0.11.0-SNAPSHOT")
                api(project(":aws-runtime:aws-config"))
                api(project(":aws-runtime:aws-core"))
                api(project(":aws-runtime:aws-endpoint"))
                api("aws.smithy.kotlin:runtime-core:0.11.0-SNAPSHOT")
            }
        }
        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test:1.6.21")
                implementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.21")
                implementation("aws.smithy.kotlin:smithy-test:0.11.0-SNAPSHOT")
                implementation(project(":aws-runtime:testing"))
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")
            }
        }
    }
}
