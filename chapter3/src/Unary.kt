fun main(args: Array<String>) {
    var a = 20
    //使用运算符
    val b = -a
    //调用方法
    val c = a.unaryMinus()
    println("b:$b, c:$c")
    val flag = true
    val notFlag1 = !flag
    //调用方法
    val notFlag2 = flag.not()
    println("notFlag1:$notFlag1, notFlag2:$notFlag2")
}