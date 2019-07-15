package com.fengzhi.kotlinlearning.chapter9

fun main() {
    var i = 0
    while (i * i < 100_000) {
        i++
    }
    println("i=${i}")
    println("i*i=${i * i}")
}