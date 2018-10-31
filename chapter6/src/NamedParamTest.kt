//定义一个函数
private fun girth(width: Double, height: Double): Double {
    println("width:$width")
    println("height:$height")
    return 2 * (width + height)
}

fun main(args: Array<String>) {
    //传统调用函数的方式，根据位置传入参数
    println(girth(3.5, 4.8))
    //根据参数名来传入参数
    println(girth(width = 3.5, height = 4.8))
    //根据命名参数时可交换位置
    println(girth(height = 4.8, width = 3.5))
    //部分使用命名参数，部分使用位置参数
    println(girth(3.5, height = 4.8))

    //位置参数必须放在命名参数之前，下面代码错误
//    println(girth(width = 3.5, 4.8))
}