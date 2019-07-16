package com.fengzhi.kotlinlearning.chapter11

class User1 constructor(val name: String, var password: String)

class User2(val name: String, var password: String)

class User3 private constructor(val name: String, var password: String)

class Animal constructor(val age: Int = 0, val sex: Boolean = false)

fun main() {
    val animal = Animal()
    val anima2 = Animal(10)
    val anima3 = Animal(sex = true)
    val anima4 = Animal(10, true)
}