package section8

import kotlin.properties.Delegates

var observableProp: String by Delegates.observable("默认值") {
    //Lambda表达式的第一个参数代表被监听的属性
    //第二个参数代表修改之前的值
    //第三个参数代表设置的新值
    prop, old, new ->
    println("${prop}的${old}被改为$new")
}

fun main(args: Array<String>) {
    //访问observableProp属性,不会触发监听器的Lambda表达式
    println(observableProp)
    //设置属性值，触发监听器的Lambda表达式
    observableProp = "疯狂软件"
    println(observableProp)
}