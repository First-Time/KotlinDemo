//定义一个计算乘方的函数
private fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

//定义一个计算面积的函数
private fun area(width: Int, height: Int): Int {
    return width * height
}

fun main(args: Array<String>) {
    //定义一个变量，其类型为(Int, Int) -> Int
    var myFun: (Int, Int) -> Int
    //定义一个变量，其类型为(String)
    var test: (String)

    //将pow函数赋值给myFun，则myFun可当成pow使用
    myFun = ::pow
    println(myFun(3, 4))
    //将area函数赋值给myFun，则myFun可当成area使用
    myFun = ::area
    println(myFun(3, 4))
}


