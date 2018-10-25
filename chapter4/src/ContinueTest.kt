fun main(args: Array<String>) {
    //一个简单的for循环
    for (i in 0 until 3) {
        println("i的值是：$i")
        if (i == 1) {
            //忽略本次循环的剩下语句
            continue
        }
        println("continue后的输出语句")
    }
}