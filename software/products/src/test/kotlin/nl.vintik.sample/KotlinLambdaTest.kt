package nl.vintik.sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class KotlinLambdaTest {
    @Test
    fun shouldReturnSuccess() {
        handleRequest("unitTest", null) { error, result ->
            assertNull(error)
            assertEquals("Success!", result)
        }
    }
}