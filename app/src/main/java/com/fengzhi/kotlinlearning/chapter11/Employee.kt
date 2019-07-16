package com.fengzhi.kotlinlearning.chapter11

class Employee {
    var no: Int = 0;
    var job: String? = null
    var firstName: String = "Tony"
    var lastName: String = "guan"
    var fullName: String
        get() {
            return firstName + "." + lastName
        }
        set(value) {
            var name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }
    var salary: Double = 0.0
        set(value) {
            if (value >= 0.0) field = value
        }
}