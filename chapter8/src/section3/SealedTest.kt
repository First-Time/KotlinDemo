package section3

//定义一个密封类，其实就是抽象类
sealed class Apple {
    abstract fun taste()
}

open class RedFuji : Apple() {
    override fun taste() {
        println("红富士苹果香甜可口")
    }
}

data class Gala(var weight: Double) : Apple() {
    override fun taste() {
        println("嘎啦果更清脆，重量为：$weight")
    }
}

class test {
    fun judge(ap: Apple) {
        when (ap) {
            is RedFuji -> println("红富士苹果")
            is Gala -> println("嘎啦果")
        }
    }
}

fun main(args: Array<String>) {
    //使用Apple声明变量，用子类实例赋值
    var ap1: Apple = RedFuji()
    var ap2: Apple = Gala(2.3)
    ap1.taste()
    ap2.taste()
}