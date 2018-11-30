package section3

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter
import kotlin.reflect.jvm.javaSetter

class Item4 {
    var name: String = "疯狂Kotlin讲义"
    val price: Double = 76.6
}

var foo4 = "测试属性"

fun main(args: Array<String>) {
    //获取foo属性，属于KMutableProperty0的实例
    val topProp = ::foo4
    println(topProp.javaField)
    println(topProp.javaGetter)
    println(topProp.javaSetter)

    //获取Item4的name属性，属于KMutableProperty1的属性
    var mp = Item4::name
    println(mp.javaField)
    println(mp.javaGetter)
    println(mp.javaSetter)

    //获取Item的price属性，属于KMutableProperty1的属性
    var prop = Item4::price
    println(prop.javaField)
    println(prop.javaGetter)
}