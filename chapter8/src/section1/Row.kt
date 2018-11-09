package section1

open class Raw {
    fun test() {
        println("test方法")
    }
}

class RawSub: Raw() {
    fun sub() {
        println("--sub()方法--")
    }
}

//定义一个函数，函数名为"被扩展类.方法"
fun Raw.info() {
    println("===扩展的info方法===")
}