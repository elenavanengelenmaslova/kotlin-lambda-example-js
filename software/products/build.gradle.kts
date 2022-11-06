buildscript {
    repositories {
        mavenCentral()
    }
}
plugins {
    kotlin("js") version "1.7.20"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(npm("@aws-sdk/client-dynamodb", "^3.95.0", generateExternals = false))
    implementation(npm("aws-xray-sdk-core", "^3.3.8", generateExternals = false))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation(npm("zoned-date-time", "1.1.0"))

}

kotlin {
    js {
        binaries.executable()
        nodejs {
        }
        useCommonJs()
    }
}

tasks.register<Zip>("packageDistribution") {
    dependsOn("compileTestKotlinJs")
    from("${project.rootDir}/build/js"){
        include("node_modules/kotlin-lambda-example-js/**", "node_modules/kotlin-lambda-example-js-products/**",  "node_modules/@aws-sdk/client-dynamodb/**", "node_modules/aws-xray-sdk-core/**", "node_modules/@aws-sdk/middleware-serde/**", "node_modules/@aws-sdk/smithy-client/**" , "node_modules/@aws-sdk/middleware-stack/**", "node_modules/@aws-sdk/protocol-http/**", "node_modules/@aws-sdk/config-resolver/**", "node_modules/@aws-sdk/util-config-provider/**", "node_modules/@aws-sdk/util-middleware/**", "node_modules/@aws-sdk/middleware-content-length/**", "node_modules/@aws-sdk/middleware-endpoint-discovery/**", "node_modules/@aws-sdk/middleware-host-header/**", "node_modules/@aws-sdk/middleware-logger/**","node_modules/@aws-sdk/middleware-retry/**","node_modules/@aws-sdk/middleware-signing/**","node_modules/@aws-sdk/middleware-user-agent/**","node_modules/@aws-sdk/**","node_modules/kotlinx-coroutines-core/**", "node_modules/kotlinx-atomicfu/**", "node_modules/cls-hooked/**","node_modules/emitter-listener/**" , "node_modules/zoned-date-time/**", "node_modules/kotlin/**", "node_modules/tslib/**","node_modules/uuid/**","node_modules/mnemonist/**","node_modules/obliterator/**","node_modules/entities/**", "node_modules/fast-xml-parser/**","packages/kotlin-lambda-example-js/**",  "packages/kotlin-lambda-example-js-products/**",  "packages/kotlin/**")
    }
    archiveFileName.set("function.zip")
    destinationDirectory.set(file("${project.rootDir}/build/dist"))
}

