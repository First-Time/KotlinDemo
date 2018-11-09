package section6

interface Outputable5 {
    fun output(msg: String)
}

class MyClass3 {
    //省略名称的伴生对象
    companion object : Outputable5 {
        val name = "name属性值"
        //重写父接口中的抽象方法
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h$i>$msg</h$i>")
            }
        }
    }
}

//为伴生对象扩展方法
fun MyClass3.Companion.test() {
    println("为伴生对象扩展的方法")
}

val MyClass3.Companion.foo
    get() = "为伴生对象扩展的属性"

fun main(args: Array<String>) {
    //使用伴生对象所在的类调用伴生对象的方法
    MyClass3.output("fkit.org")
    println(MyClass3.name)
    //通过伴生对象所在的类调用为伴生对象扩展的成员
    MyClass3.test()
    println(MyClass3.foo)
}