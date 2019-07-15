package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val string = "ABC12CD34EF"
    val regex = Regex("""\d+""")
    val result = regex.find(string)
    println("第一个匹配字符串：${result?.value}")
    regex.findAll(string).forEach { e -> println(e.value) }
}