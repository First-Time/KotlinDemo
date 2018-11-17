package section1

fun main(args: Array<String>) {
    try {
        var a = Integer.parseInt(args[0])
        var b = Integer.parseInt(args[1])
        val c = a / b
        println("您输入的两个数相除的结果是：$c")
    } catch (e: IndexOutOfBoundsException) {
        println("数组越界：运行程序时输出的参数个数不够")
    } catch (e: NumberFormatException) {
        println("数字格式异常：程序只能接收整数参数")
    } catch (e: ArithmeticException) {
        println("算术异常")
    } catch (e: Exception) {
        println("未知异常")
    }
}