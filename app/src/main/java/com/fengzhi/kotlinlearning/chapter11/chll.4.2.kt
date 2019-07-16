package com.fengzhi.kotlinlearning.chapter11

fun main() {
    val emp=Employee()
    println(emp.fullName)
    emp.fullName="Tom.guan"
    println(emp.fullName)
    emp.salary=-10.0
    println(emp.salary)
    emp.salary=10.0
    println(emp.salary)
}