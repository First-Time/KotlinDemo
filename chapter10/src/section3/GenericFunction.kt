package section3

fun <T> copy(from: List<T>, to: MutableList<in T>) {
    for (ele in from) {
        to.add(ele)
    }
}

fun main(args: Array<String>) {
    var strList = listOf("Java", "Kotlin")
    var objList: MutableList<Any> = mutableListOf(2, 12, "Android")
    //指定泛型函数的T为String类型
    copy<String>(strList, objList)
    println(objList)
    var intList = listOf(7, 13, 17, 19)
    //不显式指定泛型函数的T的类型，系统推断出T为Int类型
    copy(intList, objList)
    println(objList)
}