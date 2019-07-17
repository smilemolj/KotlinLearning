package com.fengzhi.kotlinlearning.chapter11

class View1 {
    fun handler(listener: OnClickListener5) {
        listener.onClick()
    }
}

interface OnClickListener {
    fun onClick()
}

fun main() {
    var i = 10
    val v = View1()
// 对象表达式作为函数参数
    v.handler(object : OnClickListener5 {
        override fun onClick() {
            println("对象表达式作为函数参数...")
            println(++i)
        }
    })
}