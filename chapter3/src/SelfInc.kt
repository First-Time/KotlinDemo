fun main(args: Array<String>) {
    var a = 20
    a++
    println("a:$a")
    //一下代码大致相当于a++
    a = a.inc()
    println("a:$a")
}