package section2

class Item<in T> {
    fun foo(t: T) {
        println(t)
    }
}

fun main(args: Array<String>) {
    //此时T的类型是Any
    var item = Item<Any>()
    item.foo(20)

    var im2: Item<String> = Item()
    //im2的实际类型是Item<Any>，因此它的foo参数只要是Any即可
    //但我们声明了im2的类型为Item<String>
    //因此传入的参数只可能是String，所以程序肯定是安全的
    im2.foo("fkit")
}