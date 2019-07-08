package com.fengzhi.kotlinlearning.chapter4

fun main(args: Array<String>) {
    val englishscore = 95
    val chineseScore = 98
    val result = if (englishscore < 60) "不及格" else "及格"
    print(result)

    val totalSocre = sum(englishscore, chineseScore)
    println(totalSocre)
}

fun sum(a: Int, b: Int): Int = a + b