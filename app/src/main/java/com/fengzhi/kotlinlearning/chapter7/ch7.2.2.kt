package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val s1 = "hello"
    val s2 = s1 + " "
    val s3 = s2 + "world"
    println(s3)

    var s4 = "hello"
    s4 += " "
    s4 += "world"
    println(s4)

    val age = 18
    val s5 = "她的年龄是" + age + "岁。"
    println(s5)

    val score = 'A'
    val s6 = "她的英语成绩是" + score
    println(s6)
    val now = java.util.Date()
    val s7 = "今天是：" + now
    println(s7)
}