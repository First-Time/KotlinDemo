package section3

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions

class Foo2 {
    fun test2(msg: String) {
        println("执行带String参数的test方法:$msg")
    }

    fun test2(msg: String, price: Double) {
        println("执行带String, Double参数的test2方法：$msg,$price")
    }
}

fun main(args: Array<String>) {
    val clazz = Foo2::class
    //创建Foo类的实例
    val ins = clazz.createInstance()
    //获取clazz所代表类直接定义的全部函数
    val funs = clazz.declaredFunctions
    for (f in funs) {
        //如果函数具有3个参数（对应带2个参数的方法）
        if (f.parameters.size == 3) {
            //调用带3个参数的函数
            f.call(ins, "Kotlin", 78.8)
        }
        //如果函数具有2个参数（对应带1个参数的方法）
        if (f.parameters.size == 2) {
            //调用带2个参数的函数
            f.call(ins, "Kotlin")
        }
    }
}
