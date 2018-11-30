package section1

fun main(args: Array<String>) {
    val iaf = IntArrayFun()
    //由于sum()方法需要的参数的Int[]类型，因此此处需要使用IntArray对象
    val intArr = intArrayOf(2, 4, 10)
    println(iaf.sum(intArr))
}