package com.fengzhi.kotlinlearning.chapter6

fun divide(n1: Int, n2: Int): Double? {
    if (n2 == 0) {
        return null
    }
    return n1.toDouble() / n2
}

fun main() {
    val divNumber1 = divide(100, 0)
    val result1= divNumber1?.plus(100)
    println(result1)
    val divNumber2 = divide(100, 10)
    val result2= divNumber2?.plus(100)
    println(result2)
}