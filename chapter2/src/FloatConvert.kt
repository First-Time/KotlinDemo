fun main(args: Array<String>) {
    var width: Float = 2.3f
    var height: Double = 4.5
    println("width的值是：$width")
    println("height的值是：$height")
    //width必须显式强制转换为Double之后，才能赋值给变量a
    var a: Double = width.toDouble()
    println("a的值为: $a")
    //将height强制转换为Float之后再进行计算，整个表达式的类型是Float，因此area1的类型也被推断为Float
    val area1 = width * height.toFloat()
    println("area1的类型是：${area1.javaClass}")
    //表达式中的height是Double类型，它是等级最高的运算符，因此整个表达式的类型是Double，area2的类型也被推断为Double
    var area2 = width * height
    println("area2的类型是：${area2.javaClass}")
    val multi: Int = 5
    //因此totalHeight1的类型也被推断为Double
    val totalHeight = height * multi
    println("totalHeight的类型是：${totalHeight.javaClass}")
    //将height强制转换为Int类型后进行计算，整个表达式的类型是Int，因此totalHeihht2的类型也被推断为Int
    var totalHeight2 = height.toInt() * multi
    println("totalHeight2的类型是：${totalHeight2.javaClass}")
    println("totalHeight2的值是：${totalHeight2}")
}