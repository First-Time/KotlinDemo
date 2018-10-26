import java.util.*

fun main(args: Array<String>) {
    //创建包含指定元素的数组
    var strArr = arrayOf("Kotlin", "Java", "Go", "Swift")
    //使用两种方式获取数组元素
    println(strArr[1])
    println(strArr.get(1))
    //使用两种方式修改数组元素
    strArr[1] = "Groovy"
    strArr.set(2, "Lua")
    println(Arrays.toString(strArr))

    //访问数组元素指定的索引值等于数组长度，所以下面代码将在运行时出现异常
//    println(strArr[4])

    //创建指定长度、元素为null的数组
    var prices = arrayOfNulls<Double>(5)
    //使用循环输出prices数组的每个数组元素的值
    for (i in 0 until prices.size) {
        println(prices[i])
    }

    var books = arrayOfNulls<String>(4)
    //对动态初始化后的数组元素进行赋值
    books[0] = "疯狂Java讲义"
    books[1] = "轻量级Java EE企业应用实践"
    //使用循环输出books数组的每个数组元素的值
    for (i in 0 until books.size) {
        println(books[i])
    }
}