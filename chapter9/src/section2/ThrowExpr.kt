package section2

class User(var name: String? = null, var pass: String? = null)

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    val user = User()
    //在Elvis表达式中使用throw表达式
    //throw表达式表示程序出现异常，不会真正对变量进行赋值
//    val th: String = user.name ?: throw NullPointerException("目标对象不能为null")
//    println(th)

    val s: String = user.name ?: fail("目标对象不能为null")
    println(s)
}