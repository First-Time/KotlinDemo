fun main(args: Array<String>) {
    var score = 'B'
    when (score) {
        'A', 'B' -> {
            println("优秀")
            println("望百尺竿头更进一步")
        }
        'C', 'D' -> {
            println("中")
        }
        else -> {
            println("不及格")
            println("啥也不说了，下次再来")
        }
    }
}