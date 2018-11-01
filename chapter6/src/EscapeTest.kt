import java.util.ArrayList

//定义一个List类型的变量，并将其初始化为空List
var lambdaList = ArrayList<(Int) -> Int>()

//定义一个函数，该函数的形参类型为函数
private fun collectFu(fn: (Int) -> Int) {
    //将传入的fn参数（函数或Lambda表达式）添加到lambdaList集合中，这意味着fn将可以在collectFu范围之外使用
    lambdaList.add(fn)
}

fun main(args: Array<String>) {
    //调用collectFu()函数两次，将会向lambdaList中添加元素（每个元素都是Lambda表达式)
    collectFu { it * it }
    collectFu { it * it * it }
    //输出lambdaList的长度
    println(lambdaList.size)
    //依次调用lambdaList集合的元素（每个元素都是Lambda表达式）
    for (i in lambdaList.indices) {
        println(lambdaList[i](i + 10))
    }
}