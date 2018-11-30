package section1

fun main(args: Array<String>) {
    val list = listOf(2, 3, 10)
    //is不能检测泛型类型
//    println(list is List<String>)
    println(list is List<*>)
}