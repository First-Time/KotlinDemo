package section5

//使用主构造器声明属性
class Customer(val name: String = "匿名", var addr: String = "天河") {

}

fun main(args: Array<String>) {
    //调用有参数的主构造器
    var ct = Customer("孙悟空", "花果山")
    println(ct.name)
    println(ct.addr)
    //以构造参数的默认值调用构造器，看上去像调用无参数的构造器
    var ctm = Customer()
    println(ctm.name)
    println(ctm.addr)
}