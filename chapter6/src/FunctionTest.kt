//定义一个函数，声明两个形参，返回值为Int类型
private fun max(x: Int, y: Int): Int {
    //定义一个常量z，该常量等于x、y中较大的值
    val z = if (x > y) x else y
    //返回常量z的值
    return z
    //return if (x > y) x else y
}

//定义一个函数，声明一个形参，返回值为String类型
private fun sayHi(name: String): String {
    println("===正在执行sayHi()函数")
    return "$name, 您好！"
}

fun main(args: Array<String>) {
    var a = 6
    var b = 9
    //调用max()函数，将函数返回值赋给result变量
    var result = max(a, b)
    println("result:$result")
    //调用sayHI()函数，直接输出函数的返回值
    println(sayHi("孙悟空"))
}