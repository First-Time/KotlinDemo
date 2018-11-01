private fun test(msg: String) {
    println("只有一个字符串参数的test()函数$msg")
}

//因为前面已经有了一个带一个字符串参数的test()函数，此处的个数可变的形参又可以包含带一个字符串参数的形式
private fun test(vararg books: String) {
    println("****形参个数可变的test()函数****${books.contentToString()}")
}

fun main(args: Array<String>) {
    //下面两次调用将执行第二个test()函数
    test()
    test("aa", "bb")
    test("aa")
}