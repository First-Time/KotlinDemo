package section5

class NestedCalssTest {
    var propl = 5
    fun test() {
        println("外部类的test()方法")
    }

    //没有inner修饰符，是嵌套类（相当于Java的静态内部类）
    class NestedClass {
        fun accessOuterMemeber() {
            //访问另一个嵌套类是允许的
            val a = A()
            //下面两行代码都会出现错误
//            println(propl)
//            test()
        }
    }

    class A
}