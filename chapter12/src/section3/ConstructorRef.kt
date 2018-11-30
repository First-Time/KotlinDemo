package section3

class Foo(var name: String = "未知")

//test函数的参数是(String) -> Foo类型（这就是Foo带参数的构造器的类型）
fun test(factory: (String) -> Foo) {
    val x: Foo = factory("疯狂Kotlin讲义")
    println(x.name)
}

fun main(args: Array<String>) {
    //通过::Foo引用Foo类的主构造器
    test(::Foo)
}