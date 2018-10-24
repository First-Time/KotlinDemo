fun main(args: Array<String>) {
    val s1 = "2.34"
    //将s1字符串转换成Double类型
    val d: Double = s1.toDouble()
    println(d)
    var s2 = "45"
    //将s2字符串转换成Int类型
    val i: Int = s2.toInt()
    println(i)

    var str2 = "crazyit.org"
    //返回两个字符串相同的前缀
    println(str2.commonPrefixWith("crazyjava.org"))
    //返回两个字符串相同的后缀
    println(str2.commonSuffixWith("fkit.org"))

    var str3 = "java886"
    //判断str3是否包含3个连续的数字
    println(str3.contains(Regex("\\d{3}")))
}