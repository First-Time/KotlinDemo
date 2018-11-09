package section8

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PropertyDelegation {
    var name: String by MyDelegation()
}

class MyDelegation : ReadWriteProperty<PropertyDelegation, String> {
    /**
     * Returns the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @return the property value.
     */
    override fun getValue(thisRef: PropertyDelegation, property: KProperty<*>): String {
        println("${thisRef}的${property.name}属性执行getter方法")
        return _backValue
    }

    /**
     * Sets the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @param value the value to set.
     */
    override fun setValue(thisRef: PropertyDelegation, property: KProperty<*>, value: String) {
        println("${thisRef}的${property.name}属性执行setter方法，传入参数值为：$value")
        _backValue = value
    }

    private var _backValue = "默认值"
}

fun main(args: Array<String>) {
    val pd = PropertyDelegation()
    //读取属性，实际上是调用属性的委托对象的getter方法
    println(pd.name)
    //写入属性，实际上是调用属性的委托对象的setter方法
    pd.name = "fkit.org"
    println(pd.name)
}