import java.util.*

fun main(args: Array<String>) {
    var bookPrice: Byte = 79
    //在字符串模板中嵌入变量
    var s = "图书价格是：$bookPrice"
    println(s)
    val rand = Random() //创建Java的Random对象
    //在字符串模板中嵌入方法调用
    val s2 = "伪随机数是：${rand.nextInt(10)}"
    println(s2)
    val myStr = "fkjava.org"
    println("${myStr}的长度是${myStr.length}")
    var bookName = "疯狂Kotlin讲义"
    val poem = """
        |图书名是$bookName,
        |图书价格是$bookPrice,
        |随机促销价是${rand.nextInt(10) + 50}
    """.trimIndent()
    println(poem)
}