package section3.section02

import javax.swing.AbstractButton
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

//处理注解的方法，其中obj是包含注解的对象
fun processAnnotations(obj: Any) {
    //获取obj对象的类
    val c1 = obj::class
    //获取指定obj对象的所有成员，并遍历每个成员
    for (prop in c1.memberProperties) {
        //获取该成员上ActionListenerFor类型的注解
        val a = prop.findAnnotation<ActionListenerFor>()
        //获取属性prop的值
        val fObj = prop.call(obj)
        //如果fObj是AbstractButton的实例，且a不为null
        if (a != null && fObj != null && fObj is AbstractButton) {
            //获取a注解的listener属性值（它是一个监听器类）
            val listenerClazz = a.listener
            //使用反射来创建listener类的对象
            val a1 = listenerClazz.createInstance()
            //为fObj按钮添加事件监听器
            fObj.addActionListener(a1)
        }
    }
}