package section3

fun main(args: Array<String>) {
    var user = User("悟空", "孙")
    //输出user.fullName，实际上市调用其getter方法返回值
    println(user.fullName)
}