package section8

fun main(args: Array<String>) {
    val name: String by lazy {
        println("计算name局部变量")
        "疯狂Kotlin讲义"
    }

    //第一次访问name属性时，会执行Lambda表达式
    println(name)
    //以后再次访问name属性时，则直接使用第一次计算的值
    println(name)
}