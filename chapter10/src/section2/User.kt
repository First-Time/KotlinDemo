package section2

class User<out T> {
    //此处不能用var，否则就有setter方法
    //setter方法会导致T出现在方法形参中
    val info: T

    constructor(info: T) {
        this.info = info
    }

    fun test(): T {
        println("执行test方法")
        return info
    }
}

fun main(args: Array<String>) {
    //此处T的类型是String
    var user = User("fkit")
    println(user.info)
    println(user.test())
    //对于u2而言，它的类型是User<Any>，此时T的类型是Any
    //由于程序声明了T支持协变，因此User<String>可当成User<Any>使用
    var u2: User<Any> = user
    println(u2.info)
    println(user.test())
}