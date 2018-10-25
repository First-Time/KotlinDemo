fun main(args: Array<String>) {
    var inputPrice = 26
    println(realPrice(inputPrice))
}

//程序对inputPrice的类型进行判断
fun realPrice(inputPrice: Any) = when (inputPrice) {
    //如果inputPrice的类型为String，程序返回该字符串转换的Double值
    is String -> inputPrice.toDouble()
    //如果inputPrice的类型是Int，程序返回该Int值转换的Double值
    is Int -> inputPrice.toDouble()
    is Double -> inputPrice
    else -> 0.0
}