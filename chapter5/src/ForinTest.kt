fun main(args: Array<String>) {
//    var books = arrayOf("轻量级Java EE企业应用实践", "疯狂Java讲义", "疯狂Android讲义")
    var books = setOf("轻量级Java EE企业应用实践", "疯狂Java讲义", "疯狂Android讲义")
    //使用for-in循环来遍历数组元素
    // 其中book将会自动迭代每个数组元素
    for (book in books) {
        println(book)
    }

    //调用forEach方法来遍历Set集合
    books.forEach { println(it) }

    //根据索引来遍历Set集合
    for (i in books.indices) {
        println(books.elementAt(i))
    }
}