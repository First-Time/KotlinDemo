package section8

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MyTarget {
    //该属性的委托对象是provideDelegate()方法返回的MyDelegation3对象
    var name: String by PropertyChecker()
}

class PropertyChecker() {
    operator fun provideDelegate(thisRef: MyTarget, prop: KProperty<*>): ReadWriteProperty<MyTarget, String> {
        //插入自定义代码，可执行任意业务草屋
        checkProperty(thisRef, prop.name)
        //返回实际的委托对象
        return MyDelegation3()
    }

    private fun checkProperty(thisRef: MyTarget, name: String) {
        println("-----检查属性-----")
    }
}

class MyDelegation3 : ReadWriteProperty<MyTarget, String> {
    private var _backValue = "默认值"

    /**
     * Returns the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @return the property value.
     */
    override fun getValue(thisRef: MyTarget, property: KProperty<*>): String {
        println("${thisRef}的${property.name}属性执行getter方法")
        return _backValue
    }

    /**
     * Sets the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @param value the value to set.
     */
    override fun setValue(thisRef: MyTarget, property: KProperty<*>, value: String) {
        println("${thisRef}的${property.name}属性执行setter方法，传入参数值为：$value")
        _backValue = value
    }
}

fun main(args: Array<String>) {
    //创建对象（初始化属性），调用委托工厂的provideDelegate()方法
    val pd = MyTarget()
    //读取属性，实际上是调用属性的委托工厂的getter方法
    println(pd.name)
    //写入属性，实际上是调用属性的委托工厂的setter方法
    pd.name = "fkit.org"
    println(pd.name)
}