package section6

fun main(args: Array<String>) {
    var a = 20
    var obj = object {
        fun change() {
            println("change()方法修改变量a的值")
            a++
        }
    }

    obj.change()
    println(a)
}