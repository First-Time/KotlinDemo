package section3

fun main(args: Array<String>) {
    var p = Person("李刚", 29)
    p.age = 120 //赋值非法，赋值失败
    println(p.age) //输出29
    p.age = 25 //赋值合法，赋值成功
    println(p.age) //输出29
}