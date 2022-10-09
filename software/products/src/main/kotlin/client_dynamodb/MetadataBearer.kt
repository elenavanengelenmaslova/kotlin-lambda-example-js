@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule()
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

external interface ResponseMetadata {
    var httpStatusCode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var requestId: String?
        get() = definedExternally
        set(value) = definedExternally
    var extendedRequestId: String?
        get() = definedExternally
        set(value) = definedExternally
    var cfId: String?
        get() = definedExternally
        set(value) = definedExternally
    var attempts: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalRetryDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MetadataBearer {
    var `$metadata`: ResponseMetadata
}