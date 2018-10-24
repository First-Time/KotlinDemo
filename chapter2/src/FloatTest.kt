fun main(args: Array<String>) {
    var af1 = 5.2345556f
    //下面将看到af1的值已经发生了改变
    println("af1的值为：$af1")
    //声明af2是Float类型，但25.2345默认是Double类型，因此下面代码编译时报错
//    var af2: Float = 25.2345
    //f1的类型被推断为Double
    var f1 = 5.12e2
    println("f1的值为：$f1")
    var a = 0.0
    //5.0除以0.0将出现正无穷大数值
    println("5.0/a的值为：${5.0/a}")
    //所有的正无穷大数值都相等，所以下面将会输出true
    println(5.0 / a == 50000 / 0.0)
    //-5.0除以0.0将出现负无穷大数值
    println("-5.0/a的值为：${-5.0/a}")
    //所有的负无穷大数值都相等，所以下面将会输出true
    println(-5.0 / a == -50000 / 0.0)
    //0.0除以0.0将出现非数
    var nan: Double = a / a
    println("a/a的值为：${nan}")
    //非数与自己都不相等，所以下面将会输出false
    println(nan == nan)
}