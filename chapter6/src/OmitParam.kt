fun main(args: Array<String>) {
    //省略形参名，用it代表形参
    var square: (Int) -> Int = { it * it }
    //使用square调用Lambda表达式
    println(square(5))  //输出25
    println(square(6))  //输出36
    //Lambda表达式有两个形参，无法省略
    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(result) //输出64
    var list = listOf("Java", "Kotlin", "Go")
    //省略形参名，用it代表形参
    var rt = list.dropWhile { it.length > 3 }
    println(rt) //输出[Go]
}