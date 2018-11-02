fun main(args: Array<String>) {
    //调用有参数的构造器创建实例
    var im = Item("1333", "疯狂Kotlin讲义", 69.8)
    //通过点语法访问对象的属性
    println(im.barCode)
    println(im.name)
    println(im.price)
}