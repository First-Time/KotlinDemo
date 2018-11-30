package section3

//定义两个重载的函数
fun isSmall(i: Int) = i < 5

fun isSmall(s: String) = s.length < 5

fun main(args: Array<String>) {
    val list = listOf(20, 30, 100, 4, -3, 2, -12)
    //由于filter()函数需要(Int) -> Boolean类型的参数，故此处::isSmall引用第一个函数
    val resultList = list.filter(::isSmall)
    println(resultList) //输出[4, -3, 2, -12]

    val strlist = listOf("Java", "Kotlin", "Swift", "Go", "Erlang")
    //由于filter()函数需要(String) -> Boolean类型的函数，故此处::isSmall引用第二个函数
    val resultStrList = strlist.filter(::isSmall)
    println(resultStrList) //输出[Java, Go]

    //无法推断出::isSmall到底引用哪个函数，报错
//    val f = ::isSmall
    //可以推断出::isSmall到底引用哪个函数，正确
    val f2: (String) -> Boolean = ::isSmall
    println(f2("Lua"))
}