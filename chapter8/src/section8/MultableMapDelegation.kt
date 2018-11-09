package section8

class MutableItem(var map: MutableMap<String, Any?>) {
    var barCode: String by map
    var name: String by map
//    var price: Double by map
    var price: Double = 10.0
}

fun main(args: Array<String>) {
    var item = MutableItem(mutableMapOf(

    ))

//    println(item.barCode)
//    println(item.name)
    println(item.price)

    item.barCode = "133355"
    item.name = "疯狂Kotlin讲义"
    item.price = 68.9

    println(item.barCode)
    println(item.name)
    println(item.price)
    println("---------------------")

    //将对象持有的map暴露出来，其他程序可通过标准Map读取数据
    val map = item.map
    println(map["barCode"])
    println(map["name"])
    println(map["price"])

    map["price"] = 78.8
    println(map["price"])
    println(item.price)
}