@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()
package externals.client_dynamodb

//import SmithyException

//typealias ExceptionOptionType<ExceptionType, BaseExceptionType> = Any

external interface ServiceExceptionOptions : MetadataBearer {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
}

//typealias ServiceException = Error