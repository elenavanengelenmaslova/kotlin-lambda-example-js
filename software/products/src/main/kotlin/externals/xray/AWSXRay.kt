@file:JsModule("aws-xray-sdk-core")
@file:JsNonModule()
package externals.xray

external fun <T> captureAWSClient(service: T): T
