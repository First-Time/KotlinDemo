package section6

interface Outputable {
    fun output(msg: String)
}

abstract class Product(var price: Double) {
    abstract val name: String
    abstract fun printInfo()
}

fun main(args: Array<String>) {
    //指定一个父类型（接口）的对象表达式
    var ob1 = object : Outputable {
        //重写父接口中的抽象方法
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h$i>$msg</h$i>")
            }
        }
    }

    ob1.output("疯狂软件教育中心")
    println("-------------------------")

    //指定零个父类型的对象表达式
    var ob2 = object {
        //初始化块
        init {
            println("初始化块")
        }

        //属性
        var name = "Kotlin"

        //方法
        fun test() {
            println("test方法")
        }

        //只能包含内部类，不能包含嵌套类
        inner class Foo
    }

    println(ob2.name)
    ob2.test()
    println("----------------------------")

    //指定两个父类型的对象表达式
    //由于Product只有一个带参数的构造器，因此需要传入构造器参数
    var ob3 = object : Outputable, Product(28.8) {
        override fun output(msg: String) {
            println("输出信息：$msg")
        }

        override val name: String
            get() = "激光打印机"

        override fun printInfo() {
            println("高速激光打印机，支持自动双面打印")
        }
    }

    println(ob3.name)
    ob3.output("Kotlin真不错！")
    ob3.printInfo()
}