package util

import java.lang.IllegalArgumentException

object StringUtils {
    fun parseInt(parameter: String): Int {
        return try {
            parameter.toInt()
        } catch (ex: NumberFormatException) {
            println(ex.message)
            0
        }
    }

    fun isEmpty(parameter: String?) = (null == parameter) || parameter.isBlank()

    fun split(parameter: String, seperate: String): List<String> {
        if ( isEmpty(parameter) ) {
            throw IllegalArgumentException("파라미터가 잘못되었습니다.")
        }
        return parameter.split(seperate)
    }
}