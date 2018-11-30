package section3.section01

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.functions

inline fun <reified T : Any> processTestable() {
    var passed = 0
    var failed = 0
    val target = T::class.createInstance<T>()
    //遍历T对应的类里的所有方法
    for (m in T::class.functions) {
        //如果该方法使用了@Testable修饰
        if (m.findAnnotation<Testable>() != null) {
            try {
                //调用m方法
                m.call(target)
                //测试成功，passed计数器加1
                passed++
            } catch (e: Exception) {
                println("方法" + m + "运行失败，异常：" + e.cause)
                //测试出现异常，failed计数器加1
                failed++
            }
        }
    }
    //统计测试结果
    println("共运行了：" + (passed + failed) + "个方法，其中：\n" + "失败了：" + failed + "个，\n" + "成功了：" + passed + "个！")
}

fun main(args: Array<String>) {
    //处理MyTest类
    processTestable<MyTest>()
}