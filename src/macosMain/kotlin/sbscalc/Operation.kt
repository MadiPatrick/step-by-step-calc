package sbscalc

import kotlin.math.pow

enum class Operation(val symbol: Char) {
    ADD('+') {
        override fun eval(vararg operands: Double) = operands[0] + operands[1]
        override fun toString(vararg operands: Double) = "${operands[0]} + ${operands[1]}"
    },
    SUBTRACT('-') {
        override fun eval(vararg operands: Double) = operands[0] - operands[1]
        override fun toString(vararg operands: Double) = "${operands[0]} - ${operands[1]}"
    },
    MULTIPLY('*') {
        override fun eval(vararg operands: Double) = operands[0] * operands[1]
        override fun toString(vararg operands: Double) = "${operands[0]} * ${operands[1]}"
    },
    DIVIDE('/') {
        override fun eval(vararg operands: Double) = operands[0] / operands[1]
        override fun toString(vararg operands: Double) = "${operands[0]} / ${operands[1]}"
    },
    POWER('^') {
        override fun eval(vararg operands: Double) = operands[0].pow(operands[1])
        override fun toString(vararg operands: Double) = "${operands[0]} ^ ${operands[1]}"
    },
    PLUS('+') {
        override fun eval(vararg operands: Double) = operands[0]
        override fun toString(vararg operands: Double) = "+${operands[0]}"
    },
    MINUS('-') {
        override fun eval(vararg operands: Double) = -operands[0]
        override fun toString(vararg operands: Double) = "-${operands[0]}"
    };

    abstract fun eval(vararg operands: Double): Double
    abstract fun toString(vararg operands: Double): String

    companion object {
        fun findOperation(sym: Char): Operation? {
            for(op in values()) {
                if (op.symbol == sym) return op
            }
            return null
        }
    }
}