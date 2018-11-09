package section5

class Outer {
    private val outProp = 9

    inner class Inner {
        val inProp = 5
        fun accessOuterProp() {
            //内部类可以直接访问外部类的private属性
            println("外部类的outProp值：$outProp")
        }
    }

    fun accessInnerProp() {
        //外部类不能直接访问内部类的属性
        //下面代码出现编译错误
//        println("内部类的inProp值：$inProp")
        //如需访问内部类的属性，必须显示创建内部类对象
        println("内部类的inProp值：${Inner().inProp}")
        Inner().accessOuterProp()
    }
}

fun main(args: Array<String>) {
    //执行下面代码，只创建了外部类对象，还未创建内部类对象
    val ot = Outer()
    ot.accessInnerProp()
}