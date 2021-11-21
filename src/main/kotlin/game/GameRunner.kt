package game

import car.RacingCarManager
import ui.UserConsole
import java.lang.IllegalArgumentException

class GameRunner private constructor(
    private val numberOfGames: Int,
    private val racingCarManager: RacingCarManager,
    private val userConsole: UserConsole
) {

    fun start() {
        userConsole.printLine()
        userConsole.printLine("실행 결과")
        for (time in 1..numberOfGames) {
            racingCarManager.step()
            printResult()
        }
        printWinner()
    }

    private fun printResult() {
        racingCarManager.cars().forEach {
            userConsole.printLine("${it.name} : ${it.locationToString()}")
        }
        userConsole.printLine()
    }

    private fun printWinner() {
        userConsole.printLine("${racingCarManager.winner()!!.name}가 최종우승했습니다")
    }

    companion object {
        fun of(numberOfGames: Int,
               carManager: RacingCarManager,
               userConsole: UserConsole): GameRunner {
            validate(numberOfGames)
            return GameRunner(numberOfGames, carManager, userConsole)
        }

        private fun validate(numberOfGames: Int) {
            if (numberOfGames <= 0) {
                throw IllegalArgumentException("Wrong arguments, numberOfGame=$numberOfGames")
            }
        }
    }
}