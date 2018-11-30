package section1

fun main(args: Array<String>) {
    val jv = JavaVarargs()
    jv.test(2, 4, 5)
    val intArr = intArrayOf(6, 20, 33)
    //将数组解开成多个元素
    jv.test(*intArr)
}