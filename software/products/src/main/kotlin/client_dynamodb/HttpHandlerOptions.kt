@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()

package externals.client_dynamodb

external interface HeaderBag {
    @nativeGetter
    operator fun get(key: String): String?

    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface HttpMessage {
    var headers: HeaderBag
    var body: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueryParameterBag {
    @nativeGetter
    operator fun get(key: String): dynamic /* String? | Array<String>? */

    @nativeSetter
    operator fun set(key: String, value: String?)

    @nativeSetter
    operator fun set(key: String, value: Array<String>?)
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Endpoint {
    var protocol: String
    var hostname: String
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var path: String
    var query: QueryParameterBag?
        get() = definedExternally
        set(value) = definedExternally

    companion object {
        var filterSensitiveLog: (obj: Endpoint) -> Any
    }
}

external interface HttpRequest : HttpMessage, Endpoint {
    var method: String
}

external interface HttpResponse : HttpMessage {
    var statusCode: Number
}

external interface HttpHandlerOptions {
    var abortSignal: Any?
        get() = definedExternally
        set(value) = definedExternally
}