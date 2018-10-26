fun main(args: Array<String>) {
    //定义一个可变的Set
    var languages = mutableSetOf("Swift")
    //添加一个元素
    languages.add("Go")
    languages.add("Lua")
    println(languages)
    println(languages.count())
    languages.addAll(setOf("Java", "Kotlin"))
    println(languages)
}