package sbscalc

fun isNumber(token: String): Boolean {
    try {
        token.toDouble()
    } catch (_: NumberFormatException) {
        return false;
    }
    return true
}

fun isOpenBracket(token: String) = token == "("

fun isCloseBracket(token: String) = token == ")"

fun isAbsBracket(token: String) = token == "|"

