package section1

//定义一个简单的注解
annotation class Test

//使用@Test修饰类定义
@Test class MyClass {
    //使用@Test注解修饰属性
    @Test var name: String = ""
    //使用@Test注解修饰方法
    @Test fun info() {
        //...
    }
    //...
}

class User @Test constructor(var name: String, var pass: String) {

}