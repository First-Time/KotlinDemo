fun main(args: Array<String>) {
    //定义常量，没有显式指定类型，编译器根据初始值确定常量的类型
    val maxAge = 120
    //定义常量时，既显式指定了常量的类型，也指定了常量的初始值
    val eduName: String = "疯狂软件教育"
    //常量不允许重新赋值，因此下面代码是错误的
//    maxAge = 12
    //同时定义多个变量
    //局部范围的常量，声明时不指定初始值
    val herName: String
}