import java.util.*

fun main(args: Array<String>) {
    var s1 = "java"
    var s2 = "kotlin"
    //下面两行代码是相同的
    println(s1 > s2)
    println(s1.compareTo(s2))
    var date1 = Date()
    var date2 = Date(System.currentTimeMillis() - 1000)
    println(date1 > date2)
    println(date1.compareTo(date2))
}