fun main(args: Array<String>) {
    var mutableMap = mutableMapOf("OC" to 96, "PHP" to 3400, "Perl" to 4300, "Ruby" to 5600, "Go" to 5600)
    //以方括号语法放入key-value对
    mutableMap["Swift"] = 9000
    //用put方法放入key-value对
    mutableMap.put("OC", 8600)
    println(mutableMap) //{OC=8600, PHP=3400, Perl=4300, Ruby=5600, Go=5600, Seift=9000}
    //删除key为"PHP"的key-value对
    mutableMap.remove("PHP")
    //删除key为"Perl"的key-value对
    mutableMap.remove("Perl")
    println(mutableMap) //{OC=8600, Ruby=5600, Go=5600, Swift=9000}
    println(mutableMap.size) //4
    //删除所有元素
    mutableMap.clear()
    println(mutableMap) //{}
    println(mutableMap.size) //0
}