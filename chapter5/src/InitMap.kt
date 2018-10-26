fun main(args: Array<String>) {
    //创建不可变集合，返回值是Map
    var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(map) //key-value对按添加顺序排列
    //创建可变集合，返回值是MutableMap
    var mutableMap = mutableMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(mutableMap) //key-value对按添加顺序排列
    println("mapOf的返回对象的实际类型：${map.javaClass}")
    println("mutableMapOf的返回对象的实际类型：${mutableMap.javaClass}")
    //创建HashMap集合
    var hashMap = hashMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(hashMap) //不保证key-value对的排列
    //创建LinkedHashMap集合
    var linkedHashMap = linkedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(linkedHashMap) //key-value对按添加顺序排列
    //创建TreeMap集合
    var treeMap = sortedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    println(treeMap) //key-value对按key有小到大排列
}