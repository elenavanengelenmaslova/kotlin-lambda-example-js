
plugins {
    application
    kotlin("jvm") version "1.7.21"
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("software.amazon.awscdk:aws-cdk-lib:2.49.0")
    implementation("software.constructs:constructs:10.1.159")
}

application {
    mainClass.set("nl.vintik.sample.infra.InfrastructureAppKt")
}

tasks.named("run") {
    dependsOn(":products:packageDistribution")
}
repositories {
    mavenCentral()
}
