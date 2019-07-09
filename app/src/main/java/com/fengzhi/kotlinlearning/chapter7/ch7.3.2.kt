package com.fengzhi.kotlinlearning.chapter7

import java.lang.StringBuilder

fun main() {
    val sbuilder1 = StringBuilder("Hello")
    sbuilder1.append(" ").append("World")
    sbuilder1.append('.')
    println(sbuilder1)
    val sbuilder2 = StringBuilder()
    val obj: Any? = null
    sbuilder2.append(false).append('\t').append(obj)
    println(sbuilder2)
    val sbuilder3 = StringBuilder()
    for (i in 0..9) sbuilder3.append(i)
    println(sbuilder3)
    sbuilder3.insert(4, "kotlin")
    println(sbuilder3)
    sbuilder3.delete(1, 2)
    println(sbuilder3)
    sbuilder3.replace(3, 9, "A")
    println(sbuilder3)
}