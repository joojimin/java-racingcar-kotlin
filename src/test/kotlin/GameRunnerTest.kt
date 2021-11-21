import car.RacingCarManager
import game.GameRule
import game.GameRunner
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ui.UserConsole
import java.util.*

internal class GameRunnerTest {

    @DisplayName("게임 횟수가 0보다 크면 정상")
    @Test
    fun name() {
        assertDoesNotThrow {
            val racingCarManager = RacingCarManager.of(Collections.emptyList(), GameRule())
            GameRunner.of(5, racingCarManager, UserConsole())
        }
    }


    @DisplayName("게임 횟수가 0보다 작으면 비정상")
    @Test
    fun name2() {
        assertThrows(IllegalArgumentException::class.java) {
            val racingCarManager = RacingCarManager.of(Collections.emptyList(), GameRule())
            GameRunner.of(-1, racingCarManager, UserConsole())
        }
    }
}