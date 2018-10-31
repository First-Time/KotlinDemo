//定义一个函数，该函数既无参数，业务返回值
private fun foo() {
    println("程序执行foo()函数")
}

//定义一个函数，该函数没有返回值，但函数有一个形参
private fun sayHi(name: String): Unit {
    println("====程序执行sayHi()函数====")
    println("$name,你好。欢迎光临")
}
//定义一个函数，该函数没有返回值，但函数有两个形参
private fun showMsg(msg: String, count: Int) {
    for (i in 1..count) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    foo()
    sayHi("孙悟空")
    showMsg("欢迎学习Kotlin", 3)
}