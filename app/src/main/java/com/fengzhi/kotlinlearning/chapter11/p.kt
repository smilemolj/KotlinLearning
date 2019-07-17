package com.fengzhi.kotlinlearning.chapter11

import java.util.*

//声明OnClickListener接口
interface OnClickListener5 {
    fun onClick()
}

class Account6 {
    // 实例属性账户金额
    var amount = 0.0
    // 实例属性账户名
    var owner: String? = null

    // 实例函数
    fun messageWith(amt: Double): String {
//实例函数可以访问实例属性、 实例函数、 静态属性和静态函数
        val interest = Account6.interestBy(amt)
        return "${owner}的利息是${interest}"
    }

    companion object Factory : Date(), OnClickListener5 {
        override fun onClick() {
        }

        // 静态属性利率
        var interestRate: Double = 0.0

        // 静态函数
        fun interestBy(amt: Double): Double {
// 静态函数可以访问静态属性和其他静态函数
            return interestRate * amt
        }

        // 静态代码块
        init {
            println("静态代码块被调用...")
// 初始化静态属性
            interestRate = 0.0668
        }
    }
}

fun main() {
    val myAccount = Account6()
// 访问伴生对象属性
    println(Account6.interestRate)
    println(Account6.Factory.interestRate)
// 访问伴生对象函数
    println(Account6.interestBy(1000.0))
    println(Account6.Factory.interestBy(1000.0))
}