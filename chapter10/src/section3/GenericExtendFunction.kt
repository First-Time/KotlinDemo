package section3

//为泛型形参T扩展方法
fun <T> T.toBookString(): String {
    return "《${this.toString()}》"
}

fun main(args: Array<String>) {
    val a = 2
    //显式指定泛型函数的T为Int类型
    println(a.toBookString<Int>())

    //不显式指定泛型函数的T的类型，系统推断出T为Double类型
    println(3.4.toBookString())

    var str = "疯狂Kotlin讲义"
    //不显式指定泛型函数的T的类型，系统推断出T为String类型
    println(str.toBookString())
}