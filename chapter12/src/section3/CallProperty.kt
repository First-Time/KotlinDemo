package section3

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties

class Item2 {
    var name: String = "疯狂Kotlin讲义"
    val price: Double = 76.6
}

fun main(args: Array<String>) {
    val clazz = Item2::class
    val ins = clazz.createInstance()
    val props = clazz.declaredMemberProperties
    props.forEach {
        when (it.name) {
            "name" -> {
                @Suppress("UNCHECKED_CAST")
                //将属性转换为读写属性
                val mp = it as KMutableProperty1<Item2, Any>
                //修改属性值
                mp.set(ins, "疯狂Java讲义")
                println(it.get(ins))
            }
            "price" -> {
                //只读属性，只能通过get()方法读取属性值
                println(it.get(ins))
            }
        }
    }
}