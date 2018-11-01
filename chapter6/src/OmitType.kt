fun main(args: Array<String>) {
    //由于程序定义了square变量的类型，因此Kotlin可以推断出Lambda表达式的形参类型
    var square: (Int) -> Int = { n -> n * n }
    //使用square调用Lambda表达式
    println(square(5))  //输出25
    println(square(6))  //输出36
    //此时Kotlin无法推断出base、exponent两个形参的类型，因此必须为其制定类型
    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(result) //输出64
    var list = listOf("Java", "Kotlin", "Go")
    //使用Lambda表达式定义去除条件：长度大于3的集合元素被去除
    //由于doWhile()方法的形参是(T) -> Boolean类型
    //因此调用该方法时可省略形参类型
    var rt = list.dropWhile { e -> e.length > 3 }
    println(rt) //输出[Go]
}