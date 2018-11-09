package section1

//为可空类型扩展equals方法
fun Any?.equals(other: Any?): Boolean {
    if (this == null) {
//        return if (other == null) true else false
        return other == null
    }
    return other.equals(other)
}

fun main(args: Array<String>) {
    var a = null
    println(a.equals(null))
    println(a.equals("Kotlin"))
}