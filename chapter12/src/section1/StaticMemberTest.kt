package section1

import java.awt.BorderLayout

fun main(args: Array<String>) {
    //调用Runtime的静态方法（就像调用伴生对象的方法一样）
    val rt = Runtime.getRuntime()
    println(rt)
    //访问BorderLayout的NORTH静态成员（就像访问伴生对象的属性一样）
    val str = BorderLayout.NORTH
    println(str)
}