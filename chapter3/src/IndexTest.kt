import java.util.ArrayList

fun main(args: Array<String>) {
    var str = "fkjava.org"
    //根据get方法获取指定索引处的字符
    println(str.get(2))
    //使用索引访问运算符来获取指定索引处的字符
    println(str[2])
    //创建Java的ArrayList集合
    var list = ArrayList<String>()
    list.add("Java")
    list.add("Kotlin")
    list.add("Go")
    //使用索引访问运算符来获取指定索引处的List集合元素
    println(list[1])
    //使用索引访问运算符来修改指定索引处的List集合元素
    list[2] = "Swift"
    println(list)
}