@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule
package externals.client_dynamodb

external interface BatchWriteItemCommandInput : BatchWriteItemInput

external interface BatchWriteItemCommandOutput : BatchWriteItemOutput, MetadataBearer

external interface ItemCollectionMetrics {
    var ItemCollectionKey: AttributeValue?
        get() = definedExternally
        set(value) = definedExternally
    var SizeEstimateRangeGB: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally

}
external interface BatchWriteItemOutput {
    var UnprocessedItems: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var ItemCollectionMetrics: `T$13`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BatchWriteItemCommand(input: BatchWriteItemCommandInput) {
    var input: BatchWriteItemCommandInput
    open var serialize: Any
    open var deserialize: Any
}

external interface BatchWriteItemInput {
    var RequestItems: `T$10`?
    var ReturnConsumedCapacity: String? /* "INDEXES" | "NONE" | "TOTAL" | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ReturnItemCollectionMetrics: String? /* "NONE" | "SIZE" | String? */
        get() = definedExternally
        set(value) = definedExternally

}

external interface `T$10` {
    @nativeGetter
    operator fun get(key: String): Array<WriteRequest>?
    @nativeSetter
    operator fun set(key: String, value: Array<WriteRequest>)
}

external interface `T$13` {
    @nativeGetter
    operator fun get(key: String): Array<ItemCollectionMetrics>?
    @nativeSetter
    operator fun set(key: String, value: Array<ItemCollectionMetrics>)
}