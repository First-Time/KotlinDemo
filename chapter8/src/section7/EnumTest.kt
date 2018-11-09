package section7

fun main(args: Array<String>) {
    //枚举类默认有一个values()方法，返回该枚举类的所有实例
    for (s in Season.values()) {
        println(s)
    }

    val seasonName = "SUMMER"
    val s: Season = Season.valueOf(seasonName)
    println(s)

    //直接访问枚举值
    println(Season.WINTER)
    println(Season.WINTER.ordinal)

    printAllValues<Season>()
}

inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}