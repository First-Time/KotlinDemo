package section1

//定义带value属性的注解
annotation class MyTag3(val value: String)

//该注解的target属性的类型是MyTag3
annotation class ShowTag(val message: String, val target: MyTag3)

@ShowTag("message属性值", MyTag3("yeeku"))
class Circle