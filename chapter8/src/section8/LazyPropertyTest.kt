package section8

val lazyProp: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("第一次访问时执行代码块")
    "疯狂软件"
}

fun main(args: Array<String>) {
    //两次访问lazyProp属性
    println(lazyProp)
    println(lazyProp)
}