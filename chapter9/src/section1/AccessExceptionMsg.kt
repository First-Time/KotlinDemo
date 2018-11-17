package section1

import java.io.FileInputStream

fun main(args: Array<String>) {
    try {
        var fis = FileInputStream("a.txt")
    } catch (e: Exception) {
        println(e.message)
        e.printStackTrace()
    }
}