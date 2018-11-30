package section4

annotation class MyTag
annotation class FkTag(val info: String)
class Item {
    //指定注解只对getter方法起作用
    //对getter方法用了两个注解：MyTag、FkTag
    @get:[MyTag FkTag(info = "补充信息")]
    var name: String = "fkJava"
}

fun main(args: Array<String>) {
    //获取Item类对应的Java类（Class对象）
    val clazz = Item::class.java
    //遍历clazz类所包含的全部方法
    for (mtd in clazz.declaredMethods) {
        println("--方法${mtd}上的注解如下--")
        //遍历该方法上直接声明的所有注解
        for (an in mtd.declaredAnnotations) {
            println(an)
        }
    }

    //遍历clazz类所包含的全部成员变量
    for (f in clazz.declaredFields) {
        println("--方法${f}上的注解如下--")
        //遍历该成员变量上直接声明的所有注解
        for (an in f.declaredAnnotations) {
            println(an)
        }
    }
}