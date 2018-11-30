package section1

import java.util.concurrent.Executors
import java.util.function.Predicate

fun main(args: Array<String>) {
    //使用Lambda表达式来创建函数式接口（Predicate）的对象
    val pred = Predicate<Int> { t -> t > 5 }
    var list = arrayListOf(2, 200, 10, 34, 30, 44)
    //使用pred对list进行过滤
    list.removeIf(pred)
    println(list)
    //使用Lambda表达式来创建函数式接口（Runnable）的对象
    val rn = Runnable {
        for (i in 0..10) {
            println(i)
        }
    }
    //通过Runnable对象创建、启动线程
    Thread(rn).start()

    val executor = Executors.newSingleThreadExecutor()
    //由于executor的execute()方法需要一个Runnable对象
    //因此程序可自动将符合该接口规范的Lambda表达式创建成Runnable对象
    executor.execute { println("This runs in a thread pool") }
    executor.execute(rn)

    //当然也可在方法中显式指定Lambda表达式创建的是Runnable对象
    executor.execute { println("This runs in a thread pool") }
}