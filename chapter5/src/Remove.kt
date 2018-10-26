fun main(args: Array<String>) {
    var languages = mutableSetOf("Kotlin", "OC", "PHP", "Perl", "Ruby", "Go")
    //删除"PHP"
    languages.remove("PHP")
    //再次删除"Perl"
    languages.remove("Perl")
    println(languages)
    //批量删除多个元素
    languages.removeAll(setOf("Ruby", "Go"))
    println(languages)
    //清空Set集合
    languages.clear()
    println(languages.count())

    var set = mutableSetOf("aa", "eyz", "abc")
    var it = set.iterator() //返回MutableIterator
    while (it.hasNext()) {
        var e = it.next()
        println(e)
        //遍历时删除元素
        if (e.length < 3) {
            it.remove()
        }
    }
    println(set)
}