package section1

class User(var first: String, var last: String)

//为User扩展读写属性
var User.fullName: String
    get() = "$first.$last"
    set(value) {
        println("执行扩展属性fullName的setter方法")
        //value字符串中不包含.活包含几个.都不行
        if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
            println("您输入的fullName不合法")
        } else {
            var tokens = value.split(".")
            first = tokens[0]
            last = tokens[1]
        }
    }

fun main(args: Array<String>) {
    var user = User("悟空", "孙")
    println(user.fullName)
    user.fullName = "八戒.猪"
    println(user.first)
    println(user.last)
}