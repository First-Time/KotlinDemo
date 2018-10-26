fun main(args: Array<String>) {
    //定义一个数组
    var arr = arrayOf(2, 4, 5, 6)
    //判断是否所有元素的平方大于20
    println(arr.all { it * it > 20 }) //输出false
    //判断是否任一元素的平方大于20
    println(arr.any { it * it > 20 }) //输出true
    //根据数组元素来计算<K,V>对，返回所有<K,V>对组成的Map集合
    //下面的算法规则是：K是数组元素+2，V是数组元素的平方
    var result1 = arr.associate { it + 2 to it * it }
    println(result1)
    //创建一个可变Map集合，用于追加根据数组计算出来的key-value对
    var map = mutableMapOf(1 to 100, 2 to 120, -3 to 130)
    //将计算出来的key（元素的平方）、value（元素）对添加到map集合中
    arr.associateByTo(map) { it * it }
    println(map)
    //计算数组所有元素的总和
    println(arr.fold(0) { acc, e -> acc + e }) //输出17

    //定义一个a数组
    var a = arrayOf(3, 4, 5, 6)
    //定义一个a2数组
    var a2 = arrayOf(3, 4, 5, 6)
    //a数组和a2数组的长度相等，每个元素依次相等，将输出true
    println("a数组和a2数组是否相等：${a.contentEquals(a2)}")
    //通过复制a数组，生成一个新的b数组
    var b = a.copyOf(6)
    println("a数组和b数组是否相等：${a.contentEquals(b)}")
    //输出b数组的元素，将输出[3, 4, 5, 6, null, null]
    println("b数组的元素为：${b.contentToString()}")
    //将b数组的第5个元素（包括）到第7个元素（不包括）赋值为1
    b.fill(1, 4, 6)
    //输出b的数组元素，将输出[3, 4, 5, 6, 1, 1]
    println("b数组的元素为：${b.contentToString()}")
    //对b数组进行排序
    b.sort()
    //输出b数组的元素，将输出[1, 1, 3, 4, 5, 6]
    println("b数组的元素为：${b.contentToString()}")

    var c = arrayOf("Java", "Go", "Kotlin")
    var d = arrayOf("Lua", "Kotlin", "Python")
    println((c + d).contentToString()) //计算两个集合的并集
    println("Java" in c) //输出true
}