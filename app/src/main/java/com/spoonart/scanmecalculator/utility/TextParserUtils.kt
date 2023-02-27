package com.spoonart.scanmecalculator.utility

class TextParserUtils {

    private abstract class Arithmetic {
        abstract fun apply(a: Double, b: Double): Double
    }

    private class Plus : Arithmetic() {
        override fun apply(a: Double, b: Double) = a + b
    }

    private class Minus : Arithmetic() {
        override fun apply(a: Double, b: Double) = a - b
    }

    private class Times : Arithmetic() {
        override fun apply(a: Double, b: Double) = a * b
    }

    private class Divide : Arithmetic() {
        override fun apply(a: Double, b: Double) = a / b
    }

    private val operators = hashMapOf(
        "+" to Plus(),
        "-" to Minus(),
        "x" to Times(),
        "*" to Times(),
        "/" to Divide()
    )

    @Throws(IllegalArgumentException::class)
    fun calculate(source: String): Double {
        val regex = "[0-9]"
        val operator = source.replace(Regex(regex), "")
        val numbers = source.split(operator)
        val arithmetic = operators[operator]
        return arithmetic?.apply(a = numbers.first().toDouble(), b = numbers.last().toDouble())
            ?: throw IllegalArgumentException("Given source = $source and cannot be calculated,")
    }
}
