package section1

import org.omg.CORBA.Object

class A1 : Apple<String>() {
    //正确重写了父类的属性
    //属性类型与父类Apple<String>的属性类型完全相同

    override var info: String? = null
        get() = "子类" + super.info

    //下面方法是错误的，重写父类方法时返回值类型不一致

//    override var info: Object? = null
}