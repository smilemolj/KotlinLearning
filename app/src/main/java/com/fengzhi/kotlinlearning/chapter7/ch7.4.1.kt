package com.fengzhi.kotlinlearning.chapter7

fun main() {
//    全部是数字模式
    val regex = Regex("""\d+""")
    val input1="1000"
    val input2="￥1000"
    println(regex.matches(input1))
    println(regex.matches(input2))
    println(regex.containsMatchIn(input1))
    println(regex.containsMatchIn(input2))
}