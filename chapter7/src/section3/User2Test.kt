package section3

fun main(args: Array<String>) {
    var u = User2("悟空", "孙")
    //使用点语法赋值，实际上是调用setter方法
    u.fullName = "八戒.猪"
    println(u.first)
    println(u.last)
}