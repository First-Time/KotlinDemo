package section5

class DiscernVariable { //隐式标签 @DiscernVariable
    private val prop = "外部类的属性"

    inner class InClass { //隐式标签 @InClass
        private val prop = "内部类的属性"
        fun info() {
            val prop = "局部变量"
            //通过外部类名.this.varName访问外部类的属性
            println("外部类的属性值：${this@DiscernVariable.prop}")

            //通过this.varName访问内部类的属性
            println("内部类的属性值：${this@InClass.prop}")

            //直接访问局部变量
            println("局部变量的值：$prop")
        }
    }

    fun test() {
        val ic = InClass()
        ic.info()
    }
}

fun main(args: Array<String>) {
    DiscernVariable().test()
}