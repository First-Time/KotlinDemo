package section2

class MyTest {

    //使用@Testable修饰info()方法
    @Testable
    fun info() {
        println("info方法...")
    }
}

fun main(args: Array<String>) {
    val aArray = MyTest::info.annotations
    //遍历所有注解
    for (an in aArray) {
        println(an)
    }
}