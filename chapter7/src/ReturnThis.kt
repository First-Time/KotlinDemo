class ReturnThis {
    var age = 0
    fun grow(): ReturnThis {
        age++
        //return thsi返回调用该方法的对象
        return this
    }
}

fun main(args: Array<String>) {
    val rt = ReturnThis()
    //可以连续调用同一个方法
    rt.grow().grow().grow()
    println("rt的age属性值是：" + rt.age)
}