package section4

class Apple<T : Number> {
    var col: T

    constructor(col: T) {
        this.col = col
    }
}

fun <T : Number> sum(vararg params: T): Double {
    var sum = 0.0
    for (p in params) {
        sum += p.toDouble()
    }
    return sum
}

fun main(args: Array<String>) {
    //显式指定泛型函数的T是Int类型
    var ai = Apple<Int>(2)

    //显式指定泛型函数的T是Double类型
    var ad: Apple<Double> = Apple(3.3)

    //下面代码将引发编译异常。下面代码试图把String类型传给T形参
    //但String不是Number的子类型，所以引发编译错误
//    var ap: Apple<String> = Apple("Kotlin")


    //显式指定泛型函数的T是Int类型，Int是Number的子类型
    println(sum<Int>(2, 4, 5))

    //系统推断出T为Double类型，Double是Number的子类型
    println(sum(1.2, 4.4, 5.6))
}