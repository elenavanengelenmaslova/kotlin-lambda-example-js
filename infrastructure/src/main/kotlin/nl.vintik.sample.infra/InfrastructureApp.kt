package nl.vintik.sample.infra

import InfrastructureJsARM64Stack
import InfrastructureJsStack
import software.amazon.awscdk.App
import software.amazon.awscdk.Environment
import software.amazon.awscdk.StackProps

fun main() {
    val app = App()

    val environment = Environment.builder()
        .account(System.getenv("DEPLOY_TARGET_ACCOUNT"))
        .region(System.getenv("DEPLOY_TARGET_REGION"))
        .build()

    val stackNameTable = "Kotlin-Lambda-JS-table"
    InfrastructureTableStack(
        app, stackNameTable, StackProps.builder()
            .stackName(stackNameTable)
            .env(environment)
            .description("Dynamo Table used for JS example")
            .build()
    )

    val stackNameJS = "Kotlin-Lambda-JS-example"
    InfrastructureJsStack(
        app, stackNameJS,
        StackProps.builder()
            .stackName(stackNameJS)
            .env(environment)
            .description("JS example")
            .build()
    )

    val stackNameJSArm64 = "Kotlin-Lambda-JS-Arm64-example"
    InfrastructureJsARM64Stack(
        app, stackNameJSArm64,
        StackProps.builder()
            .stackName(stackNameJSArm64)
            .env(environment)
            .description("JS Arm64 example")
            .build()
    )

    app.synth()
}
