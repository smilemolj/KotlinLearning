package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val sourceStr = "There is a string accessing example."
    val len = sourceStr.length
    val ch = sourceStr[16]
    val firstChar1 = sourceStr.indexOf('r')
    val lastChar1 = sourceStr.lastIndexOf('r', ignoreCase = true)
    println("原始字符串:${sourceStr}")
    println("字符串长度：${len}")
    println("索引16的字符：${ch}")
    println("从前往后查找r字符，第一次找到它所在的索引：" + firstChar1)
    println("从后往前查找r字符，第一次找到它所在的索引：" + lastChar1)
}