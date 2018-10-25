fun main(args: Array<String>) {
    var age = 20
    //将if表达式赋值给str变量
    var str = if (age > 20)
        "age大于20"
    else if (age < 20)
        "age 小于20"
    else
        "age等于20"
    println(str)
}