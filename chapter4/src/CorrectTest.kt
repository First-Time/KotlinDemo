fun main(args: Array<String>) {
    var age = 45
    if (age > 60) {
        println("老年人")
    }
    else if (age > 40 && !(age > 60)) {
        println("中年人")
    }
    else if (age > 20 && !(age > 60) && !(age > 40 && !(age > 60))) {
        println("青年人")
    }
}