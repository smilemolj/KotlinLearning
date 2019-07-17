package com.fengzhi.kotlinlearning.chapter11

class Outer {
    val x = 10
    fun printOuter() {
        println("调用外部函数")
    }

    fun test() {
        val inner = Inner()
        inner.display()
    }

    inner class Inner {
        private val x = 5
        fun display() {
            println("外部类属性x=${this@Outer.x}")
            println("内部类属性x=${this.x}")
        }
    }
}

fun main() {
    val outer=Outer()
    outer.test()
    val inner=Outer().Inner()
    inner.display()
}