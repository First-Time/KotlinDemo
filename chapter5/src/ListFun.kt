fun main(args: Array<String>) {
    //创建不可变集合，返回值是List
    var list = listOf("Java", "Kotlin", null, "Go")
    for (i in list.indices) {
        //使用[]运算符访问集合元素，实际上就是根据get方法访问
        println(list[i])
    }
    //获取指定元素的出现位置
    println(list.indexOf("Kotlin"))
    //获取List的子集合
    println(list.subList(1, 3))
}