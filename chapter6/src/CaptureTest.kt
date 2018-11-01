//定义一个函数，该函数的返回值类型为() -> List<String>
private fun makeList(ele: String): () -> List<String> {
    //创建一个不包含任何元素的List
    var list: MutableList<String> = mutableListOf()
    fun addElement(): List<String> {
        //想list集合中添加一个元素
        list.add(ele)
        return list
    }
    return ::addElement
}

fun main(args: Array<String>) {
    println("-----add1返回的List-----")
    //add1将会持有list的副本
    val add1 = makeList("孙悟空")
    println(add1())
    println(add1())
    println("-----add2返回的List-----")
    //add2将会持有list的副本，与add1的list副本没有关系
    val add2 = makeList("猪八戒")
    println(add2())
    println(add2())
    println(add2())
    println(add2())
}