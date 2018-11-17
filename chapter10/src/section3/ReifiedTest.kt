package section3

import java.util.*

val db = listOf("Java", Date(), 103, 2.3, '我')

/*fun <T> findData(clazz: Class<T>): T? {
    for (ele in db) {
        if (clazz.isInstance(ele)) {
            @Suppress("UNCHECKED_CAST")
            return ele as? T
        }
    }
    return null
}*/

//使用reified修饰泛型形参，使之成为具体化的类型参数
inline fun <reified T> findData(): T? {
    for (ele in db) {
        if (ele is T) {
            return ele
        }
    }
    return null
}

fun main(args: Array<String>) {
    println(findData<Int>())
    println(findData<Double>())
}