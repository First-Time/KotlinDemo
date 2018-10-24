fun main(args: Array<String>) {
    //定义b1的值为true
    var b1: Boolean = true
    //定义b2的值为false
    var b2: Boolean = false

    //将Boolean类型的变量插值到字符串中
    var str: String = "${b1}代表真"
    println(str)

    var i = 1
    if (i === 1) {
        println(true)
    }
}