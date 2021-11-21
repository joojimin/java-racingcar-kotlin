package game

import util.RandomNumberUtils

class GameRule {

    private val minRange: Int = 0
    private val maxRange: Int = 9

    private val conditionToMove: Int = 4

    fun checkToMove(): Boolean {
        val pickNumber = RandomNumberUtils.pick(minRange, maxRange)
        if (pickNumber >= conditionToMove) {
            return true
        }
        return false
    }
}