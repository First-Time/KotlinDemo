package section1

annotation class MyTag1(val value: String)

class Category {

    //为value属性指定属性值时无须带属性名
    @MyTag1("feeku")
    fun info() {
        //...
    }
    //...
}