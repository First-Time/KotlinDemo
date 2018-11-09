package section2

open class FinalMethodTest {
    fun test(){}
}

class Sub: FinalMethodTest() {
    //下面的方法定义将出现编译错误，不能重写final方法
//    override fun test(){}
}