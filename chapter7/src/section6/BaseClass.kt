package section6

open class BaseClass {
    var name: String

    constructor(name: String) {
        this.name = name
    }
}

//子类没有显式声明主构造器
//子类默认有一个主构造器，因此要在声明继承时委托调用父类构造器
class SubClass1 : BaseClass("foo") {

}

//子类显式声明主构造器
//主构造器必须在声明继承时委托调用父类构造器
class SubClass2(name: String) : BaseClass(name) {

}