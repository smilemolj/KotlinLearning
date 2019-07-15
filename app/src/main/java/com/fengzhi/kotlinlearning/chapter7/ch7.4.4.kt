package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val string = "ABC12CD34EF"
    val regex = Regex("""\d+""")
    val result = regex.replace(string, " ")
    println(result)
}