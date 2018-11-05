package section7

open class Fruit {
    var name: String
    var weight: Double

    constructor(name: String, weight: Double) {
        this.name = name
        this.weight = weight
    }
}

class Apple : Fruit {
    var color: String

    constructor(name: String, weight: Double, color: String) : super(name, weight) {
        this.color = color
    }
}

class Grape : Fruit {
    var sugarRate: Double

    constructor(name: String, weight: Double, sugarRate: Double) : super(name, weight) {
        this.sugarRate = sugarRate
    }
}

fun main(args: Array<String>) {
    //使用数组保存4个水果
    var fruits = arrayOf(
            Apple("红富士", 1.8, "粉色"),
            Apple("花牛果", 2.3, "红色"),
            Grape("巨峰", 1.4, 0.34),
            Grape("加州提子", 2.2, 0.45)
    )
    //由于fruits的类型是Array<Fruit>，因此程序只知道该数组元素是Fruit
    for (f in fruits) {
        //此处使用as?强制转换，因此ap的类型是Apple？
        var ap = f as? Apple
        //由于ap的类型是ap？，因此程序使用?.语法来访问它的属性
        println("${ap?.name}苹果的颜色是：${ap?.color}")
    }
}