package section4

//定义一个Product接口
interface Product {
    fun getProductTime(): Int
}

const val MAX_CACHE_LINE = 10

//让Printer类实现Outputable和Product接口
class Printer : Outputable, Product {

    private val printData = Array(MAX_CACHE_LINE) { "" }

    //用以记录当前需打印的作业数
    private var dataNum = 0

    //重写接口的抽象只读属性
    override val brand: String = "HP"
    //重写接口的抽象读写属性
    override var category: String = "输出设备"

    override fun out() {
        //只要还有作业，就继续打印
        while (dataNum > 0) {
            println("打印机打印：" + printData[0])
            //把作业队列整体前移一位，并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum)
        }
    }

    override fun getData(msg: String) {
        if (dataNum >= MAX_CACHE_LINE) {
            println("输出队列已满，添加失败")
        } else {
            //把打印数据添加到队列里，已保存数据的数量加1
            printData[dataNum++] = msg
        }
    }

    override fun getProductTime(): Int {
        return 45
    }
}

fun main(args: Array<String>) {
    //创建一个Printer对象，当成Output使用
    var o: Outputable = Printer()
    o.getData("轻量级Java EE企业级实战")
    o.getData("疯狂Java讲义")
    o.out()
    o.getData("疯狂Android讲义")
    o.getData("疯狂Ajax讲义")
    o.out()

    //调用Outputable接口中定义的非抽象方法
    o.print("孙悟空", "猪八戒", "白骨精")
    o.test()
    //创建一个Printer对象，当成Product使用
    var p: Product = Printer()
    println(p.getProductTime())
    //所有接口类型的引用变量都可直接赋值给Any类型的变量
    val obj: Any = p
}