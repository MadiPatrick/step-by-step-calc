package sbscalc

import kotlin.math.absoluteValue

fun hello(name: String?): String = "Hi $name, x = ${((-35.0).absoluteValue)}"

fun main() {
    val s = readLine()
    println(hello(s))
}