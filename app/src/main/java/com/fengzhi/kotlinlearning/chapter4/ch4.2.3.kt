package com.fengzhi.kotlinlearning.chapter4

class Person(val name: String,val age:Int)

fun main(args: Array<String>) {
//    不能改变p1的引用
    val p1=Person("Tony",18)
    print(p1.name)
    print(p1.age)
}