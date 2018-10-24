fun main(args: Array<String>) {
    //直接指定单个字符作为字符值
    val aChar: Char = 'a'
    //使用转义字符来作为字符值
    val enterChar: Char = '\r'
    //使用Unicode编码值来指定字符值
    val ch: Char = '\u9999'
    //将输出一个'香'字符
    println(ch)
    //定义一个'疯'字符值
    val zhong: Char = '疯'
    //将Char型变量当成Int型变量处理会报错
//    var zhongValue: Int = zhong
}