//定义函数，该函数的返回值类型为(Int) -> Int
private fun getMathFunc(type: String): (Int) -> Int {
    //定义一个计算平方的局部函数
    fun square(n: Int): Int {
        return n * n
    }

    //定义一个计算立方的局部函数
    fun cube(n: Int): Int {
        return n * n * n
    }

    //定义一个计算阶乘的局部函数
    fun factorial(n: Int): Int {
        var result = 1
        for (index in 2..n) {
            result *= index
        }
        return result
    }

    return when (type) {
        //返回局部函数
        "square" -> ::square
        "cube" -> ::cube
        else -> ::factorial
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