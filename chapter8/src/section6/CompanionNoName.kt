package section6

interface Outputable4 {
    fun output(msg: String)
}

class MyClass2 {
    //省略名称的伴生对象
    companion object : Outputable4 {
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
    MyClass2.output("fkit.org")
    //使用Companion名称访问伴生对象
    println(MyClass2.Companion)
}