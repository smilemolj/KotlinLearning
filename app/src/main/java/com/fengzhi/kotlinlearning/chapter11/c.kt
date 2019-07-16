package com.fengzhi.kotlinlearning.chapter11

class Rectangle constructor(w: Int, h: Int) {
    var width: Int
    var height: Int
    var area: Int

    init {
        width = w
        height = h
        area = w * h
    }
}