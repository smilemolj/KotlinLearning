package com.fengzhi.kotlinlearning.chapter11

class Rectangle2 constructor(var width: Int, var heigt: Int) {
    var area: Int

    init {
        area = width * heigt
    }

    constructor(width: Int, heigt: Int, area: Int) : this(width, heigt) {
        this.area = area
    }

    constructor(area: Int) : this(200, 100) {
        this.area = area
    }
}

class User5 {
    val username: String?
    val password: String?

    init {
        username = null
        password = null
    }
}

data class User6 constructor(val name: String, var password: String)

fun main() {
    var rect1 = Rectangle2(100, 90)
    var rect2 = Rectangle2(10, 9, 900)
    var rect3 = Rectangle2(20000)
    var user6 = User6("nihao", "999")
    var user8 = User6("hao", "666")
    println(rect1.area)
    println(rect2.area)
    println(rect3.area)
    println(user6.toString())
    println(user8.toString())
    println("--------------------")
    val user9 = User6("Tony", "123")
    val user10 = user9.copy(name = "Tom")
    val user11 = user9.copy()

    println(user10.toString())
    println(user11.toString())
    println(user9 == user11)
    println("-----------")
    val (name1, _) = user11
    println(name1)
}