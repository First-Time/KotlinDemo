fun main(args: Array<String>) {
    var bookPrice: Byte = 79
    var itemprice: Short = 120
    //bookPrice是Byte类型，但变量a是Short类型，因此下面代码错误
//    var a: Short = bookPrice
    //显式将bookPrice强制转换为Short类型
    var a: Short = bookPrice.toShort()
    var b: Byte = itemprice.toByte()
    println("a: $a, b:$b")
    val amount = 233
    //将Int类型变量转换为Byte类型，发生溢出
    val byteAmount: Byte = amount.toByte()
    print("byteAmount:$byteAmount")

    //算数表达式中的bookPrice，itemPrice会自动提升为Int类型
    var total = bookPrice + itemprice
    println("total的值为：$total")
    //可以看到total映射的Java类型为int
    println("total的类型为：$total.javaClass")
    //下面表达式中的bookPrice强制转换为Long类型，因此整个表达式类型为Long
    val tot = bookPrice.toLong() + itemprice.toLong()
    println("tot的值为：$tot")
    //可以看到total映射的Java类型为long
    println("total的类型为：${tot.javaClass}")
}