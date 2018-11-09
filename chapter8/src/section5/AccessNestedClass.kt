package section5

class AccessNestedClass {
    class NestedClass {
        var prop = 9
    }

    fun accessNestedProp() {
//        println(prop)
        //上面代码实现错误，应改为如下形式
        //通过对象访问嵌套类的成员
        println(NestedClass().prop)
    }
}