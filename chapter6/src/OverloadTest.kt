//下面定义了3个test()函数，但函数的形参列表不同，系统可以区分它们，这被称为函数重载
private fun test() {
    println("无参数的test()函数")
}

//该函数类型为(String): Unit
private fun test(msg: String) {
    println("重载的test()函数$msg")
}

//该函数类型为(Int): String
private fun test(msg: Int): String {
    println("重载的test()函数$msg,带返回值")
    return "test"
}

fun main(args: Array<String>) {
    //调用test()时没有传入参数，因此系统调用上面没有参数的test()函数
    test()
    //调用带String参数的test()函数
    test("fkjava")
    //调用带Int参数的test()函数，该函数返回字符串
    var rt = test(30)
    println(rt)
}