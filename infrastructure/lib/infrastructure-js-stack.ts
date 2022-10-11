import {
    aws_dynamodb as dynamodb,
    aws_lambda as lambda,
    aws_logs as logs,
    Duration,
    Fn,
    Stack,
    StackProps
} from 'aws-cdk-lib';
import {Construct} from 'constructs';
import * as path from "path";

export class InfrastructureJsStack extends Stack {
    constructor(scope: Construct, id: string, props?: StackProps) {
        super(scope, id, props);

        const productsTable = dynamodb.Table.fromTableArn(this, 'dynamoTable', Fn.importValue('Products-JS-ExampleTableArn'));
        const lambdaJS = new lambda.Function(this, 'lambdaJSArm64', {
            description: "Kotlin Lambda JS Example",
            runtime: lambda.Runtime.NODEJS_16_X,
            architecture: lambda.Architecture.ARM_64,
            timeout: Duration.seconds(120),
            memorySize: 512,
            handler: 'kotlin-lambda-example-js-products.handleRequest',
            code: lambda.Code.fromAsset(path.join(__dirname, '../../build/dist/function.zip')),
            environment: {
                REGION: Stack.of(this).region,
            },
            logRetention: logs.RetentionDays.ONE_DAY
        });

        productsTable.grantReadData(lambdaJS);
    }
}
