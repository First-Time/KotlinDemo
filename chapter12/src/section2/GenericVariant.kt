package section2

open class Base
class Sub : Base()
class Box<out T>(val value: T)

fun boxSub(value: Sub): Box<Sub> = Box(value)
fun unboxBase(box: Box<Base>): Base = box.value