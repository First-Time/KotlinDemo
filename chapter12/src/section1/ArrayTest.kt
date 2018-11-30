package section1

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3, 4)
    //不会使用get()、set()方法访问数组元素
    //实际上还是通过java数组的快速访问
    array[2] = array[2] * 2
    //使用索引定位是基于java数组元素所在内存地址的快速访问
    //不需要创建迭代器
    for (i in array.indices) {
        array[i] += 2
    }

    //for-in循环也是基于java数组元素所在内存地址的快速访问
    //不需要创建迭代器
    for (x in array) {
        println(x)
    }
}