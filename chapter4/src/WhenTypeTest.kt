import java.util.*

fun main(args: Array<String>) {
    var date = Date()
    //when分支的条件表达式是Date类型
    when (date) {
        Date() -> {
            println("优秀")
            println("望百尺竿头更进一步")
        }
        else -> {
            println("不及格")
            println("啥也不说了，下次再来")
        }
    }
}