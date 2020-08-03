import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyKotlinThingTest {

    @Test
    fun `test my kotlin thing`() {
        assertThat(MyKotlinThing().hello()).isEqualTo("hello world")
    }
}