package section7

fun main(args: Array<String>) {
    var a: Any = "fkit"
    //直接访问a的length属性，编译器报错
    //由于a的编译时类型是Any，因此编译时它没有length属性
//    println(a.length)
    //先判断a为String，在if条件体中a被自动转换为String类型
    if (a is String) println(a.length)

    //能进入&&之后的表达式，表明a是String类型
    //因此在&&之后可调用a的length属性
    if (a is String && a.length > 3) {
        println("a的长度大于3")
    }

    var b: Any = 123
    when (b) {
        //如果进入该分支，则表明a是String类型，可调用String的方法
        is String -> println(b.length)
        //如果进入该分支，则表明a是Int类型，可调用Int的方法
        is Int -> println(b.toDouble())
    }

    test(123)
    foo("")
}

fun test(x: Any) {
    //如果x不是String，函数返回
    if (x !is String) return
    //因此以下部分，x会被自动转换为String类型
    println("x的长度为：${x.length}")
}

fun foo(x: Any) {
    //能进入||之后的表达式，表明a是String类型
    //因此在||之后可调用a的length属性
    if (x !is String || x.length == 0) {
        return
    }
    //以下部分，x会被自动转换为String类型
    println("x的长度为：${x.length}")
}