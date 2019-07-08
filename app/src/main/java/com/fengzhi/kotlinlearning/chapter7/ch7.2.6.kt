package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val souceStr = "There is a string accessing example."
    val subStr1 = souceStr.substring(28)
    val subStr2 = souceStr.substring(11, 17)
//    参数是区间
    val subStr3 = souceStr.substring(11..17)
    println(subStr1)
    println(subStr2)
    println(subStr3)
}