package com.fengzhi.kotlinlearning.chapter11

fun main() {
    var rectangle5=object {
        // 矩形宽度
        var width: Int = 200
        // 矩形高度
        var height: Int = 300
        //重写toString函数
        override fun toString(): String {
            return ("[width=$width, height=$height]")
        }
    }
    println(rectangle5)
}