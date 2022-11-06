@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule
package externals.client_dynamodb

external interface QueryCommandInput : QueryInput

external interface QueryCommandOutput : QueryOutput, MetadataBearer

open external class QueryCommand(input: QueryCommandInput) {
    var input: QueryCommandInput
    open var serialize: Any
    open var deserialize: Any
}