package section1

class ExtensionAndMember {
    //为该类定义成员方法：foo()
    fun foo() = println("成员方法")
}

//为ExtensionAndMemeber类定义扩展方法：foo()
fun ExtensionAndMember.foo() = println("扩展方法")

fun ExtensionAndMember.foo(name: String) = println("扩展方法，参数：$name")
fun ExtensionAndMember.foo(age: Int) = println("扩展方法，参数：$age")

fun main(args: Array<String>) {
    var ea = ExtensionAndMember()
    ea.foo()
    ea.foo("刘燕霏")
    ea.foo(123)
}