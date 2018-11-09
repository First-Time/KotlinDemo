package section6

interface Outputable3 {
    fun output(msg: String)
}

class MyClass {
    //使用Companion修饰的伴生对象
    companion object MyObject1 : Outputable3 {
        val name = "name属性值"
        //重写父接口中的抽象方法
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h$i>$msg</h$i>")
            }
        }
    }
}

fun main(args: Array<String>) {
    //使用伴生对象所在的类调用伴生对象的方法
    MyClass.output("fkit.org")
    println(MyClass.name)
}