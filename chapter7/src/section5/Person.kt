package section5

class Person(name: String) {
    //下面定义一个初始化块
    init {
        var a = 6
        if (a > 4) {
            println("Person初始化块：局部变量a的值大于4")
        }
        println("Person的初始化块")
        println("name参数为：$name")
    }

    //定义第二个初始化块
    init {
        println("Person的第二个初始化块")
    }
}

fun main(args: Array<String>) {
    Person("孙悟空")
}