package com.fengzhi.kotlinlearning.chapter11

import kotlin.reflect.KProperty

class User {
    var name: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String = property.name
    operator fun setValue(thisRef: Any?, property: KProperty<*>,value:String){
        println(value)
    }
}

fun main() {
    val user=User()
    user.name="Tom"
    println(user.name)
}