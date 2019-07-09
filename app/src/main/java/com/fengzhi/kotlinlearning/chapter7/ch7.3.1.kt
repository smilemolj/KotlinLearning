package com.fengzhi.kotlinlearning.chapter7

import java.lang.StringBuilder

fun main() {
    val sbuilder1 = StringBuilder()
    println("字符串容量：${sbuilder1.capacity()}")
    val sbuilder2 = StringBuilder("Hello")
    println("字符串长度:${sbuilder2.length}")
    println("字符串容量：${sbuilder2.capacity()}")
    val sbuilder3 = StringBuilder()
    for (i in 0..16) sbuilder3.append(8)
    println("字符串长度:${sbuilder3.length}")
    println("字符串容量：${sbuilder3.capacity()}")
}