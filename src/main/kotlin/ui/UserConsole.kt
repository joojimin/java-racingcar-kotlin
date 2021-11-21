package ui

import java.util.*

class UserConsole {

    private val input = Scanner(System.`in`)

    fun readLine() = input.nextLine()?: ""


    fun printLine() {
        println()
    }

    fun printLine(message: String) {
        println(message)
    }

}