package section4;

//Kotlin注解可通过位置来指定属性值
//第一个值传给name属性，第二个值传给age属性
@KotlinTag(name = "疯狂Kotlin讲义", age = 29)
class Book {
    //Kotlin注解也可通过属性名来指定属性值
    @KotlinTag(name = "Kotlin", age = 14)
    //Java注解只能通过属性名来指定属性值
    @JavaTag(name = "java", age = 28)
    void test() {

    }
}
