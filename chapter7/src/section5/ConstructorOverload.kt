package section5

class ConstructorOverload {
    var name: String?
    var count: Int

    init {
        println("初始化块！")
    }

    //提供无参数的构造器
    constructor() {
        name = null
        count = 0
    }

    constructor(name: String, count: Int) {
        this.name = name
        this.count = count
    }
}

fun main(args: Array<String>) {
    //通过无参数的构造器创建ConstructorOverload对象
    var oc1 = ConstructorOverload()
    //通过有参数的构造器创建ConstructorOverload对象
    var oc2 = ConstructorOverload("轻量级Java EE企业应用实战", 300000)
    println("${oc1.name} ${oc1.count}")
    println("${oc2.name} ${oc2.count}")
}