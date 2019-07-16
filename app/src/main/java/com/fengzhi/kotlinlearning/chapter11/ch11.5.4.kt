package com.fengzhi.kotlinlearning.chapter11

infix fun Double.interestBy1(interestRate: Double): Double {
    return this * interestRate
}

class Department5 {
    var no: Int = 10
    infix fun rp(times: Int) {
        repeat(times) {
            println(no)
        }
    }
}

fun main() {
    val interset1 = 10000.00.interestBy1(0.0689)
    println("利息1：${interset1}")
    val interest2 = 10000.00 interestBy1 0.088
    println("利息1：${interest2}")
    val dept = Department5()
    dept rp 3
}