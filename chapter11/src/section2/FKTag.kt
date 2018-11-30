package section2

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
//指定该注解可重复注解
@Repeatable
annotation class FKTag(val name: String = "疯狂软件", val age: Int)

@FKTag(age = 5)
@FKTag(name = "疯狂Java", age = 9)
class FKTagTest