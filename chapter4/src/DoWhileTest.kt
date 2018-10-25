fun main(args: Array<String>) {
    //定义变量count
    var count = 1
    //执行do while循环
    do {
        println(count)
        //循环迭代语句
        count++
        //循环条件紧跟while关键字
    } while (count < 10)
    println("循环结束！")

    //定义变量count
    var count2 = 20
    //执行do while循环
    do {
        //这行代码把循环体和迭代部分合并成一行代码
        println(count2++)
    } while (count2 < 10)
    println("循环结束！")
}