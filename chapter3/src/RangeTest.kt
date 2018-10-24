fun main(args: Array<String>) {
    //使用闭区间运算符定义区间
    val range1 = 2..6
    for (num in range1) {
        println("$num * 5 = ${num * 5}")
    }

    //定义数组
    val books = arrayOf("Swift", "Kotlin", "C", "C++")
    //使用半开区间运算符定义区间
    for (index in 0 until books.size) {
        println("第${index + 1}种语言是：${books[index]}")
    }
}