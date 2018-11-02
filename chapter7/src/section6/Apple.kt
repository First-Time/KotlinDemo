package section6

//定义Apple类继承Fruit
class Apple : Fruit(0.0)

fun main(args: Array<String>) {
    //创建Apple对象
    var a = Apple()
    //Apple对象本身没有weight属性
    //因为Apple的父类有weight属性，所以也可以访问Apple对象的weight属性
    a.weight = 56.0
    //调用Apple对象的info()方法
    a.info()
}