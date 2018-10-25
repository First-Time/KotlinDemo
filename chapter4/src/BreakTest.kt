fun main(args: Array<String>) {
    //一个简单的for循环
    for (i in 0..10) {
        println("i的值是：$i")
        if (i == 2) {
            //执行该语句时将结束循环
            break
        }
    }
}