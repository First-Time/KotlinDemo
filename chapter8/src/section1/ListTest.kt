package section1

fun main(args: Array<String>) {
    var nums = listOf(20, 30, 100, 34, 67)
    //调用程序为List扩展的shuffle()方法
    println(nums.shuffle())
    println(nums.shuffle())

    var strList = listOf("Kotlin", "Java", "Go", "Erlang")
    println(strList.shuffle())
    println(strList.shuffle())
}