package section8

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MyDelegation2 : ReadWriteProperty<Nothing?, String> {
    private var _backValue = "默认值"

    /**
     * Returns the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @return the property value.
     */
    override fun getValue(thisRef: Nothing?, property: KProperty<*>): String {
        println("${thisRef}的${property.name}属性执行getter方法")
        return _backValue
    }

    /**
     * Sets the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @param value the value to set.
     */
    override fun setValue(thisRef: Nothing?, property: KProperty<*>, value: String) {
        println("${thisRef}的${property.name}属性执行setter方法，传入参数值为：$value")
        _backValue = value
    }
}

fun main(args: Array<String>) {
    var name: String by MyDelegation2()
    //访问局部变量，实际上是调用MyDelegation2对象的getValue()方法
    println(name)
    //对局部变量赋值，实际上是调用MyDelegation2对象的setValue()方法
    name = "新的值"
    println(name)
}