package section1

class Tiger {
    fun foo() {
        println("Tiger类的foo()方法")
    }
}

class Bear {
    private fun foo() {
        println("Bear类的foo()方法")
    }

    //以成员方式为Tiger类扩展test()方法
    private fun Tiger.test() {
        foo()
        //使用带标签的this指定调用Bear的foo()方法
        this@Bear.foo()
    }

    fun info(tiger: Tiger) {
        tiger.test()
    }
}

fun main(args: Array<String>) {
    var b = Bear()
    b.info(Tiger())
}