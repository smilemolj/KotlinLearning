package com.fengzhi.kotlinlearning.chapter11

open class Employee2{
    var no:Int=0
    var firstName:String="Tony"
    var lastName:String="Guan"
    val fullName:String by lazy {
        firstName+"."+lastName
    }
    lateinit var dept:Department1
}
class Department1{
    var no:Int=0
    var name:String=""
}

fun main() {
    val emp=Employee2()
    println(emp.fullName)
    val dept=Department1()
    dept.no=20
    emp.dept=dept
    println(emp.dept)
}