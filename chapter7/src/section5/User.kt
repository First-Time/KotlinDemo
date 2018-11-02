package section5

//定义主构造器
class User(name: String) {
    var name: String
    var age: Int
    var info: String? = null

    init {
        println("User的初始化块")
        this.name = name
        this.age = 0
    }

    //委托给主构造器
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    //委托给(String, Int)构造器
    constructor(name: String, age: Int, info: String) : this(name, age) {
        this.info = info
    }
}

fun main(args: Array<String>) {
    //调用主构造器
    var us1 = User("孙悟空")
    println("${us1.name} => ${us1.age} => ${us1.info}")
    //调用(String, Int)构造器
    var us2 = User("白骨精", 21)
    println("${us2.name} => ${us2.age} => ${us2.info}")
    //调用(String, Int, String)构造器
    var us3 = User("蜘蛛精", 20, "吐丝织网")
    println("${us3.name} => ${us3.age} => ${us3.info}")
}