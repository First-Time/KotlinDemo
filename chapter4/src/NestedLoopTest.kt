fun main(args: Array<String>) {
    //外层循环
    for (i in 0 until 5) {
        var j = 0
        //内层循环
        while (j < 3){
            println("i的值为：$i, j的值为：${j++}")
        }
    }
}