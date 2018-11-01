fun main(args: Array<String>) {
    //定义一个Lambda表达式，并将它赋值给square变量
    var square = {n: Int -> n * n}
    //使用square调用Lambda表达式
    println(square(5))  //输出25
    println(square(6))  //输出36
    //定义一个Lambda表达式，并未它后面添加圆括号来调用该Lambda表达式
    var result = {base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    } (4, 3)
    println(result) //输出64
}