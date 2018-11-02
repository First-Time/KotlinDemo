fun main(args: Array<String>) {
    //使用Person类定义一个Person类型的变量
//    var p: Person
    //调用Person类的构造器，返回一个Person对象
    //将该Person对象赋给p变量
//    p = Person()

    //在定义p变量的同时为p变量赋值
    var p = Person()
    //访问p的name属性，直接为该属性赋值
    p.name = "李刚"
    //调用p的say方法，声明say()方法时定义了一个形参
    //调用该方法必须为形参指定一个值
    p.say("Kotlin语言很简单，学习很容易")
    //直接输出p的name属性，将输出"李刚"
    println(p.name)
}