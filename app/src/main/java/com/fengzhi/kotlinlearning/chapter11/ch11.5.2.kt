package com.fengzhi.kotlinlearning.chapter11

class Department3 {
    var no: Int = 0
    var name: String = ""

}

var Department3.desc: String
    get() {
        return "Department3 [no=${this.no},name=${this.name}]"
    }
    set(value) {
        println(value)
    }
val Int.errorMessage: String
    get() = when (this) {
        -7 -> "没有数据"
        -6 -> "没有"
        -5 -> "没数据"
        -4 -> "有数据"
        -3 -> "数据"
        else -> ""
    }

fun main() {
    val message = (-7).errorMessage
    println("error code:-7,error message:${message}")
    val dept = Department3()
    dept.name = "小宝贝"
    dept.no = 100
    println(dept.desc)
}