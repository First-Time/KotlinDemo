//定义函数类型的形参，其中fn是(Int) -> Unit类型的形参
private inline fun each(data: Array<Int>, fn: (Int) -> Unit) {
    for (el in data) {
        fn(el)
    }
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    each(arr) {
        println(it)
        return  //如果each函数没有inline修饰，此处编译错误
        //如果each函数有inline修饰，此处的return将返回main函数
    }
}