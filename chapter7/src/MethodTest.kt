private class MethodTest {
    //定义一个无参数的run方法
    //其类型是() -> Unit
    fun run() {
        println("run方法")
    }

    //定义一个带String参数的run方法
    //其类型是(String) -> Unit
    fun eat(food: String) {
        println("正在吃：$food")
    }
}

fun main(args: Array<String>) {
    //将Dog的run方法赋值给rn变量
    //rn变量的类型应该是(Dog) -> Unit
    var rn: (MethodTest) -> Unit = MethodTest::run
    val d = MethodTest()
    rn(d)
    //将Dog的eat方法赋值给et变量
    //et变量的类型应该是(Dog, String) -> Unit
    var et = MethodTest::eat/**/
    et(d, "肉骨头")
}