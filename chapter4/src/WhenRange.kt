import java.util.*

fun main(args: Array<String>) {
    var age = Random().nextInt(100)
    println(age)
    val str = when (age) {
        in 10..25 -> {
            "当时年少青衫薄"
        }
        in 26..50 -> {
            "风景依稀似去年"
        }
        in 51..80 -> {
            "醉听清吟胜管弦"
        }
        else -> {
            "其他"
        }
    }
    println(str)
}