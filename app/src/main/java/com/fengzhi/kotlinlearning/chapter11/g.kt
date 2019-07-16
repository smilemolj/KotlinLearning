package com.fengzhi.kotlinlearning.chapter11

enum class WeekDays {
    MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY
}

fun main() {
    val day = WeekDays.FRIDAY
    println(day)
    when (day) {
        WeekDays.MONDAY -> println("星期一")
        WeekDays.TUESDAY -> println("星期二")
        WeekDays.WENSDAY -> println("星期三")
        WeekDays.THURSDAY -> println("星期四")
        else -> println("星期五")
    }
    println("-----------")
    val day1 = WeekDays1.FRIDAY
    println(day1)
    println("-----------")
    val allValues = WeekDays1.values()
    for (value in allValues) {
        println("${value.ordinal}---${value}")
    }
    val day5 = WeekDays1.FRIDAY
    val day6 = WeekDays1.valueOf("FRIDAY")
    println(day5 == WeekDays1.FRIDAY)
    println(day5 == day6)
}

enum class WeekDays1 constructor(private val wname: String, private val index: Int) {
    MONDAY("星期一", 0), TUESDAY("星期二", 1), WENSDAY("星期三", 2), THURSDAY("星期四", 3), FRIDAY("星期五", 4);

    override fun toString(): String {
        return "${wname}->${index}"
    }
}
