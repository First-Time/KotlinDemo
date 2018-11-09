package section3

abstract class Shape {
    init {
        println("执行Shape的初始化块")
    }

    var color = ""
    //定义一个计算周长的抽象方法
    abstract fun calPerimeter(): Double

    //定义一个代表形状的抽象的只读属性
    //抽象属性不需要初始值
    abstract val type: String

    //定义Shape的构造器，该构造器并不是用于创建Shape对象的，而是用于被子类调用
    constructor() {}

    constructor(color: String) {
        println("执行Shape的构造器...")
        this.color = color
    }
}