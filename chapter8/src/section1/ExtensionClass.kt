package section1

class A {
    fun bar() = println("A的bar方法")
}

class B {
    fun baz() = println("B的baz方法")
    //以成员方式为A扩展foo()方法
    fun A.foo() {
        //在该方法内既可调用类A的成员，也可调用类B的成员
        bar() //A对象为隐式调用者
        baz() //B对象为隐式调用者
    }

    fun test(target: A) {
        //调用A对象的成员方法
        target.bar()
        //调用A对象的扩展方法
        target.foo()
    }
}

fun main(args: Array<String>) {
    var b = B()
    b.test(A())
}