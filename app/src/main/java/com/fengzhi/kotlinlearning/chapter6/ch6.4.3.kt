package com.fengzhi.kotlinlearning.chapter6

fun main() {
    val divNumber1= divide(100,0)
//    为空则返回0
    val result1=divNumber1?.plus(100)?:0
    println(result1)
}