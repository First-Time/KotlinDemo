private class Dog {
    //定义一个jump()方法
    private fun jump() {
        println("正在执行jump方法")
    }

    //定义一个run()方法，run()方法需要借助jump()方法
    fun run() {
        //使用this引用调用run()方法的对象
        jump()
        println("正在执行run方法")
    }
}