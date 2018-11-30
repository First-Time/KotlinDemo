package section1

import kotlin.reflect.KClass

//arg1的类型是KClass<*>，这是星号投影用法，相当于java的原始类型
//arg2的类型是KClass<out Any>，这是使用出协变的用法
//可传入KClass<Int>、KClass<Class>等，只要尖括号里的类型是Any的子类即可
annotation class DrawTag(val arg1: KClass<*>, val arg2: KClass<out Any>)

@DrawTag(arg1 = String::class, arg2 = Int::class)
class Circle2