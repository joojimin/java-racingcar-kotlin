package car

import game.GameRule

class RacingCarManager private constructor(
    private val cars: List<Car>,
    private val gameRule: GameRule
) {

    fun step() {
        cars.forEach {
            if (gameRule.checkToMove()) {
                it.move()
            }
        }
    }

    fun cars(): List<Car> {
        return cars
    }

    fun winner(): Car? {
        return cars.maxByOrNull { it.location }
    }

    companion object {
        fun of(cars: List<Car>, gameRule: GameRule): RacingCarManager {
            return RacingCarManager(cars, gameRule)
        }
    }
}