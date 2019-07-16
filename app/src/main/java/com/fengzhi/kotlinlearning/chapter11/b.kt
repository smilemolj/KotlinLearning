package com.fengzhi.kotlinlearning.chapter11

import kotlin.properties.Delegates

class Department2 {
    var no: Int = 0
    var name: String by Delegates.observable("<无>") { p, oldValue, newValue ->
        println("${oldValue}->$newValue")
    }
}

fun main() {
    val dept=Department2()
    dept.no=20
    dept.name="技术部"
    dept.name="市场部"
}