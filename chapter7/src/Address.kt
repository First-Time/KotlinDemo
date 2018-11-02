class Address {
    var street: String = ""
    var city = ""
    var province = ""
    var postCode: String? = null
}

fun main(args: Array<String>) {
    var addr = Address()
    //通过点语法对属性赋值，实际就是调用setter方法
    addr.street = "大岗工业路"
    addr.city = "广州"
    //通过点语法访问属性，实际就是调用getter方法
    println(addr.city)
    println(addr.street)
}