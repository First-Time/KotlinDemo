package section6

class ObjectExprType {
    private val ob1 = object {
        val name: String = "fkit"
    }
    internal val ob2 = object {
        val name: String = "fkit"
    }

    private fun privateBar() = object {
        val name: String = "fkjava.org"
    }

    fun publicBar() = object {
        val name: String = "fkjava.org"
    }

    fun test() {
        //ob1是private对象表达式，编译器可识别它的真实类型
        //下面代码正确
        println(ob1.name)

        //ob2是非private对象表达式，编译器当它是Any类型
        //下面代码错误
//        println(ob2.name)

        //privateBar是private函数，编译器可识别它返回的对象表达式的真是类型
        //下面代码错误
        println(privateBar().name)

        //publicBar是非private函数，编译器将它返回的对象表达式当成Any类型
        //下面代码错误
//        println(publicBar().name)
    }
}

fun main(args: Array<String>) {
    ObjectExprType().test()
}