package section5

fun main(args: Array<String>) {
    //使用Lambda表达式创建Runnable实例
    var t = Runnable {
        for (i in 0..100) {
            println("${Thread.currentThread().name}, i:$i")
        }
    }

    //启动新线程
    Thread(t).start()

    //主线程的循环
    for (i in 0..100) {
        println("${Thread.currentThread().name}, i:$i")
    }
}