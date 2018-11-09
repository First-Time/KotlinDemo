package section5

class NestedOut {
    //定义一个嵌套类，不使用访问控制符，默认是public
    open class Nested() {
        init {
            println("嵌套类的构造器")
        }
    }
}

fun main(args: Array<String>) {
    var nested: NestedOut.Nested = NestedOut.Nested()

//    上面代码可改为如下两行代码
//    使用OutterClass.InnerClass的形式定义嵌套类变量
//    var nested: NestedOut.Nested
//    通过调用嵌套类的构造器创建嵌套类实例
//    nested = NestedOut.Nested()
}