package section5

class A { //隐式标签@A
    inner class B { //隐式标签@B
        //为Int扩展foo()方法
        fun Int.foo() { //隐式标签@foo
            val a = this@A //A的this
            val b = this@B //B的this
            val c = this //不带标签的this，默认代表该方法所属对象：Int对象
            val c1 = this@foo //显式指定@foo标签，与c代表的对象相同
            println(a)
            println(b)
            println(c)
            println(c1)

            //为String扩展funLit()方法
            val funLit = lambda@ fun String.() {
                val d = this //不带标签的this，默认代表该方法所属对象：String对象
                val d1 = this@lambda //显式指定@lambda标签，与d代表的对象相同
                println(d)
                println(d1)
            }

            "fkit".funLit()
            //直接定义一个Lambda表达式，没有接收者
            val funLit2 = {
                //该this所在的Lambda表达式没有接收者，因此当前范围没有this
                //系统会继续向该Lambda表达式所在范围搜索this
                //故此处this将代表foo()方法的接收者：Int对象
                val e = this
                val e1 = this@foo //显式指定@foo标签，与e代表的对象相同
                println("foo()方法中Lambda表达式的this：" + e)
                println("e1的this：" + e1)
            }
            funLit2()
        }

        fun testB() {
            //调用2（Int值）的foo()方法
            2.foo()
        }
    }

    fun testA() {
        var bObj = B()
        println("程序创建的B对象：$bObj")
        bObj.testB()
    }
}

fun main(args: Array<String>) {
    var aObj = A()
    println("程序创建的A对象：$aObj")
    aObj.testA()
}