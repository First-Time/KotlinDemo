package section3.section02

import java.awt.event.ActionListener
import kotlin.reflect.KClass

//指定该注解只能修饰属性
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
//定义一个属性，用于设置原数据
//该listener属性用于保存监听器实现类
annotation class ActionListenerFor(val listener: KClass<out ActionListener>)