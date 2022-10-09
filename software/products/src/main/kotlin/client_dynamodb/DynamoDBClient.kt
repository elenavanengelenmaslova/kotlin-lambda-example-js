@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()
package externals.client_dynamodb

external open class DynamoDBClient(configuration: Any) {
    var middlewareStack: Any
    var send: Any
    var destroy: () -> Unit
    var config: Any
}