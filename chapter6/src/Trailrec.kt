//定义计算阶乘的函数
private fun fact(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        n * fact(n - 1)
    }
}

fun main(args: Array<String>) {
    println(fact(10))
    println(fact(5))
}