package com.fengzhi.kotlinlearning.chapter11

open class Person (val name: String, val age: Int)
interface OnClickListener1 {
    fun onClick()
}
fun main() {
    val person = object : Person("Tony", 18), OnClickListener1 {
        //实现接口onClick函数
        override fun onClick() {
            println("实现接口onClick函数...")
        }

        //重写toString函数
        override fun toString(): String {
            return ("Person[name=$name, age=$age]")
        }
    }
    println(person)
    println(person.onClick())
}