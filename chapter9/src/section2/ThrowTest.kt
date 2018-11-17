package section2

fun main(args: Array<String>) {
    //无论该异常在Java中是否是checked异常
    //在Kotlin中该异常都不是checked异常
    throwChecked(3)
    throwRuntime(3)
}

fun throwChecked(a: Int) {
    if (a > 0) {
        //自行抛出普通异常，在Kotlin中也不是checked异常
        //该代码不必处于try块中
        throw Exception("a的值大于0，不符合要求")
    }
}

fun throwRuntime(a: Int) {
    if (a > 0) {
        throw RuntimeException("a的值大于0，不符合要求")
    }
}