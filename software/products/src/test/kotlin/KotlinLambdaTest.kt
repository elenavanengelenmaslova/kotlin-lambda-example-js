import kotlin.test.Test
import kotlin.test.assertNull

class KotlinLambdaTest {
    @Test
    fun shouldSmokeTestSuccessfully() {
        handleRequest("unitTest", null) { error, result ->
            console.error(error)
            assertNull(error)
            assertNull(result)
        }
    }
}