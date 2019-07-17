package com.fengzhi.kotlinlearning.chapter11

fun Double.interestBy(interestRate:Double):Double{
    return this*interestRate
}
class Account{
    var amount:Double=0.0
    var owner:String=""
}
fun Account1.interestBy(interestRate: Double):Double{
    return this.amount*interestRate
}
fun main() {
    val interest1=10000.00.interestBy(0.066)
    println("利息1：${interest1}")
    val account=Account1()
    val interest2=account.interestBy(0.066)
    println("利息2：${interest2}")
}