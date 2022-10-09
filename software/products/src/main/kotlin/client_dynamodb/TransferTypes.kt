@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule
package externals.client_dynamodb

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface RequestHandlerOutput<ResponseType> {
    var response: ResponseType
}

external interface RequestHandler<RequestType, ResponseType, HandlerOptions> {
    var metadata: RequestHandlerMetadata?
        get() = definedExternally
        set(value) = definedExternally
    var destroy: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var handle: (request: RequestType, handlerOptions: HandlerOptions) -> Promise<RequestHandlerOutput<ResponseType>>
}

external interface RequestHandler__2<RequestType, ResponseType> : RequestHandler<RequestType, ResponseType, Any>

external interface RequestHandlerMetadata {
    var handlerProtocol: String
}