package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val s1 = ""
    val s2 = "helloworld"
    val s4 = "hello\nworld"
    val s5 = """hello
world"""
    println(s4 == s5)
    val s6 = """hello\nworld"""
    println(s6)
}