fun main(args: Array<String>) {
    test()
}

fun test() {
    //一个简单的for循环
    for (i in 0 until 10) {
        println("i的值是：$i")
        if (i == 1) {
            return
        }
        println("return后的输出语句")
    }
}