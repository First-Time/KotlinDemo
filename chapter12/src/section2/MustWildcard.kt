package section2

open class Base2
class Sub2 : Base2()
class Box2<out T>(val value: T)

//对返回值类型强制生成通配符
fun boxSub2(value: Sub2): Box2<@JvmWildcard Sub2> = Box2(value)

fun unboxBase2(box: Box2<Base2>): Base2 = box.value