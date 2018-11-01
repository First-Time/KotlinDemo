//定义函数类型的形参，其中fn是(Int) -> Int类型的形参
private inline fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array(data.size) { 0 }
    //遍历data数组的每个元素，并用fn函数对data[i]进行计算
    //然后将计算结果作为新数组的元素
    for (i in data.indices) {
        result[i] = fn(data[i])
    }
    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    var mappedResult1 = map(arr) { it + 3 }
    println(mappedResult1.contentToString())
}