package section3

class SelfException : Exception {
    constructor()
    constructor(msg: String) : super(msg)
}

class PrintStackTraceTest {
    fun firstMethod() {
        secondMethod()
    }

    private fun secondMethod() {
        thirdMethod()
    }

    private fun thirdMethod() {
        throw SelfException("自定义异常信息")
    }
}

fun main(args: Array<String>) {
    PrintStackTraceTest().firstMethod()
}