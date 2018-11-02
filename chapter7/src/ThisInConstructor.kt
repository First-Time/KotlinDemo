class ThisInConstructor {
    //定义一个名为foo的属性
    var foo: Int

    constructor() {
        //在构造器中定义一个foo变量
        val foo = 0
        //使用this代表该构造器正在初始化的对象
        //下面的代码将会把该构造器正在初始化的对象的foo属性设为6
        this.foo = 6
    }
}

fun main(args: Array<String>) {
    //所有使用ThisInConstructor创建的对象的foo属性将被设为6
    println(ThisInConstructor().foo) //输出6
}