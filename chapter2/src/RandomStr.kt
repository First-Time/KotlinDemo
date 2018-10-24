fun main(args: Array<String>) {
    //定义一个空字符串
    var result = ""
    //进行6次循环
    for(i in 0..5) {
        //生成一个97~122之间的Int类型整数
        val intVal = (Math.random() * 26 + 97).toInt()
        //将intValue强制转换为Char类型后连接到result后面
        result += intVal.toChar()
        //输出随机字符串
        println(result)
    }
}