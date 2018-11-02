package section6

class Ostrich : Bird() {
    //重写Bird类的fly()方法
    override fun fly() {
        println("我只能在地上奔跑...")
    }
}

fun main(args: Array<String>) {
    //创建Ostrich对象
    var os = Ostrich()
    //执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
    os.fly()
}