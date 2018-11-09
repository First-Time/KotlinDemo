package section6

interface Outputable2 {
    fun output(msg: String)
}

abstract class Product2(var price: Double) {
    abstract val name: String
    abstract fun printInfo()
}

//指定一个父类型（接口）的对象表达式
object MyObject1: Outputable2 {
    //重写父接口中的抽象方法
    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h$i>$msg</h$i>")
        }
    }
}

//指定零个父类型的对象表达式
object MyObject2{
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
    class Foo
}

//指定两个父类型的对象表达式
//由于Product2只有一个带参数的构造器，因此需要传入构造器参数
object MyObject3: Outputable2, Product2(28.8) {
    override fun output(msg: String) {
        println("输出信息：$msg")
    }

    override val name: String
        get() = "激光打印机"

    override fun printInfo() {
        println("高速激光打印机，支持自动双面打印")
    }
}

fun main(args: Array<String>) {
    MyObject1.output("疯狂软件教育中心")
    println("-------------------------")

    println(MyObject2.name)
    MyObject2.test()
    println("----------------------------")

    println(MyObject3.name)
    MyObject3.output("Kotlin真不错！")
    MyObject3.printInfo()
}