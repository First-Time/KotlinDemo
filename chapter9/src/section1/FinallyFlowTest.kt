package section1

fun main(args: Array<String>) {
    var a = test()
    println(a)
}

fun test(): Boolean {
    try {//因为finally块中包含了return语句
        //所以下面的return语句失去作用
        return true
    } finally {
        return false
    }
}