@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()

package externals.client_dynamodb

import kotlin.js.Promise

external class DynamoDB (configuration: Any): DynamoDBClient {
    open fun scan(args: ScanCommandInput): Promise<ScanCommandOutput>
    open fun batchWriteItem(args: BatchWriteItemCommandInput, options: HttpHandlerOptions = definedExternally): Promise<BatchWriteItemCommandOutput>
    open fun batchWriteItem(args: BatchWriteItemCommandInput): Promise<BatchWriteItemCommandOutput>
    open fun batchWriteItem(args: BatchWriteItemCommandInput, cb: (err: Any, data: BatchWriteItemCommandOutput) -> Unit)
    open fun batchWriteItem(args: BatchWriteItemCommandInput, options: HttpHandlerOptions, cb: (err: Any, data: BatchWriteItemCommandOutput) -> Unit)
    open fun query(args: QueryCommandInput, options: HttpHandlerOptions = definedExternally): Promise<QueryCommandOutput>
    open fun query(args: QueryCommandInput): Promise<QueryCommandOutput>
    open fun query(args: QueryCommandInput, cb: (err: Any, data: QueryCommandOutput) -> Unit)
    open fun query(args: QueryCommandInput, options: HttpHandlerOptions, cb: (err: Any, data: QueryCommandOutput) -> Unit)
}