@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()

package externals.client_dynamodb

external interface ScanCommandInput : ScanInput

external interface ScanCommandOutput : ScanOutput, MetadataBearer

//external open class ScanCommand(input: ScanCommandInput) : Command__3<ScanCommandInput, ScanCommandOutput, DynamoDBClientResolvedConfig> {
//    override var input: ScanCommandInput
//    open fun resolveMiddleware(clientStack: MiddlewareStack<Any /* BatchExecuteStatementCommandInput | BatchGetItemCommandInput | BatchWriteItemCommandInput | CreateBackupCommandInput | CreateGlobalTableCommandInput | CreateTableCommandInput | DeleteBackupCommandInput | DeleteItemCommandInput | DeleteTableCommandInput | DescribeBackupCommandInput | DescribeContinuousBackupsCommandInput | DescribeContributorInsightsCommandInput | DescribeEndpointsCommandInput | DescribeExportCommandInput | DescribeGlobalTableCommandInput | DescribeGlobalTableSettingsCommandInput | DescribeKinesisStreamingDestinationCommandInput | DescribeLimitsCommandInput | DescribeTableCommandInput | DescribeTableReplicaAutoScalingCommandInput | DescribeTimeToLiveCommandInput | DisableKinesisStreamingDestinationCommandInput | EnableKinesisStreamingDestinationCommandInput | ExecuteStatementCommandInput | ExecuteTransactionCommandInput | ExportTableToPointInTimeCommandInput | GetItemCommandInput | ListBackupsCommandInput | ListContributorInsightsCommandInput | ListExportsCommandInput | ListGlobalTablesCommandInput | ListTablesCommandInput | ListTagsOfResourceCommandInput | PutItemCommandInput | QueryCommandInput | RestoreTableFromBackupCommandInput | RestoreTableToPointInTimeCommandInput | ScanCommandInput | TagResourceCommandInput | TransactGetItemsCommandInput | TransactWriteItemsCommandInput | UntagResourceCommandInput | UpdateContinuousBackupsCommandInput | UpdateContributorInsightsCommandInput | UpdateGlobalTableCommandInput | UpdateGlobalTableSettingsCommandInput | UpdateItemCommandInput | UpdateTableCommandInput | UpdateTableReplicaAutoScalingCommandInput | UpdateTimeToLiveCommandInput */, Any /* BatchExecuteStatementCommandOutput | BatchGetItemCommandOutput | BatchWriteItemCommandOutput | CreateBackupCommandOutput | CreateGlobalTableCommandOutput | CreateTableCommandOutput | DeleteBackupCommandOutput | DeleteItemCommandOutput | DeleteTableCommandOutput | DescribeBackupCommandOutput | DescribeContinuousBackupsCommandOutput | DescribeContributorInsightsCommandOutput | DescribeEndpointsCommandOutput | DescribeExportCommandOutput | DescribeGlobalTableCommandOutput | DescribeGlobalTableSettingsCommandOutput | DescribeKinesisStreamingDestinationCommandOutput | DescribeLimitsCommandOutput | DescribeTableCommandOutput | DescribeTableReplicaAutoScalingCommandOutput | DescribeTimeToLiveCommandOutput | DisableKinesisStreamingDestinationCommandOutput | EnableKinesisStreamingDestinationCommandOutput | ExecuteStatementCommandOutput | ExecuteTransactionCommandOutput | ExportTableToPointInTimeCommandOutput | GetItemCommandOutput | ListBackupsCommandOutput | ListContributorInsightsCommandOutput | ListExportsCommandOutput | ListGlobalTablesCommandOutput | ListTablesCommandOutput | ListTagsOfResourceCommandOutput | PutItemCommandOutput | QueryCommandOutput | RestoreTableFromBackupCommandOutput | RestoreTableToPointInTimeCommandOutput | ScanCommandOutput | TagResourceCommandOutput | TransactGetItemsCommandOutput | TransactWriteItemsCommandOutput | UntagResourceCommandOutput | UpdateContinuousBackupsCommandOutput | UpdateContributorInsightsCommandOutput | UpdateGlobalTableCommandOutput | UpdateGlobalTableSettingsCommandOutput | UpdateItemCommandOutput | UpdateTableCommandOutput | UpdateTableReplicaAutoScalingCommandOutput | UpdateTimeToLiveCommandOutput */>, configuration: DynamoDBClientResolvedConfig, options: HttpHandlerOptions = definedExternally): Handler<ScanCommandInput, ScanCommandOutput>
//    open var serialize: Any
//    open var deserialize: Any
//}