package section1

fun main(args: Array<String>) {
    val im = InMethod()
    //im.in()  //in是关键字，报错
    //调用in()方法
    im.`in`() //对in关键字转义
}