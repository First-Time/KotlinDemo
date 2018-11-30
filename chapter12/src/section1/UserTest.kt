package section1

fun main(args: Array<String>) {
    val user = User()
    //操作name读写属性
    user.name = "yeeku"
    println(user.name)
    //操作isMarried读写属性
    user.isMarried = true
    println(user.isMarried)
    //操作age只读属性
    println(user.age)
}