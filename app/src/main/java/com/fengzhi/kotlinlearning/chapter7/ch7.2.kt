package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val chars = charArrayOf(
        'a', 'b', 'c', 'd', 'e'
    )
    val s1 = String(chars)
    val s2 = String(chars, 1, 4)
    println("s1=" + s1)
    println("s2=" + s2)
    val bytes = byteArrayOf(97, 98, 99)
    val s3 = String(bytes)
    val s4 = String(bytes, 1, 2)
    println("s3=" + s3)
    println("s4=" + s4)
}