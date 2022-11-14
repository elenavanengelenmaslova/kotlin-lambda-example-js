import software.amazon.awscdk.*
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct

class InfrastructureJsARM64Stack(scope: Construct, id: String, props: StackProps) : Stack(scope, id, props) {
    init {
        val productsTable = Table.fromTableArn(this, "dynamoTable", Fn.importValue("Products-JS-ExampleTableArn"))
        val functionId = "lambdaJSArm64"
        val function = Function.Builder.create(this, functionId)
            .description("Kotlin Lambda JS Example")
            .handler("kotlin-lambda-example-js-products.handleRequest")
            .runtime(Runtime.NODEJS_16_X)
            .code(Code.fromAsset("../build/dist/function.zip"))
            .environment(
                mapOf("REGION" to of(this).region)
            )
            .architecture(Architecture.ARM_64)
            .logRetention(RetentionDays.ONE_WEEK)
            .memorySize(512)
            .timeout(Duration.seconds(120))
            .build()
        productsTable.grantReadData(function)

        CfnOutput(
            this, "${functionId}-fn-arn",
            CfnOutputProps.builder()
                .value(function.functionArn)
                .description("The arn of the $functionId function")
                .exportName("${functionId}FnArn").build()
        )
    }
}