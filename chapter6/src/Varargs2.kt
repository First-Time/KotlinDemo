//定义一个形参个数可变的函数
private fun test(vararg books: String, num: Int) {
    //books被当成数组处理
    for (b in books) {
        println(b)
    }
    //输出整型变量a的值
    println(num)
}

fun main(args: Array<String>) {
    //调用test()函数
    test("疯狂IOS讲义", "疯狂Android讲义", num = 5)

    var arr = arrayOf("疯狂Kotlin讲义", "疯狂Java讲义")
    test(*arr, num = 20)
}