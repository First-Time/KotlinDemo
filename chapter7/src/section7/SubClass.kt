package section7

open class BaseClass {
    open var book = 6
    fun base() {
        println("父类的普通方法")
    }

    open fun test() {
        println("父类的被覆盖的方法")
    }
}

class SubClass: BaseClass() {
    //重写父类的属性
    override var book = 60

    override fun test() {
        println("子类的覆盖父类的方法")
    }

    fun sub() {
        println("子类的普通方法")
    }
}

fun main(args: Array<String>) {
    //下面编译时类型和运行时类型完全一样，因此不存在多态
    var bc: BaseClass = BaseClass()
    println(bc.book) //输出6
    //下面两次调用将执行BaseClass的方法
    bc.base()
    bc.test()
    //下面编译时类型和运行时类型完全一样，因此不存在多态
    var sc: SubClass = SubClass()
    println(sc.book) //输出60
    //下面调用将执行从父类集成的base()方法
    sc.base()
    //下面调用将执行当前类的test()方法
    sc.test()
    //下面编译时类型和运行时类型不一样，多态发生
    var ploymophicBc: BaseClass = SubClass()
    println(ploymophicBc.book) //输出60————表明访问的依然是子类对象的属性
    //下面调用将执行从父类集成的base()方法
    ploymophicBc.base()
    //下面调用将执行当前类的test()方法
    ploymophicBc.test()
    //因为ploymophicBc的编译时类型是BaseClass
    //BaseClass类没有提供sub()方法，所以下面代码编译时会出现错误
//    ploymophicBc.sub()
}