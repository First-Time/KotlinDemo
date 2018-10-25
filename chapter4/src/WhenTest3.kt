fun main(args: Array<String>) {
    var score = 'B'
    var str = "EFGH"
    when (score) {
        str[0] - 4, str[1] - 4 -> {
            println("优秀")
            println("望百尺竿头更进一步")
        }
        str[2] - 4, str[3] - 4 -> {
            println("中")
        }
        else -> {
            println("不及格")
            println("啥也不说了，下次再来")
        }
    }
}