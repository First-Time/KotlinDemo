fun main(args: Array<String>) {
    var age = 18
    //将if表达式赋值给str变量
    var str = if (age > 20) {
        println("大于20的分支")
        "age大于20"
    }
    else if (age < 20) {
        println("小于20的分支")
        "age 小于20"
    }
    else {
        println("else的分支")
        "age等于20"
    }
    println(str)
}