package com.fengzhi.kotlinlearning.chapter11

interface DAOInterface {
    //插入数据
    fun create(): Int

    //查询所有数据
    fun findAll(): Array<Any>?
}

object UserDAO : DAOInterface {
    //保存所有数据属性
    private var datas: Array<Any>? = null

    override fun findAll(): Array<Any>? {
//TODO 查询所有数据
        return datas
    }

    override fun create(): Int {
//TODO 插入数据
        return 0
    }
}

fun main() {
    UserDAO.create()
    var datas = UserDAO.findAll()
}