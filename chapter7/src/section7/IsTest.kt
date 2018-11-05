package section7

import java.util.*

interface Testable {}

fun main(args: Array<String>) {
    //声明hello时使用Any类，则hello的编译时类型是Any
    //hello变量的实际类型是String
    val hello: Any = "Hello"
    println("字符串是否是String类型的实例：${hello is String}") //返回true
    //Date与Any类存在继承关系，可以进行is运算
    println("字符串是否是Date类型的实例：${hello is Date}") //返回false
    //String没有实现TestProtocal协议，所以返回false
    println("字符串是否是Testable协议的实例：${hello is Testable}") //返回false
    val a: String = "Hello"
    //String类与Date类没有继承关系，所以下面代码编译出现错误
//    println("字符串是否是Date类的实例：${a is Date}")
}