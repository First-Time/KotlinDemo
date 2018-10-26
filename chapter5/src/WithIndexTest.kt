fun main(args: Array<String>) {
    var books = arrayOf("轻量级Java EE企业应用实践", "疯狂Java讲义", "疯狂Android讲义")
    // 根据数组的索引来遍历数组
    for ((index, value) in books.withIndex()) {
        println("索引为${index}的元素是：${value}")
    }
}