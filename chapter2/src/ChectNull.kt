fun main(args: Array<String>) {
    var b: String? = "fkit"
    //先判断b不为null，然后访问b的length属性
    var len = if (b != null) b.length else 1
    println("b的长度：$len")
    b = null
    //先判断b不为null，然后调用b的length属性
    if (b != null && b.length > 0) {
        //访问b的length属性
        println(b.length)
    } else {
        println("空字符串")
    }

    var c: Boolean? = null
    if (c == true) {
        println("为真")
    }
}