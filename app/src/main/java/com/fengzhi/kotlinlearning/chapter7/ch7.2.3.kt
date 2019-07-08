package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val age = 18
    val s1 = "她的年龄是 ${age} 岁。"
    println(s1)

    val score = 'A'
    val s2 = "她的英语成绩是${score}"
    println(s2)
    val now = java.util.Date()
    val s3 = "今天是：${now.year + 1900}年${now.month}月${now.date}日"
    println(s3)
}