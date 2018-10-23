fun main(args: Array<String>) {
    //声明变量时显式指定类型
    var b : Int
    //声明变量时指定初始值，编译器会根据初始值确定该变量的类型为String
    var name = "crazit.org"
    b = 20 //b的类型是Int(整型)，赋值正确
    name = "fkit.org" //name的类型是String，赋值正确
    name = 12 //name的类型是String，但12为Int，赋值错误
    //声明变量是既显式指定类型，也指定初始值
    //显式指定的类型与初始值的类型一致，声明变量正确
    var age: Int = 25
    age = 12 //age的类型是Int，赋值正确
    //声明变量是既显式指定类型，也指定初始值
    //显式指定的类型与初始值的类型不一致，声明变量失败
    var sun: String = 500
    val book = "疯狂kotlin讲义"
    book = "a" //使用val声明的变量是不可变变量，不能被重新赋值
}