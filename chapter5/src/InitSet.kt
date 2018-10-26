fun main(args: Array<String>) {
    //创建不可变集合，返回值是Set
    var set = setOf("Java", "Kotlin", "Go")
    println(set) //集合元素按添加顺序排列
    //创建可变集合，返回值是MutableSet
    var mutableSet = mutableSetOf("Java", "Kotlin", "Go")
    println(mutableSet)
    println("setOf的返回对象的实际类型：${set.javaClass}")
    println("mutableSetOf的返回对象的实际类型：${mutableSet.javaClass}")
    //创健HashSet集合
    var hashSet = hashSetOf("Java", "Kotlin", "Go")
    println(hashSet)  //不保证元素的顺序
    //创建LinkedHashSet集合
    var linkedHashSet = linkedSetOf("Java", "Kotlin", "Go")
    println(linkedHashSet) //集合元素按添加顺序排列
    //创建TreeSet'集合
    var treeSet = sortedSetOf("Java", "Kotlin", "Go")
    println(treeSet) //集合元素有小到大排列
}