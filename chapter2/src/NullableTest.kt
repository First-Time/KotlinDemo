import kotlin.test.assertSame

fun main(args: Array<String>) {
    var str = "fkit"
    //由于str转换为Int有可能失败，故num有可能没有值
    //因此不能使用Int来声明num的类型
//    var num: Int = str.toIntOrNull()
    var num: Int? = str.toIntOrNull()
    println(num)

    var aStr: String = "fkit"
    var bStr: String? = "fkit"
//    aStr = null //错误，aStr不接收null
    //编译通过，aStr不可能为null，运行时不可能导致NPE
    println(aStr.length)
    //编译不能通过，有可能导致NPE
//    println(bStr.length)
}