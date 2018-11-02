package section3

class User(first: String, last: String) {
    var first: String = first
    var last: String = last
    val fullName: String
    //自定义getter方法
        get() {
            println("执行fullName的getter方法")
            return "$first.$last"
        }
}