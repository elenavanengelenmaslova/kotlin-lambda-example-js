import {aws_dynamodb as dynamodb, CfnOutput, RemovalPolicy, Stack, StackProps} from 'aws-cdk-lib';
import {Construct} from 'constructs';

export class InfrastructureTableStack extends Stack {
    constructor(scope: Construct, id: string, props?: StackProps) {
        super(scope, id, props);

        const tableName = 'Products-JS-Example';
        const productsTable = new dynamodb.Table(this, id, {
            billingMode: dynamodb.BillingMode.PAY_PER_REQUEST,
            removalPolicy: RemovalPolicy.DESTROY,
            partitionKey: {name: 'id', type: dynamodb.AttributeType.STRING},
            pointInTimeRecovery: false,
            tableName: tableName,
        });

        new CfnOutput(this, `${tableName}-table-arn`, {
            value: productsTable.tableArn,
            description: `The arn of the ${tableName} table`,
            exportName: `${tableName}TableArn`,
        });
    }
}