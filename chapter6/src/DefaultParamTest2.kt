//定义一个打印三角形的函数，只为第一个参数指定默认值
private fun printTriangle(height: Int = 5, char: Char) {
    for (i in 1..height) {
        //先打印一排空格
        for (j in 0 until height - i) {
            print(" ")
        }
        //再打印一排特殊字符
        for (j in 0 until 2 * i - 1) {
            print(char)
        }
        println()
    }
}

fun main(args: Array<String>) {
    printTriangle(6, '@')
    printTriangle(7, char = '#')
    printTriangle(char = '*')
}