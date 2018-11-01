//定义函数，该函数的返回值类型为(Int) -> Int
private fun getMathFunc(type: String): (Int) -> Int {
    return when (type) {
        //返回局部函数
        "square" -> { n: Int -> n * n }
        "cube" -> { n: Int -> n * n * n }
        else -> { n: Int ->
            var result = 1
            for (index in 2..n) {
                result *= index
            }
            result
        }
    }
}

fun main(args: Array<String>) {
    //调用getMathFunc(),程序返回一个(Int) -> Int类型的函数
    var mathFunc = getMathFunc("cube") //得到cube函数
    println(mathFunc(5)) //输出9
    mathFunc = getMathFunc("square") //得到square函数
    println(mathFunc(5)) //输出9
    mathFunc = getMathFunc("other") //得到factorial函数
    println(mathFunc(5)) //输出9
}