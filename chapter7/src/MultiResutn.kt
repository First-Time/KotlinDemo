//定义一个数据类
//数据类会自动为每个属性定义对应的componentN方法
data class Result(val result: Int, val status: String)

private fun factorial(n: Int): Result {
    if (n == 1) {
        return Result(1, "成功")
    } else if (n > 1) {
        return Result(factorial(n - 1).result * n, "成功")
    } else {
        return Result(-1, "参数必须大于0")
    }
}

fun main(args: Array<String>) {
    //通过解构获取函数返回的两个值
    var (rt, status) = factorial(6)
    println(rt)
    println(status)

    var (_, status2) = factorial(-6)
    println(status2)

    var result = Result(2, "未知结果")
    //调用copy()方法完成复制
    val oldRt = result.copy()
    println(oldRt)
}