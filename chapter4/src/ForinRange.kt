fun main(args: Array<String>) {
    var max = 7
    var result = 1
    //使用for-in循环遍历范围
    for (num in 1..max) {
        result += num
    }
    println(result)

    for (i in 1 until 5) {
        println("i:$i")
        //对for-in循环的循环计数器赋值会导致错误
//        i = 20
    }
}