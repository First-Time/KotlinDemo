fun main(args: Array<String>) {
    //创建不可变集合，返回值是Map
    var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    //遍历Map的key-value对，entries元素返回key-value对组成的Set
    for (en in map.entries) {
        println("${en.key} -> ${en.value}")
    }
    //先遍历Map的key，再通过key获取value
    for (key in map.keys) {
        println("${key} -> ${map[key]}")
    }
    //直接使用for-in循环遍历Map
    for ((key, value) in map) {
        println("${key} -> ${value}")
    }
    //用Lambda表达式遍历Map
    map.forEach { println("${it.key} -> ${it.value}") }
}