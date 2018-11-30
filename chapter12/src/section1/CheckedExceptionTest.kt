package section1

import java.io.FileInputStream

fun main(args: Array<String>) {
    //下面代码可能引发IOException（checked异常）
    //到Kotlin并不强制处理该异常
    val fis = FileInputStream("aa.txt")
    println(fis.read())
}