@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule
package externals.client_dynamodb

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
open external interface ScanInput {
    var TableName: String?
    var IndexName: String?
        get() = definedExternally
        set(value) = definedExternally
    var AttributesToGet: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var Limit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var Select: String? /* "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "COUNT" | "SPECIFIC_ATTRIBUTES" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ConditionalOperator: String? /* "AND" | "OR" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ExclusiveStartKey: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally
    var ReturnConsumedCapacity: String? /* "INDEXES" | "NONE" | "TOTAL" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var TotalSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var Segment: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ProjectionExpression: String?
        get() = definedExternally
        set(value) = definedExternally
    var FilterExpression: String?
        get() = definedExternally
        set(value) = definedExternally
    var ExpressionAttributeNames: `T$5`?
        get() = definedExternally
        set(value) = definedExternally
    var ExpressionAttributeValues: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally
    var ConsistentRead: Boolean?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: ScanInput) -> Any
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ScanOutput {
    var Items: Array<AttributeValue>?
        get() = definedExternally
        set(value) = definedExternally
    var Count: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ScannedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var LastEvaluatedKey: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: ScanOutput) -> Any
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface QueryInput {
    var TableName: String?
    var IndexName: String?
        get() = definedExternally
        set(value) = definedExternally
    var Select: String? /* "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "COUNT" | "SPECIFIC_ATTRIBUTES" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var AttributesToGet: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var Limit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ConsistentRead: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var KeyConditions: `T$9`?
        get() = definedExternally
        set(value) = definedExternally
    var QueryFilter: `T$9`?
        get() = definedExternally
        set(value) = definedExternally
    var ConditionalOperator: String? /* "AND" | "OR" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ScanIndexForward: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ExclusiveStartKey: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally
    var ReturnConsumedCapacity: String? /* "INDEXES" | "NONE" | "TOTAL" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ProjectionExpression: String?
        get() = definedExternally
        set(value) = definedExternally
    var FilterExpression: String?
        get() = definedExternally
        set(value) = definedExternally
    var KeyConditionExpression: String?
        get() = definedExternally
        set(value) = definedExternally
    var ExpressionAttributeNames: `T$5`?
        get() = definedExternally
        set(value) = definedExternally
    var ExpressionAttributeValues: Map<String, SMember>?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: QueryInput) -> Any
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface QueryOutput {
    var Items: Array<AttributeValue>?
        get() = definedExternally
        set(value) = definedExternally
    var Count: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ScannedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var LastEvaluatedKey: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: QueryOutput) -> Any
    }
}

external interface `T$5` {
    @nativeGetter
    operator fun get(key: String): String?

    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface `T$9` {
    @nativeGetter
    operator fun get(key: String): Condition?
    @nativeSetter
    operator fun set(key: String, value: Condition)
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Condition {
    var AttributeValueList: Array<dynamic /* AttributeValue.BMember | AttributeValue.BOOLMember | AttributeValue.BSMember | AttributeValue.LMember | AttributeValue.MMember | AttributeValue.NMember | AttributeValue.NSMember | AttributeValue.NULLMember | AttributeValue.SMember | AttributeValue.SSMember | AttributeValue.$UnknownMember */>?
        get() = definedExternally
        set(value) = definedExternally
    var ComparisonOperator: String /* "BEGINS_WITH" | "BETWEEN" | "CONTAINS" | "EQ" | "GE" | "GT" | "IN" | "LE" | "LT" | "NE" | "NOT_CONTAINS" | "NOT_NULL" | "NULL" | String? */

    companion object {
        var filterSensitiveLog: (obj: Condition) -> Any
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WriteRequest {
    var PutRequest: PutRequest?
        get() = definedExternally
        set(value) = definedExternally
    var DeleteRequest: DeleteRequest?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: WriteRequest) -> Any
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface PutRequest {
    var Item: `T$4`?

    companion object {
        var filterSensitiveLog: (obj: PutRequest) -> Any
    }
}

external interface `T$4` {
    var clang: Number
    var host_arch: String
    var node_install_npm: Boolean
    var node_install_waf: Boolean
    var node_prefix: String
    var node_shared_openssl: Boolean
    var node_shared_v8: Boolean
    var node_shared_zlib: Boolean
    var node_use_dtrace: Boolean
    var node_use_etw: Boolean
    var node_use_openssl: Boolean
    var target_arch: String
    var v8_no_strict_aliasing: Number
    var v8_use_snapshot: Boolean
    var visibility: String
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface DeleteRequest {
    var Key: `T$4`?

    companion object {
        var filterSensitiveLog: (obj: DeleteRequest) -> Any
    }
}