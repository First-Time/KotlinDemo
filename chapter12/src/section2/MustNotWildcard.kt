package section2

open class Base3
class Sub3 : Base3()
class Box3<out T>(val value: T)

//对返回值类型强制生成通配符
fun boxSub3(value: Sub3): Box3<Sub3> = Box3(value)

fun unboxBase3(box: Box3<@JvmSuppressWildcards Base3>): Base3 = box.value