package section4

interface Outputable {
    //只读属性定义了getter方法，非抽象属性
    val name: String
        get() = "输出设备"

    //只读属性没有定义getter方法，抽象属性
    val brand: String

    //读写属性没有定义getter、setter方法，抽象属性
    var category: String

    //接口中定义的抽象方法
    fun out()

    fun getData(msg: String)

    //在接口中定义的非抽象方法，可使用private修饰
    fun print(vararg msgs: String) {
        for (msg in msgs) {
            println(msg)
        }
    }

    //在接口中定义的非抽象方法，可使用private修饰
    fun test() {
        println("接口中的test()方法")
    }
}