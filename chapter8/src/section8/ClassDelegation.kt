package section8

import javax.swing.JOptionPane

interface Outputable {
    fun output(msg: String)
    var type: String
}

//定义一个DefaultOutput类实现Outputable接口
class DefaultOutput : Outputable {
    override var type: String = "输出设备"

    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h$i>$msg</h$i>")
        }
    }
}

//定义Printer类，指定构造参数b作为委托对象
class Printer(b: DefaultOutput) : Outputable by b

//定义Projection类，指定新建的对象作为委托对象
class Projection : Outputable by DefaultOutput() {
    //该类重写output()方法

    override fun output(msg: String) {
        JOptionPane.showMessageDialog(null, msg)
    }
}

fun main(args: Array<String>) {
    val output = DefaultOutput()
    //Printer对象的委托对象是output
    var printer = Printer(output)
    //其实就是调用委托对象的output()方法
    printer.output("fkit.org")
    //其实就是调用委托对象的type属性方法
    println(printer.type)
    //Projection对象委托对象也是output
    var projection = Projection()
    //Projection本身重写了output()方法，所以此处是调用本类重写的方法
    projection.output("疯狂软件教育中心")
    //其实就是调用委托对象的type属性方法
    println(projection.type)
}