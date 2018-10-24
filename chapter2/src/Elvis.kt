fun main(args: Array<String>) {
    var b: String? = "fkit"
    //先判断b不为null，然后访问b的length属性
    var len1 = if (b != null) b.length else -1
    println("b的长度：$len1")
    b = null
    //先判断b不为null，然后调用b的length属性
    var len2 = b?.length ?: -1
    println(len2)
}