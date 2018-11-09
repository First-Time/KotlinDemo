package section1

class HTML {
    fun body() {
        println(" <body></body>")
    }

    fun head() {
        println(" <head></head>")
    }
}

//定义一个类型为HTML.() -> Unit的形参（带接收者的匿名函数）
//这样在函数中HTML对象就增加了一个init方法
fun html(init: HTML.() -> Unit) {
    println("<html>")
    val html = HTML() //创建接收者对象
    html.init()//使用接收者调用init引用匿名函数（即传入的参数）
    println("</html>")
}

fun main(args: Array<String>) {
    //调用html函数，需要传入HTML.() -> Unit类型的参数
    //此时系统可推断出接收者的类型，故可用Lambda表达式代替匿名函数
    html {
        //Lambda表达式中的this就是该方法的调用者
        head()
        body()
    }
}