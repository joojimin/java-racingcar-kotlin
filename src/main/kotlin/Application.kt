import car.Car
import car.RacingCarManager
import game.GameRule
import game.GameRunner
import ui.UserConsole
import util.StringUtils.parseInt
import util.StringUtils.split
import java.util.stream.Collectors

fun main() {
    val userConsole = UserConsole()

    // input names of Car
    val names = split(userConsole.readLine(), ",")
    val cars = names
        .stream()
        .map(Car::from)
        .collect(Collectors.toList())
    val racingCarManager = RacingCarManager.of(cars, GameRule())


    // input number of games
    val numberOfGames = parseInt(userConsole.readLine())

    // game start
    GameRunner
        .of(numberOfGames, racingCarManager, userConsole)
        .start()
}