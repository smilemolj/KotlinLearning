package com.fengzhi.kotlinlearning.chapter7

fun main() {
    val s1 = "hello"
    val s2 = "hello"

    println(s1.equals(s2))
    println(s1 == s2)
    val s3 = "HELlo"
    println(s1.equals(s3, ignoreCase = true))
    println(s1 == s3)
    val s4 = "java"
    val s5 = "Kotlin"
    println(s4.compareTo(s5))
    println(s4.compareTo(s5, ignoreCase = true))

    val docFolder = arrayOf("java.docx", "JavaBean.docx", "Object-c.xlsx", "Swift.docx")
    var wordDocCount = 0
    for (doc in docFolder) {
        if (doc.endsWith(".docx")) wordDocCount++
    }
    println("文件夹中word文档个数是：${wordDocCount}")
    var javaDocCount = 0
    for (doc in docFolder) if (doc.startsWith("java", ignoreCase = true)) javaDocCount++
    println("文件夹中Java相关文档个数是：${javaDocCount}")
}