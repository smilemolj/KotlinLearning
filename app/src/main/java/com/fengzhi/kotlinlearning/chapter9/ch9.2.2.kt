package com.fengzhi.kotlinlearning.chapter9

import java.util.logging.Level

fun main() {
    val testScore = 75
    val grade = when (testScore / 10) {
        9 -> '优'
        8 -> '良'
        7, 6 -> '中'
        else -> '差'
    }
    println("Gradle=${grade}")
    val level = "优"
    val desc = when (level) {
        "优" -> "90分以上"
        "良" -> "80-90分"
        "中" -> "70-80分"
        "差" -> "9低于60分"
        else -> "无法判断"
    }
    println("说明=${desc}")
}