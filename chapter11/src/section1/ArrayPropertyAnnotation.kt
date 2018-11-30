package section1

annotation class MyTag2(vararg val infos: String)

class Role {

    //使用带属性的注解
    @MyTag2("java", "yeeku", "kotlin")
    fun info() {
        //...
    }
    //...
}