data class Data(val x: Int, val y: Int) {
    //为Data类定义一个unaryMinus()方法
    operator fun unaryMinus(): Data {
        return Data(-x, -y)
    }
}

//以扩展方法的形式为Data类定义not()方法
operator fun Data.not(): Data {
    return Data(-x, -y)
}

fun main(args: Array<String>) {
    val d = Data(4, 10)
    println(-d)
    println(!d)
}