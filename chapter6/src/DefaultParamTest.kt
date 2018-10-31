//为两个参数指定默认值
private fun sayHi(name: String = "孙悟空", message: String = "欢迎来到疯狂软件") {
    println("$name, 您好")
    println("消息是：$message")
}

fun main(args: Array<String>) {
    //全部使用默认参数
    sayHi()
    //只有message参数使用默认值
    sayHi("白骨精")
    //两个参数都不使用默认值
    sayHi("白骨精", "欢迎学习kotlin")
    //只有name参数使用默认值
    sayHi(message = "欢迎学习kotlin")
}