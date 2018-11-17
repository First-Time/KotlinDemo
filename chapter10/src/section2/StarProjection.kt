package section2

fun main(args: Array<String>) {
    //<*>必不可少，相当于Java的原始类型
    var list: ArrayList<*> = arrayListOf(1, "Kotlin")
    println(list)
}