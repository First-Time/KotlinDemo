package section6

open class Item {
    protected open var price: Double = 10.9
    open val name: String = ""
    open var validDays: Int = 0
}

class Book : Item {
    //正确重写了父类属性，类型兼容，访问权限更大
    public override var price: Double
    //正确重写了父类属性，读写属性重写只读属性
    override var name: String = "图书"
    //重写错误，只读属性不能重写读写属性
//    override val validDays: Int = 2

    constructor() {
        price = 3.0
    }
}