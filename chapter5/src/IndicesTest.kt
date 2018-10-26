import java.util.*

fun main(args: Array<String>) {
    var books = arrayOf("轻量级Java EE企业应用实践", "疯狂Java讲义", "疯狂Android讲义")
    // 根据数组的索引来遍历数组
    for (i in books.indices) {
        println(books[i])
    }

    var i = Random().nextInt(10)
    //检查i是否位于books数组的索引区间内
    println(i in books.indices) //i >= 0 && i < books.size

    println(books.lastIndex)
    println(books.size - 1 == books.lastIndex)
}