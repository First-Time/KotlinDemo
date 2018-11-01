fun main(args: Array<String>) {
    var list = listOf(3, 5, 30, -25, 14)
    //使用匿名函数执行forEach()方法
    list.forEach(fun(n) {
        println("元素依次为：$n")
        //匿名函数中的return用于返回该函数本身
        return
    })

    //使用Lambda表达式执行forEach()方法
    list.forEach { n ->
        println("元素依次为：$n")
        //使用限定返回，此时return只是返回传给forEach方法的Lambda表达式
        return@forEach
    }

    //使用Lambda表达式执行forEach()方法
    list.forEach { n ->
        println("元素依次为：$n")
        //Lambda表达式中的return用于返回它所在的函数(main函数)
        return
    }
}