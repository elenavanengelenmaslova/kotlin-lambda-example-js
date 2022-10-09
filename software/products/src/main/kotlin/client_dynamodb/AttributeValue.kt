@file:JsModule("@aws-sdk/client-dynamodb")
@file:JsNonModule
package externals.client_dynamodb

external interface AttributeValue {
    @nativeGetter
    operator fun get(key: String): dynamic /* AttributeValue.BMember? | AttributeValue.BOOLMember? | AttributeValue.BSMember? | AttributeValue.LMember? | AttributeValue.MMember? | AttributeValue.NMember? | AttributeValue.NSMember? | AttributeValue.NULLMember? | AttributeValue.SMember? | AttributeValue.SSMember? | AttributeValue.$UnknownMember? */

    @nativeSetter
    operator fun set(key: String, value: BMember)

    @nativeSetter
    operator fun set(key: String, value: BOOLMember)

    @nativeSetter
    operator fun set(key: String, value: BSMember)

    @nativeSetter
    operator fun set(key: String, value: LMember)

    @nativeSetter
    operator fun set(key: String, value: MMember)

    @nativeSetter
    operator fun set(key: String, value: NMember)

    @nativeSetter
    operator fun set(key: String, value: NSMember)

    @nativeSetter
    operator fun set(key: String, value: NULLMember)

    @nativeSetter
    operator fun set(key: String, value: SMember)

    @nativeSetter
    operator fun set(key: String, value: SSMember)

    @nativeSetter
    operator fun set(key: String, value: UnknownMember)
}

external interface MMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}


external interface SMember {
    var S: String
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: String
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SSMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Array<String>
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NSMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Array<String>
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BSMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Array<dynamic /* AttributeValue.BMember | AttributeValue.BOOLMember | AttributeValue.BSMember | AttributeValue.LMember | AttributeValue.MMember | AttributeValue.NMember | AttributeValue.NSMember | AttributeValue.NULLMember | AttributeValue.SMember | AttributeValue.SSMember | AttributeValue.$UnknownMember */>
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NULLMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Boolean
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BOOLMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Boolean
    var `$unknown`: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UnknownMember {
    var S: Any?
        get() = definedExternally
        set(value) = definedExternally
    var N: Any?
        get() = definedExternally
        set(value) = definedExternally
    var B: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BS: Any?
        get() = definedExternally
        set(value) = definedExternally
    var M: Any?
        get() = definedExternally
        set(value) = definedExternally
    var L: Any?
        get() = definedExternally
        set(value) = definedExternally
    var NULL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var BOOL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var `$unknown`: dynamic /* JsTuple<String, Any> */
        get() = definedExternally
        set(value) = definedExternally
}