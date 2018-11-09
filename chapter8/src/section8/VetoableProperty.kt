package section8

import kotlin.properties.Delegates

var vetoableProp: Int by Delegates.vetoable(20) {
    //Lambda表达式的第一个参数代表被监听的属性
    //第二个参数代表修改之前的值
    //第三个参数代表设置的新值
    prop, old, new ->
    println("${prop}的${old}被改为$new")
    new > old
}

fun main(args: Array<String>) {
    //访问vetoableProp,不会触发监听器的Lambda表达式
    println(vetoableProp)
    //新值小于就只，监听的Lambda表达式返回false，新值设置失败
    vetoableProp = 15
    println(vetoableProp) //输出20
    //新值大于就只，监听的Lambda表达式返回true，新值设置成功
    vetoableProp = 25
    println(vetoableProp) //输出25
}