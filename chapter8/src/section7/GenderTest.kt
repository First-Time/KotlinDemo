package section7

fun main(args: Array<String>) {
    //通过Gender的valueOf()方法根据枚举名获取枚举值
    val g = Gender.valueOf("FEMALE")
    //访问枚举值的cnName属性
    println("${g}代表：${g.cnName}")
    //调用info方法
    g.info()
}