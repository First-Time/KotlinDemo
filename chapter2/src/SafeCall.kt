fun main(args: Array<String>) {
    var b: String? = "fkit"
    println(b?.length)
    b = null
    println(b?.length)

    //定义一个元素可空的数组
    val myArr: Array<String?> = arrayOf("fkit", "fkjava", null, "crazyit")
    for (item in myArr) {
        //当item不为null时才调用let函数
        item?.let { println(it) }
    }
}