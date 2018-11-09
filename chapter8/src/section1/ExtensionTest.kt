package section1

fun main(args: Array<String>) {
    var t = Raw()
    t.test()
    //调用Raw对象扩展的方法
    t.info()
    //创建Raw类的子类的实例
    var rs = RawSub()
    rs.test()
    rs.sub()
    //Raw的子类的对象也可调用扩展的方法
    rs.info()
}