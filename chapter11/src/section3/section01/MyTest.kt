package section3.section01

class MyTest {

    //使用@Testable注解指定该方法时需要测试的
    @Testable
    fun m1() {

    }

    fun m2() {

    }

    //使用@Testable注解指定该方法时需要测试的
    @Testable
    fun m3() {
        throw IllegalArgumentException("参数出错了！")
    }

    fun m4() {

    }

    //使用@Testable注解指定该方法时需要测试的
    @Testable
    fun m5() {

    }

    fun m6() {

    }

    //使用@Testable注解指定该方法时需要测试的
    @Testable
    fun m7() {
        throw RuntimeException("程序业务出现异常！")
    }

    fun m8() {

    }
}