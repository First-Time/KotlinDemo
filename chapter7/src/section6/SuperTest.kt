package section6

open class BaseClass1 {
    open var a: Int = 5
}

class SubClass : BaseClass1() {
    override var a: Int = 7
    fun accessOwner() {
        println(a)
    }

    fun accessBase() {
        //通过super限定刚问从父类继承得到的a属性
        println(super.a)
    }
}

fun main(args: Array<String>) {
    val sc = SubClass()
    sc.accessOwner() //输出7
    sc.accessBase() //输出5
}