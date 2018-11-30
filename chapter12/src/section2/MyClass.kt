package section2

class MyClass {
    //使用companion修饰的伴生对象
    companion object MyObject1 {
        @JvmField
        val name = "name属性值"
    }
}

fun main(args: Array<String>) {
    println(MyClass.name)
    println(MyClass.MyObject1.name)
}