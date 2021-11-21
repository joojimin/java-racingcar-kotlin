package car

import util.StringUtils.isEmpty
import java.lang.IllegalArgumentException

class Car private constructor(val name: String){
    var location: Int = 0

    fun move() {
        location++
    }

    fun locationToString(): String {
        val stringBuilder = StringBuilder()
        for ( i in 1..location) {
            stringBuilder.append("-")
        }
        return stringBuilder.toString()
    }

    companion object {
        private const val limitLength = 5

        fun from(name: String): Car {
            validate(name)
            return Car(name)
        }

        private fun validate(name: String) {
            if (isEmpty(name) || name.length > limitLength) {
                throw IllegalArgumentException("잘못된 자동차 이름입니다. 입력값: $name")
            }
        }
    }
}