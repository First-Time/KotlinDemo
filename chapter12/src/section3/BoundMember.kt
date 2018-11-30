package section3

fun main(args: Array<String>) {
    val str = "Kotlin"
    //获取对象绑定的方法
    val f: (CharSequence, Boolean) -> Boolean = str::endsWith
    //调用绑定的方法时不需传入调用者
    println(f("lin", true))
    //获取对象绑定的属性
    val prop = str::length
    //调用绑定的属性时无需传入调用者
    println(prop.get())

    var list = listOf("Kotlin", "Java", "Go", "Erlang")
    //获取对象绑定的方法
    val fn = list::subList
    //调用绑定的方法时不需传入调用者
    println(fn(1, 3))
    //获取对象绑定的属性
    val prp = list::indices
    //调用绑定的属性时无需传入调用者
    println(prp.get())
}