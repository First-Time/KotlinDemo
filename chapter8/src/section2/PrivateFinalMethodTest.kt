package section2

open class PrivateFinalMethodTest {
    //其实下面的方法、属性使用private修饰是多余的
    private fun test() {}

    private var name: String = "父类属性"
}

class Sub1 : PrivateFinalMethodTest() {
    //下面的方法定义不会出现问题
    fun test() {}

    var name: String = "子类属性"
}