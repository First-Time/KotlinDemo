private fun <T> test(vararg names: String, transform: (String) -> T): List<T> {
    var mutableList: MutableList<T> = mutableListOf()
    for (name in names) {
        mutableList.add(transform(name))
    }
    return mutableList.toList()
}

fun main(args: Array<String>) {
    //将Lambda表达式放在圆括号后面，无需使用命名参数
    var list1 = test("Java", "Kotlin", "Go") { it.length }
    println(list1)
    //将Lambda表达式放在圆括号后面，无需使用命名参数
    var list2 = test("Java", "Kotlin", "Go") { "疯狂${it}讲义" }
    println(list2)
}