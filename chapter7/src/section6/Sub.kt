package section6

open class Base {
    constructor() {
        println("Base的无参数的构造器")
    }

    constructor(name: String) {
        println("Base的带一个String参数：${name}的构造器")
    }
}

class Sub : Base {
    //构造器没有显式委托
    //因此该次构造器将会隐式委托调用父类无参数的构造器
    constructor() {
        println("Sub的无参数的构造器")
    }

    //构造器用super(name)显式委托父类带String参数的构造器
    constructor(name: String) : super(name) {
        println("Sub的String构造器，String参数为：$name")
    }

    //构造器用this(name)显式委托本类中带String参数的构造器
    constructor(name: String, age: Int) : this(name) {
        println("Sub的String, Int构造器，Int参数为：$age")
    }
}

fun main(args: Array<String>) {
    Sub()
    Sub("Sub")
    Sub("子类", 29)
}