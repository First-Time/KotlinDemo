private fun fn(value: Int): Int {
    if (value == 0) {
        return 1
    } else if (value == 1) {
        return 4
    } else {
        return 2 * fn(value - 1) + fn(value - 2)
    }
}

fun main(args: Array<String>) {
    //输出recursive(10)的结果
    println("fn(10)的结果是：${fn(10)}")
}