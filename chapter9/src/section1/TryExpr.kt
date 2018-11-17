package section1

fun main(args: Array<String>) {
    val input = readLine()
    //用try表达式对变量a赋值
    val a: Int? = try {
        Integer.parseInt(input)
    } catch (e: NumberFormatException) {
        null
    }
    println(a)
}