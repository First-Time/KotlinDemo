fun main(args: Array<String>) {
    var age = 45
    if (age > 60) {
        println("老年人")
    }
    //在原本的if条件中增加了else的隐含条件
    else if (age > 40) {
        println("中年人")
    }
    //在原本的if条件中增加了else的隐含条件
    else if (age > 20) {
        println("青年人")
    }
}