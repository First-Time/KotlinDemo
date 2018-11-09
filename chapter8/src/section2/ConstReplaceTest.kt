package section2

//下面定义了4个"宏变量"
const val a = 5 + 2
const val b: Double = 1.2 / 3
const val str: String = "疯狂" + "Java"
const val book: String = "疯狂Java讲义：" + 99.0
//下面的book2常量的值因为使用了另一个常量，所以无法在编译时被确定下来
val d = 99.0
//const val book2: String = "疯狂Java讲义：" + d

fun main(args: Array<String>) {
    println(book === "疯狂Java讲义：99.0")
}