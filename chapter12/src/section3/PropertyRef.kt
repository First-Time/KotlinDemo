package section3

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties

class Item3 {
    var name: String = "疯狂Kotlin讲义"
    val price: Double = 76.6
}
var foo = "测试属性"

fun main(args: Array<String>) {
    //获取foo属性，属于KMutableProperty0的实例
    val topProp = ::foo
    topProp.set("修改后的属性")
    println(topProp.get())

    var im = Item3()
    //获取name属性，属于KMutableProperty1的属性
    var mp = Item3::name
    mp.set(im, "疯狂Java讲义")
    println(mp.get(im))

    //获取Item的price属性，属于KMutableProperty1的属性
    var prop = Item3::price
    println(prop.get(im))
}