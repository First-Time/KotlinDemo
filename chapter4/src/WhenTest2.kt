fun main(args: Array<String>) {
    var score = 'B'
    when (score) {
        'A' -> {
            println("优秀")
            println("望百尺竿头更进一步")
        }
        'B' -> {
            println("良好")
            println("不拼一把，你不知道自己的能力")
        }
        'C' -> {
            println("中")
        }
        'D' -> {
            println("及格")
        }
        else -> {
            println("不及格")
            println("啥也不说了，下次再来")
        }
    }
}