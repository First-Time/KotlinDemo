fun main(args: Array<String>) {
    //读取一行输入
    val ln = readLine()
    //in是String？类型，所以需要先判断in不为null
    if (ln != null) {
        //when分支不需要任何条件表达式
        when {
            //每个分支条件都是布尔表达式
            ln.matches(Regex("\\d+")) -> println("您输入的全是数字")
            ln.matches(Regex("[a-zA-Z]+")) -> println("您输入的全是字母")
            ln.matches(Regex("[a-zA-Z0-9]+")) -> println("您输入的是字母和数字")
            else -> println("您输入的包含特殊字符")
        }
    }
}