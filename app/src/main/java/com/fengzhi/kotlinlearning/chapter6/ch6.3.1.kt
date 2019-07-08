package com.fengzhi.kotlinlearning.chapter6

fun main() {
    val byteNum: Byte = 16
//    Byte类型转换为short类型
    val shortNum: Short = byteNum.toShort()
    var intNum = 16
    val logNum: Long = intNum.toLong()
    intNum = logNum.toInt()
    val doubleNum = 10.8
    println("doubleNum.toInt:" + doubleNum.toInt())

    val charNum = 'A'
    println("charNum.toInt():" + charNum.toInt())
    val llongNum = 666666666666666L
    println("llongNum:" + llongNum)
    println("llongNum.toInt:" + llongNum.toInt())
}