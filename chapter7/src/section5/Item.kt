package section5

//使用主构造器声明属性
class Item(val code: String, var price: Double)

fun main(args: Array<String>) {
    var im = Item("1234567", 6.7)
    println(im.code)
    println(im.price)
}