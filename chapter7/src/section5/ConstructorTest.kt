package section5

//提供主构造器，该构造器包含两个参数
class ConstructorTest(name: String, count: Int) {
    var name: String
    var count: Int

    //定义初始化块，它相当于主构造器的执行体
    init {
        //初始化块中的this代表其进行初始化的对象
        //外面两行代码将传入的两个参数赋值给this所代表的对象的name和count属性
        this.name = name
        this.count = count
    }
}

fun main(args: Array<String>) {
    //使用自定义的构造器来创建对象
    //系统将会对该对象执行自定义的初始化
    var tc = ConstructorTest("疯狂Java讲义", 90000)
    //输出ConstructorTest对象的name和count两个属性
    println(tc.name)
    println(tc.count)
}