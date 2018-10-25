fun main(args: Array<String>) {
    var score = 'B'
    val str = when (score) {
        'A' -> {
            println("望百尺竿头更进一步")
            "优秀"
        }
        'B' -> {
            println("不拼一把，你不知道自己的能力")
            "良好"
        }
        'C' -> {
            "中"
        }
        'D' -> {
            "及格"
        }
        else -> {
            println("不及格")
            println("啥也不说了，下次再来")
        }
    }
    println(str)
}