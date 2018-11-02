package section3

class BackingProperty(name: String) {
    //定义private修饰的属性，该属性是幕后属性
    private var _name: String = name
    var name
    //重写getter方法，返回幕后属性的值
        get() = _name
        set(newName) {
            //执行合理性校验，要求用户名必须在2~6位之间
            if (newName.length > 6 || newName.length < 2) {
                println("您设置的人名不符合要求")
            } else {
                _name = newName
            }
        }
}

fun main(args: Array<String>) {
    var p = BackingProperty("李刚")
    //访问p.name，实际上会转为访问幕后属性_name
    println(p.name)
    //对p.name赋值，实际上会转为对幕后属性_name赋值
    p.name = "孙悟空"
    println(p.name)
}