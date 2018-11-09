package section1

//定义一个带接收者的匿名函数
val factorial = fun Int.(): Int {
    //该匿名函数的接收者是Int对象
    //因此在该匿名函数中，this代表调用该匿名函数的Int对象
    return when {
        this < 0 -> -1
        this == 1 -> 1
        else -> {
            var result = 1
            for (i in 1..this) {
                result *= i
            }
            result
        }
    }
}

fun main(args: Array<String>) {
    println(6.factorial())
}