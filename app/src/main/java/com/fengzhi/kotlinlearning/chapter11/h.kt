package com.fengzhi.kotlinlearning.chapter11

class View {
    val x = 20

    class Button {
        fun onclick() {
            println("onClick...")
        }
    }

    fun test() {
        val button = Button()
        button.onclick()
    }
}

fun main() {
    val button = View.Button()
    button.onclick()
    val view = View()
    view.test()
}