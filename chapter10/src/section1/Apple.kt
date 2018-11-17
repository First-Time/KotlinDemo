package section1

//定义Apple类时使用了泛型声明
open class Apple<T> {
    //使用泛型T定义属性
    open var info: T?

    constructor() {
        info = null
    }

    //下面方法中使用泛型T来定义构造器
    constructor(info: T) {
        this.info = info
    }
}

fun main(args: Array<String>) {
    //由于传给泛型T的是String，所以构造器的参数只能是String
    var a1: Apple<String> = Apple<String>("苹果")
    println(a1.info)

    //由于传给泛型T的是Int，所以构造器的参数只能是Int
    var a2: Apple<Int> = Apple(3)
    println(a2.info)

    //由于传给泛型T的是Double，所以构造器的参数只能是Double
    var a3 = Apple(5.67)
    println(a3.info)
}