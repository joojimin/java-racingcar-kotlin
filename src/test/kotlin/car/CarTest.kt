package car

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CarTest {

    @DisplayName("입력받은 name이 정상인 경우")
    @Test
    fun name() {
        assertDoesNotThrow { Car.from("jimin") }
    }

    @DisplayName("입력받은 name이 5글자 이상 비정상인 경우")
    @Test
    fun name2() {
        assertThrows(IllegalArgumentException::class.java) {
            Car.from("jimin2222")
        }
    }

    @DisplayName("입력받은 name이 0글자 이하 비정상인 경우")
    @Test
    fun name3() {
        assertThrows(IllegalArgumentException::class.java) {
            Car.from("")
        }
    }
}