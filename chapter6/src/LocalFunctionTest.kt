//定义函数，该函数的返回值类型为Int
private fun getMathFunc(type: String, nn: Int): Int {
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
        //调用局部函数
        "square" -> square(nn)
        "cube" -> cube(nn)
        else -> factorial(nn)
    }
}

fun main(args: Array<String>) {
    println(getMathFunc("square", 3)) //输出9
    println(getMathFunc("cube", 3)) //输出27
    println(getMathFunc("", 3)) //输出6
}