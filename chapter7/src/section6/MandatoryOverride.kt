package section6

open class Foo {
    open fun test() {
        println("Foo的test")
    }

    fun foo() {
        println("foo")
    }
}

interface Bar {
    //接口中成员默认是open的
    fun test() {
        println("Bar的test")
    }

    fun bar() {
        println("bar")
    }
}

class Wow: Foo(), Bar {
    override fun test() {
        super<Foo>.test()// 调用父接口Foo的test()
        super<Bar>.test()// 调用父接口Bar的test()
        super.foo()
        super.bar()
    }
}

fun main(args: Array<String>) {
    var w = Wow()
    w.test()
}