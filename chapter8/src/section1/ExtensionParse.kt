package section1

//定义一个Base类
open class Base

//定义Sub类继承Base类
class Sub : Base()

//为Base类扩展foo方法
fun Base.foo() = println("Base扩展的foo()方法")

//为Sub类扩展foo方法
fun Sub.foo() = println("Sub扩展的foo()方法")

//定义一个函数
fun invokeFoo(b: Base) {
    //调用Base对象的foo()方法
    b.foo()
}

fun main(args: Array<String>) {
    //传入的是Sub对象
    invokeFoo(Sub())

    var bb: Base = Sub()
    bb.foo()
}