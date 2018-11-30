package section1

annotation class MyTag(val name: String = "yeeku", val age: Int = 29)

class Item {
    //使用带属性的注解时，需要为属性指定属性值
    @MyTag(name="xx", age = 6)
    fun info() {
        //...
    }
    //...
}

class Item1 {
    //使用带属性的注解
    //因为它的属性有默认值，所以可以不为该属性指定值
    @MyTag
    fun info() {
        //...
    }
    //...
}