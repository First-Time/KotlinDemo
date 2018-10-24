class A {
    inner class Inner
}

class B {
    inner class Inner
}
//为A.Inner内部类指定别名
typealias AInner = A.Inner

//为B.Inner内部类指定别名
typealias BInner = B.Inner

//为(T) -> Boolean类型指定别名Predicate<T>
typealias Predicate<T> = (T) -> Boolean

fun main(args: Array<String>) {
    //使用AInner定义变量、调用对象
    var a: AInner = A().AInner()
    //使用BInner定义变量、调用对象
    var b: BInner = B().BInner()

    //使用Predicate<String>定义变量，该变量的值是一个Lambda表达式
    val p: Predicate<String> = { it.length > 4 }
    //为filter()方法传入p参数，值保留长度大于4的字符串
    println(arrayOf("Java", "Objective-C", "Go", "Kotlin").filter(p))
}