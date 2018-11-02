package section4.lee

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 //默认是public访问权限

    protected class Nested {
        val e: Int = 5
    }
}

class Subclass : Outer() {
    //a不可访问
    //b、c、d可访问
    //Nested和e可访问

    override val b = 5 //被重新的b依然是protected访问权限
}

class Other(o: Outer) {
    //o.a、o.b不可访问
    //o.c、Other类在同一模块中，可以被访问
    //o.d可访问
    //Other.Nested不可访问，Nested::e也不可访问
}