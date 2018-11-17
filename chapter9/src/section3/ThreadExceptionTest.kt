package section3

class ThreadExceptionTest: Runnable {

    override fun run() {
        firstMethod()
    }

    private fun firstMethod() {
        secondMethod()
    }

    private fun secondMethod() {
        val a = 5
        val b = 0
        val c = a / b
    }
}

fun main(args: Array<String>) {
    Thread(ThreadExceptionTest()).start()
}