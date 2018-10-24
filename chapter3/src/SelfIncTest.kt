data class Data1(val x: Int, val y: Int) {
    //为Data类定义一个inc()方法
    operator fun inc(): Data1 {
        return Data1(x + 1, y + 1)
    }
}

//以扩展方法的形式为Data类定义dec()方法
operator fun Data1.dec(): Data1 {
    return Data1(x - 1, y - 1)
}

fun main(args: Array<String>) {
    var d = Data1(4, 10)
    println(d++)
    println(d)
    println(++d)
    println(d)
    var dd = Data1(9, 20)
    println(--dd)
    println(dd)
}