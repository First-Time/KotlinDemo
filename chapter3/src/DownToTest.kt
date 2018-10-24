fun main(args: Array<String>) {
    //使用反向闭区间运算符定义区间
    var range1 = 6 downTo 2
    for (num in range1) {
        println("$num * 5 = ${num * 5}")
    }

    //为反向闭区间指定步长
    for (num in 7 downTo 1 step 2) {
        println("$num * 5 = ${num * 5}")
    }
}