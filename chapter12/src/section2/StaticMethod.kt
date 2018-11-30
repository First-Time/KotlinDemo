package section2

//指定零个父类型的命名对象
object MyObject3 {
    //方法
    fun test() {
        println("test方法")
    }

    @JvmStatic
    fun foo() {
        println("有@JvmStatic修饰的foo()方法")
    }
}

class MyClass3 {
    //省略名字的半生对象
    companion object {
        //方法
        fun test() {
            println("test方法")
        }

        @JvmStatic
        fun output(msg: String) {
            for (i in 1..6) {
                println("<h$i>$msg</h$i>")
            }
        }
    }
}