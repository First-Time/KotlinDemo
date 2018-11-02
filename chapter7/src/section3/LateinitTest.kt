package section3

import java.util.*

class User1 {
    //延迟初始化属性
    lateinit var name: String
    lateinit var birth: Date
}

fun main(args: Array<String>) {
    var user = User1()
//    println(user.name)
//    println(user.birth)
    user.name = "孙悟空"
    user.birth = Date()
    println(user.name)
    println(user.birth)
}