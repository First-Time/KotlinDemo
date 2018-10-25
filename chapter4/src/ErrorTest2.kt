fun main(args: Array<String>) {
    var age = 45
    if (age > 20) {
        println("青年人")
    }
    //在原本的if条件中增加了else的隐含条件
    if (age > 40 && !(age > 20)) {
        println("中年人")
    }
    //在原本的if条件中增加了else的隐含条件
    if (age > 60 && !(age > 20) && !(age > 40 && !(age > 20))) {
        println("老年人")
    }
}