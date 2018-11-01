//定义一个形参个数可变的函数
private fun test(a: Int, vararg books: String) {
    //books被当成数组处理
    for (b in books) {
        println(b)
    }
    //输出整型变量a的值
    println(a)
}

fun main(args: Array<String>) {
    //调用test()函数
    test(5, "疯狂IOS讲义", "疯狂Android讲义")
}