fun main(args: Array<String>) {
    //创建不可变集合，返回值是Map
    var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
    //判断是否所有key-value对的key的长度都大于4、value都大于80
    println(map.all { it.key.length > 4 && it.value > 80 }) //输出false
    //判断是否任一key-value对的key的长度大于4、value大于80
    println(map.any { it.key.length > 4 && it.value > 80 }) //输出true
    //由于有contains()方法，所以可用in、!in运算符
    println("Java" in map) //输出true
    println("Go" !in map) //输出false

    //对Map集合元素进行过滤：要求key包含li
    val filteredMap = map.filter { "li" in it.key }
    println(filteredMap) //输出{Kotlin=92}
    //将每个key-value对映射成新值，返回所有新值组成的Map集合
    val mappedList = map.map { "《疯狂${it.key}讲义》 价格为：${it.value}" }
    println(mappedList) //输出：[《疯狂Java讲义》 价格为：86, 《疯狂Kotlin讲义》 价格为：92, 《疯狂Go讲义》 价格为：78]
    //根据key获取最大值
    println(map.maxBy { it.key })
    //根据value获取最小值
    println(map.minBy { it.value })
    var bMap = mapOf("Lua" to 67, "Erlang" to 73, "Kotlin" to 92)
    //由于Map有operator修饰的plus、minus方法，因此可执行+、-运算
    //集合相加，相当于并集
    println(map + bMap) //输出：{Java=86, Kotlin=92, Go=78, Lua=67, Erlang=73}
    //集合相减，减去它们公共的元素
    println(map - bMap) //输出：{Java=86, Kotlin=92, Go=78}
}