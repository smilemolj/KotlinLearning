package com.fengzhi.kotlinlearning.chapter4

fun main(args: Array<String>) {
    var 您好="世界"
    var public="共有的"
//    it是普通标识符
    var it=100
//    创建一个数组
    val ary= arrayListOf<String>("A","B","C")
//    it特定标识符
    ary.forEach { print(it) }
}