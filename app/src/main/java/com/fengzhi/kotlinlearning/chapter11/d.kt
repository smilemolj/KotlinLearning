package com.fengzhi.kotlinlearning.chapter11

class Rectangle1 constructor(var width: Int, var height: Int) {
    var area: Int

    init {
        area = width * height
    }
}