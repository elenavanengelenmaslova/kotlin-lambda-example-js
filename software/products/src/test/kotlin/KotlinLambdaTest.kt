import handleRequest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class KotlinLambdaTest {
    @Test
    fun shouldSmokeTestSuccessfully() {
        handleRequest("unitTest", null) { error, result ->
            assertNull(error)
            assertNull(result)
        }
    }
}